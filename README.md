# CMS Shopping Cart: Online Store Utilisation
a web application that can carry out the essential e-commerce tasks using Spring Boot.


Features
--------

### From the viewpoint of the user

- Simple registration and login - Easy product filtering
- Product assortment - Shopping basket - Order synopsis
- PayPal payments

### From an administrative standpoint
- Simple login
- Pages (create, modify, remove, arrange)
- Add, modify, and remove products - Add, edit, delete, and sort categories

Used Instruments
----------- - Java 11; MySQL Community Server 8.0.23; Thymeleaf; Spring Boot v2.4.2; Maven v3.6.3; Spring Security and roles
- JPa Data Spring


Configuring a Database --------------- ### Using Workbench for MySQL:

Select Data Import from the Server menu. Then, select Import from Self-Contained File.
- From the `database} directory, choose the file `cmsshoppingcart.sql`.
- In the Schema for Default Target: Make a fresh schema with the name `cmsshoppingcart}.
- Pick one of the following options: {Dump Structures Only}: Select Import Now.
- Click Start Import

Setting Up a Database with Spring Boot
---------------—------------—
Modify the configuration of the database connection in 

`src/main/resources/application.properties} in cmsshoppingcart

*/resources/main/src/main/application.properties}

The path {restclient/src/main/resources/application.properties}
spring.datasource.url=localhost/cmsshoppingcart;jdbc:mysql
spring.datasource.root_username
{{{ spring.datasource.password=

Setup of the Project ------------- - Clone the file, then open it in Visual Studio Code (you can use another IDE as long as the spring boot plugins are installed).
Modify the configuration of the database connection in `src/main/resources/application.properties}.
- Use the command "mvn install" or the IDE's auto import feature to install Maven dependencies.
- Launch the application from the project root directory by calling ``mvn spring-boot:start}}.
- Visit http://localhost:8080/ or http://localhost:8080/admin/pages. 

