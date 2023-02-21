#Start with a base image containing Java runtime
FROM openjdk:11-jdk-slim as build

#Information around who maintains the image
MAINTAINER javawebtutor.com

# Add the application's jar to the container
COPY target/account-service-0.0.1-SNAPSHOT.jar accounts-service.jar

#execute the application
ENTRYPOINT ["java","-jar","/accounts-service.jar"]