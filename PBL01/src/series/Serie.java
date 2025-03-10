package series;

import java.util.ArrayList;
import java.util.List;

public class Serie {
    private String titulo;
    private String genero;
    private String anoLancamento;
    private String anoEncerramento;
    private String direcao;
    private String roteiro;
    private List<String> elenco;
    private String tituloOriginal;
    private String ondeAssistir;
    private List<Temporada> temporadas;

    public Serie(String titulo, String genero, String anoLancamento, String anoEncerramento, String direcao, String roteiro, List<String> elenco, String tituloOriginal,
                 String ondeAssistir,List<Temporada> temporadas){
        this.titulo = titulo;
        this.genero = genero;
        this.anoLancamento = anoLancamento;
        this.anoEncerramento = anoEncerramento;
        this.direcao = direcao;
        this.roteiro = roteiro;
        this.elenco = elenco;
        this.tituloOriginal = tituloOriginal;
        this.ondeAssistir = ondeAssistir;
        this.temporadas = new ArrayList<>();
    }

    public void adicionarTemporada(String ano, int quantidadeEpisodios) {
        temporadas.add(new Temporada(ano, quantidadeEpisodios));
    }

    @Override
    public String toString() {
        return "Título: " + titulo + " (" + tituloOriginal + ")\n" +
                "Gênero: " + genero + "\n" +
                "Ano de Lançamento: " + anoLancamento + "\n" +
                "Ano de Encerramento: " + (anoEncerramento.equals("0") ? "Em andamento" : anoEncerramento) + "\n" +
                "Elenco: " + elenco + "\n" +
                "Onde Assistir: " + ondeAssistir + "\n" +
                "Temporadas:\n" + temporadas;
    }
}
}
