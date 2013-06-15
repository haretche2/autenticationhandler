authenticationhandler
====================
Handles authentication of users

To use the project, follow the next steps:

1) Install the following maven projects before starting: 
	modelstorage (https://github.com/marshhxx/modelstorage) 
 
2) Download sources for AuthenticationHandler from git repository: 
	git pull https://github.com/haretche2/autenticationhandler

3) Run in command line, where the sources have been downloaded:
	mvn clean install 

4) To add dependency to pom.xml, in dependencies copy: 
			<dependency>
    				<groupId>autenticationhandler</groupId>
    				<artifactId>autenticationhandler</artifactId>
    				<version>1.0-SNAPSHOT</version>	
			</dependency>
		
5) To use the jar in another context the correspondent file will be generated under ./target folder
		
Note: When used, make sure that the libraries which scope is �provided� in the dependencies are available, and that those that are not provided and are included with the file do not create conflicts with already loaded libraries.
