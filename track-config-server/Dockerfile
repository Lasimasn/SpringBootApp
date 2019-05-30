FROM openjdk:11-jdk-stretch

ADD target/track-config-server-0.0.1-SNAPSHOT.jar   src/main/config-server/track-config-server-0.0.1-SNAPSHOT.jar

WORKDIR /src/main/config-server

ENTRYPOINT ["java","-jar","track-config-server-0.0.1-SNAPSHOT.jar"]