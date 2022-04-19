package com.company;
import java.util.LinkedList;

public class Aula extends Identificador{
    //private String sumario;
    private StringBuilder sumario;
    private Professor professor;
    private LinkedList<Aluno> alunos;
    private Horario horario;

    public Aula(String nome, long numero, Horario horario){
        this(nome,numero,horario, null, new LinkedList<>());
    }

    public Aula(String nome, long numero,Horario horario, Professor professor, LinkedList<Aluno> alunos) {
        super(nome,numero);
        this.alunos = new LinkedList<>();
        this.sumario = new StringBuilder();
        this.horario = horario;

        setProfessor(professor);
        for (Aluno aluno : alunos) {
            adicionar(aluno);
        }
    }

    public void adicionar(Aluno aluno) {
        if (aluno == null || this.alunos.contains(aluno)) {
            return;
        }

        this.alunos.add(aluno);
        aluno.adicionar(this);
    }

    public void adicionarLinha(String linha) {
        //this.sumario += linha + '\n';
        sumario.append(linha).append("\n");
    }

    public void desassociarProfessor() {
        if (this.professor == null) {
            return;
        }
        Professor professorRemovido = this.professor;
        this.professor = null;
        professorRemovido.remover(this);

    }

    public String getSumario() {
        return sumario.toString();
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        if (this.professor == professor || professor == null) {
            return;
        }

        if (this.professor != null) {
            this.desassociarProfessor();
        }

        this.professor = professor;
        professor.adicionar(this);
    }

    public void remover(Aluno aluno) {
        if (aluno == null) {
            return;
        }

        if (this.alunos.contains(aluno)) {
            this.alunos.remove(aluno);
            aluno.remover(this);
        }
    }

    public LinkedList<Aluno> getAlunos() {
        return new LinkedList<>(alunos);
    }

    public Horario getHorario() {
        return horario;
    }
}
