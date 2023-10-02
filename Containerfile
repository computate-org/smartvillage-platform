FROM quay.io/computateorg/smartvillage-traffic-light-controller-sumo:computate-api

MAINTAINER Christopher Tate <computate@computate.org>

ENV APP_DEPENDENCIES="java-11-openjdk-devel maven" \
  JAVA_HOME=/usr/lib/jvm/java-11-openjdk

USER root

RUN yum install -y ${APP_DEPENDENCIES}

RUN install -d /usr/local/src/smartabyar-smartvillage
COPY . /usr/local/src/smartabyar-smartvillage
RUN git clone https://github.com/computate-org/computate.git /usr/local/src/computate

RUN git clone https://github.com/computate-org/computate-base.git /usr/local/src/computate-base
RUN git clone https://github.com/computate-org/computate-search.git /usr/local/src/computate-search
RUN git clone https://github.com/computate-org/computate-vertx.git /usr/local/src/computate-vertx
RUN git clone https://github.com/computate-org/smartabyar-smartvillage-static.git /usr/local/src/smartabyar-smartvillage-static
WORKDIR /usr/local/src/computate-base
RUN mvn clean install -DskipTests
WORKDIR /usr/local/src/computate-search
RUN mvn clean install -DskipTests
WORKDIR /usr/local/src/computate-vertx
RUN mvn clean install -DskipTests

WORKDIR /usr/local/src/smartabyar-smartvillage
RUN mvn clean install -DskipTests
RUN cp /usr/local/src/smartabyar-smartvillage/target/*.jar /usr/local/src/smartabyar-smartvillage/app.jar
RUN cp -r /usr/local/src/smartabyar-smartvillage/src/main/resources/webroot/ /usr/local/src/smartabyar-smartvillage-static/
CMD java $JAVA_OPTS -cp .:* org.computate.smartvillageview.enus.vertx.MainVerticle
