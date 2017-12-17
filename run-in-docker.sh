./gradlew clean build --daemon &&
docker stop $(docker ps -qa) || true &&
docker build -t "spring-boot-rest-api" . &&
docker run -p 8080:8080 -t "spring-boot-rest-api"