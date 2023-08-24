FROM azul/zulu-openjdk:17-latest
VOLUME /tmp
ARG JAR_FILE
COPY build/libs/aupp-demo.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]

EXPOSE 8081