
# Learn Microservices Architecture and Docker

A simple microservices project with Students and Classes services built with

- Java 17
- Spring Boot
- PostgreSQL
- Flyway
- Gradle
- Eureka (Netflix Service Discovery)
- Docker

This project demonstrates basic **CRUD operations** and **inter-service communication** using `RestClient`.

## Project Structure

- `discovery-service`: Eureka discovery server
- `api-gateway`: Routes and proxies requests to services
- `students-service`: Handles student-related basic operations
- `classes-service`: Handles class-related basic operations
- `common`: Shared library used by both services

## Project Setup


### Clone the Repository

```bash
git clone https://github.com/KusalDemo/learn-microservice-architecture.git
cd simple-hrms
```


### Install Dependencies

Ensure Java 17 is installed.
Install Docker and Docker Compose for running PostgreSQL databases.
Gradle is included in the project (use ./gradlew).


### Set Up PostgreSQL Databases

The project uses two PostgreSQL databases `simplehrms_students` and `simplehrms_classes`.  
If running locally without Docker, ensure PostgreSQL is installed and create the databases.

```bash
psql -U postgres -c "CREATE DATABASE simplehrms_students;"
psql -U postgres -c "CREATE DATABASE simplehrms_classes;"
```

### Build the Project

Run the following command to build all modules

```bash
./gradlew build
```

## How to Run the Application

### Local Setup (Without Docker)

#### Start PostgreSQL Databases

Ensure PostgreSQL is running locally with databases `simplehrms_students` (port 5432) and `simplehrms_classes` (port 5433).


Update `DB_USERNAME` and `DB_PASSWORD` in `students-service/src/main/resources/application.yml` and `classes-service/src/main/resources/application.yml` if needed (defaults: postgres/password).


#### Run Eureka Discovery Service
```bash
cd discovery-service
./gradlew bootRun
```

#### Run API Gateway
```bash
cd api-gateway
./gradlew bootRun
```


#### Run Students Service
```bash
cd students-service
./gradlew bootRun
```


#### Run Classes Service
```bash
cd classes-service
./gradlew bootRun
```

#### Access the Application

Eureka dashboard: http://localhost:8761


### Docker Setup

#### Build the Project
```bash
./gradlew build
```


#### Start All Services with Docker Compose

The `docker-compose.yml` file includes PostgreSQL databases and all services (discovery, gateway, students, classes).

```bash
docker-compose up -d --build
```

#### Access the Application

Eureka dashboard: http://localhost:8761


#### Stop Services
```bash
docker-compose down
```



