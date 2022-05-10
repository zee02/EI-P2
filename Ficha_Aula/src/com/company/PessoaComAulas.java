package com.company;
import java.util.LinkedList;

public abstract class PessoaComAulas extends Pessoa implements RepositorioAulas{
    protected LinkedList<Aula> aulas;


    public PessoaComAulas(String nome, long numero) {
        super(nome, numero);
        aulas = new LinkedList<>();
    }


    public LinkedList<Aula> getAulas() {
        return aulas;
    }

    public LinkedList<Aula> getAulas(Horario horario) {
        LinkedList<Aula> aulasHorario = new LinkedList<Aula>();
        for (Aula aula: aulas) {
            if(aula.getHorario().isSobreposto(horario)==true){
                aulasHorario.add(aula);
            }
        }
        return aulasHorario;
    }

    public void adicionar(Aula aula){
        if(aula==null || this.aulas.contains(aula)){
            return;
        }
        aulas.add(aula);
        associar(aula);
    }

    protected abstract void associar(Aula aula);

    public void remover(Aula aula){
        if(!aulas.contains(aula)) {
            return;
        }

        aulas.remove(aula);
        desassociar(aula);
    }

    protected abstract void desassociar(Aula aula);


    public void preencherSumario (Aula aula){
        if(aula == null || !aulas.contains(aula)){
            return;
        }
        escreverSumario(aula);
    }

    protected void escreverSumario(Aula aula){
        aula.adicionarLinha(this.nome);
    }

}
