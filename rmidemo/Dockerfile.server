# Busybox with a Java installation

FROM docker.io/jeanblanchard/busybox-java
MAINTAINER gbsnaker <longmenkezhai@sohu.com>


# Set environment
ENV JAVA_HOME /opt/jdk
ENV PATH ${PATH}:${JAVA_HOME}/bin

COPY server.jar /server.jar
CMD ["/opt/jdk/bin/java","-jar", "/server.jar", "1099"]  
