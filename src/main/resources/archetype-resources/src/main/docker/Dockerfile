#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )

FROM frolvlad/alpine-oraclejdk8:slim
VOLUME /tmp
ADD ${project.build.finalName}.jar app.jar
RUN sh -c 'touch /app.jar'
ENV JAVA_OPTS=""
ENV CLOUD_SEA_CONFIG_SERVER_URI=http://172.17.0.2:9001
ENV SPRING_APPLICATION_NAME=${artifactid}
ENV MONGO_HOST=139.59.33.41
ENV MONGO_PORT=27017
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar" ]
