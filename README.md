# tinnova-challenge

---

# Projeto Prático

Consiste em um sistema de gestão para uma biblioteca que permita registrar novos livros, emprestar livros, devolver livros e listar livros disponíveis.

## Models

O model `Book` é utilizado para representar livros e tem as seguintes informações:

- **title**: O título do livro.
- **author**: O nome do autor do livro.
- **availability**: Indica se o livro está disponível para empréstimo ou não.
- Possui Getters e Setters padrão.

---

Já model `Library` é utilizado para representar a biblioteca e tem as seguintes informações:

- **List<Book>**: É a lista de livros que foram cadastrados.
- **Método addBook**: Que realiza o castrado do livro.
- **Método listAvailableBooks**: Lista de livros disponíveis.
- **Método lendBook**: Realiza o empréstimo do livro.
- **Método returnBook**: Realiza a devolução do livro.

## **Como Usar?**

- Opção 1: Utilize esta opção para cadastrar um novo livro na biblioteca.
- Opção 2: Utilize esta opção para listar todos os livros que estão disponíveis para empréstimo.
- Opção 3: Utilize esta opção para emprestar um livro da biblioteca.
- Opção 4: Utilize esta opção para devolver um livro à biblioteca.