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

    public String getNome() {
        return nome;
    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public void preencherSumario(Aula aula){
        if(aula == null || !aulas.contains(aula)){
            return;
        }
        aula.adicionarLinhaSumario(nome);
    }

    public void adicionar(Aula aula) {
        if(aula==null || this.aulas.contains(aula)){
            return;
        }
        this.aulas.add(aula);

    }

    public void remover(Aula aula) {
        if(!this.aulas.contains(aula)){
            return;
        }
        this.aulas.remove(aula);
        aula.remover(this);
    }
}
