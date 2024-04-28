# Base image with Java 17 and Maven
FROM adoptium/openjdk:17-slim

# Environment variable for JAR filename (optional)
ARG JAR_FILE=target/*.jar

# Set working directory
WORKDIR /app

# Copy application JAR
COPY ${JAR_FILE} application.jar

# Expose Spring Boot port (default 8080)
EXPOSE 8080

# Install PostgreSQL JDBC driver
RUN apt-get update && apt-get install -y postgresql-jdbc

# Environment variables for database connection (replace with your details)
ENV DB_HOST=db
ENV DB_PORT=5432
ENV DB_NAME=your_database_name
ENV DB_USERNAME=your_username
ENV DB_PASSWORD=your_password

# Copy application properties with database connection details
COPY application.properties .

# Start Spring Boot application
CMD ["java", "-jar", "application.jar"]
