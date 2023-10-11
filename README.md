# Projeto de Criação de Pessoas usando o Padrão de Projeto Builder

Este é um projeto simples que demonstra a criação de objetos do tipo `Pessoa` com a ajuda de um `PessoaBuilder`. A ideia principal é ilustrar como o padrão de projeto Builder pode ser usado para criar objetos complexos com várias propriedades.

## Padrão de Projeto Builder

O padrão de projeto Builder é um padrão de criação que permite construir objetos complexos passo a passo. Ele fornece uma maneira mais flexível e legível de criar objetos com várias propriedades, permitindo que você configure os campos desejados e, em seguida, crie uma instância com todos esses valores configurados.

## Estrutura do Projeto

- **Pessoa.java**: Esta classe representa uma pessoa e contém campos como nome, CPF, RG, idade, altura e peso. Ela possui um construtor que aceita esses campos e métodos de getter e setter para acessar e modificar essas propriedades.

- **PessoaBuilder.java**: Esta classe implementa o padrão de projeto Builder e fornece um mecanismo para criar instâncias de `Pessoa` de forma mais fácil e legível. Ela permite configurar os campos desejados através de métodos fluentes e, em seguida, criar uma instância de `Pessoa` com todos esses valores configurados.

## Uso

Você pode criar instâncias de `Pessoa` com diferentes valores da seguinte maneira:

```java
Pessoa pessoa = new PessoaBuilder("Nome")
        .cpf("123456789")
        .rg("987654321")
        .idade(30)
        .altura(1.80f)
        .peso(70.5f)
        .build();
```
## Requisitos
Este projeto é escrito em Java. Certifique-se de ter o Java instalado em sua máquina.
## Contribuições
Contribuições são bem-vindas. Sinta-se à vontade para criar pull requests ou issues para melhorias ou correções.
