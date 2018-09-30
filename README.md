# Book Management System

Book management system is a simple web application that demostartes the CRUD operations using Spring Boot, Hibernate and MySQL.

## Requirements

1. Java - 1.8.x

2. Maven - 3.3.9

3. MySQL - 5.7.12

4. Hibernate - 5.1.0.Final

5. Spring Boot - 2.0.5

## Getting Started


**1. Clone the application**

```bash
git clone https://github.com/scbushan05/book-management-system.git
```

**2. Create Mysql database**

```
CREATE DATABASE bookdb;
```

Select the database,

```
USE bookdb;
```

Create a table,

```
CREATE TABLE book(
	id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
	title VARCHAR(255) NOT NULL,
	author VARCHAR(255) NOT NULL
	
);
```

**3. Change mysql username and password as per your installation**

+ open `src/main/resources/application.properties`

+ change `db.username` and `db.password` as per your mysql installation

**4. Build and run the app using maven**

```bash
mvn package
```

The app will start running at <http://localhost:8080/>.

## Learn more

You can find the tutorial for this application on my blog - 

<http://bushansirgur.in/complete-crud-application-with-spring-boot-hibernate-and-mysql/>

## Demo

![spring-boot](https://user-images.githubusercontent.com/19311256/46258221-54420300-c4e4-11e8-874c-8210053f5743.gif)


