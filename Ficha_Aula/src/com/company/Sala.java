package com.company;

import java.util.LinkedList;

public class Sala extends Divisao implements RepositorioAulas, AssociavelAulas {
    private GestorAulas gestorAulas;

    public Sala(String nome, boolean aberta) {
        super(nome, aberta);
        gestorAulas = new GestorAulas(this);
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
    }

    @Override
    public void remover(Aula aula){
        gestorAulas.remover(aula);
    }

    @Override
    public void associar(Aula aula){
        aula.setSala(this);
    }

    @Override
    public void desassociar(Aula aula) {
        aula.desassociarSala();
    }


}
