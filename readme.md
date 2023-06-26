
# Pesquisa CEP

Este é um projeto de pesquisa de CEP que utiliza a API de consulta de endereços. Ele permite buscar, adicionar, listar e remover endereços.


## Pré-requisitos
* Java 8 ou superior
* Biblioteca Gson (pode ser baixada em https://github.com/google/gson)
## Como usar
1. Faça o clone deste repositório.
2. Importe o projeto em sua IDE preferida.
3. Certifique-se de adicionar a biblioteca Gson ao seu projeto.
4. Execute a classe `Principal` para iniciar o programa.
5. Siga as instruções exibidas no menu para interagir com o programa.
## Funcionalidades
* Buscar/adicionar novo endereço: Permite buscar um endereço pelo CEP e adicioná-lo à lista de endereços.
* Listar endereços: Exibe a lista de endereços cadastrados.
* Remover endereços da listagem: Remove um endereço da lista com base em seu índice.
* Exportar arquivo 'listagem de endereços': Exporta a lista de endereços para um arquivo JSON.
## Uso/Exemplos

```
Escolha uma opção:
1 - Buscar/adicionar novo endereço
2 - Listar endereços
3 - Remover endereços da listagem
4 - Exportar arquivo 'listagem de endereços'.
0 - Sair
Opção escolhida: 1

Informe o CEP para busca:
Digite o CEP: 12345-678
Endereço adicionado com sucesso:
Índice: [0]
CEP: 12345-678
Logradouro: Rua Exemplo
Complemento: Vazio
Bairro: Centro
Localidade: Cidade
UF: UF
```

* Listar Endereços:

```
Escolha uma opção:
1 - Buscar/adicionar novo endereço
2 - Listar endereços
3 - Remover endereços da listagem
4 - Exportar arquivo 'listagem de endereços'.
0 - Sair
Opção escolhida: 2

Lista de endereços:
Índice: [0]
CEP: 12345-678
Logradouro: Rua Exemplo
Complemento: Vazio
Bairro: Centro
Localidade: Cidade
UF: UF
```

* Remover endereços da listagem:

```
Escolha uma opção:
1 - Buscar/adicionar novo endereço
2 - Listar endereços
3 - Remover endereços da listagem
4 - Exportar arquivo 'listagem de endereços'.
0 - Sair
Opção escolhida: 3

Digite o índice do endereço que deseja remover:
1

Índice inválido. Tente novamente.

```
* Exportar arquivo 'listagem de endereços':

```
Escolha uma opção:
1 - Buscar/adicionar novo endereço
2 - Listar endereços
3 - Remover endereços da listagem
4 - Exportar arquivo 'listagem de endereços'.
0 - Sair
Opção escolhida: 4

Arquivo de listagem de endereço exportado com sucesso!

```
## Contribuição
Contribuições são bem-vindas! Se você encontrou algum problema, tem alguma ideia de melhoria ou deseja adicionar uma nova funcionalidade, fique à vontade para enviar um pull request.
## Autores

- [@rabisquim](https://www.github.com/rabisquim)


## Agradecimentos
Gostaria de expressar minha gratidão aos intrutores: Jacqueline Oliveira e Paulo Silveira, da Alura, que se tornaram peças essenciais para o desenvolvimento desse desafio, por meio do conteúdo compartilhado em aula.
