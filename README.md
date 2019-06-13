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
## Testing the APIs
You can test them using postman or any other rest client

Me I am using RestLet Client chrome extension

![alt text](https://github.com/asopiah/Images/blob/master/notes_api_testing.gif)

## I have deployed this rest API on [Heroku](https://www.heroku.com/)
Use below endpoints to test CRUD operations live without running the application localy. You only require [Postman](https://www.getpostman.com/
) or any other rest client.

GET https://sopia-notes-api.herokuapp.com/api/notes --Get all the notes

POST https://sopia-notes-api.herokuapp.com/api/notes -- Create a new note

GET https://sopia-notes-api.herokuapp.com/api/notes/{noteId} -- Get a specefic note 

PUT https://sopia-notes-api.herokuapp.com/api/notes/{noteId} -- Update a given note

DELETE https://sopia-notes-api.herokuapp.com/api/notes/{noteId} -- Delete a given note


## Issue
Please open an issue if you encounter an error while running or using this code

Please make sure to update tests as appropriate.

## License
clone, use, modify and use as you may wish to
