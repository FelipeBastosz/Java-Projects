package filmes;

import java.util.Scanner;

public class MenuFilme {
    public static Object main;
    private static Scanner scanner = new Scanner(System.in);

    public static void main() {
        boolean condicional = true;
        while(condicional){
            System.out.println("\n\n-------MENU FILME-------\n[1] Cadastrar filme\n[2] Listar filmes\n[3] Voltar para o menu principal\n Escolha uma opção:");
            int decisao = scanner.nextInt();
            scanner.nextLine();
            switch (decisao){
                case 1:
                    CadastroFilme.registroLivro();
                    break;
                case 2:
                    CadastroFilme.listarFilmes();
                    break;
                case 3:
                    condicional = false;
                    System.out.println("Voltando para o menu principal...\n"); // QUANDO FOR MEXER COM A PARTE PRINCIPAL, FAZER ELE RETORNAR AO MENU ORIGINAL.
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}
