# API Eventostec

Projeto de estudo desenvolvido em Java com Spring Boot.

Este projeto foi feito acompanhando o conteudo da Fernanda Kipper:

- Video: https://www.youtube.com/watch?v=d0KaNzAMVO4
- Repositorio original: https://github.com/Fernanda-Kipper/eventostec-backend/tree/main

Agradecimento a Fernanda Kipper pelo conteudo e pela didatica. Este repositorio foi usado como pratica para aprender melhor Spring Boot, JPA, Docker, PostgreSQL, Flyway, DTOs, upload de imagens e organizacao de uma API em camadas.

## Aviso

Este projeto faz parte do meu processo de aprendizado. Pode conter erros, escolhas simples ou pontos que ainda podem ser melhorados. A ideia e manter o codigo compreensivel para o meu nivel atual e evoluir com o tempo.

## Tecnologias

- Java 21
- Spring Boot
- Spring Data JPA
- PostgreSQL
- Flyway
- Docker Compose
- LocalStack
- AWS SDK S3
- Maven

## Como Rodar

Suba os containers:

```bash
docker compose up -d
```

Crie o bucket no LocalStack:

```bash
docker compose exec localstack awslocal s3 mb s3://eventostec-images
```

Rode a aplicacao:

```bash
./mvnw spring-boot:run
```

No Windows:

```bash
mvnw.cmd spring-boot:run
```

A API fica disponivel em:

```text
http://localhost:8080
```
