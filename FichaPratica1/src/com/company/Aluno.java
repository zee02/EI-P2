package com.company;
import java.util.LinkedList;

public class Aluno {
    private String nome;
    private long numero;
    private LinkedList<Aula> aulas;

    public Aluno(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
        this.aulas = new LinkedList<>();
    }

    public void adicionarSumario(Aula aula) {
        //todo
    }

    public String getNome() {
        return nome;
    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public void adicionarAula(Aula aula){
        if(aula==null || this.aulas.contains(aula)){
            return;
        }
        this.aulas.add(aula);
        aula.adicionar(this);
    }

    public void removerAula(Aula aula){
        if(aula==null || !aulas.contains(aula)){
            return;
        }
        this.aulas.remove(aula);
        aula.removerAluno(this);
    }

    public LinkedList<Aula> getAulas() {
        return new LinkedList<>(aulas);
    }

    public LinkedList<Aula> getAulas(Horario horario){

        LinkedList<Aula> aulasAuxiliar = new LinkedList<>();
        int horaInicio = horario.getHoraInicio();
        int horaFim = horaInicio + horario.getDuracao();
        DiaSemana diaSemana = horario.getDiaSemana();

        for (Aula aula : aulas){
            if(aula.getHorario().getDiaSemana() == diaSemana){
                if(horaFim > aula.getHorario().getHoraInicio() && horaInicio < aula.getHorario().getHoraInicio()+aula.getHorario().getDuracao()){
                    aulasAuxiliar.add(aula);
                }
            }
        }
        return aulasAuxiliar;
    }
}
