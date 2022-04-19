package com.company;
import java.util.LinkedList;

public class Professor {
    private String nome;
    private long numero;
    private LinkedList<Aula> aulas;

    public Professor (String nome, long numero){
        this.nome = nome;
        this.numero = numero;
        this.aulas = new LinkedList<>();
    }

    public void adicionar(Aula aula){
        if(aula==null){
            return;
        }
        if(this.aulas.contains(aula)){
            return;
        }
        this.aulas.add(aula);
        aula.setProfessor(this);
    }

    public void preencherSumario (Aula aula){
        if(!this.aulas.contains(aula)){
            return;
        }

        aula.adicionarLinha(aula.getNome());
        aula.adicionarLinha(Long.toString(aula.getNumero()));
        aula.adicionarLinha(this.nome);

        for (Aluno aluno : aula.getAlunos()) {
            aluno.preencherSumario(aula);
        }
    }

    public String getNome() {
        return nome;
    }

    public long getNumero(){
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public void remover(Aula aula){
        if(!aulas.contains(aula)) {
            return;
        }

        this.aulas.remove(aula);
        aula.desassociarProfessor();
    }

    public LinkedList<Aula> getAulas() {
        return aulas;
    }

    public LinkedList<Aula> getAulas(Horario horario) {
        LinkedList<Aula> aulasHorario = new LinkedList<Aula>();
        for (Aula aula: aulas) {
            if(aula.getHorario().isSobreposto(horario)==true){
                aulasHorario.add(aula);
            }
        }
        return aulasHorario;
    }
}
