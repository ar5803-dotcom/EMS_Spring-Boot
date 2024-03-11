#CRUD REST API - Spring Boot

**Overview**

This project demonstrates the implementation of a CRUD (Create, Read, Update, Delete) REST API using Spring Boot, JPA (Java Persistence API), and an H2 in-memory database with a web-based console.

**What is CRUD?**

CRUD stands for Create, Read, Update, and Delete. It represents the basic operations that can be performed on data in a database or API:

Create: Inserting new data into the system.
Read: Retrieving existing data from the system.
Update: Modifying existing data in the system.
Delete: Removing existing data from the system.
In the context of a RESTful API, CRUD operations are typically mapped to HTTP methods:

Create: POST method.
Read: GET method.
Update: PUT or PATCH method.
Delete: DELETE method.

**Implementation Details**

Technologies Used
Spring Boot: A popular Java framework for building microservices and web applications.
Spring Data JPA: Simplifies the implementation of data access layers by providing mechanisms for ORM (Object-Relational Mapping).
H2 Database: An in-memory SQL database that provides a web-based console for easy data manipulation and querying.
Postman: A REST client for testing APIs.
Project Structure
The project follows a standard Spring Boot project structure, with the main components being:

Entities: POJO (Plain Old Java Object) classes representing database entities.
Repositories: Interfaces extending JpaRepository for CRUD operations on entities.
Services: Business logic for processing data and interacting with repositories.
Controllers: Define REST endpoints and handle HTTP requests/responses.
H2 Console
H2 Console is a web-based database management tool provided by the H2 database. It allows users to interact with the in-memory database, execute SQL queries, and view data visually through a web browser.

**
To access the H2 Console, run the Spring Boot application and navigate to http://localhost:8384/h2-console in your web browser. Use the JDBC URL (jdbc:h2:~/test) and default credentials (Username: sa, Password: ak2002).**

Testing with Postman
Postman is a popular tool for testing APIs. You can use it to send requests to the CRUD endpoints exposed by the Spring Boot application and verify the responses. Here's how to test each CRUD operation:

Create: Send a POST request with JSON data to create a new entity.
Read: Send a GET request to retrieve existing entities or a single entity by its ID.
Update: Send a PUT or PATCH request with JSON data to update an existing entity.
Delete: Send a DELETE request with the ID of the entity to be deleted.
Getting Started
Clone the repository to your local machine.
Import the project into your preferred IDE (Integrated Development Environment).
Build and run the application.
Access the H2 Console to interact with the database.
Use Postman to test the CRUD endpoints.
Conclusion
This project demonstrates the implementation of a CRUD REST API using Spring Boot, JPA, and an H2 in-memory database. It provides a foundation for building scalable and maintainable APIs with basic CRUD functionality.

