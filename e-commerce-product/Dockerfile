FROM openjdk:8-jre-alpine

LABEL MAINTAINER = "mahhss@foxmail.com"

VOLUME /ecommerce-product

ADD target/e-commerce-product-1.0-SNAPSHOT.jar e-commerce-product.jar

EXPOSE 9040

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/e-commerce-product.jar"]