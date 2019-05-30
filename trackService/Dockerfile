FROM openjdk:11-jdk-stretch
ADD /target/userservice-0.0.1-SNAPSHOT.jar  src/main/track-config/userservice-0.0.1-SNAPSHOT.jar
WORKDIR /src/main/track-config
ENTRYPOINT ["java","-jar","userservice-0.0.1-SNAPSHOT.jar"]

