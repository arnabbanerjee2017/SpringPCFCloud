# SpringPCFCloud
======================================================================================================
Spring PCF Demo
----------------------------
This project demonstrates the basics of Pivotal Cloud Foundry using Spring Boot app.
This app just fetches data from a hosted MySQL Database. The database is hosted on PCF as a service.
The manifest.yml file is -
					applications:
					- name: spring-pcf-demo
					  memory: 768M
					  instances: 2
					  random-route: true
					  path: target\SpringPCFDemo-0.0.1-SNAPSHOT.jar

Build the project - mvn clean install
Then push to PCF - cf push

======================================================================================================
Spring PCF Actuator
----------------------------
This project demonstrates the working of Spring Boot Actuator on PCF.
First add the dependency and the plugin in the pom.xml as below -
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-actuator</artifactId>
		</dependency>
		
		<build>
			<plugins>
				<plugin>
					<groupId>org.springframework.boot</groupId>
					<artifactId>spring-boot-maven-plugin</artifactId>
					<executions>
						<execution>
							<goals>
								<goal>build-info</goal>
							</goals>
						</execution>
					</executions>
				</plugin>
				<plugin>
					<groupId>pl.project13.maven</groupId>
					<artifactId>git-commit-id-plugin</artifactId>
				</plugin>
			</plugins>
		</build>

The manifest.yml file as below - 
		applications:
		- name: spring-pcf-actuator
		  memory: 768M
		  instances: 2
		  random-route: true
		  path: target\SpringPCFActuator-0.0.1-SNAPSHOT.jar
		  
Add the below in application.properties - 
management.info.git.mode=full

Build the project - mvn clean install
Then push to PCF - cf push

======================================================================================================
Spring PCF Eureka Demo
----------------------------
This project is demo to explain the working of Eureka on PCF. This project consists three sub-projects - SpringPCFEurekaServer, SpringPCFEurekaClient, and  SpringPCFEurekaMainClient.
The SpringPCFEurekaServer is a Eureka server. Check the manifest.yml, pom.xml, application.properties, and the annotation above the main class of the application.
The SpringPCFEurekaClient is a Eureka client and it registers with the Eureka server as a client. Check the manifest.yml, pom.xml, application.properties, and the annotation above the main class of the application.
SpringPCFEurekaMainClient is also a Eureka client and it also registers with the Eureka server as a client. It will call the Eureka client using the app-name registered with the Eureka server. Check the manifest.yml, pom.xml, application.properties, and the annotation above the main class of the application. Also check the source files.
======================================================================================================
