# multipleDatabaseSpringBoot

Creating SpringBootApplication with multiple Database by using Quaifier Bean along with Primary Database MySql. 

Technologies Stack:
•	Language: Java
•	Development Kit: Java SDK 8
•	Framework: SpringBoot
•	Build Automation Tool: Maven
•	Database: Mysql 5.1.1
•	ORM: Hibernate
•	Service API: REST API
•	IDE: STS 3.9.2

Installing and Running Application
Please follow carefully step by step instructions below in order to get the app up and running locally.
1.	Copy the Shared (zip) file into your local System and Extract the File.
2.	Import the file as Existing Maven Project into your Eclipse or STS.
3.	Clean and Install the Maven dependency – in case of any errors in POM file, please do a force update of the project.
4.	Go to MultipleDatabaseApplication main class and Run the Project as Java Application.


API Documentation
Localhost base URL: http://localhost:2020/club
Localhost base URL: http://localhost:2020/shortcode
Note: 
•	Windows: In order to test RESTful API Endpoints you need to use an HTTP Client Tool, such as postman.
•	Ubuntu/Linux: In order to test RESTful API Endpoints you may need either a HTTP client tool such as Postman or we can also use terminal to hit CURL command (commands given later in this document).


Data Source:- 
application.properties

#Subscription
spring.subscription.datasource.driver-class-name=com.mysql.jdbc.Driver
spring.subscription.datasource.url=jdbc:mysql://m.mysql-preprod-1.ext.arvm.de:3306/subscription
spring.subscription.datasource.username=mondia-master
spring.subscription.datasource.password=B1ll1ngGWt35t
spring.subscription.datasource.test-on-borrow=true
spring.subscription.datasource.validation-query=select 1 from dual

#Smsgw
spring.smsgw.datasource.driver-class-name=com.mysql.jdbc.Driver
spring.smsgw.datasource.url=jdbc:mysql://m.mysql-preprod-1.ext.arvm.de:3306/smsgw
spring.smsgw.datasource.username=mondia-master
spring.smsgw.datasource.password=B1ll1ngGWt35t
spring.smsgw.datasource.initialize=true


