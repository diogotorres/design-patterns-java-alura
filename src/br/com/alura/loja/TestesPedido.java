package br.com.alura.loja;

import br.com.alura.loja.pedido.GeraPedido;

import java.math.BigDecimal;

public class TestesPedido {
    public static void main(String[] args) {
        String cliente = args[0];
        BigDecimal valorOrcamento = new BigDecimal(args[1]);
        int qtdeItens = Integer.parseInt(args[2]);

        GeraPedido gerador = new GeraPedido(cliente, valorOrcamento,  qtdeItens);
        gerador.executa();
    }
}
