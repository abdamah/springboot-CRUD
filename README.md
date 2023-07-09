# springboot-crud

## This project is for study purposes

![Get Request](https://github.com/abdamah/springboot-CRUD/blob/main/get_request.png)

### Prepare dependencies

- spring boot web
- 0spring boot jpa
- spring Devtools
- H2 Database
- lambok

### Create Entity classes

- Todo class: create properties with @Lombok, @Jpa annotations
- TodoStatus enum to represent the status of Todo.

### Create Repository interface

- TodoRepository: interface with @Repository stereo type annotation

### Create Service interface

- TodoService: with all necessary methods

### Create Service Impl

- TodoServiceImpl: Implement all services methods with repositories @Service stereo type annotation

### Create Controller class

- TodoController: Implement all endpoints methods with ResponseEntity types with @RestController stereo type annotation

### Installation

- make a clone of this repo
- git clone https://github.com/abdamah/springboot-CRUD.git
- Then open with your favorite editor
- make sure you have downloaded all the dependencies
- configure application.yml for H2 Database
- Run the application

## Test Apis

- Use your favorite api endpoint test here I used POSTMAN.
