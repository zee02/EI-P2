package com.company;
import java.util.LinkedList;

public class Aula {
    private String nome;
    private long numero;
    private String sumario;
    private Professor professor;
    private LinkedList<Aluno> alunos;
    private Horario horario;

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
        return alunos;
    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public void setProfessor(Professor professor) {
        if(this.professor == null) {
            this.professor = professor;
        }
        return;
    }

    public Horario getHorario() {
        return horario;
    }

    public void adicionar(Aluno aluno){
        if(aluno==null || alunos.contains(aluno)){
            return;
        }
        this.alunos.add(aluno);
        aluno.adicionarAula(this);
    }

    public void removerAluno(Aluno aluno){
        if(aluno==null){
            return;
        }
        this.alunos.remove(aluno);
        aluno.removerAula(this);
    }

    public void adicionarProfessor(Professor professor){
        if(professor == null || this.professor!=null){
            return;
        }
        this.professor = professor;
        professor.adicionarAula(this);
    }

    public void desassociarProfessor(){
        if(this.professor==null){
            return;
        }
        this.professor.removerAula(this);
        this.professor = null;
    }

    public Horario horario(){
        return horario;
    }

    public Aula(String nome, long numero, Horario horario){
        this(nome, numero,horario ,null, new LinkedList<>());
    }

    public Aula(String nome, long numero, Horario horario,Professor professor, LinkedList<Aluno> alunos){
        if(professor == null && alunos == null){
            return;
        }
        this.nome = nome;
        this.numero = numero;
        this.horario = horario;
        this.setProfessor(professor);
        this.alunos = new LinkedList<>();
        for(Aluno aluno : alunos){
            adicionar(aluno);
        }
        sumario = "";
    }

    public void adicionarLinhaSumario(String linha){
        sumario+=linha +='\n';
    }

}