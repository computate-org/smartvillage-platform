FROM registry.access.redhat.com/ubi8/openjdk-11

MAINTAINER Christopher Tate <computate@computate.org>

COPY . .
USER root
RUN mvn clean install -DskipTests
COPY --from=0 /home/jboss/target/*.jar /home/jboss/app.jar
ENTRYPOINT [“java”,”-jar”,”app.jar”]

