# Apache Camel Integration Application

- This is a sample Apache Camel integration application using Spring Boot.

## Overview
The application demonstrates how to use Apache Camel routes to handle incoming messages and files. It exposes two endpoints for creating messages and fetching key bodies.
## Getting Started

### Prerequisites
- Java JDK 8 or higher
- Maven
### Installation
1. Clone the repository:
```bash
  git clone https://github.com/abhishekshah2905/spring-boot-camel.git
```
2. Navigate to the project directory:
```bash
  cd spring-boot-camel
```
3. Build the project:
```bash
  mvn clean install
```
4. Run the application:
```bash
  mvn spring-boot:run
```
5. Access the application at http://localhost:8080
### Usage
- Use the /api/messages endpoint to create messages.
- Use the /api/key endpoint to fetch key bodies.