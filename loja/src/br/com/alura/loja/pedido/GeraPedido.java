package br.com.alura.loja.pedido;

import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class GeraPedido {
    private String nomeCliente;
    private BigDecimal valorOrcamento;
    private int quantidadeDeItens;

    public GeraPedido(String nomeCliente, BigDecimal valorOrcamento, int quantidadeDeItens) {
        this.nomeCliente = nomeCliente;
        this.valorOrcamento = valorOrcamento;
        this.quantidadeDeItens = quantidadeDeItens;
    }

    public void executa() {
        Orcamento orcamento = new Orcamento(this.valorOrcamento, this.quantidadeDeItens);
        Pedido pedido = new Pedido(nomeCliente, LocalDateTime.now(), orcamento);

        System.out.println("Salvando no banco de dados.");
        System.out.println("Enviar email com dados do pedido.");
    }
}
