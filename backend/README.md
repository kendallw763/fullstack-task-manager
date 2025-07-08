# Java CRUD Application – Task Manager API
A robust backend application built with Java, Spring Boot, PostgreSQL, Swagger, and Maven, designed to demonstrate core principles of Create, Read, Update, Delete (CRUD) operations through a RESTful API. This project reflects clean architecture practices, modular design, and integration with tools commonly used in real-world enterprise systems.

## 🔧 Tech Stack
Java 24 – Core programming language
Spring Boot – Simplifies application configuration and development
PostgreSQL – Relational database for persistent storage
Spring Data JPA – ORM layer for managing database operations
Postman – API testing and documentation
Maven – Dependency management and project build tool
IntelliJ IDEA – Primary development environment

![image 11 45 34 PM](https://github.com/user-attachments/assets/d32b436a-20c1-4436-9ee3-d317b46c7ed2)

## 📌 Key Features
RESTful API: Built with Spring MVC following REST principles
CRUD Functionality: Endpoints for creating, retrieving, updating, and deleting tasks
DTOs and Entity Mapping: Clean separation between persistence and presentation layers
Exception Handling: Centralized error management with custom exception classes
Validation: Input validation using Spring's @Valid and @NotNull
Containerization Ready: Configured for deployment via Docker with environment variable support
Swagger/OpenAPI Support (optional): For interactive API documentation and client generation (if included)

![image](https://github.com/user-attachments/assets/78203e65-98bc-4ca4-9c13-07786151580c)

## 📂 Endpoints Overview
POST /api/tasks – Create a new task
GET /api/tasks – Retrieve all tasks
GET /api/tasks/{id} – Retrieve a specific task by ID
PUT /api/tasks/{id} – Update an existing task
DELETE /api/tasks/{id} – Delete a task

## Complex API End point Testing 🧪

## ✅ Create
<img width="908" alt="CREATE" src="https://github.com/user-attachments/assets/136f9f04-8150-479f-9d17-526bad5ea2e3" />

## ✅ Read
<img width="911" alt="READ" src="https://github.com/user-attachments/assets/c80d7598-fd67-4159-b718-4c0db502afdd" />

## ✅ Read By ID
<img width="929" alt="READ BY ID" src="https://github.com/user-attachments/assets/89350762-81d2-4257-b1b0-c19858a7f16c" />

## ✅ Update
<img width="911" alt="UPDATE" src="https://github.com/user-attachments/assets/28e61dd7-82bd-4858-980a-07381b8881ee" />

## ✅ Delete
<img width="915" alt="DELETE" src="https://github.com/user-attachments/assets/f81a7889-8be0-4c82-bffd-d930d39aad31" />

# 👨🏾 👨🏻 👨🏿 👨🏼 Collaborative Endpoint UI (Swagger)
![Screenshot 2025-07-04 at 12 54 29 PM](https://github.com/user-attachments/assets/15c584b2-0e78-4eee-801c-ebc87daec95c)

## 🦾 Maven Automation 
Build automation and project management tool used in Java development. It manages a project’s dependencies, builds, and documentation from a single configuration file called the POM (Project Object Model). Maven automatically downloads the libraries your project needs and handles the build lifecycle — making it easier for developers to maintain and share code across different environments.

## 📦 Docker Support
Includes a production-ready Dockerfile for containerizing the application and connecting it with a PostgreSQL instance via Docker Compose, enabling easy deployment and testing in isolated environments.

## 💡 Learning Outcomes
Mastery of REST API design patterns using Spring Boot
Hands-on experience with database integration and persistence logic
Improved understanding of MVC architecture and layered backend development
Exposure to real-world deployment practices with containerization

## Resources 📚
https://spring.io/projects/spring-boot | 
https://maven.apache.org/what-is-maven.html |
https://www.postman.com |
https://www.postgresql.org |
https://www.jetbrains.com/idea |
https://swagger.io


