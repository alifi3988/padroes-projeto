package br.com.projetos.comportamentais.strategy.contextOperacao;

import br.com.projetos.comportamentais.strategy.interfacePKG.Operacao;

public class ContextOperacao {

    private Operacao operacao;

    public void setOperacao(Operacao operacao) {
        this.operacao = operacao;
    }

    public int executarOperacao(int valorEntradaA, int valorEntradaB){
        return operacao.executar(valorEntradaA, valorEntradaB);
    }
}
