# CineFetch

[![NPM](https://img.shields.io/npm/l/react)](https://github.com/MurilloMorgado/cinefetch/blob/main/LICENSE)

## Sobre o Projeto

**CineFetch** é uma API desenvolvida para consultar filmes utilizando a API pública OMDB. O principal objetivo do projeto é consolidar o conhecimento em requisições HTTP, especialmente com o uso de **WebClient**, além de aplicar conceitos de design de software como a **Arquitetura Hexagonal**.

## Objetivos do Projeto

* **Consulta de Filmes**: A API permite realizar consultas de filmes através do nome do filme e da chave de acesso da API pública OMDB.

* **Arquitetura Hexagonal**: A aplicação adota a arquitetura hexagonal (também conhecida como arquitetura de portas e adaptadores), separando as preocupações de negócio das interfaces externas (como APIs e bancos de dados).

* **RESTful API**: A comunicação entre o cliente e o servidor é feita através de uma API RESTful, garantindo simplicidade, escalabilidade e independência entre os componentes do sistema.

## Funcionalidades

A API oferece um endpoint que permite consultar filmes passando o nome como parâmetro e a chave de acesso da API pública

# Tecnologias utilizadas
## Back end
- Java: Linguagem de programação utilizada para construir a API.
- Spring Boot: Framework para simplificar a criação de aplicações Java, com foco em REST APIs.
- JPA (Java Persistence API): API para manipulação e persistência de dados em banco de dados relacional.
- Hibernate: Framework de mapeamento objeto-relacional (ORM) utilizado para realizar a integração entre a aplicação Java e o banco de dados.
- Maven: Ferramenta de gerenciamento de dependências e build para projetos Java.
- Arquitetura Hexagonal: Estrutura modular que separa a lógica de negócios da comunicação externa.

## Back end
- Pré-requisitos: Java 17

# Como executar o projeto
-Clone o repositório:

  ```http
  http://www.omdbapi.com/?apikey={apikey}&t={movieName}
  ```
- E possivel conseguir uma chave com sua propria conta na API publica da OMDB e colocar no paramentro "apikey".
- Passe o nome do filme que deseja buscar como parametro.

# Autor

Murillo Morgado

https://www.linkedin.com/in/murillo-morgado
