# API de Gerenciamento de Produtos - FIAP

Este projeto é um CRUD completo desenvolvido como parte do curso de Análise e Desenvolvimento de Sistemas na FIAP.

## 🚀 Tecnologias Utilizadas
* Java 25
* Spring Boot 4.0.6
* Oracle SQL (Banco de Dados)
* Spring Data JPA / Hibernate

## 📋 Funcionalidades
* Cadastro de produtos (Nome, Valor, Quantidade, Data de Fabricação)
* Listagem de todos os produtos
* Busca de produto por ID
* Atualização e Exclusão de registros

## 🛠️ Como executar
1. Configure as credenciais do banco Oracle no arquivo `application.properties`.
2. Execute o script SQL fornecido no repositório para criar a tabela `tbl_produto`.
3. Inicie a aplicação via IntelliJ.
4. Utilize o Insomnia para realizar as requisições na porta 8080.