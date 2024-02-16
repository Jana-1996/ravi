FROM eclipse-temurin:17
COPY target/ravi.jar ravi.jar
CMD [ "java","-jar","ravi.jar" ]