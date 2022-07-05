FROM registry.access.redhat.com/ubi8/openjdk-11

MAINTAINER Christopher Tate <computate@computate.org>

ENV APP_NAME=sumo \
	APP_DEPENDENCIES="git python3 python3-pip python3-virtualenv make gcc gcc-c++ readline-devel tcl zlib-devel libpng-devel libjpeg-turbo-devel libtiff-devel libXext-devel mesa-libGLw mesa-libGL-devel mesa-libGLU-devel" \
	APP_DISPLAY_NAME="SUMO Simulation of Urban Mobility" \
	APP_PREFIX="/usr/local" \
	APP_SRC="/usr/local/src/sumo" \
	APP_SHARE="/usr/local/share/sumo" \
	APP_REPO_HTTPS="https://github.com/eclipse/sumo.git" \
	APP_TAG="v1_12_0" \
	APP_EXEC="/usr/local/bin/sumo-gui" \
	PYTHON_DIR="/opt/python"

COPY . .
USER root

RUN microdnf install -y ${APP_DEPENDENCIES}
RUN /usr/bin/virtualenv ${PYTHON_DIR}
RUN source ${PYTHON_DIR}/bin/activate && pip install setuptools_rust wheel
RUN source ${PYTHON_DIR}/bin/activate && pip install --upgrade pip
RUN source ${PYTHON_DIR}/bin/activate && pip install ansible
RUN git clone https://github.com/computate-org/computate_sumo.git /home/jboss/.ansible/roles/computate.computate_sumo
RUN git clone https://github.com/computate-org/computate_sqlite.git /home/jboss/.ansible/roles/computate.computate_sqlite
RUN git clone https://github.com/computate-org/computate_fox.git /home/jboss/.ansible/roles/computate.computate_fox
RUN source ${PYTHON_DIR}/bin/activate && ${PYTHON_DIR}/bin/ansible-playbook -e APP_PREFIX=/usr/local -e APP_DOWNLOAD_DIR=/tmp /home/jboss/.ansible/roles/computate.computate_sumo/install.yml

RUN mvn clean install -DskipTests
RUN cp /home/jboss/target/*.jar /home/jboss/app.jar

CMD java -XX:+UseParallelOldGC -XX:MinHeapFreeRatio=10 -XX:MaxHeapFreeRatio=20 -XX:GCTimeRatio=4 -XX:AdaptiveSizePolicyWeight=90 -XX:MaxMetaspaceSize=100m -XX:ParallelGCThreads=1 -Djava.util.concurrent.ForkJoinPool.common.parallelism=1 -XX:CICompilerCount=2 -XX:+ExitOnOutOfMemoryError -cp .:* org.computate.smartvillageview.enus.vertx.MainVerticle

