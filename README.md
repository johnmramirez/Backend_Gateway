# Backend Gateway

ABOUT:

A Spring Cloud Gateway service utilizing Java, and Spring Cloud Gateway.
This service receives and forwards HTTP requests between clients
and the various backend systems.

USE:
This app can be used with any of the backend system repos. To use with a specific
system, switch to the branch with the same title as the backend system.

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

