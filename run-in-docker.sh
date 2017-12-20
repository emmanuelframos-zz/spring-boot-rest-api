./gradlew -q build --daemon --build-cache --parallel --configure-on-demand -x test &&
docker stop $(docker ps -qa) || true &&
docker-compose build &&
docker-compose up -d