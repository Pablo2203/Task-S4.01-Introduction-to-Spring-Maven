# S04T01N01 - Spring Boot & Maven Exercise

## 📄 Project Overview

This project is a hands-on exercise for getting familiar with **Spring Boot** and **Maven**. The main objective is to create a basic **REST API** using Spring Boot and get accustomed to fundamental Maven commands and project structure.

### 💡 Features

- **REST API** with two endpoints for greeting users.
- Parametrized requests using `@RequestParam` and `@PathVariable`.
- Configurable server port (`9000`).

---

## 💻 Technologies Used

- **Java** (Minimum version 21)
- **Spring Boot** (Latest stable version)
- **Maven**

### Included Dependencies:
1. Spring Boot DevTools
2. Spring Web

---

## 📋 Project Requirements

Before starting, make sure you have the following installed and set up:

- **Java Development Kit (JDK)** version 21 or higher.
- **Maven** (for project management and build).
- Integrated Development Environment (IDE) like IntelliJ IDEA or Eclipse.

---

## 🛠️ Installation & Setup

### 1. Generate the Project:

- Access [Spring Initializr](https://start.spring.io/).
- Configure the project with the following settings:
  - **Build Tool**: Maven  
  - **Language**: Java  
  - **Group**: `cat.itacademy.s04.t01.n01`  
  - **Artifact**: `S04T01N01`  
  - **Name**: `S04T01N01`  
  - **Description**: `S04T01N01`  
  - **Package Name**: `cat.itacademy.s04.t01.n01`  
  - **Packaging**: Jar  
  - **Java Version**: 11 or higher.  
- Add the dependencies:
  - **Spring Boot DevTools**
  - **Spring Web**  
- Download the generated project.

### 2. Import into Your IDE:

- Open **Eclipse/IntelliJ IDEA**.
- Use `File > Import > Existing Maven Project` to load the project.

### 3. Configure the Application:

- Open the `application.properties` file in `src/main/resources`.
- Add the following line to set the server port:
  ```properties
  server.port=9000
  ```

---

## ▶️ Running the Project

### 1. Implement REST API:

- Create a `controller` subpackage under the main package (`cat/itacademy/s04/t01/n01`).
- Create a class `HelloWorldController` with the following methods:
  - **Method 1**:
    - Responds to HTTP GET requests at `/HelloWorld`.
    - Accepts a `String` parameter `nombre` via `@RequestParam`.
    - Default parameter value: `"UNKNOWN"`.
    - Returns: `"Hola, " + nombre + ". Estás ejecutando un proyecto Maven."`
    - Example:
      - `http://localhost:9000/HelloWorld`
      - `http://localhost:9000/HelloWorld?nombre=MyName`
  - **Method 2**:
    - Responds to HTTP GET requests at `/HelloWorld2/{nombre}`.
    - Accepts a `String` parameter `nombre` via `@PathVariable`.
    - Returns: `"Hola, " + nombre + ". Estás ejecutando un proyecto Maven."`
    - Example:
      - `http://localhost:9000/HelloWorld2`
      - `http://localhost:9000/HelloWorld2/MyName`

### 2. Run the Server:

Open a terminal in the root directory of the project and execute the following Maven commands:

- **Compile the Project**:
  ```bash
  mvn compile
  ```

- **Package the Project**:
  ```bash
  mvn package
  ```

- **Clean the Project**:
  ```bash
  mvn clean
  ```

- **Run the Application**:
  ```bash
  mvn spring-boot:run
  ```

---

## 🌐 REST API Endpoints

| HTTP Method | Endpoint                               | Description                                            |
|-------------|---------------------------------------|--------------------------------------------------------|
| GET         | `/HelloWorld`                         | Returns a greeting with the default or specified name. |
| GET         | `/HelloWorld?nombre=YourName`         | Returns a greeting for the given `nombre`.             |
| GET         | `/HelloWorld2/{nombre}`               | Returns a greeting for the specified path variable.    |

---

## 🤝 Contributions

Contributions to improve the project are always welcome! To contribute:

1. **Fork the repository.**
2. **Create a feature branch**:
   ```bash
   git checkout -b feature/NewFeature
   ```
3. **Commit your changes**:
   ```bash
   git commit -m "Add NewFeature"
   ```
4. **Push the branch**:
   ```bash
   git push origin feature/NewFeature
   ```
5. **Submit a pull request** for review.

---

## 📚 Helpful Resources

- [Spring Boot Documentation](https://spring.io/projects/spring-boot)
- [Maven Official Documentation](https://maven.apache.org/)

---

Feel free to reach out or open an issue for any assistance related to the project!

### Author: Your Name  
### License: MIT License  
