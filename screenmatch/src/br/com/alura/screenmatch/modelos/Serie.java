package br.com.alura.screenmatch.modelos;

public class Serie extends Titulo {
    private int temporadas;
    private boolean ativa;
    private int episodeosPorTemporada;
    private int minutosPorEpisodio;

    public int getEpisodeosPorTemporada() {
        return episodeosPorTemporada;
    }

    public void setEpisodeosPorTemporada(int episodeosPorTemporada) {
        this.episodeosPorTemporada = episodeosPorTemporada;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    @Override
    public int getDuracaoEmMinutos() {
        return temporadas * episodeosPorTemporada * minutosPorEpisodio;
    }
}
