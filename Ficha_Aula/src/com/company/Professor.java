package com.company;
import java.util.LinkedList;

public class Professor extends PessoaComAulas {

    private GabineteProfessor gabinete;
    private LinkedList<Horario> horariosAtendimento;

    public Professor(String nome, long numero, GabineteProfessor gabineteProfessorA1){
        super(nome, numero);
        setGabinete(gabinete);
        horariosAtendimento = new LinkedList<>();
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
        return gabinete;
    }

    public LinkedList<Horario> getHorariosAtendimento(){
        return horariosAtendimento;
    }

    public void abrirGabinete(){
        if(gabinete != null || !gabinete.isAberta()){
            gabinete.abrir();
        }
    }

    public void fecharGabinete(){
        if(gabinete != null && gabinete.isAberta()){
            gabinete.fechar();
        }
    }

    public void setGabinete(GabineteProfessor gabinete){
        if(gabinete == null || this.gabinete==gabinete){
            return;
        }
        this.gabinete = gabinete;
        gabinete.adicionar(this);
    }

    public void desassociarGabinete(){
        if(gabinete==null){
            return;
        }
        GabineteProfessor gabineteARemover = gabinete;
        gabinete = null;
        gabineteARemover.remover(this);

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

    }
    public void remover(Horario horario){

    }
}
