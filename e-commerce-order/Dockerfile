FROM openjdk:8-jre-alpine

LABEL MAINTAINER = "mahhss@foxmail.com"

VOLUME /ecommerce-order

ADD target/e-commerce-order-1.0-SNAPSHOT.jar e-commerce-order.jar

EXPOSE 9030

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/e-commerce-order.jar"]