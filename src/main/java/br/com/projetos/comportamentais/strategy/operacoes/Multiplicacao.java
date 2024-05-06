package br.com.projetos.comportamentais.strategy.operacoes;

import br.com.projetos.comportamentais.strategy.interfacePKG.Operacao;

public class Multiplicacao implements Operacao {


    @Override
    public int executar(int valorEntradaA, int valorEntradaB) {
        return (valorEntradaA * valorEntradaB);
    }
}
