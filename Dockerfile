FROM quay.io/centos/centos:stream8

MAINTAINER Christopher Tate <computate@computate.org>

ENV APP_NAME=sumo \
	APP_DEPENDENCIES="git python3 python3-pip python3-virtualenv make gcc gcc-c++ readline-devel tcl zlib-devel libpng-devel libjpeg-turbo-devel libtiff-devel libXext-devel libXft-devel mesa-libGLw mesa-libGL-devel mesa-libGLU-devel cmake xerces-c-devel proj-devel gl2ps-devel swig java-11-openjdk-devel maven libsq3-devel libsqlite3x-devel" \
	# gtest-devel gdal-devel ffmpeg-devel
	APP_DISPLAY_NAME="SUMO Simulation of Urban Mobility" \
	APP_PREFIX="/usr/local" \
	APP_SRC="/usr/local/src/sumo" \
	APP_SHARE="/usr/local/share/sumo" \
	APP_REPO_HTTPS="https://github.com/eclipse/sumo.git" \
	APP_TAG="v1_12_0" \
	APP_EXEC="/usr/local/bin/sumo-gui" \
	PYTHON_DIR="/opt/python" \
	SUMO_HOME="/usr/local/share/sumo" \
	LD_LIBRARY_PATH="/usr/local/lib:/usr/local/lib64"

RUN install -d /root/src
COPY . /root/src
USER root

RUN rpm -ivh https://dl.fedoraproject.org/pub/epel/epel-release-latest-8.noarch.rpm
RUN rpm -ivh https://mirrors.rpmfusion.org/free/el/rpmfusion-free-release-8.noarch.rpm

RUN yum install -y ${APP_DEPENDENCIES}

RUN /usr/bin/virtualenv ${PYTHON_DIR}
RUN source ${PYTHON_DIR}/bin/activate && pip install setuptools_rust wheel
RUN source ${PYTHON_DIR}/bin/activate && pip install --upgrade pip
RUN source ${PYTHON_DIR}/bin/activate && pip install ansible
RUN git clone https://github.com/computate-org/computate_sumo.git /root/.ansible/roles/computate.computate_sumo
RUN git clone https://github.com/computate-org/computate_sqlite.git /root/.ansible/roles/computate.computate_sqlite
RUN git clone https://github.com/computate-org/computate_fox.git /root/.ansible/roles/computate.computate_fox
RUN git clone https://github.com/computate-org/computate_gtest.git /root/.ansible/roles/computate.computate_gtest
RUN git clone https://github.com/computate-org/computate_eigen.git /root/.ansible/roles/computate.computate_eigen
RUN git clone https://github.com/computate-org/computate_gdal.git /root/.ansible/roles/computate.computate_gdal
RUN source ${PYTHON_DIR}/bin/activate && ${PYTHON_DIR}/bin/ansible-playbook -e  APP_PREFIX=/usr/local -e APP_DOWNLOAD_DIR=/tmp /root/.ansible/roles/computate.computate_sumo/install.yml

WORKDIR /root/src
RUN mvn clean install -DskipTests
RUN cp /root/src/target/*.jar /root/src/app.jar
CMD java $JAVA_OPTS -cp .:* org.computate.smartvillageview.enus.vertx.MainVerticle
