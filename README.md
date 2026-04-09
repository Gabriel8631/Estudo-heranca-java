Padrão Repository com Herança e Generics em Java

Este projeto é uma demonstração prática de como implementar o padrão arquitetural **Repository** utilizando **Herança** e **Generics** na linguagem Java. O objetivo principal é criar uma estrutura base reutilizável para operações de banco de dados, reduzindo a duplicação de código (boilerplate) e mantendo a arquitetura limpa e escalável.

 Funcionalidades

**CRUD Genérico:** Interface e classe abstrata base que fornecem operações padronizadas (Salvar, Buscar, Deletar) para qualquer entidade.
**Uso de Generics:** Flexibilidade para tipar o repositório dinamicamente através de `<T, ID>`, onde `T` é a entidade e `ID` é o tipo da chave primária.
**Armazenamento em Memória:** Utilização de `HashMap` para simular a persistência de dados, facilitando os estudos da lógica arquitetural sem a necessidade de configurar dependências externas ou bancos de dados reais.
**Arquitetura Limpa:** Separação clara entre a modelagem de domínio e a camada de acesso a dados.

Estrutura do Projeto

Abaixo está a organização de pacotes do projeto:

```text
src/
├── dominio/
│   ├── EntidadeBase.java         # Classe abstrata base para garantir a existência de um identificador
│   └── Usuario.java              # Entidade de exemplo representando a regra de negócio
└── repositorio/
    ├── RepositorioGenerico.java  # Contrato (Interface) com as operações básicas
    ├── RepositorioBase.java      # Implementação abstrata do banco em memória
    └── UsuarioRepositorio.java   # Repositório concreto contendo consultas específicas
