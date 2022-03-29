package com.company;

import java.util.LinkedList;

public class Aula {

    private String nome;
    private long numero;
    private String sumario;
    private Professor professor;
    private LinkedList<Aluno> alunos;

    public Aula(String nome, long numero,Professor professor,LinkedList<Aluno> alunos){
        this.nome = nome;
        this.numero = numero;
        this.setProfessor(professor);
        this.alunos = new LinkedList<>();
        for (Aluno aluno : alunos){
            this.adicionar(aluno);
        }
        sumario = "";
    }

    public Aula(String nome, long numero){
        this(nome,numero,null,new LinkedList<>());
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
        if(aluno==null || alunos.contains((aluno))){
            return;
        }
        this.alunos.add(aluno);
        aluno.adicionar(this);
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
