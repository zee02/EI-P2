package com.company;

import java.util.LinkedList;

public class Sala extends Divisao implements RepositorioAulas {
    private GestorAulas gestorAulas;

    public Sala(String nome, boolean aberta) {
        super(nome, aberta);
        gestorAulas = new GestorAulas();
    }

    @Override
    public LinkedList<Aula> getAulas() {
        return gestorAulas.getAulas();
    }

    @Override
    public LinkedList<Aula> getAulas(Horario horario) {
        return gestorAulas.getAulas(horario);
    }

    @Override
    public void adicionar(Aula aula){
        gestorAulas.adicionar(aula);
        aula.setSala(this);
    }

    @Override
    public void remover(Aula aula){
        gestorAulas.remover(aula);
        aula.desassociarSala();
    }
}
