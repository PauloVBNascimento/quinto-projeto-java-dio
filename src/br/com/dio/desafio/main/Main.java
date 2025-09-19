package br.com.dio.desafio.main;
import java.util.Arrays;
import java.util.LinkedHashSet;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) {
        //Instanciando os Cursos
        Curso curso1 = new Curso();
        Curso curso2 = new Curso();

        //Adicionando os atributos de Curso
        curso1.adicionarCurso("Curso Java", "Curso para aprender Java", 10);
        curso2.adicionarCurso("Curso Git", "Curso para aprender Git", 5);

        //System.out.println(curso1);
        //System.out.println(curso2);

        //Instanciando as Mentorias
        Mentoria mentoria1 = new Mentoria();

        //Adicionando os atributos de Mentoria
        mentoria1.adicionarMentoria("Mentoria Js", "Mentoria Javascript");
        
        //System.out.println(mentoria1);

        //Instancinado os Bootcamps
        Bootcamp bootcamp1 = new Bootcamp();
        Bootcamp bootcamp2 = new Bootcamp();

        //Adicionando os atributos de Bootcamp1
        bootcamp1.adicionarBootcamp("Java Trilha Básica", "Curso Básico Java");
        //Adicionando os Conteudos de Bootcamp1
        bootcamp1.adicionarConteudo(new LinkedHashSet<>(Arrays.asList(curso1, curso2)));

        bootcamp2.adicionarBootcamp("Programação Java e Js", "Curso de Programação Java e Javascript");
        bootcamp2.adicionarConteudo(new LinkedHashSet<>(Arrays.asList(curso1, mentoria1, curso2)));

        //Instanciando os Devs
        Dev paulo = new Dev();
        Dev ronaldo = new Dev();

        //Adicionando os atributos de Dev
        paulo.adicionarDev("Paulo");
        ronaldo.adicionarDev("Ronaldo");

        //Se "Matriculando" no Bootcamp
        paulo.inscreverBootcamp(bootcamp1);
        ronaldo.inscreverBootcamp(bootcamp2);

        //System.out.println(bootcamp1);
        //System.out.println(bootcamp2);

        //Impressão inicial sem nenhuma progressão no Bootcamp
        //System.out.println("Conteúdos Inscritos Paulo: " + paulo.getConteudosInscritos());
        //System.out.println("Conteudos Conclúidos Paulo: " + paulo.getConteudosConcluidos());

        //System.out.println("Conteúdos Inscritos Ronaldo: " + ronaldo.getConteudosInscritos());
        //System.out.println("Conteudos Conclúidos Ronaldo: " + ronaldo.getConteudosConcluidos());

        //Progredindo em um Bootcamp
        paulo.progredir();
        ronaldo.progredir();
        ronaldo.progredir();

        //Impressão após progredir em um Bootcamp
        System.out.println("Conteúdos Inscritos Paulo: " + paulo.getConteudosInscritos());
        System.out.println("Conteudos Conclúidos Paulo: " + paulo.getConteudosConcluidos());
        
        System.out.println("XP: " + paulo.calcularXpTotal());

        System.out.println("Conteúdos Inscritos Ronaldo: " + ronaldo.getConteudosInscritos());
        System.out.println("Conteudos Conclúidos Ronaldo: " + ronaldo.getConteudosConcluidos());

        System.out.println("XP: " + ronaldo.calcularXpTotal());
    }
}
