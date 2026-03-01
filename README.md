# Gym Frequency API

Projeto desenvolvido com Spring Boot com foco em aprender os principais conceitos de ORM utilizando Spring Data JPA.

O domínio da aplicação é uma academia, permitindo cadastrar alunos, planos, matrículas e presenças.

---

## 🚀 Tecnologias utilizadas

- Java
- Spring Boot
- Spring Web
- Spring Data JPA
- PostgreSQL
- Hibernate
- Lombok

---

## 🎯 Objetivo

O objetivo do projeto é:

- Criar entidades com JPA
- Mapear relacionamentos entre tabelas
- Utilizar repositórios do Spring Data
- Criar endpoints REST simples
- Persistir dados em banco relacional

---

## 🧱 Entidades

- Aluno  
- Plano  
- Matricula  
- Presenca  

Relacionamentos principais:
- Um aluno pode ter várias matrículas  
- Um aluno pode ter várias presenças  

---

## 📡 Endpoints

### 👤 Alunos
- POST /alunos  
- GET /alunos  

### 💳 Planos
- POST /planos  
- GET /planos  

### 📄 Matrículas
- POST /matriculas  
- GET /matriculas  

### 📅 Presenças
- POST /presencas  
- GET /presencas  

---

## ⚙️ Configuração do Banco

No `application.yml` a senha do banco é configurada por variável de ambiente:
password: ${DB_PASSWORD}
Defina no seu sistema antes de rodar o projeto.

---

## ▶️ Como executar

1. Criar banco PostgreSQL chamado `gym_frequency`
2. Configurar usuário e senha
3. Definir variável de ambiente `DB_PASSWORD`
4. Rodar a aplicação

A API roda em:

http://localhost:8080
