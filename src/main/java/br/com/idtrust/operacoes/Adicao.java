package br.com.idtrust.operacoes;

import br.com.idtrust.interfacePKG.Operacao;

public class Adicao implements Operacao {

    @Override
    public int executar(int valorEntradaA, int valorEntradaB) {
        return (valorEntradaA + valorEntradaB);
    }

}
