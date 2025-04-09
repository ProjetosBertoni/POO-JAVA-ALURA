import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import exercicio.Calculadora;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();


        meuFilme.setNome("O poderoso chefâo");
        meuFilme.setAnoDeLancamento(1978);
        meuFilme.setDuracaoEmMinutos(180);

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(10);
        meuFilme.avalia(8);
        System.out.println(meuFilme.getSomaDasAvaliacoes());
        System.out.println(meuFilme.getTotalDeAvaliacao());
        System.out.println(meuFilme.mediaDasAvaliacao());
        System.out.println("---------------");
        Serie serie = new Serie();
        serie.setNome("Lost");
        System.out.println(serie.getNome());

        serie.setTemporadas(10);
        serie.setMinutosPorEpisodio(60);
        serie.setEpisodeosPorTemporada(10);
        System.out.println(serie.getTemporadas());
        System.out.println("Duração para maratonar " + serie.getNome() + ": " + serie.getDuracaoEmMinutos());

        System.out.println("--------------");

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtroRecomendacao = new FiltroRecomendacao();
        filtroRecomendacao.filtra(meuFilme);

        Episodio episodio = new Episodio();
        Serie lucifer = new Serie();
        lucifer.setNome("Lucifer");
        lucifer.setTemporadas(5);
        lucifer.setEpisodeosPorTemporada(12);
        lucifer.avalia(3);


        episodio.setNumero(1);
        episodio.setSerie(lucifer);
        episodio.setTotalDeAvaliacao(100);
        episodio.getTotalDeAvaliacao();
        filtroRecomendacao.filtra(episodio);
    }
}