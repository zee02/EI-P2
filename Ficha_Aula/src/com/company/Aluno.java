package com.company;
import java.util.LinkedList;

public class Aluno extends Pessoa{

    public Aluno(String nome, long numero){
        super(nome,numero);
    }

    @Override
    public void adicionar(Aula aula){
        super.adicionar(aula);
        aula.adicionar(this);
    }

    @Override
    public void preencherSumario(Aula aula){
        super.preencherSumario(aula);
        aula.adicionarLinha(this.nome);
    }

    @Override
    public void remover(Aula aula){
        super.remover(aula);
        aula.remover(this);
    }
}