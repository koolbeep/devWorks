FROM openjdk:8-jre-alpine

EXPOSE 8081

ARG JAR_FILE=devworks-1.0.1.jar

ADD ${JAR_FILE} app.jar

ENTRYPOINT ["java", "-XX:+UnlockExperimentalVMOptions", "-XX:+UseCGroupMemoryLimitForHeap", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/app.jar"]

