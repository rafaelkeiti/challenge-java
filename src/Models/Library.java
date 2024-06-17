package Models;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private final List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(String title, String author) {
        books.add(new Book(title, author));
    }

    public void listAvailableBooks() {
        for (Book book : books) {
            if (book.isAvailable()) {
                System.out.println("Nome: " + book.getTitle() + " - Autor: " + book.getAuthor());
            } else {
                System.out.println("Nenhum livro disponível!");
            }
        }
    }

    public void lendBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title) && book.isAvailable()) {
                book.setAvailable(false);
                System.out.println("Livro '" + title + "' emprestado com sucesso.");
            } else {
                System.out.println("Livro não encontrado ou não disponível para empréstimo.");
            }
        }
    }

    public void returnBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title) && !book.isAvailable()) {
                book.setAvailable(true);
                System.out.println("Livro '" + title + "' devolvido com sucesso.");
            } else {
                System.out.println("Livro não encontrado ou já disponível.");
            }
        }
    }
}
