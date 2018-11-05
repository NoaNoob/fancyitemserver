FROM tomcat:8.0.20-jre8

RUN mkdir /usr/local/tomcat/webapps/myapp

COPY /target/fancyitemserver-0.0.1-SNAPSHOT.war.war /usr/local/tomcat/webapps/myapp.war