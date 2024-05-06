package br.com.idtrust.operacoes;

import br.com.idtrust.interfacePKG.Operacao;

public class Divisao implements Operacao {

    @Override
    public int executar(int valorEntradaA, int valorEntradaB) {

        if (valorEntradaB == 0 && valorEntradaA == 0) return 0;
        return (valorEntradaA / valorEntradaB);
    }
}
