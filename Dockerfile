FROM gradle:4.7.0-jdk8-alpine
WORKDIR /contacts
COPY --chown=gradle:gradle . .
RUN gradle bootJar
CMD ["java", "-Dspring.profiles.active=dockercompose", "-jar", "build/libs/contacts.jar"]