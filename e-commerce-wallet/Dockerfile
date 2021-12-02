FROM openjdk:8-jre-alpine

LABEL MAINTAINER = "mahhss@foxmail.com"

VOLUME /ecommerce-wallet

ADD target/e-commerce-wallet-1.0-SNAPSHOT.jar e-commerce-wallet.jar

EXPOSE 9050

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/e-commerce-wallet.jar"]