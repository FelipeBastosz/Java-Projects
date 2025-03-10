import filmes.MenuFilme;
import livros.RegistroLivro;
import java.util.Scanner;

public class Principal {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean condicional = true;
        while (condicional) {
            System.out.println("----------MENU----------\n[1] Livros\n[2] Filmes\n[3] Séries\n[4] Sair\nInsira uma opção:");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    RegistroLivro.main();
                    break;
                case 2:
                    MenuFilme.main();
                    break;
                case 3:
                    //Puxar filme
                case 4:
                    condicional = false;
                    System.out.println("Encerrando sistema...\nSistema finalizado.");
                    break;
                default:
                    System.out.println("Opção inválida! Insira uma opção de 1 a 3");
            }
        }
    }
}
