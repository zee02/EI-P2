package com.company;

import java.util.LinkedList;

public class GabineteSeguranca extends Divisao {
    private LinkedList<Seguranca> segurancas;

    public GabineteSeguranca(String nome, boolean aberta) {
        super(nome, aberta);
        segurancas = new LinkedList<>(segurancas);
    }

    public LinkedList<Seguranca> getSegurancas() {
        return new LinkedList<>(segurancas);
    }

    public void adicionar(Seguranca seguranca){
        if(seguranca == null || segurancas.contains(seguranca)){
            return;
        }
        segurancas.add(seguranca);
        seguranca.setGabinete(this);
    }
    public void remover(Seguranca seguranca){
        if(!segurancas.contains(seguranca)){
            return;
        }
        segurancas.remove(seguranca);
        seguranca.desassociarGabinete();
    }
}
