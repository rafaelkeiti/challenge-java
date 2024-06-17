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
        boolean hasAvailableBooks = false;
        for (Book book : books) {
            if (book.isAvailable()) {
                System.out.println("Nome: " + book.getTitle() + " - Autor: " + book.getAuthor());
                hasAvailableBooks = true;
            }
        }
        if (!hasAvailableBooks) {
            System.out.println("Nenhum livro disponível!");
        }
    }

    public void lendBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                if (book.isAvailable()) {
                    book.setAvailable(false);
                    System.out.println("Livro '" + title + "' emprestado com sucesso.");
                } else {
                    System.out.println("Livro não disponível para empréstimo.");
                }
                return;
            }
        }
        System.out.println("Livro não encontrado.");
    }

    public void returnBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                if (!book.isAvailable()) {
                    book.setAvailable(true);
                    System.out.println("Livro '" + title + "' devolvido com sucesso.");
                } else {
                    System.out.println("Livro já está disponível.");
                }
                return;
            }
        }
        System.out.println("Livro não encontrado.");
    }
}
