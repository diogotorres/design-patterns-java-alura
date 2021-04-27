package br.com.alura.loja.pedido;

import br.com.alura.loja.orcamento.Orcamento;

import java.time.LocalDateTime;

public class GeraPedidoHandler {

    // construtor com injecao de dependencias: repository, service, dao etc
    // desta forma, o construtor da classe GeraPedido não fica poluido com as dependencias

    public void execute(GeraPedido dados) {
        Orcamento orcamento = new Orcamento(dados.getValorOrcamento(), dados.getQtdeItens());

        Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);

        System.out.println("Salvar pedido no banco de dados");
        System.out.println("Enviar email com dados do novo pedido");
    }
}
