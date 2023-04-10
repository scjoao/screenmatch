package dev.scjoao.screenmatch.calculos;

public class FiltroRecomendacao {
    private String recomendacao;

    public void filtra(Classificavel classificavel){
        if (classificavel.getClassificacao() >= 4){
            System.out.println("Esta nos preferidos");
        } else if (classificavel.getClassificacao() >= 2) {
            System.out.println("Bem avaliado");
        }else {
            System.out.println("Assista depois");
        }
    }
}
