# Estate

This project was generated with Java 17 and Spring Boot 3.2.2.

## Start the project

Git clone:

> git clone https://github.com/davipro34/HR-association.git

Go inside folder:

> cd HR-association

### Java
Launch Back-end whit Spring Boot Dashboard :

### H2 Console
Regarding the H2 console, once the application is started, you can go to the URL “http://localhost:9000/h2-console”.
A login window opens, and it is necessary to indicate the Jdbc URL (which changes each time the application is started).

In your console, you will have a line that should look like the following:
“H2 console available at '/h2-console'. Database available at 'jdbc:h2:mem:b59feadd-5612-45fe-bd1c-3b62db66ea8a'”.

Get the JDBC URL (in this case jdbc:h2:mem:b59feadd-5612-45fe-bd1c-3b62db66ea8a'), enter into the form as below, then “Connect”. The default username is “sa”, and the default password is empty.

## Ressources
### H2 env

Concerning the configuration of H2, it is also about providing the structure of the database and data.
To help, a file named "src/main/resources/data.sql" is provided
It contains the structure that will be used, as well as some data.
This is a single table named Employees, with 5 columns.

