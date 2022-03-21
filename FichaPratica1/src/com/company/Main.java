package com.company;

public class Main {

    private Main(){
        Aula aulaDeHoje = new Aula("Programação2", 2);
        Aluno aluno1 = new Aluno("José Silva", 1);
        Aluno aluno2 = new Aluno("Carlos José", 2);
        Professor professor1 = new Professor("Manuel", 1);
        Professor professor2 = new Professor("Bernardo", 2);

        professor1.preencherSumario(aulaDeHoje);
    }
    public static void main(String[] args) {
	    new Main();
    }
}
