FROM quay.io/computateorg/smartvillage-traffic-light-controller-sumo:computate-api

MAINTAINER Christopher Tate <computate@computate.org>

ENV APP_DEPENDENCIES="java-11-openjdk-devel maven" \
  JAVA_HOME=/usr/lib/jvm/java-11-openjdk

USER root

RUN yum install -y ${APP_DEPENDENCIES}

RUN install -d /usr/local/src/smartabyar-smartvillage
COPY . /usr/local/src/smartabyar-smartvillage
RUN git clone https://github.com/computate-org/computate.git /usr/local/src/computate
WORKDIR /usr/local/src/smartabyar-smartvillage
RUN mvn clean install -DskipTests
RUN cp /usr/local/src/smartabyar-smartvillage/target/*.jar /usr/local/src/smartabyar-smartvillage/app.jar
CMD java $JAVA_OPTS -cp .:* org.computate.smartvillageview.enus.vertx.MainVerticle
