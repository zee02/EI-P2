package com.company;

import java.util.LinkedList;

public class GestorFuncionario<TGabinete extends Gabinete, TDivisao extends Divisao> {
    private LinkedList<Horario> horariosAtendimento;
    private TGabinete gabinete;
    private Funcionario<TGabinete, TDivisao> funcionario;

    public GestorFuncionario(Funcionario<TGabinete, TDivisao> funcionario){
        horariosAtendimento = new LinkedList<>();
        this.funcionario = funcionario;
    }

    public TGabinete getGabinete() {
        return gabinete;
    }

    public void setGabinete(TGabinete gabinete) {
        if(gabinete == null || this.gabinete==gabinete){
            return;
        }

        desassociarGabinete();

        this.gabinete = gabinete;
        gabinete.adicionar(funcionario);
    }

    public void abrirGabinete(){
        if(gabinete != null || !gabinete.isAberta()){
            gabinete.abrir();
        }
    }

    public void fecharGabinete(){
        if(gabinete != null && !gabinete.isAberta()){
            gabinete.fechar();
        }
    }

    public void desassociarGabinete() {
        if(gabinete==null){
            return;
        }
        TGabinete gabineteARemover = gabinete;
        gabinete = null;
        gabineteARemover.remover(funcionario);
    }

    public LinkedList<Horario> getHorariosAtendimento(){
        return horariosAtendimento;
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

    public void remover(Horario horario){
        if(horario == null){
            return;
        }
        horariosAtendimento.remove(horario);
    }
}
