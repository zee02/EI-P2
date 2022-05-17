package com.company;

public class Aluno extends PessoaComAulas {

    public Aluno(String nome, long numero){
        super(nome, numero);
    }
/*
    @Override
    public void adicionar(Aula aula){
        super.adicionar(aula);
    }
*/

    @Override
    public void associar(Aula aula) {
        aula.adicionar(this);
    }

    @Override
    public void escreverSumario(Aula aula){
        aula.adicionarLinha(nome);
    }

    @Override
    public void desassociar(Aula aula) {
        aula.remover(this);
    }
}