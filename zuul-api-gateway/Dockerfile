FROM openjdk:11-jdk-stretch

ADD target/zuul-api-gateway-0.0.1-SNAPSHOT.jar   target/src/main/zuul-api-gateway/zuul-api-gateway-0.0.1-SNAPSHOT.jar

WORKDIR /src/main/zuul-api-gateway

ENTRYPOINT ["java","-jar","target/zuul-api-gateway-0.0.1-SNAPSHOT.jar"]

