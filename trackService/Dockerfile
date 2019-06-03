FROM openjdk:11-jdk-stretch

WORKDIR /src/main/track-config

ADD ./target/userservice-0.0.1-SNAPSHOT.jar  /src/main/track-config/userservice-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java","-jar","userservice-0.0.1-SNAPSHOT.jar"]

