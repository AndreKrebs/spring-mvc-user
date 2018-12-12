# spring-mvc-user

Sistema de **busca e listagem de usuários** desenvolvido com Framework Java Spring, JSP, MyBatis, banco de dados MySQL 5 e estrutura MVC.

# Configuração do ambiente e inicialização do sistema
## Requisitos do ambiente
- Java 8;
- Maven;
- Docker e Docker Compose;
- IDE(de preferencia STS!);
- Internet;

## Iniciando o sistema
1. Baixe ou clone o projeto na sua máquina local;
2. Abra o terminal e acesse o diretório do projeto;
3. Execute o comando `mvn clean package` para baixar as dependencias e gerar o arquivo **.war**;
4. Inicie o container do banco de dados com o comando `docker-compose up src/main/docker/mysql/docker-compose.yml -d`
5. Acesse o banco de dados através de um sistema de gerenciamento de banco de dados de sua preferencia(Mysql Workbench, por exemplo!) e execute o comando que esta no arquivo **src/main/resources/schema.sql**;
6. No terminal, execute o comando `java -jar target/SpringMVCUser-0.0.1-SNAPSHOT.war`(Caso não tenha o arquivo .war com esse nome é só executar o unico .war dentro da pasta)
7. Aguarde o sistema terminar de iniciar e acesse o endereço <a href="http://localhost:8080">http://localhost:8080</a> no seu navegador;


*************** TODO: print da tela

# Estrutura do projeto

*************** TODO: imagem da estrutura do projeto

*************** TODO: Descrever estrutura do projeto 

# Funcionalidades do sistema

- [ ] Login/logout
- [X] Listagem de usuários
- [X] Filtro de usuários
- [ ] CRUD de usuários
