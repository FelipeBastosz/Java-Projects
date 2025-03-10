package filmes;

import java.util.List;

public class Filme {
    private String titulo;
    private String genero;
    private String anoLancamento;
    private String tempoDuracao;
    private String direcao;
    private String roteiro;
    private List<String> elenco;
    private String tituloOriginal;
    private String ondeAssistir;

    public Filme( String titulo,String genero, String anoLancamento, String tempoDuracao, String direcao, String roteiro, List<String> elenco,
                 String tituloOriginal, String ondeAssistir) {
        this.titulo = titulo;
        this.genero = genero;
        this.anoLancamento = anoLancamento;
        this.tempoDuracao = tempoDuracao;
        this.direcao = direcao;
        this.roteiro = roteiro;
        this.elenco = elenco;
        this.tituloOriginal = tituloOriginal;
        this.ondeAssistir = ondeAssistir;
    }

    public String toString(){
        return "Titulo:" + titulo + "\nGênero: " + genero + "\nAno de lançamento: " + anoLancamento + "\nTempo de duração: " + tempoDuracao +
                "\nDireção: " + direcao + "\nRoteiro: " + roteiro + "\nElenco: " + String.join(", ", elenco) + "\nTitulo Original " + tituloOriginal +
                "\nOnde assistir: " + ondeAssistir;
    }

}