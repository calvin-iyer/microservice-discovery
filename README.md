# Spring Boot Microservice Architecture using Eureka
A set of sample applications designed using Spring Boot to demonstrate setting up a microservice architecture and using
service discovery to access the different service.

##Project Structure
- `dataservice` - Represents the service that would be connected to your datastore and 
could have multiple nodes.
- `restservice` - Represents the client facing REST API server which could have multiple nodes and could be serviced 
via an Application Gateway
- `eureka` - Represents the Eureka discovery service server which the other services call to register themselves. This
could also be deployed on multiple nodes to handle failover of the Eureka server.

##Usage
You can spin up the services by the following command via the command line:
``
mvn spring-boot:run
``

To spin up multiple `dataservice` nodes you can use the following command:
``mvn spring-boot:run -Dspring-boot.run.arguments="--server.port=8082 --data.service.identifier=dataservice-2"``
You will have to edit the port and service identifier based on how many instances you want to spin up.

You can then access the following urls on the `restservice`:
- Fetch Instance Information (`dataservice` can be replaced with any name based on the `spring.application.name` property)
    ``http://localhost:8080/instance/dataservice``
    
- Fetch data (In case you have multiple `dataservice` nodes running this should return different values based on the `data.service.identifier` property in the `dataservice` project)
    ``http://localhost:8080/data/name`` 