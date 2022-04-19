package com.company;

public class Horario{
    private DiaSemana diaSemana;
    private int horaInicio;
    private int duracao;

    public Horario(DiaSemana diaSemana, int horaInicio, int duracao){
        this.diaSemana = diaSemana;
        this.horaInicio = horaInicio;
        this.duracao = duracao;
    }

    public DiaSemana getDiaSemana() {
        return diaSemana;
    }

    public int gethoraInicio() {
        return horaInicio;
    }

    public int getDuracao() {
        return duracao;
    }

    public boolean isSobreposto(Horario horarioProc){
        return this.diaSemana == horarioProc.diaSemana && this.horaInicio + this.duracao > horarioProc.horaInicio &&
                this.horaInicio < horarioProc.horaInicio + horarioProc.duracao;
    }
}