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

    public String getNome() {
        return nome;
    }

    public String getSumario() {
        return sumario;
    }

    public Professor getProfessor() {
        return professor;
    }

    public LinkedList<Aluno> getAlunos() {
        return new LinkedList<>(alunos);
    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public void setProfessor(Professor professor) {
        if(professor == null || this.professor == professor){
            return;
        }
        if(this.professor != null){
            this.professor.remover(this);
        }
        this.professor = professor;
        professor.adicionar(this);
    }

    public void atribuirProfessor(Professor professor){

    }

    public void adicionar(Aluno aluno){

    }

    public void adicionarLinhaSumario(String linha) {
        sumario += linha + '\n';
    }

    public void desassociarProfessor() {
        if(this.professor == null){
            return;
        }
        Professor professorRemovido = this.professor;
        this.professor = null;
        professorRemovido.remover(this);
    }

    public void remover(Aluno aluno) {

    }
}
