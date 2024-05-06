package br.com.projetos.operacoes;

import br.com.projetos.interfacePKG.Operacao;

public class Divisao implements Operacao {

    @Override
    public int executar(int valorEntradaA, int valorEntradaB) {

        if (valorEntradaB == 0 && valorEntradaA == 0) return 0;
        return (valorEntradaA / valorEntradaB);
    }
}
