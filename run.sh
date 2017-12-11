docker stop $(docker ps -qa) || true &&
docker build -t "spring-boot-rest-api" . &&
gradle clean build &&
java -jar build/libs/spring-boot-rest-api.jar