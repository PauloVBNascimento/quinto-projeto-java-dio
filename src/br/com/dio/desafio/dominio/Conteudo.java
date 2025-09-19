package br.com.dio.desafio.dominio;

public abstract class Conteudo {

    private double xpPadrao = 10d;
    private String titulo;
    private String descricao;

    public Double getXpPadrao() {
        return xpPadrao;
    }

    public void setXpPadrao(Double xpPadrao) {
        this.xpPadrao = xpPadrao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public abstract double calcularXpPadrao();
}
