FROM java:8

COPY /target/GiftService-1.0-SNAPSHOT.jar /home/ec2-user/releases/giftservices/giftservices.jar
COPY /src/main/resources/application.yml  /home/ec2-user/releases/giftservices/application.yml

EXPOSE 9797

RUN chmod -R -776 /home/ec2-user/releases/giftservices/
RUN chmod -R -776 /home/ec2-user/releases/giftservices/giftservices.jar

ENTRYPOINT ["java", "-Xmx512m", "-Xms256m", "-jar", "/home/ec2-user/releases/giftservices/giftservices.jar”, ”—spring.config.location=/home/ec2-user/releases/giftservices/"]