Getting Started with App42PaaS-Roo-PostgreSQL Sample Application:
---------------------------------------------------------

This application is basically a simple User Input Form that takes input from user and saves it in database.

<b>[Download the source code from git.](https://github.com/shephertz/App42PaaS-Roo-PostgreSQL-Sample/archive/master.zip)</b>

Note: This project is build with roo 1.2.3


Create Roo application:
-------------------------

	$ mkdir App42PaaS-Roo-PostgreSQL-Sample
	$ cd App42PaaS-Roo-PostgreSQL-Sample
	$ roo
    ____  ____  ____  
   / __ \/ __ \/ __ \ 
  / /_/ / / / / / / / 
 / _, _/ /_/ / /_/ /  
/_/ |_|\____/\____/    W.X.Y.ZZ [rev RRR]


Welcome to Spring Roo. For assistance press TAB or type "hint" then hit ENTER.
roo> project --topLevelPackage com.shephertz.app42.paas
roo> persistence setup --provider HIBERNATE --database POSTGRES
roo> entity jpa --class com.shephertz.app42.paas.App42User
roo> field string --fieldName name
roo> field string --fieldName email
roo> field string --fieldName description
roo> controller scaffold --class ~.App42User
roo> web mvc setup
roo> web mvc all --package ~.web


Project Configuration:
--------------------------
		 
        1. Open database.properties (located in src/main/resources/META-INF/spring folder).

        2. Update the details of your PostgreSQL service in it.

                database.driverClassName=org.postgresql.Driver
				database.url=jdbc:postgresql://host:port/dbName  
				database.username=username  
				database.password=password  
      
				// host = service_host  
				// port = service_port  
				// dbName = service_database_name  
				// username = service_username  
				// password = service_password  


Create War using Roo:
-----------------------

	1. Run the following Roo command to create war:
	
		roo> perform package
		
		

Create War using Maven:
--------------------------

	1. Run the following Maven command to create war:
	
		$ mvn clean
		$ mvn install



Deploying Application on App42 PaaS using Binary:
---------------------------------------------------
				
		
	1. Run the app42 deploy command.
        
                  $ app42 deploy
                  $ Enter App Name: <your_app_name>
				  $ 1: Binary
				  $	2: Source
				  $ Choose Upload Type [Binary]: 1
                  $ Would you like to deploy from the current directory? [Yn]: n
                  $ Binary Deployment Path: <your_binary_path>
                  $ This process may take a while, be patient with it.
                  $ Deploying Application... OK
                  $ Please wait it may take few minutes.
                  $ Latest Status....|
                  $ App deployed successfully.
				  

Deploying Application on App42 PaaS using Source (Git):
--------------------------------------------------------

	1. Run the app42 deploy command.
	
				  $ app42 deploy
                  $ Enter App Name: <your_app_name>
				  $ 1: Binary
				  $	2: Source
				  $ Choose Upload Type [Binary]: 2
				  $ Enter Git URL?: <your_public_git_url>
				  $ Deploying Application... OK
                  $ Please wait it may take few minutes.
                  $ Latest Status....|
                  $ App deployed successfully.

