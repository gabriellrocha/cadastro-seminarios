# Cadastro seminários
![](src/main/resources/imagens/main.png)
## Descrição
Aplicação simples de linha de comando (CLI) para cadastro de seminários.
Os usuários podem adicionar, listar e remover seminários, incluindo informações como título,
alunos, professores ministrante e local. O sistema inclui regras de negócio para validar os dados, como evitar que
alunos estejam presentes simultâneamente em seminários.

## Observações:
> ⚠️ **Atenção:** O código pode conter bugs, pois não corrigi todas as exceções que podem surgir na interação com
> o terminal (CLI)

Projeto desenvolvido para fins didáticos, visando a aplicação prática de conceitos e técnicas aprendidos
durante estudos, tais como:
 - Orientação a objetos
 - Exceções
 - Associação de classes (relacionamentos)
 - Boas práticas de código
 - Padrões de commit
 - Maven (compilação e execução)

## 🚀 Funcionalidades
- `Funcionalidade 1:` Gerenciar seminários (Criar, visualizar e deletar)
- `Funcionalidade 2:` Cadastrar alunos em seminários existentes
- `Funcionalidade 3:` Cadastrar professores em seminários existentes

## ✔️ Aplicação
![](src/main/resources/imagens/cadastro.gif)

## 🛠️ Tecnologias e técnicas utilizadas
- ``MAVEN``
- ``JAVA 8``

## 📋 Pré-requisitos
- [Maven - Gerente de Dependência](https://maven.apache.org/download.cgi)
- [JDK 8](https://www.oracle.com/br/java/technologies/javase/javase8-archive-downloads.html)


## 🔧 Como executar o projeto
- Faça o download das ferramentas necessárias citadas anteriormente em pré-requisitos
- Após tudo devidamente instalado e configurado
- Clone o projeto para sua máquina ou faça o download do zip clicando [aqui](https://github.com/gabriellrocha/cadastro-seminarios/archive/refs/heads/main.zip)
- Caso tenha baixado o .zip será necessário descompactá-lo em um diretório de sua preferência
- Navegue até a pasta raiz ``\cadastro-seminarios-main``
- Execute os seguintes comandos:
  - `mvn clean install (no diretório raiz)`
  - `mvn exec:java`
