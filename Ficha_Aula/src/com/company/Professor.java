package com.company;
import java.util.LinkedList;

public class Professor extends PessoaComAulas implements Funcionario<GabineteProfessor, Sala> {

    //private GabineteProfessor gabinete;
    //private LinkedList<Horario> horariosAtendimento;
    private GestorFuncionario<GabineteProfessor, Sala> gestorFuncionario;

    public Professor(String nome, long numero, GabineteProfessor gabinete){
        super(nome, numero);
        gestorFuncionario = new GestorFuncionario<>(this);
        setGabinete(gabinete);
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
    public void associar(Aula aula) {
        aula.setProfessor(this);
    }

    public void remover(Aula aula){
        super.remover(aula);
    }

    @Override
    public void desassociar(Aula aula) {
        aula.desassociarProfessor();
    }

    public GabineteProfessor getGabinete(){
        return gestorFuncionario.getGabinete();
    }

    public LinkedList<Horario> getHorariosAtendimento(){
        return gestorFuncionario.getHorariosAtendimento();
    }

    public void abrirGabinete(){
        gestorFuncionario.abrirGabinete();
    }

    public void fecharGabinete(){
        gestorFuncionario.fecharGabinete();
    }

    public void setGabinete(GabineteProfessor gabinete){
        gestorFuncionario.setGabinete(gabinete);
    }

    public void desassociarGabinete(){
        gestorFuncionario.desassociarGabinete();

    }
    public void abrir(Sala sala){
        if(sala != null || !sala.isAberta()){
            sala.abrir();
        }
    }

    public  void fechar(Sala sala){
        if(sala != null && sala.isAberta()){
            sala.fechar();
        }
    }

    public void adicionar(Horario horario){
        gestorFuncionario.adicionar(horario);
    }

    public void remover(Horario horario){
        gestorFuncionario.remover(horario);
    }


}
