package br.com.alura.loja;

import br.com.alura.loja.pedido.GeraPedido;
import br.com.alura.loja.pedido.GeraPedidoHandler;
import br.com.alura.loja.pedido.acao.EnviarEmailPedido;
import br.com.alura.loja.pedido.acao.SalvarPedidoNoBancoDeDados;

import java.math.BigDecimal;
import java.util.Arrays;

public class TestesPedidos {
    public static void main(String[] args) {
        String cliente = "Wagner Herculano";
        BigDecimal valorOrcamento = new BigDecimal("7500");
        int qtdItens = Integer.parseInt("9");

        GeraPedido gerador = new GeraPedido(cliente, valorOrcamento, qtdItens);
        GeraPedidoHandler handler = new GeraPedidoHandler(
                Arrays.asList(new SalvarPedidoNoBancoDeDados(),
                new EnviarEmailPedido())
        );
        handler.executa(gerador);
    }
}
