# Siza Server
Java 17 / Spring Boot backend for Siza Help-Hub.

## Included domains
Users, service categories, providers, provider categories, service areas, customer addresses, service requests/jobs, job notes, quotes, reviews, subscription plans, provider subscriptions, payments and notifications.

## Run
```bash
docker compose up -d
mvn clean spring-boot:run
```

Swagger: http://localhost:8080/swagger-ui.html
Health: http://localhost:8080/actuator/health

## Notes
Security dependencies are included and `SecurityConfig` currently permits all requests for local MVP development. Replace this with Keycloak JWT role rules before production. JPA schema update is enabled for development; introduce reviewed Liquibase migrations before production release.
