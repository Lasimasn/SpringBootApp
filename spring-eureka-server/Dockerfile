FROM openjdk:11-jdk-stretch

ADD target/spring-eureka-server-0.0.1-SNAPSHOT.jar   src/main/eureka-server/spring-eureka-server-0.0.1-SNAPSHOT.jar

WORKDIR /src/main/eureka-server

ENTRYPOINT ["java","-jar","spring-eureka-server-0.0.1-SNAPSHOT.jar"]