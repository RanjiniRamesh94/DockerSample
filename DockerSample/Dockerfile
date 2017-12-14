FROM java:8
VOLUME /tmp
ADD target/DockerSample-0.0.1-SNAPSHOT.jar dockersample.jar
EXPOSE 9014
RUN bash -c 'touch /dockersample.jar'
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /dockersample.jar" ]
