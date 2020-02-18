FROM openjdk:8-jre
WORKDIR /
ADD . /epsi-contrat-0.0.1-SNAPSHOT.jar
CMD java - jar app.jar 