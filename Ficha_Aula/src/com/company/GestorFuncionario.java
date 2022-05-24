package com.company;

import java.util.LinkedList;

public class GestorFuncionario {
    private LinkedList<Horario> horariosAtendimento;

    public GestorFuncionario(){
        horariosAtendimento = new LinkedList<>();
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
