# Contacts
Demo app which provides backend services to manage contacts.

## Technologies
1. Spring Boot Web
1. Spring Boot Data
1. Spring Boot Actuator
1. MongoDb
1. Docker
1. Spock
1. Gradle
1. Swagger

## Build
`./gradlew build`

## Run
`docker-compose up`

If the application changed then the image needs to be rebuilt so run `docker-compose up --build --force-recreate` instead.

## Stop
`docker-compose stop`