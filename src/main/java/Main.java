import dev.scjoao.screenmatch.calculos.CalculadoraDeTempo;
import dev.scjoao.screenmatch.calculos.FiltroRecomendacao;
import dev.scjoao.screenmatch.modelos.Episodio;
import dev.scjoao.screenmatch.modelos.Filme;
import dev.scjoao.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("Super Mario");
        meuFilme.setAnoDeLancamento(2013);
        meuFilme.setDuracaoEmMinutos(90);
        meuFilme.getDuracaoEmMinutos();
        meuFilme.exibeFichaTecnica();

        meuFilme.avalia(10.0);
        meuFilme.avalia(4.0);
        meuFilme.avalia(7.0);

        Filme meuFilme2 = new Filme();
        meuFilme2.setNome("Super Mario");
        meuFilme2.setAnoDeLancamento(2013);
        meuFilme2.setDuracaoEmMinutos(90);
        meuFilme2.getDuracaoEmMinutos();
        meuFilme2.exibeFichaTecnica();

        meuFilme2.avalia(10.0);
        meuFilme2.avalia(4.0);
        meuFilme2.avalia(7.0);

        System.out.println(meuFilme.getSomadasAvaliacoes());
        System.out.println("N° de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println("Media: " + meuFilme.pegaMedia());

        Serie minhaSerie = new Serie();
        minhaSerie.setNome("Breaking Bad");
        minhaSerie.setAnoDeLancamento(2011);
        minhaSerie.exibeFichaTecnica();
        minhaSerie.setTemporadas(5);;
        minhaSerie.setEpisodiosPorTemporada(10);
        minhaSerie.setMinutosPorEpisodio(30);

        System.out.println("Duração para maratonar: " + minhaSerie.getDuracaoEmMinutos());

        CalculadoraDeTempo calculadoraDeTempo = new CalculadoraDeTempo();
        calculadoraDeTempo.inclui(meuFilme);
        System.out.println("Tempo: " + calculadoraDeTempo.getTempoTotal());

        FiltroRecomendacao filtroRecomendacao = new FiltroRecomendacao();
        filtroRecomendacao.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(7);
        episodio.setSerie(minhaSerie);
        episodio.setTotalVizualizacoes(12);
        filtroRecomendacao.filtra(episodio);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(meuFilme2);
        System.out.println("Tamanho da lista: " + listaDeFilmes.size());
        System.out.println("Primeiro filme: " + listaDeFilmes.get(0).getNome());
    }
}
