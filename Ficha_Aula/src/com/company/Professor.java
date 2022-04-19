package com.company;
import java.util.LinkedList;

public class Professor extends Pessoa {
    private LinkedList<Aula> aulas;

    public Professor (String nome, long numero){
        super(nome,numero);
        this.aulas = new LinkedList<>();
    }

    @Override
    public void adicionar(Aula aula){
        super.adicionar(aula);
        aula.setProfessor(this);
    }

    @Override
    public void preencherSumario (Aula aula){
        super.preencherSumario(aula);

        aula.adicionarLinha(aula.getNome());
        aula.adicionarLinha(Long.toString(aula.getNumero()));
        aula.adicionarLinha(this.nome);

        for (Aluno aluno : aula.getAlunos()) {
            aluno.preencherSumario(aula);
        }
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public long getNumero(){
        return numero;
    }

    @Override
    public void setNumero(long numero) {
        this.numero = numero;
    }

    @Override
    public void remover(Aula aula){
        super.remover(aula);
        aula.desassociarProfessor();
    }
}
