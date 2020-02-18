FROM openjdk:8-jre
WORKDIR /
ADD build/libs/epsi-contrat-0.0.1-SNAPSHOT.jar /epsi-contrat-0.0.1-SNAPSHOT.jar
CMD java - jar app.jar 