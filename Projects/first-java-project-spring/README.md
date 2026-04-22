# Task 1 – Spring Boot Controller

## Project Overview
This project is a simple **Spring Boot** application created as part of **Task 1**.  
It demonstrates:

- Creating a Spring Boot project from scratch
- Writing the first Spring controller
- Handling HTTP GET requests
- Passing parameters via URL
- Using the MVC pattern (Controller → Model → View)

The application runs on an embedded Tomcat server and is accessible at `localhost:8080`.

---

## Technologies Used
- Java
- Spring Boot
- Spring Web
- Thymeleaf
- Maven

---

## Controller Description

### `HelloController.java`

This controller is responsible for handling HTTP requests and returning responses or views.

```java
@Controller
public class HelloController {
