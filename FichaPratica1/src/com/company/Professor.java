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

    public void preencherSumario(Aula aula){
        if(aula == null || !aulas.contains(aula)){
            return;
        }
        
        aula.adicionarLinhaSumario(aula.getNome());
        aula.adicionarLinhaSumario(Long.toString(aula.getNumero()));
        aula.adicionarLinhaSumario(this.nome);
        for (Aluno aluno : aula.getAlunos()) {
            aluno.preencherSumario(aula);
        }
        
    }

    public void adicionar(Aula aula){
        if(aula == null || this.aulas.contains(aula)){
            return;
        }
        this.aulas.add(aula);
        aula.setProfessor(this);
    }

    public void remover(Aula aula) {
        if(!this.aulas.contains(aula)) {
            return;
        }
        this.aulas.remove(aula);
        aula.desassociarProfessor();
    }
}
