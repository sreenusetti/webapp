FROM jboss/wildfly
ADD /target/maven1-0.0.1-SNAPSHOT.jar /opt/jboss/wildfly/standalone/deployments/
ENV JBOSS_HOME /opt/jboss/wildfly
CMD ["/opt/jboss/wildfly/bin/standalone.sh", "-b", "0.0.0.0"]
