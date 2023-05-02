package br.com.alura.loja.pedido;

import java.math.BigDecimal;

public class GeraPedido {
    private String nomeCliente;
    private BigDecimal valorOrcamento;
    private int quantidadeDeItens;

    // Aqui seriam declaradas as dependencias, como, por exemplo, PedidoRepository, EmailService, etc
    public GeraPedido(String nomeCliente, BigDecimal valorOrcamento, int quantidadeDeItens) {
        this.nomeCliente = nomeCliente;
        this.valorOrcamento = valorOrcamento;
        this.quantidadeDeItens = quantidadeDeItens;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public BigDecimal getValorOrcamento() {
        return valorOrcamento;
    }

    public int getQuantidadeDeItens() {
        return quantidadeDeItens;
    }
}
