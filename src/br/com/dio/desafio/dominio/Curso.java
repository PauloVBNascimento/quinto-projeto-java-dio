package br.com.dio.desafio.dominio;

public class Curso extends Conteudo{

    private int cargaHoraria;
    
    public int getCargaHoraria() {
        return cargaHoraria;
    }
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "\nCurso | titulo=" + getTitulo() + ", descricao=" + getDescricao() + ", cargaHoraria=" + cargaHoraria + ", xp=" + getXpPadrao();
    }

    public void adicionarCurso(String titulo, String descricao, int cargaHoraria) {
        setTitulo(titulo);
        setDescricao(descricao);
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public double calcularXpPadrao() {
        return (getXpPadrao() * cargaHoraria);
    }
    
}
