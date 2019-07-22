FROM openjdk:8-jre-alpine
COPY build/libs/contacts-*.jar /contacts.jar
CMD ["java", "-jar", "contacts.jar"]