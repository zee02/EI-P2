package com.company;

import java.util.LinkedList;

public class Seguranca extends Pessoa implements Funcionario<GabineteSeguranca, Divisao> {

    //private GabineteSeguranca gabinete;
    //private LinkedList<Horario> horariosAtendimento;
    private GestorFuncionario<GabineteSeguranca, Divisao> gestorFuncionario;

    public Seguranca(String nome, long numero, GabineteSeguranca gabinete) {
        super(nome, numero);
        setGabinete(gabinete);
        gestorFuncionario = new GestorFuncionario<>(this);
    }


    public GabineteSeguranca getGabinete() {
        return gestorFuncionario.getGabinete();
    }

    public LinkedList<Horario> getHorariosAtendimento() {
        return gestorFuncionario.getHorariosAtendimento();
    }

    public void setGabinete(GabineteSeguranca gabinete) {
        gestorFuncionario.setGabinete(gabinete);
    }

    public void abrirGabinete(){
        gestorFuncionario.abrirGabinete();
    }

    public void fecharGabinete(){
        gestorFuncionario.fecharGabinete();
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
            divisao.abrir();
        }
    }

    public void abrir(GabineteSeguranca gabinete){

    }

    public void fechar(GabineteSeguranca gabinete){

    }

    public void remover(Horario horario){
        gestorFuncionario.remover(horario);
    }

    public void adicionar(Horario horario){
        gestorFuncionario.adicionar(horario);
    }

    public void desassociarGabinete() {
        gestorFuncionario.desassociarGabinete();
    }
}
