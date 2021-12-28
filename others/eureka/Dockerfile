FROM java:8
VOLUME /eureka-server
ADD eureka-server-1.0.jar eureka-server.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/eureka-server.jar"]