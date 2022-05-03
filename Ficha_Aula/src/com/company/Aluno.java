package com.company;
import java.util.LinkedList;

public class Aluno extends Pessoa{

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
    protected void associar(Aula aula) {
        aula.adicionar(this);
    }

    @Override
    public void escreverSumario(Aula aula){
        aula.adicionarLinha(nome);
    }

    @Override
    protected void desassociar(Aula aula) {
        aula.remover(this);
    }
}