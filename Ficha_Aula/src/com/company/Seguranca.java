package com.company;

import java.util.LinkedList;

public class Seguranca extends Pessoa {

    private GabineteSeguranca gabinete;
    private LinkedList<Horario> horariosAtendimento;

    public Seguranca(String nome, long numero, GabineteSeguranca gabineteSegurancaA) {
        super(nome, numero);
    }


    public GabineteSeguranca getGabinete() {
        return gabinete;
    }

    public LinkedList<Horario> getHorariosAtendimento() {
        return horariosAtendimento;
    }

    public void setGabinete(GabineteSeguranca gabinete) {
        if(gabinete == null || this.gabinete==gabinete){
            return;
        }
        this.gabinete = gabinete;
        gabinete.adicionar(this);
    }

    public void abrirGabinete(){
        if(gabinete.isAberta()){
            return;
        }
        gabinete.abrir();
    }

    public void fecharGabinete(){
        if(gabinete.isAberta()){
            gabinete.abrir();
        }

    }

    public void abrir(Sala sala){

    }

    public void fechar(Sala sala){

    }

    public void abrir(Divisao divisao){
        if(divisao == null || divisao.isAberta()){
            return;
        }
        divisao.abrir();
    }

    public void fechar(Divisao divisao){
        if(divisao == null || !divisao.isAberta()){
            gabinete.abrir();
        }
    }

    public void abrir(GabineteSeguranca gabinete){

    }

    public void fechar(GabineteSeguranca gabinete){

    }

    public void remover(Horario horario){
        if(horario == null){
            return;
        }
        horariosAtendimento.remove(horario);
    }

    public void adicionar(Horario horario){
        if(horario == null){
            return;
        }

        for (Horario horario1 : horariosAtendimento) {
            if(horario.isSobreposto(horario1)){
                return;
            }
        }
        horariosAtendimento.add(horario);
    }

    public void desassociarGabinete() {
        if(gabinete==null){
            return;
        }
        GabineteSeguranca gabineteARemover = gabinete;
        gabinete = null;
        gabineteARemover.remover(this);
    }
}
