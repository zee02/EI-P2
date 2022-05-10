package com.company;

import java.util.LinkedList;

public class Sala extends Divisao {
    private LinkedList<Aula> aulas;

    public Sala(String nome, boolean aberta) {
        super(nome, aberta);
        aulas = new LinkedList<>();
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

    public void adicionar(Aula aula){
        if(aula == null || aulas.contains(aula)){
            return;
        }
        aulas.add(aula);
        aula.setSala(this);
    }

    public void remover(Aula aula){
        if(aula==null || !aulas.contains(aula)){
            return;
        }
        aulas.remove(aula);
        aula.desassociarSala();
    }
}
