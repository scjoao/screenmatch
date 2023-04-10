package dev.scjoao.screenmatch.calculos;

import dev.scjoao.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {

    private int tempoTotal;

//    public void inclui(Filme filme){
//        tempoTotal += filme.getDuracaoEmMinutos();
//    }
//
//    public void inclui(Serie serie){
//        tempoTotal += serie.getDuracaoEmMinutos();
//    }

    public void inclui(Titulo titulo){
        this.tempoTotal += titulo.getDuracaoEmMinutos();
    }

    //Getters and Setter
    public int getTempoTotal() {
        return tempoTotal;
    }
}
