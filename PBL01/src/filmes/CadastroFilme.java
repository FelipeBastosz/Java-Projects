package filmes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CadastroFilme {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Filme> listaFilmes = new ArrayList<>();
    private static List<String> elenco = new ArrayList<>();

     public static void registroLivro(){
        System.out.println("Insira o titulo do filme:");
        String titulo = scanner.nextLine();

        System.out.println("Insira o gênero do filme:");
        String genero = scanner.nextLine();

        System.out.println("Insira o ano de lançamento do filme (dd/mm/aa):");
        String anoLancamento = scanner.nextLine();

        System.out.println("Insira o tempo de duração do filme:");
        String tempoDuracao = scanner.nextLine();

        System.out.println("Insira o nome do diretor(a) do filme:");
        String direcao = scanner.nextLine();

        System.out.println("Insira o roteiro do filme:");
        String roteiro = scanner.nextLine();

        System.out.println("Insira o titulo original do filme:");
        String tituloOriginal = scanner.nextLine();

        System.out.println("Insira quantos atores possuem o elenco:");
        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++){
            System.out.println("Insira o nome do ator/atriz:");
            String ator = scanner.nextLine();
            elenco.add(ator);
        }

        System.out.println("Insira onde o filme pode ser assistido:");
        String ondeAssistir = scanner.nextLine();


        Filme filme = new Filme(titulo,genero,anoLancamento,tempoDuracao,direcao,roteiro,elenco,tituloOriginal,ondeAssistir);
        listaFilmes.add(filme);
        System.out.println("Filme cadastrado com sucesso!");

    }

    static void listarFilmes(){
         if(listaFilmes.isEmpty()){
             System.out.println("Não há filmes registrados!");
         }else{
             for(Filme filme : listaFilmes){
                 System.out.println(filme);
             }
         }
    }
}
