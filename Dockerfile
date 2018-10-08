FROM openjdk:10
WORKDIR usr/src
ENV MYSQL_DATABASE=mydatabase
ENV MYSQL_USER=root
ENV MYSQL_PASSWORD=12345
ENV MYSQL_CI_URL = jdbc:mysql://localhost:3306/mydatabase
ADD ./target/moviesdb-0.0.1-SNAPSHOT.jar usr/src/moviesdb-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","usr/src/moviesdb-0.0.1-SNAPSHOT.jar"]
