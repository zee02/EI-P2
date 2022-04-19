package com.company;
import java.util.LinkedList;

public class Aluno extends Identificador{
    private LinkedList<Aula> aulas;

    public Aluno(String nome, long numero){
        super(nome,numero);
        this.aulas = new LinkedList<>();
    }

    public void adicionar(Aula aula){
        if(aula == null || this.aulas.contains(aula)){
            return;
        }
        this.aulas.add(aula);
        aula.adicionar(this);
    }

    public void preencherSumario(Aula aula){
        if(aula == null || !this.aulas.contains(aula)){
            return;
        }
        aula.adicionarLinha(this.nome);
    }

    public void remover(Aula aula){
        if(aula == null || !this.aulas.contains(aula)){
            return;
        }
        this.aulas.remove(aula);
        aula.remover(this);
    }

    public LinkedList<Aula> getAulas() {
        return aulas;
    }

    public LinkedList<Aula> getAulas(Horario horario){
        LinkedList<Aula> aulasHorario = new LinkedList<Aula>();
        for (Aula aula: aulas) {
            if(aula.getHorario().isSobreposto(horario)==true){
                aulasHorario.add(aula);
            }
        }
        return aulasHorario;
    }
}