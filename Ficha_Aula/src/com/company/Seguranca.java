package com.company;

import java.util.LinkedList;

public class Seguranca extends Identificador {

    private GabineteSeguranca gabinete;
    private LinkedList<Horario> horariosAtendimento;

    public Seguranca(String nome, long numero) {
        super(nome, numero);
    }


    public GabineteSeguranca getGabinete() {
        return gabinete;
    }

    public LinkedList<Horario> getHorariosAtendimento() {
        return horariosAtendimento;
    }

    public void setGabinete(GabineteSeguranca gabinete) {
        this.gabinete = gabinete;
    }

    public void abrirGabinete(){

    }

    public void fecharGabinete(){

    }

    public void abrir(Sala sala){

    }

    public void fechar(Sala sala){

    }

    public void abrir(GabineteProfessor gabinete){

    }

    public void fechar(GabineteProfessor gabinete){

    }

    public void abrir(GabineteSeguranca gabinete){

    }

    public void fechar(GabineteSeguranca gabinete){

    }

    public void remover(Horario horario){

    }

    public void adicionar(Horario horario){

    }
}
