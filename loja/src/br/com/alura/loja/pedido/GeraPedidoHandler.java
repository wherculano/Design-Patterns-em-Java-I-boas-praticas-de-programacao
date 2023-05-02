package br.com.alura.loja.pedido;

import br.com.alura.loja.orcamento.Orcamento;

import java.time.LocalDateTime;

public class GeraPedidoHandler {
    // aqui antes de tudo seria feita a injecao de dependencias no construtor: repository, service, etc.
    public void executa(GeraPedido dados) {
        Orcamento orcamento = new Orcamento(dados.getValorOrcamento(), dados.getQuantidadeDeItens());
        Pedido pedido = new Pedido(dados.getNomeCliente(), LocalDateTime.now(), orcamento);

        System.out.println("Salvando no banco de dados.");
        System.out.println("Enviar email com dados do pedido.");
    }
}
