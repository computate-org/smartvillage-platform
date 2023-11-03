FROM quay.io/computateorg/smartvillage-traffic-light-controller-sumo:computate-api

MAINTAINER Christopher Tate <computate@computate.org>

ENV APP_DEPENDENCIES="java-11-openjdk-devel maven" \
  JAVA_HOME=/usr/lib/jvm/java-11-openjdk

USER root

RUN yum install -y ${APP_DEPENDENCIES}

RUN install -d /usr/local/src/smartvillage-platform
COPY . /usr/local/src/smartvillage-platform
RUN git clone https://github.com/computate-org/computate.git /usr/local/src/computate

#RUN git clone https://github.com/computate-org/computate-base.git /usr/local/src/computate-base
#RUN git clone https://github.com/computate-org/computate-search.git /usr/local/src/computate-search
#RUN git clone https://github.com/computate-org/computate-vertx.git /usr/local/src/computate-vertx
#RUN git clone https://github.com/computate-org/smartvillage-platform-static.git /usr/local/src/smartvillage-platform-static
#WORKDIR /usr/local/src/computate-base
#RUN mvn clean install -DskipTests
#WORKDIR /usr/local/src/computate-search
#RUN mvn clean install -DskipTests
#WORKDIR /usr/local/src/computate-vertx
#RUN mvn clean install -DskipTests

WORKDIR /usr/local/src/smartvillage-platform
RUN mvn clean install -DskipTests
RUN cp /usr/local/src/smartvillage-platform/target/*.jar /usr/local/src/smartvillage-platform/app.jar
RUN cp -r /usr/local/src/smartvillage-platform/src/main/resources/webroot/ /usr/local/src/smartvillage-platform-static/
CMD java $JAVA_OPTS -cp .:* org.computate.smartvillage.enus.vertx.MainVerticle
