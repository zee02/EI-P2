package com.company;

import java.util.LinkedList;

public class GabineteProfessor extends Descritor {
    private LinkedList<Professor> professores;
    private boolean aberta;

    public GabineteProfessor(String nome) {
        super(nome);
    }

    public LinkedList<Professor> getProfessores() {
        return professores;
    }

    public boolean isAberta() {
        return aberta;
    }

    public void abrir(){

    }

    public void fechar(){

    }

    public void adicionar(Professor professor){

    }
    public void remover(Professor professor){

    }
}
