package com.company;

import java.util.LinkedList;

public class GabineteSeguranca extends Descritor {
    private LinkedList<Seguranca> segurancas;
    private boolean aberta;

    public GabineteSeguranca(String nome) {
        super(nome);
    }

    public LinkedList<Seguranca> getSegurancas() {
        return segurancas;
    }

    public boolean isAberta() {
        return aberta;
    }

    public void abrir(){

    }

    public void fechar(){

    }

    public void adicionar(Seguranca seguranca){

    }
    public void remover(Seguranca Seguranca){

    }
}
