# Notes-API
This a simple Spring Boot, H2, JPA, Hibernate Restful CRUD REST API

## Prerequisite/Requirements
 
1. Java - 1.8.x
 
2. Maven - 3.x.x
 
## How to Setup the application /Installation

### 1. Clone the application
```bash
git clone https://github.com/asopiah/Notes-API.git
```

### 2. Build and run using maven
Just go to the root directory of the application and type the following command to run it.
```bash
mvn clean install
```
Then ..
```bash
mvn spring-boot:run
```
The app will start running at http://localhost:8080
## Explore Rest APIs
The app defines following CRUD APIs.
```bash
GET /api/notes

POST /api/notes

GET /api/notes/{noteId}

PUT /api/notes/{noteId}

DELETE /api/notes/{noteId}
```
You can test them using postman or any other rest client


## Issue
Please open an issue if you encounter an error while running or using this code

Please make sure to update tests as appropriate.

## License
clone, use, modify and use as you may wish to
