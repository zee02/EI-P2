package com.company;

import java.util.LinkedList;

public class GestorAulas {
    private LinkedList<Aula> aulas;
    private AssociavelAulas associavelAulas;

    public GestorAulas(AssociavelAulas associavelAulas){
        aulas =  new LinkedList<>();
        this.associavelAulas = associavelAulas;
    }

    public LinkedList<Aula> getAulas(){
        return new LinkedList<>(aulas);
    }

    public LinkedList<Aula> getAulas(Horario horario) {
        LinkedList<Aula> aulasAuxiliar = new LinkedList<Aula>();
        for (Aula aula: aulas) {
            if(horario.isSobreposto(aula.getHorario())){
                aulasAuxiliar.add(aula);
            }
        }
        return aulasAuxiliar;
    }

    public void adicionar(Aula aula){
        if(aula==null || aulas.contains(aula)){
            return;
        }
        aulas.add(aula);
    }

    public void remover(Aula aula){
        if(!aulas.contains(aula)) {
            return;
        }
        aulas.remove(aula);
        associavelAulas.desassociar(aula);}

    public boolean contem(Aula aula){
        return aulas.contains(aula);
    }
}
