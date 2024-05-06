package br.com.projetos.operacoes;

import br.com.projetos.interfacePKG.Operacao;

public class Adicao implements Operacao {

    @Override
    public int executar(int valorEntradaA, int valorEntradaB) {
        return (valorEntradaA + valorEntradaB);
    }

}