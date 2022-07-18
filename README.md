# Backend-SocialMedia

# Tech used 
1.  Spring Boot (version 2.7.1)
2.  Spring Data JPA
3.  Hibernate 5.5
4.  REST Repositories 
5.  MySQL Database
6.  Maven (version 3.8.5)
7.  Log4j2
8.  Lombok (version 1.18.24)
9.  IDE : Spring Tool Suite 4 (Version: 4.15.1.RELEASE)
10.  Java version: 17.0.3
11. Postman (version 9.4)

# Architecture

1. Controller layer
2. Service layer 
3. Repository layer
4. Model layer

# STEPS (REST API)
1. Created 4 controllers(user, post, status and comment)
2. Created the get, post and delete mappings for the end points.
3. From Controller the program flow goes to the service class.
4. Created 4 services (userService, postService , statusService, commentService)
5. Using micro-services architecture.
6. Now the program flow goes to the repository class.
7. Created 4 reposotories (user repo, status repo, comment repo, comment repo).
8. These repositories extends the JpaRepositories
9. JpaRepositories contains all the CRUD pre-defined functions with pagination functionality.
10. Created the entity class(pojo) : user, status, comment, post.
11. In entity class , I have used the hibernate and persistance annotations for mapping the tables(OneToMany) and creating the tables and the primary key.

# Logging 
1. Injected the logging framework Log4j2 in this project.
2. In resources, created Log4j2.properties file that contains all the information for the logging.
3. The logging level is info.
4. Destination is console and external log file in the drive.
5. For all the endpoints, loggings will be done.

# ER Diagram
<br>
<img src ="https://github.com/Siddhanttimeline/Backend-SocialMedia/blob/main/ER%20final.png ">
