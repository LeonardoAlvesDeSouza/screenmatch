package br.com.zhorg.screenmatch.modelos;

public class Serie extends Titulo{
    private int temporadas;
    private boolean ativo;
    private int episodiosPorTemporada;
    private int minutosPorEpisodios;

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public int getMinutosPorEpisodios() {
        return minutosPorEpisodios;
    }

    public void setMinutosPorEpisodios(int minutosPorEpisodios) {
        this.minutosPorEpisodios = minutosPorEpisodios;
    }

    @Override
    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.setDuracaoEmMinutos(duracaoEmMinutos);
    }

    @Override
    public int getDuracaoEmMinutos() {
        return this.temporadas * this.episodiosPorTemporada * this.minutosPorEpisodios;
    }
}
