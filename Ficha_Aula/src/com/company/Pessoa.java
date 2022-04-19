package com.company;

import java.util.LinkedList;

public class Pessoa extends Identificador {
    private LinkedList<Aula> aulas;

    public Pessoa(String nome, long numero) {
        super(nome, numero);
        aulas = new LinkedList<>();
    }

    public LinkedList<Aula> getAulas() {
        return new LinkedList<>(aulas);
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

    public void adicionar(Aula aula){
        if(aula==null || this.aulas.contains(aula)){
            return;
        }
        this.aulas.add(aula);
    }

    public void remover(Aula aula){
        if(!aulas.contains(aula)) {
            return;
        }
        this.aulas.remove(aula);
    }

    public void preencherSumario (Aula aula){
        if(aulas == null || !this.aulas.contains(aula)) {
            return;
        }
        escreverSumario(aula);
    }
    protected void escreverSumario(Aula aula){

    }
}