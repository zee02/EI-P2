package com.company;

import java.util.LinkedList;

public interface Funcionario<TGabinete extends Gabinete, TDivisao extends Divisao> {
    LinkedList<Horario> getHorariosAtendimento();

    TGabinete getGabinete();

    void setGabinete(TGabinete gabinete);

    void abrirGabinete();

    void fecharGabinete();

    void desassociarGabinete();

    void adicionar(Horario horario);

    void remover(Horario horario);

    void abrir(TDivisao divisao);
    void fechar(TDivisao divisao);
}
