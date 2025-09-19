package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {
    
    private LocalDate data;
    
    public LocalDate getData() {
        return data;
    }
    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "\nMentoria | titulo=" + getTitulo() + ", descricao=" + getDescricao() + ", data=" + data + ", xp=" + getXpPadrao();
    }

    public void adicionarMentoria(String titulo, String descricao) {
        setTitulo(titulo);
        setDescricao(descricao);
        this.data = LocalDate.now();
    }

    @Override
    public double calcularXpPadrao() {
        return (getXpPadrao() + 10d);
    }

}
