# 🚀 API CRUD de Usuários com Spring Boot

Projeto desenvolvido para demonstrar a construção de uma API REST completa utilizando Java e Spring Boot, implementando operações de CRUD com persistência em banco de dados relacional.

---

## 📌 Sobre o Projeto

Esta aplicação permite o gerenciamento de usuários através de requisições HTTP, seguindo o padrão REST.

O sistema realiza:

* Criação de usuários
* Listagem de usuários
* Busca por ID
* Atualização de dados
* Remoção de usuários
* Persistência em banco de dados MySQL
* Organização em arquitetura de camadas

---

## 🧠 Tecnologias Utilizadas

* Java 17+
* Spring Boot
* Spring Data JPA
* Hibernate
* MySQL
* Maven

---

## 🏗️ Arquitetura do Projeto

O projeto segue o padrão de separação por camadas:

controller → Responsável pelas requisições HTTP
service → Regras de negócio
repository → Comunicação com o banco
model → Representação das entidades

---

## 🔥 Endpoints Disponíveis

| Método | Endpoint       | Descrição             |
| ------ | -------------- | --------------------- |
| POST   | /usuarios      | Criar novo usuário    |
| GET    | /usuarios      | Listar todos usuários |
| GET    | /usuarios/{id} | Buscar usuário por ID |
| PUT    | /usuarios/{id} | Atualizar usuário     |
| DELETE | /usuarios/{id} | Deletar usuário       |

---

## 🗄️ Exemplo de JSON para Criação

```json
{
  "nome": "João Silva",
  "email": "joao@email.com"
}
```

---

## ⚙️ Como Executar o Projeto

### 1️⃣ Clonar o repositório

```bash
git clone https://github.com/Michellesilvaa00/springboot-user-crud-api.git
```

### 2️⃣ Acessar a pasta

```bash
cd NOME-DO-REPOSITORIO
```

### 3️⃣ Configurar o banco de dados

Abra o arquivo:

```
src/main/resources/application.properties
```

Configure com seus dados locais:

```
spring.datasource.url=jdbc:mysql://localhost:3306/crudjava
spring.datasource.username=root
spring.datasource.password=SUA_SENHA

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

---

### 4️⃣ Executar a aplicação

```bash
./mvnw spring-boot:run
```

Ou rode diretamente pela IDE.

---

## 🎯 Objetivo do Projeto

Este projeto foi desenvolvido com foco em aprendizado e prática de:

* Desenvolvimento de APIs RESTful
* Integração com banco de dados relacional
* Uso do Spring Boot no backend
* Boas práticas de organização de código
* Versionamento com Git

---

## 👨‍💻 Autor

Desenvolvido por **MICHELLE SILVA**

---

## 📈 Próximas Melhorias

* Validação de dados com Bean Validation
* Documentação com Swagger
* Tratamento global de exceções
* Testes unitários com JUnit
* Containerização com Docker
