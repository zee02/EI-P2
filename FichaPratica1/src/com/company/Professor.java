
package com.company;
import java.util.LinkedList;

public class Professor {
    private String nome;
    private long numero;
    private LinkedList<Aula> aulas;

    public Professor(String nome, long numero) {
        this.nome = nome;
        this.numero = numero;
    }

    public void preencherSumario(Aula aula) {
        if(this.aulas == null || aula == null || !this.aulas.contains(aula)){
            return;
        }
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
        if(aula == null){
            return;
        }
        this.aulas.add(aula);
        aula.adicionarProfessor(this);
    }

    public void removerAula(Aula aula){
        if(this.aulas==null || aula == null){
            return;
        }
        this.aulas.remove(aula);
        aula.desassociarProfessor();
    }

    public LinkedList<Aula> getAulas() {
        return aulas;
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