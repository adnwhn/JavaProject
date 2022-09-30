# JavaProject
Java app simulating a store which sells and lends different objects.

### Assignment definition

Select a system to be implemented that allows at least 10 actions/queries to be performed on at least 8 types of objects.

### Implementation 

Implement a project using the Java language that complies to the requirements above. 

The application will:

* include simple classes with private/protected attributes and methods
* include at least 2 different collections capable of administering the objects in the application
* use inheritance for some of the classes used within the collections
* at least one service class that exposes the system's operations 
* a main class that calls the service's methods 

### Auditing

An auditing service will need to be created that will log to a CSV file each time an action from the first stage is performed. Structure of the file: `name_of_action,timestamp`.

## Stage III 

### Database persistence

Create services that use JDBC to store the data in a database of your choosing.
A service will be created that will expose create/read/update/delete operations for at least 4 of the defined classes.
