package model;

import calc.Classification;

public class Episode implements Classification {

    private int numero;

    private String nome;

    private TvShow tvShow;

    private int totalViews;

    public int getTotalViews() {
        return totalViews;
    }

    public void setTotalViews(int totalViews) {
        this.totalViews = totalViews;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TvShow getTvShow() {
        return tvShow;
    }

    public void setTvShow(TvShow tvShow) {
        this.tvShow = tvShow;
    }

    @Override
    public int getClassificacao() {
        if (totalViews > 100){
            return 4;
        } else return 0;
    }
}
