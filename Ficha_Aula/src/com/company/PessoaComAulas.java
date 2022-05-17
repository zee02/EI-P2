package com.company;
import java.util.LinkedList;

public abstract class PessoaComAulas extends Pessoa implements RepositorioAulas{
    protected LinkedList<Aula> aulas;
    private GestorAulas gestorAulas;

    public PessoaComAulas(String nome, long numero) {
        super(nome, numero);
        aulas = new LinkedList<>();
    }


    @Override
    public LinkedList<Aula> getAulas() {
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
        gestorAulas.adicionar(aula);
        associar(aula);
    }

    protected abstract void associar(Aula aula);

    public void remover(Aula aula){
        gestorAulas.remover(aula);
        desassociar(aula);
    }

    protected abstract void desassociar(Aula aula);


    public void preencherSumario (Aula aula){
        if(aula == null || !gestorAulas.contem(aula)){
            return;
        }
        escreverSumario(aula);
    }

    protected void escreverSumario(Aula aula){
        aula.adicionarLinha(this.nome);
    }

}
