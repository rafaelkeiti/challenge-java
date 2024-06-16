package Application;

import Models.Library;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library biblioteca = new Library();
        Scanner scanner = new Scanner(System.in);

        String title;
        String author;

        int escolha;

        while (true) {
            System.out.println("\n### Menu ###");
            System.out.println("1. Registrar Livro");
            System.out.println("2. Lista de Livros disponíveis");
            System.out.println("3. Emprestar Livro");
            System.out.println("4. Devolver Livro");
            System.out.println("5. Sair");


            System.out.print("\nEscolha uma opção: ");
            escolha = scanner.nextInt();
            scanner.nextLine();

            switch (escolha) {
                case 1:
                    System.out.print("Digite o nome do livro: ");
                    title = scanner.nextLine();

                    System.out.print("Digite o nome do autor: ");
                    author = scanner.nextLine();

                    biblioteca.addBook(title, author);
                    break;
                case 2:
                    System.out.println("\nLivros disponíveis:");
                    biblioteca.listAvailableBooks();
                    break;
                case 3:
                    System.out.print("Digite o nome do livro para emprestar: ");
                    title = scanner.nextLine();
                    biblioteca.lendBook(title);
                    break;
                case 4:
                    System.out.print("Digite o nome do livro para devolver: ");
                    title = scanner.nextLine();
                    biblioteca.returnBook(title);
                    break;
                case 5:
                    System.out.println("Finalizando...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
    }
}