# Spring Boot 3.2.1 Security with JWT Implementation

## Overview

This project demonstrates the implementation of security using Spring Boot 3.2.1 and JSON Web Tokens (JWT). It includes the following features:

- Secure endpoints with JWT authentication
- User registration and authentication
- Exception handling for authentication failures

## Prerequisites

Before you begin, ensure you have met the following requirements:

- Java installed
- Maven installed
- Your favorite IDE (IntelliJ IDEA, Eclipse, etc.)

## 🚀 Getting Started

Welcome to the Spring Boot 3 JWT Security project! Before diving in, make sure you have the following on your local machine:

- **JDK 17+**
- **Maven 3+**

### 🏗 Build and Run

1. **Clone the repository:**

    ```bash
    git clone https://github.com/MohamedBoukthir/webSecurity.git
    ```

2. **Navigate to the project directory:**

    ```bash
    cd webSecurity
    ```

3. **Add some magic:**

    - Ensure your MySql instance is sprinkled with a database named "web_security".

4. **Build the project:**

    ```bash
    mvn clean install
    ```

5. **Run the project:**

    ```bash
    mvn spring-boot:run
    ```

🎉 Voila! The application is now available at [http://localhost:8080](http://localhost:8080).

## 🛠 Database Configuration

Don't forget to add the enchanting database "web_security" to your MySql. Tune the database connection details in the `application.yml` file if needed.

```properties
# 🌟 Sample application.properties

# Database Configuration
spring
  .datasource
    .url=jdbc:mysql://localhost:3306/web_security
    .username=your_mysql_username
    .password=your_mysql_password
```

## 🚀 Usage
The application unfolds a treasure trove of RESTful APIs for user registration, authentication, and accessing secured resources.

## 🎁 Contributing
Embark on this journey! If you desire to contribute to this mystical project, please feel free.

## 🙌 Acknowledgments
Special gratitude to the Spring Boot and JWT communities for their enchanting documentation and support. May the code be ever in your favor! ✨
