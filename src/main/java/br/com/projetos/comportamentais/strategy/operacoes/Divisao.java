package br.com.projetos.comportamentais.strategy.operacoes;

import br.com.projetos.comportamentais.strategy.interfacePKG.Operacao;

public class Divisao implements Operacao {

    @Override
    public int executar(int valorEntradaA, int valorEntradaB) {

        if (valorEntradaB == 0 && valorEntradaA == 0) return 0;
        return (valorEntradaA / valorEntradaB);
    }
}
