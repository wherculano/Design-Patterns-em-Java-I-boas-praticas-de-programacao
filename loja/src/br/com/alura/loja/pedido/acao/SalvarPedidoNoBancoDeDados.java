package br.com.alura.loja.pedido.acao;

import br.com.alura.loja.pedido.Pedido;

public class SalvarPedidoNoBancoDeDados  implements AcaoAposGerarPedido{
    @Override
    public void executarAcao(Pedido pedido){
        System.out.println("[TESTE]: Salvando pedido no banco de dados!");
    }

}