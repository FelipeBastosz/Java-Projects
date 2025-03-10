package series;

class Temporada {
    private String ano;
    private int quantidadeEpisodios;

    public Temporada(String ano, int quantidadeEpisodios){
        this.ano = ano;
        this.quantidadeEpisodios = quantidadeEpisodios;
    }
    
    public String toString(){
        return "\nAno: " + ano + "\nQuantidade de Episódios: " + quantidadeEpisodios;
    }
}
