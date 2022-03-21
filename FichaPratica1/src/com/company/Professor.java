package com.company;

import java.util.LinkedList;

public class Professor {
    private String nome;
    private long numero;
    private LinkedList<Aula> aulas;


    public Professor(String nome, long numero){
        this.nome = nome;
        this.numero = numero;
        this.aulas = new LinkedList<Aula>();
    }

    public void preencherSumario(Aula aula){

    }

    public void adicionarAula(Aula aula){

    }
}
