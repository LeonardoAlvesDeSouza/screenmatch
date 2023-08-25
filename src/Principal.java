import br.com.zhorg.screenmatch.modelos.CalculadoraDeTempo;
import br.com.zhorg.screenmatch.modelos.Filme;
import br.com.zhorg.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("O poderoso chefão");
        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setSomaAvaliacoes(8.5);
        meuFilme.setIncluidoNoPlano(true);
        meuFilme.setDuracaoEmMinutos(180);
        meuFilme.avalia(9.5);
        meuFilme.avalia(9);
        meuFilme.avalia(8);
        System.out.println(meuFilme.getSomaAvaliacoes());
        System.out.println(meuFilme.getTotalDeAvaliacoes());
        meuFilme.exibeFichaTecnica();
        System.out.println("\nMédia das avaliações: " + (float) meuFilme.mediaAvaliacoes());
        System.out.println();

        Filme outroFilme = new Filme();
        outroFilme.setNome("Outro filme qualquer");
        outroFilme.setAnoDeLancamento(1980);
        outroFilme.setSomaAvaliacoes(9);
        outroFilme.setIncluidoNoPlano(true);
        outroFilme.setDuracaoEmMinutos(220);

        Serie minhaSerie = new Serie();
        minhaSerie.setNome("Lost");
        minhaSerie.setAnoDeLancamento(1990);
        minhaSerie.setTemporadas(10);
        minhaSerie.setIncluidoNoPlano(true);
        minhaSerie.avalia(7);
        minhaSerie.avalia(6);
        minhaSerie.avalia(5);
        minhaSerie.setEpisodiosPorTemporada(8);
        minhaSerie.setMinutosPorEpisodios(50);
        minhaSerie.exibeFichaTecnica();
        System.out.println("\nMédia das avaliações: " + (float) minhaSerie.mediaAvaliacoes());
        System.out.println();

        CalculadoraDeTempo calc = new CalculadoraDeTempo();
        calc.inclui(meuFilme);
        calc.inclui(outroFilme);
        calc.inclui(minhaSerie);
        System.out.println("Tempo gasto para assistir tudo: " + calc.getTempoTotal() + " minutos.");
    }
}