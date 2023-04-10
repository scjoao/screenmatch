import dev.scjoao.screenmatch.modelos.Filme;
import dev.scjoao.screenmatch.modelos.Serie;

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

    }
}
