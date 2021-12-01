FROM openjdk:8-jre-alpine

LABEL MAINTAINER = "mahhss@foxmail.com"

VOLUME /config-server

ADD target/e-commerce-config-server-0.0.1-SNAPSHOT.jar e-commerce-config-server.jar

EXPOSE 8888

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/e-commerce-config-server.jar"]