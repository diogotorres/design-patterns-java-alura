package br.com.alura.loja.pedido;

import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class GeraPedido {

    private String cliente;
    private BigDecimal valorOrcamento;
    private int qtdeItens;

    public GeraPedido(String cliente, BigDecimal valorOrcamento, int qtdeItens) {
        this.cliente = cliente;
        this.valorOrcamento = valorOrcamento;
        this.qtdeItens = qtdeItens;
    }

    public void executa() {
        Orcamento orcamento = new Orcamento(valorOrcamento, qtdeItens);

        Pedido pedido = new Pedido(cliente, LocalDateTime.now(), orcamento);

        System.out.println("Salvar pedido no banco de dados");
        System.out.println("Enviar email com dados do novo pedido");
    }
}
