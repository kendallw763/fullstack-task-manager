![ChatGPT Image Jul 8, 2025 at 07_52_41 AM](https://github.com/user-attachments/assets/b8e95e0e-c4ed-47ae-bc08-7038066259a3)


# 📊 Task Manager 
<img width="1679" alt="Screenshot 2025-07-07 at 1 54 57 PM" src="https://github.com/user-attachments/assets/e7167169-d574-4847-b126-1783494778e0" />
<img width="1679" alt="image 1 52 09 PM" src="https://github.com/user-attachments/assets/5c16b8ca-06cf-4ecd-9b40-7e3959841c68" />
<img width="574" alt="Screenshot 2025-07-07 at 1 55 10 PM" src="https://github.com/user-attachments/assets/9cc84aae-99a6-43ee-b87b-f282aa0bc185" />
<img width="576" alt="image 4 48 46 PM" src="https://github.com/user-attachments/assets/3f153f48-19d5-4782-9483-f205be515fd3" />




    
  ## 🧠 Purpose -
    Task manager is intended to send API request to the front-end browser for user view. Weather for collaboration among teammates or to be a part of a larger application clients and stakeholders can view, add, delete, and update their tasks. This application is scalable to allow API calls to the backend via React from the front end.
  
  ## Key Features 
    • CRUD operations
    
    • validation/security 
    
    • data persistence 
    
    • limited boilerplate code 
    
    • auto dependency injection   
    
    • The UI scales per request
    
    • automated build tools & testing capabilities 
    
    • Responseive yet modern layout
    
    • can be viewd on multiple screen sizes comofortably and with ease.
    

   
   # 📔 Requirements Analysis

  ## Functional Requirements

    • Create, read, update, and delete tasks (from the backend) and send the requests to the front end
  
    • Query tasks by completion/id/description
  
    • RESTful endpoints
  
    • React front end data table must scale per CRUD operation
  
    • Whole application must be scalible to add newer features to the front or backend. Such as a way to pperform CRUD operations from the user interface.
  
  
## Non-Functional Requirements

    • Secure API
    
    • Fast response time
    
    • Containerized
    
    • Works with PostgreSQL & CSV integration
    
    • API endpoint browser display for testing, collaboration, scalable & reusable for future builds and new add ons


##  Domain Model (Entities)

Example: Task

| id          | long    | primary key, auto-gen | unique task id         |
|-------------|---------|-----------------------|------------------------|
| title       | string  | not null, max length  | task name/ title       |
| description | string  | optional              | task details           |
| status      | boolean | default: true/false   | task statue (complete) |

## Architecture Layer Overview

    • Controller Layer: Handles HTTP requests and responses
    • Service Layer: Contains business logic
    • Repository Layer: Talks to the database
    • Domain Model/Entity Layer: Defines data structure (tables)


## Configuration File

## Recourses/application.properties 

| property                             | purpose                   |
|--------------------------------------|---------------------------|
| spring.datasource.url                | connects to postgresql db |
| spring.datasource.username           | db username               |
| spring.datasource.hibernate.ddl-auto | auto creation of tables   |
| spring.jpa.show-sql                  | logs queries              |
| server.port                          | local port app runs on    |



## Key Annotations to Understand

| annotation                      | description                        |
|---------------------------------|------------------------------------|
| @RestController                 | marks class as REST APPIP handler  |
| @RequestMapping                 | maps HTTP routes                   |
| @Service                        | marks a service class              |
| @Repository                     | enables db access logic            |
| @Entity                         | maps class to db table             |
| @Autowired                      | injects dependencies automatically |    
 | @GetMapping, @PostMapping, ect. | Route specific handlers            |


## Data Flow
    • Client (Postman/Swagger UI) → Controller → Service → Repository → PostgreSQL



## Tools & Technologies Used
![image](https://github.com/user-attachments/assets/ce49d103-c7ac-4928-a02f-ec812a26cddd)

    • Spring Boot: API framework for Java programming & automated build tests

    • PostgreSQL: Relational database for data storage and retrieval

    • Postman: Complex API testing

    • Maven: Dependency management & injection

    • IntelliJ IDEA: Development environment

    • Docker: Containerization of applications images

    • Swagger: Collaborative UI for API endpoints displayed on browser for collaboration

    • Java: Programming business logic

    • Render: Cloud deployment and application management (cheaper less of a learning curve compared to AWS)
   
    • HTML/CSS: Structure & styling

    • JavaScript: Functional components & API requests from the back end
    
    • React: Future reuse & ease of building front end user components for API view.

 ## Testing & Validation

    • Integration/manual testing (mvn spring-boot:run, IntelliJ IDEA play button, Postman desktop for API testing and Swagger UI for browser API testing view for customers & stakeholders)

## Best Practices

    • Always separate concerns (Controller ≠ Service ≠ Repository)

    • Use DTOs (Data Transfer Objects) for clean data exchange

    • Always use Iterative development (write a little code then run the program)

    • Log and fix important warnings and errors before containerization via Docker if not... (will have to rebuild container after codebase is updated = extra work in the long run)

 ## Confluence

    • Crafted to run both front end and backend components in one command
    • Npm install confluence within the root directory of the project (project name)
    • Root project folder/package.json.

    **Note - Write the script to run front and back ends of the application (dev: concurrently \”npm run -- prefix rootFolderNameOf front end code dev\” \” mvn spring-boot:run \”).
    **Note - there is not a folder for the backend code to be scripted because spring boot runs from the root directory

# 🧪 Backend/Frontend communication via file path with port number

  ## Frontend - TaskList -

    useEffect(() => {
    axios.get('http://localhost:8080/api/tasks')
    .then(response => setTasks(response.data))
    .catch(error => console.error(error));
    }, []);


  ## Frontend - Vite.config -

    export default defineConfig({
    plugins: [react()],
    server:{
    proxy:{
    '/api': {
    target: 'http://localhost:8080',
    changeOrigin: true,
                }
            }
        }
    })

  ## Backend - TaskController –
  
    @CrossOrigin(origins = "http://localhost:5173") //allow frontend requests

## Backend - application.properties - 
  
     spring.datasource.url=${SPRING_DATASOURCE_URL:jdbc:postgresql://localhost:5432/task-manager-api}

     **Note - The dollar signs are here because it makes it easier for the application to find the route when using docker and other tools.
     all of these file paths and port numbers are paramount for the application to communicate properly. These are the standard port numbers used by React, PostgreSQL, Postman API tester and the database.
    
  ## Swagger UI route – 

    localhost8080/api/tasks to view API endpoints for collaboration

  ## 📚 Recourses: 
  https://spring.io |
  https://www.jetbrains.com/idea/ |
  https://www.docker.com |
  https://www.postman.com |
  https://swagger.io |
  https://react.dev |
  https://www.postgresql.org |
