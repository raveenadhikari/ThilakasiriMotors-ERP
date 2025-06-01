# Thilakasiri Motors ERP

A web-based ERP (Enterprise Resource Planning) application for Thilakasiri Motors, built using Spring Boot, Spring Security, Spring Data JPA, and Thymeleaf. This project provides user registration, authentication, and a modular structure for further ERP functionalities.

## Features

- User Registration and Authentication (Email & Password)
- Role-based access control using Spring Security
- Secure password storage with BCrypt
- Modular, extensible design for growth
- Thymeleaf-powered web UI
- RESTful architecture using Spring MVC
- Easily deployable as a native image with GraalVM or as a lightweight container

## Getting Started

### Prerequisites

- Java 17+
- Maven 3.6+
- Docker (optional, for container builds)
- GraalVM (optional, for native image builds)

### Running the Application

To run locally:

```shell
./mvnw spring-boot:run
```

Visit [http://localhost:8080](http://localhost:8080).

### Registering a User

- Visit `/register` to create a new account.
- Login via `/login`.

### Building a Native Image (GraalVM)

**Prerequisites:** Install GraalVM 22.3+ and native-image tool.

To build and run as a native image (Linux):

```shell
./mvnw native:compile -Pnative
./target/erp
```

### Building a Container Image

**Prerequisites:** Docker installed and running.

```shell
./mvnw spring-boot:build-image -Pnative
docker run --rm -p 8080:8080 erp:0.0.1-SNAPSHOT
```

## Reference Documentation

- [Spring Boot Docs](https://docs.spring.io/spring-boot/3.5.0/reference/)
- [Spring Boot Maven Plugin](https://docs.spring.io/spring-boot/3.5.0/maven-plugin)
- [Spring Security](https://docs.spring.io/spring-boot/3.5.0/reference/web/spring-security.html)
- [Spring Data JPA](https://docs.spring.io/spring-boot/3.5.0/reference/data/sql.html#data.sql.jpa-and-spring-data)
- [Thymeleaf](https://docs.spring.io/spring-boot/3.5.0/reference/web/servlet.html#web.servlet.spring-mvc.template-engines)
- [Validation](https://docs.spring.io/spring-boot/3.5.0/reference/io/validation.html)

### Guides

- [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
- [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
- [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)
- [Securing a Web Application](https://spring.io/guides/gs/securing-web/)
- [Spring Boot and OAuth2](https://spring.io/guides/tutorials/spring-boot-oauth2/)

## Project Structure

```
src/
  main/
    java/com/example/erp/
      config/      # Spring Security configuration
      controller/  # Web controllers (Auth, Home, etc.)
      model/       # Domain models (User, etc.)
      repository/  # Data access (Spring Data JPA)
      service/     # Business logic
    resources/
      templates/     # Thymeleaf HTML templates
      application.properties
```

## Security

- Secure password hashing using BCrypt
- Role-based access via Spring Security
- CSRF protection enabled by default

## Contributing

1. Fork the repo
2. Create your feature branch (`git checkout -b feature/fooBar`)
3. Commit your changes (`git commit -am 'Add some fooBar'`)
4. Push to the branch (`git push origin feature/fooBar`)
5. Create a new Pull Request

## License

This project is for internal use at Thilakasiri Motors. License and usage details TBD.
