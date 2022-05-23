FROM openjdk:11-jre

#RUN mvn clean install
EXPOSE 2345
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]