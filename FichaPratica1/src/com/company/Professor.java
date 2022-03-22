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

    public String getNome() {
        return nome;
    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public void removerAula(Aula aula){

    }

    public void preencherSumario(Aula aula){

    }

    public void adicionar(Aula aula){
        this.aulas.add(aula);
    }
}
