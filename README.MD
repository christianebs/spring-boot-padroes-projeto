![visitors](https://visitor-badge.laobi.icu/badge?page_id=christianebs.spring-boot-padroes-projeto) ![GitHub Repo stars](https://img.shields.io/github/stars/christianebs/spring-boot-padroes-projeto) ![GitHub pull requests](https://img.shields.io/github/issues-pr/christianebs/spring-boot-padroes-projeto) ![GitHub closed issues](https://img.shields.io/github/issues-closed/christianebs/spring-boot-padroes-projeto)



# Sistema de Gerenciamento de Clientes com Integração de Serviço de CEP

O desafio faz parte do "Explorando Padrões de Projetos na Prática com Java" do módulo "Ganhando Produtividade com Spring Framework e Java". Este projeto exemplifica a implementação prática de Padrões de Projeto em uma aplicação Spring Boot. Ele abrange a arquitetura RESTful, utilizando o padrão MVC, juntamente com o uso do padrão Repository para a persistência de dados. Além disso, demonstra o uso do padrão Service para a lógica de negócios e a integração de serviços externos usando o padrão Façade com o Feign.

A integração com o serviço ViaCep é realizada automaticamente ao inserir ou atualizar um cliente, buscando e salvando informações de endereço com base no CEP fornecido.

Agora, o projeto também incorpora o padrão Builder, facilitando a construção de objetos Cliente e Endereco de forma mais eficiente e legível.

## :woman_mechanic: Linguagens e Ferramentas

![Java](https://img.shields.io/badge/java-0D1117.svg?style=for-the-badge&logo=openjdk&logoColor=%23ED8B00) ![Visual Studio Code](https://img.shields.io/badge/Visual%20Studio%20Code-0D1117.svg?style=for-the-badge&logo=visual-studio-code&logoColor=0078d7) ![Git](https://img.shields.io/badge/git-0D1117.svg?style=for-the-badge&logo=git&logoColor=%23F05033) ![GitHub](https://img.shields.io/badge/github-0D1117.svg?style=for-the-badge&logo=github&logoColor=white)


## :triangular_flag_on_post: Contribua com o projeto

- Realize o Fork
- Faça as modificações necessárias
- Realize a Pull Request (PR)

## :card_file_box: Fucionalidades do Projeto

- [x] Listar Todos os Clientes:
    - Exibir uma lista de todos os clientes cadastrados no sistema.

- [x] Buscar Cliente por ID:
    - Recuperar informações detalhadas de um cliente específico com base no seu ID.

- [x] Inserir Novo Cliente:
    - Adicionar um novo cliente ao sistema, fornecendo informações como nome e CEP.

- [x] Atualizar Informações do Cliente:
    - Modificar os detalhes de um cliente existente, incluindo seu nome e endereço. A integração com o serviço ViaCep é utilizada para atualizar automaticamente o endereço com base no CEP fornecido.

- [x] Excluir Cliente:
    - Remover um cliente do sistema com base no seu ID.


## :computer: Rodando o Projeto

```shell
# 1. Configure o ambiente

Certifique-se de ter o ambiente Java e Spring Boot configurado.

# 2. Clone o projeto

git clone https://github.com/christianebs/js-banco-digital-cubos.git

# 3. Escolha a IDE

Abra o projeto em sua IDE favorita.

# 4. Execute o projeto

Execute a classe principal Application.java.
```

## :arrows_counterclockwise: Endpoints

- GET /clientes - Listar Todos os Clientes:
- GET /clientes/{id} - Buscar Cliente por ID
- POST /clientes - Inserir Novo Cliente
- PUT /clientes/{id} - Atualizar Cliente
- DELETE /clientes/{id} - Deletar Cliente

## :scroll: Licença do Projeto

[Licenca MIT License](https://github.com/christianebs/js-banco-digital-cubos/blob/main/LICENSE.txt)

## :woman_technologist: Autora

<a href="https://github.com/christianebs">
<img src="https://user-images.githubusercontent.com/108686840/271874870-1003d6c2-7574-4104-a392-ab6b2713cff2.png" width="100px" />
</a>