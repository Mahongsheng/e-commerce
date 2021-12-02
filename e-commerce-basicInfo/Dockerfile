FROM openjdk:8-jre-alpine

LABEL MAINTAINER = "mahhss@foxmail.com"

VOLUME /ecommerce-basicInfo

ADD target/e-commerce-basicInfo-1.0-SNAPSHOT.jar e-commerce-basicInfo.jar

EXPOSE 9020

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/e-commerce-basicInfo.jar"]