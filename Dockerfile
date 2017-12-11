FROM java:8-jdk

ENV HOME=/home/application

WORKDIR $HOME/spring-boot-rest-api

ADD build/libs/spring-boot-rest-api.jar spring-boot-rest-api.jar

CMD ["java", "-jar", "spring-boot-rest-api.jar"]