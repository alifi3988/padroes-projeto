package br.com.idtrust;

import br.com.idtrust.contextOperacao.ContextOperacao;
import br.com.idtrust.operacoes.Adicao;
import br.com.idtrust.operacoes.Divisao;
import br.com.idtrust.operacoes.Multiplicacao;
import br.com.idtrust.operacoes.Subtracao;

public class Main {
    public static void main(String[] args) {

        ContextOperacao contextOperacao = new ContextOperacao();

        contextOperacao.setOperacao(new Adicao());
        System.out.println("Resultado da operacao soma: " + contextOperacao.executarOperacao(10, 56));

        contextOperacao.setOperacao(new Subtracao());
        System.out.println("Resultado da operacao subtracao: " + contextOperacao.executarOperacao(10, 56));

        contextOperacao.setOperacao(new Multiplicacao());
        System.out.println("Resultado da operacao multiplicacao: " + contextOperacao.executarOperacao(10, 56));

        contextOperacao.setOperacao(new Divisao());
        System.out.println("Resultado da operacao divisao: " + contextOperacao.executarOperacao(10, 56));
    }
}