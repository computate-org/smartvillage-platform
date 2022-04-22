FROM registry.access.redhat.com/ubi8/openjdk-11

MAINTAINER Christopher Tate <computate@computate.org>

COPY . .
USER root
RUN mvn clean install -DskipTests
RUN cp /home/jboss/target/*.jar /home/jboss/app.jar
CMD java -XX:+UseParallelOldGC -XX:MinHeapFreeRatio=10 -XX:MaxHeapFreeRatio=20 -XX:GCTimeRatio=4 -XX:AdaptiveSizePolicyWeight=90 -XX:MaxMetaspaceSize=100m -XX:ParallelGCThreads=1 -Djava.util.concurrent.ForkJoinPool.common.parallelism=1 -XX:CICompilerCount=2 -XX:+ExitOnOutOfMemoryError -cp .:/deployments/* org.computate.smartvillageview.enus.vertx.MainVerticle

