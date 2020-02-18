FROM openjdk:8-jre
WORKDIR /
ADD app.jar app.jar 
CMD java - jar app.jar 