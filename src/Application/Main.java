package Application;

import Models.Library;

import java.util.Scanner;

public class Main {
    private static final int REGISTER_BOOK = 1;
    private static final int LIST_AVAILABLE_BOOKS = 2;
    private static final int LEND_BOOK = 3;
    private static final int RETURN_BOOK = 4;
    private static final int EXIT = 5;

    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            displayMenu();

            int option = getUserOption(scanner);

            if (option == EXIT) {
                System.out.println("Finalizando...");
                break;
            }

            handleMenuOption(option, library, scanner);
        }
    }

    private static void displayMenu() {
        System.out.println("\n### Menu ###");
        System.out.println(REGISTER_BOOK + ". Registrar Livro");
        System.out.println(LIST_AVAILABLE_BOOKS + ". Lista de Livros disponíveis");
        System.out.println(LEND_BOOK + ". Emprestar Livro");
        System.out.println(RETURN_BOOK + ". Devolver Livro");
        System.out.println(EXIT + ". Sair");
        System.out.print("\nEscolha uma opção: ");
    }

    private static int getUserOption(Scanner scanner) {
        int option = scanner.nextInt();
        scanner.nextLine();
        return option;
    }

    private static void handleMenuOption(int option, Library library, Scanner scanner) {
        switch (option) {
            case REGISTER_BOOK:
                registerBook(library, scanner);
                break;
            case LIST_AVAILABLE_BOOKS:
                library.listAvailableBooks();
                break;
            case LEND_BOOK:
                lendBook(library, scanner);
                break;
            case RETURN_BOOK:
                returnBook(library, scanner);
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }
    }

    private static void registerBook(Library library, Scanner scanner) {
        System.out.print("Digite o nome do livro: ");
        String title = scanner.nextLine();
        System.out.print("Digite o nome do autor: ");
        String author = scanner.nextLine();
        library.addBook(title, author);
    }

    private static void lendBook(Library library, Scanner scanner) {
        System.out.print("Digite o nome do livro para emprestar: ");
        String title = scanner.nextLine();
        library.lendBook(title);
    }

    private static void returnBook(Library library, Scanner scanner) {
        System.out.print("Digite o nome do livro para devolver: ");
        String title = scanner.nextLine();
        library.returnBook(title);
    }
}