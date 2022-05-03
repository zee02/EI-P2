package com.company;
import java.util.LinkedList;

public class Professor extends Pessoa{

    public Professor (String nome, long numero){
        super(nome, numero);
    }

    @Override
    public void preencherSumario (Aula aula){
        super.preencherSumario(aula);
    }

    @Override
    protected void escreverSumario(Aula aula) {
        aula.adicionarLinha(aula.getNome());
        aula.adicionarLinha(Long.toString(aula.getNumero()));
        aula.adicionarLinha(this.nome);
        super.escreverSumario(aula);

        for (Aluno aluno : aula.getAlunos()) {
            aluno.preencherSumario(aula);
        }

    }

    @Override
    public void adicionar(Aula aula){
        super.adicionar(aula);
    }

    @Override
    protected void associar(Aula aula) {
        aula.setProfessor(this);
    }

    public void remover(Aula aula){
        super.remover(aula);
    }

    @Override
    protected void desassociar(Aula aula) {
        aula.desassociarProfessor();
    }
}
