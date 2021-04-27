package br.com.alura.loja.pedido;

import java.math.BigDecimal;

public class GeraPedido {

    private String cliente;
    private BigDecimal valorOrcamento;
    private int qtdeItens;

    public GeraPedido(String cliente, BigDecimal valorOrcamento, int qtdeItens) {
        this.cliente = cliente;
        this.valorOrcamento = valorOrcamento;
        this.qtdeItens = qtdeItens;
    }

    public String getCliente() {
        return cliente;
    }

    public BigDecimal getValorOrcamento() {
        return valorOrcamento;
    }

    public int getQtdeItens() {
        return qtdeItens;
    }
}
