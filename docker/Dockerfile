# Use an official OpenJDK 8 runtime as a parent image
FROM openjdk:8-jdk-alpine

# Set the working directory in the container
WORKDIR /app

# Copy only the JAR file from the target directory to the working directory
COPY /target/PrimeNearshoreProject-1.0-SNAPSHOT.jar /app/PrimeNearshoreProject-1.0-SNAPSHOT.jar

# Run the jar file
CMD ["java", "-jar", "PrimeNearshoreProject-1.0-SNAPSHOT.jar"]