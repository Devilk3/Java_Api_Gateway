# Java API Gateway Microservices Project

This repository contains a simple Spring Boot microservices-based application that demonstrates how to create an API Gateway with service discovery and microservices for quizzes and questions.

## Project Structure

```
Java_Api_Gateway/
│
├── ApiGateway/         → Spring Cloud Gateway (API Gateway)
├── QuizService/        → Microservice managing quizzes
├── QuestionService/    → Microservice managing questions
└── ServiceRegistry/    → Eureka Server for service discovery
```

## Technologies Used

- Java 17+
- Spring Boot
- Spring Cloud Gateway
- Eureka Discovery Server
- Maven

## How It Works

- `ServiceRegistry` uses Eureka to register and discover services.
- `ApiGateway` uses Spring Cloud Gateway to route requests to `QuizService` and `QuestionService`.
- Each microservice is a Spring Boot application and communicates via REST APIs.

## Prerequisites

- JDK 17 or higher
- Maven
- Git

## Running the Project

1. **Clone the Repository**

```bash
git clone https://github.com/Devilk3/Java_Api_Gateway.git
cd Java_Api_Gateway
```

2. **Build All Projects**

Navigate into each subproject and run:

```bash
mvn clean install
```

Repeat for:
- `ServiceRegistry`
- `ApiGateway`
- `QuizService`
- `QuestionService`

3. **Start Services (in order)**

```bash
cd ServiceRegistry
mvn spring-boot:run
```

```bash
cd ../ApiGateway
mvn spring-boot:run
```

```bash
cd ../QuizService
mvn spring-boot:run
```

```bash
cd ../QuestionService
mvn spring-boot:run
```

4. **Access Eureka Dashboard**

- URL: [http://localhost:8761](http://localhost:8761)

5. **Example API Endpoints (via API Gateway)**

- Get quizzes: `http://localhost:8080/quiz`
- Get questions: `http://localhost:8080/question`

> These are routed by the gateway to the appropriate services.



## Author

Devilal Kumawat (https://github.com/Devilk3)