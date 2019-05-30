FROM openjdk:11-jdk-stretch
ADD /target/testdemo-0.0.1-SNAPSHOT.jar src/main/user-config/testdemo-0.0.1-SNAPSHOT.jar
WORKDIR /src/main/user-config
ENTRYPOINT ["java","-jar","testdemo-0.0.1-SNAPSHOT.jar"]

