# Use the official OpenJDK base image
FROM openjdk:17-jdk-slim

# Set the working directory
WORKDIR /app

# Copy the JAR file into the container
COPY target/ratings_data_service_jar/ratings-data-service.jar app.jar

# Expose the port that the application will run on (adjust as needed)
EXPOSE 8083

# Specify the command to run your application
CMD ["java", "-jar", "app.jar"]