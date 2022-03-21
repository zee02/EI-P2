package com.company;

import java.util.LinkedList;

public class Aluno {
    private String nome;
    private long numero;
    private LinkedList<Aula> aulas;

    public Aluno(String nome, long numero){
        this.nome = nome;
        this.numero = numero;
        aulas = new LinkedList<Aula>();
    }

    public void preencherSumario(Aula aula){

    }

    public void adicionarAula(Aula aula){

    }
}
