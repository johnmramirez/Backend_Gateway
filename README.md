# Restaurant_Review_Gateway

ABOUT:

A Spring Cloud Gateway service utilizing Java, and Spring Cloud Gateway.
This service receives and forwards HTTP requests between Restaurant Review clients
and the Restaurant Review backend system.


!!! This project is designed to be used as part of the project2a Restaurant Review ecosystem !!!

\
DOCKER:

The entire application has been "dockerized", allowing it to be converted to a docker image
and deployed as three Docker containers. See the included Dockerfile for details.

\
BUILDING THE JAR:

This project was compiled with OpenJDK 17. Your JAVA_HOME environment variable must be pointing to an instance
of OpenJDK 17.

After confirming your JAVA_HOME, execute the below command within the project root:

    ./gradlew bootJar

The application jar will appear under /build/libs

\
CREATING THE DOCKER CONTAINERS:

Execute the below command within the project root:

    docker build -t cloud_gateway:1.0.0 .

This will create the cloud_gateway image on your local machine.

