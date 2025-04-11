FROM openjdk
COPY ./build/libs/first-java-docker-1.0-SNAPSHOT-all.jar /app/start.jar
WORKDIR /app
ENTRYPOINT ["java","-jar","/app/start.jar"]