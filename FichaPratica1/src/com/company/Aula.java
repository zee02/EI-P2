package com.company;

import java.util.LinkedList;

public class Aula {

    private String nome;
    private long numero;
    private String sumario;
    private Professor professor;
    private LinkedList<Aluno> alunos;

    public Aula(String nome, long numero){
        this.nome = nome;
        this.numero = numero;
        sumario = "";
        professor = null;
        alunos = new LinkedList<Aluno>();

    }

    public void atribuirProfessor(Professor professor){

    }

    public void adicionarAluno(Aluno aluno){

    }

    public void adicionarLinhaSumario(String linha) {

    }
}
