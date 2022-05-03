package com.company;

public class Divisao extends Descritor {
    private boolean aberta;

    public Divisao(String nome, boolean aberta) {
        super(nome);
        this.aberta = aberta;
    }

    public boolean isAberta() {
        return aberta;
    }

    public void abrir(CartaoDeAcesso cartao) {
        aberta = true;
    }

    public void fechar(CartaoDeAcesso cartao) {
        aberta = false;
    }
}
