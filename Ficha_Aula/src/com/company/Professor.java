package com.company;
import java.util.LinkedList;

public class Professor extends Pessoa{

    private GabineteSeguranca gabinete;
    private LinkedList<Horario> horariosAtendimento;

    public Professor (String nome, long numero){
        super(nome, numero);
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

    private GabineteSeguranca getGabinete(){
        return gabinete;
    }

    public LinkedList<Horario> getHorariosAtendimento(){
        return horariosAtendimento;
    }

    public void abrirGabinete(){

    }

    public void fecharGabinete(){

    }

    public void setGabinete(GabineteSeguranca gabinete){
        this.gabinete = gabinete;
    }

    public void desassociarGabinete(){

    }
    public void abrir(Sala sala){

    }

    public  void fechar(Sala sala){

    }

    public void adicionar(Horario horario){

    }
    public void remover(Horario horario){

    }
}
