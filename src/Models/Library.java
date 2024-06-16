package Models;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(String title, String author) {
        Book newBook = new Book(title, author);
        books.add(newBook);
    }

    public void listAvailableBooks() {
        for (Book book : books) {
            if (book.isAvailability()) {
                System.out.println("Nome: " + book.getTitle() + " - Autor: " + book.getAuthor());
            }
        }
    }

    public void lendBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title) && book.isAvailability()) {
                book.setAvailability(false);
                System.out.println("Livro '" + title + "' emprestado com sucesso.");
            } else {
                System.out.println("Livro não encontrado ou não disponível para empréstimo.");
            }
        }
    }

    public void returnBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title) && !book.isAvailability()) {
                book.setAvailability(true);
                System.out.println("Livro '" + title + "' devolvido com sucesso.");
            } else {
                System.out.println("Livro não encontrado ou já disponível.");
            }
        }
    }
}
