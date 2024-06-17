# Tinnova Challenge

## Projeto Prático

O projeto consiste em um sistema de gestão para uma biblioteca que permite registrar novos livros, emprestar livros, devolver livros e listar livros disponíveis.

### Versão do JDK Utilizado:
`21.0.2`

## Aplicação

### Main
A classe `Main` é o ponto de entrada da aplicação de gerenciamento de biblioteca. Ela permite registrar livros, listar livros disponíveis, emprestar e devolver livros através de um menu interativo.

- Inicializa um objeto `Library` para gerenciar os livros.
- Cria um objeto `Scanner` para ler as entradas do usuário.
- Executa um laço `while` infinito para manter o menu ativo até que o usuário escolha a opção de sair (`EXIT`).
- Dentro do laço, exibe o menu e obtém a opção do usuário.
- Chama o método `handleMenuOption` para processar a opção selecionada pelo usuário.

#### Métodos Auxiliares

1. **`displayMenu`**
   - Exibe as opções do menu para o usuário.

2. **`getUserOption`**
   - Lê a opção escolhida pelo usuário e retorna o valor como um inteiro.

3. **`handleMenuOption`**
   - Recebe a opção escolhida pelo usuário e executa a ação correspondente:
      - `REGISTER_BOOK`: Chama o método `registerBook`.
      - `LIST_AVAILABLE_BOOKS`: Chama o método `listAvailableBooks` do objeto `Library`.
      - `LEND_BOOK`: Chama o método `lendBook`.
      - `RETURN_BOOK`: Chama o método `returnBook`.
      - Opção inválida: Exibe uma mensagem de erro.

4. **`registerBook`**
   - Lê o título e o autor do livro fornecidos pelo usuário e adiciona o livro à biblioteca.

5. **`lendBook`**
   - Lê o título do livro que o usuário deseja emprestar e solicita à biblioteca para emprestar o livro.

6. **`returnBook`**
   - Lê o título do livro que o usuário deseja devolver e solicita à biblioteca para devolver o livro.

#### Interação com a Classe `Library`
A classe `Main` depende da classe `Library` para gerenciar as operações relacionadas aos livros. Os métodos `addBook`, `listAvailableBooks`, `lendBook` e `returnBook` da classe `Library` são chamados para realizar as ações apropriadas solicitadas pelo usuário.


## Models

### Book
O model `Book` é utilizado para representar livros e tem as seguintes informações:

- **title**: O título do livro.
- **author**: O nome do autor do livro.
- **available**: Indica se o livro está disponível para empréstimo ou não.

Possui Getters e Setters padrão.

### Library
O model `Library` é utilizado para representar a biblioteca e tem as seguintes informações:

- **List<books>**: É a lista de livros que foram cadastrados.

Métodos:
- **addBook**: Realiza o cadastro do livro.
- **listAvailableBooks**: Lista de livros disponíveis.
- **lendBook**: Realiza o empréstimo do livro.
- **returnBook**: Realiza a devolução do livro.

## Como Usar?

#### Opção 1: Cadastrar um novo livro
Utilize esta opção para cadastrar um novo livro na biblioteca.

#### Opção 2: Listar livros disponíveis
Utilize esta opção para listar todos os livros que estão disponíveis para empréstimo.

#### Opção 3: Emprestar um livro
Utilize esta opção para emprestar um livro da biblioteca.

#### Opção 4: Devolver um livro
Utilize esta opção para devolver um livro à biblioteca.

## Como Clonar o Repositório

Para clonar o repositório do projeto, siga os passos abaixo:

1. Abra o terminal.
2. Navegue até o diretório onde deseja clonar o repositório.
3. Execute o seguinte comando:

   ```bash
   git clone https://github.com/rafaelkeiti/tinnova-challenge
   ```

4. Entre no diretório do projeto:

   ```bash
   cd tinnova-challenge
   ```

5. Utilize o `SHIFT + F10` arquivo **Main**: