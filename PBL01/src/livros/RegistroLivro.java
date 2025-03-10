package livros;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RegistroLivro {
    public static Object main;
    private static Scanner scanner = new Scanner(System.in);
    private static List<Livro> biblioteca = new ArrayList<>();

    public static void main() {
        boolean condicao = true;
        while (condicao){
            System.out.println("\n\n-------MENU LIVRO-------\n[1] Cadastrar livro\n[2] Listar livros\n[3] Voltar para o menu principal\n Escolha uma opção:");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao){
                case 1:
                    cadastroLivro();
                    break;
                case 2:
                    listarLivros();
                    break;
                case 3:
                    condicao = false;
                    System.out.println("Voltando para o menu principal...\n"); // QUANDO FOR MEXER COM A PARTE PRINCIPAL, FAZER ELE RETORNAR AO MENU ORIGINAL.
                    break;
                default:
                    System.out.println("Opção inválida! Assinale uma opção disponível.");
            }
        }
    }
    static void cadastroLivro(){
        System.out.println("Insira o título do livro:");
        String titulo =  scanner.nextLine();

        System.out.println("Insira o nome do autor:");
        String autor = scanner.nextLine();

        System.out.println("Insira o nome da editora:");
        String editora = scanner.nextLine();

        System.out.println("Insira o código ISBN do livro:");
        String isbn = scanner.nextLine();

        System.out.println("Insira o ano de publicação (dd/mm/aa):");
        String anoPublicacao = scanner.nextLine();

        System.out.println("Insira o gênero da obra:");
        String genero = scanner.nextLine();

        System.out.println("Possui exemplar? (true/false)");
        boolean possui = scanner.nextBoolean();
        scanner.nextLine();

        Livro livro = new Livro(titulo,autor,editora,isbn,anoPublicacao,genero,possui);
        biblioteca.add(livro);
        System.out.println("Livro cadastrado com sucesso!\n\n");
    }

    static void listarLivros(){
        if (biblioteca.isEmpty()){
            System.out.println("Não há livros cadastrados!");
        }else{
            System.out.println("Lista de livros cadastrados:\n");
            for (Livro livro : biblioteca){
                System.out.println(livro);
            }
        }
    }

}
