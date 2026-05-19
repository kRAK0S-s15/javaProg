# Second Java Project – Spring REST API

## Project Description

This project is a **REST API application built with Spring Boot**.  
It allows managing products using standard HTTP methods.

The application follows the **MVC architecture** and uses:

- Spring Boot 
- Spring Web
- Spring Data JPA
- H2 Database (in-memory)
- Swagger (OpenAPI) 

---

## Technologies

- Java 25
- Spring Boot **v4.0.6**
- Maven
- H2 Database
- Swagger UI **v3.0.3**

---

## Application starts on:
http://localhost:8080

---

## Swagger UI

Open in browser:
http://localhost:8080/swagger-ui/index.html

<a href="https://postimages.org/" target="_blank"><img src="https://i.postimg.cc/vHF0ddJb/swagger-Pannel.png" alt="swagger-Panel"></a><br><br>

---

## IntelliJ HTTP
Base endpoint:
http://localhost:8080/api/v1/products

---

##  Available Endpoints

### Create Product (POST)
POST /api/v1/products

### Get Product by ID (GET)
GET /api/v1/products/{id}

<a href="https://postimg.cc/yWjmF26Q" target="_blank"><img src="https://i.postimg.cc/7Y8KyyFk/error-Handling-and-find-By-Id.png" alt="error-Handling-and-find-By-Id"></a><br><br>

### Get All Products (GET)
GET /api/v1/products

<a href="https://postimages.org/" target="_blank"><img src="https://i.postimg.cc/28R0ffsR/find-All-jv.png" alt="find-All-jv"></a><br><br>

### Update Product (PUT)
PUT /api/v1/products/{id}

### Delete Product (DELETE)
DELETE /api/v1/products/{id}

<a href="https://postimg.cc/grsVv1cg" target="_blank"><img src="https://i.postimg.cc/4NkWTTDR/delete-Mapping.png" alt="delete-Mapping"></a><br><br>

---

## Database
### H2 Console:
http://localhost:8080/console

### JDBC URL:
jdbc:h2:mem:testdb

<a href="https://postimg.cc/23GQ4gjX" target="_blank"><img src="https://i.postimg.cc/CLTcVV3Y/db-h2-jv.png" alt="db-h2-jv"></a><br><br>

---

## Key Concepts Used

- REST API design
- Dependency Injection
- Layered architecture
- DTO (Request / Response objects)
- Mapping (ProductMapper)
- Spring Data JPA
- Exception handling

