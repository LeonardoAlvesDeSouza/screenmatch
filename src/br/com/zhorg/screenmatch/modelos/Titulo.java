package br.com.zhorg.screenmatch.modelos;

public class Titulo {
    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaAvaliacoes;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public double getSomaAvaliacoes() {
        return somaAvaliacoes;
    }

    public void setSomaAvaliacoes(double somaAvaliacoes) {
        this.somaAvaliacoes = somaAvaliacoes;
    }

    public int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }

    public void setTotalDeAvaliacoes(int totalDeAvaliacoes) {
        this.totalDeAvaliacoes = totalDeAvaliacoes;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void exibeFichaTecnica(){
        System.out.println("Nome do titulo: " + this.nome);
        System.out.println("Ano de lançamento: " + this.anoDeLancamento);
        System.out.println("Incluído no plano: " + this.incluidoNoPlano);
        System.out.println("Soma das avaliações: " + this.somaAvaliacoes);
        System.out.println("Total de avaliações: " + this.totalDeAvaliacoes);
        System.out.println("Duração em minutos: " + getDuracaoEmMinutos());
    }

    public void avalia(double nota){
        this.somaAvaliacoes += nota;
        this.totalDeAvaliacoes++;
    }

    public double mediaAvaliacoes(){
        return this.somaAvaliacoes / this.totalDeAvaliacoes;
    }
}
