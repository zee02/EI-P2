package com.company;

import java.util.LinkedList;

public abstract class Gabinete<TFuncionario extends Funcionario> extends Divisao {
    private LinkedList<TFuncionario> funcionarios;

    public Gabinete(String nome, boolean aberta){
        super(nome,aberta);
        funcionarios = new LinkedList<>();
    }

    public LinkedList<TFuncionario> getFuncionarios() {
        return new LinkedList<>(funcionarios);
    }

    public void adicionar(TFuncionario funcionario){
        if(funcionario == null|| funcionarios.contains(funcionario)){
            return;
        }
        funcionarios.add(funcionario);
        funcionario.setGabinete(this);
    }

    public void remover(Funcionario funcionario){
        if(!funcionarios.contains(funcionario)){
            return;
        }
        funcionarios.remove(funcionario);
        funcionario.desassociarGabinete();
    }
}
