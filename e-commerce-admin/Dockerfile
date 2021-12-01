FROM openjdk:8-jre

LABEL MAINTAINER = "mahhss@foxmail.com"

VOLUME /ecommerce-admin

ADD target/e-commerce-admin-1.0-SNAPSHOT.jar e-commerce-admin.jar

EXPOSE 9010

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/e-commerce-admin.jar"]