# Use Java 24 from Eclipse Temurin
FROM eclipse-temurin:24-jdk AS base

# Set the working directory in the container
WORKDIR /task-manager-api

# Copy the compiled JAR from your local machine into the container
COPY target/task-manager-api-0.0.1-SNAPSHOT.jar app.jar


# Expose the port your app runs on (optional)
EXPOSE 8080

# Command to run your app
ENTRYPOINT ["java", "-jar", "app.jar"]
