package com.company;

import java.util.LinkedList;

public class Sala extends Descritor {
    private LinkedList<Aula> aulas;
    private boolean aberta;

    public Sala(String nome) {
        super(nome);
    }

    public LinkedList<Aula> getAulas() {
        return aulas;
    }

    public LinkedList<Aula> getAulas(Horario horario) {
        return aulas;
    }

    public boolean isAberta() {
        return aberta;
    }

    public void abrir(boolean aberta) {
        this.aberta = true;
    }

    public void fechar(boolean aberta) {
        this.aberta = false;
    }

    public void adicionar(Aula aula){
        aulas.add(aula);
        aula.setSala(this);
    }

    public void remover(Aula aula){
        aulas.remove(aula);
        aula.desassociarSala(this);
    }
}
