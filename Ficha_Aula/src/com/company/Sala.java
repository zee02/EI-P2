package com.company;

import java.util.LinkedList;

public class Sala {
    private String nome;
    private LinkedList<Aula> aulas;
    private boolean aberta;

    public String getNome() {
        return nome;
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

    public void adicionarAula(Aula aula){
        aulas.add(aula);
        aula.setSala(this);
    }

    public void removerAula(Aula aula){
        aulas.remove(aula);
        aula.desassociarSala(this);
    }
}
