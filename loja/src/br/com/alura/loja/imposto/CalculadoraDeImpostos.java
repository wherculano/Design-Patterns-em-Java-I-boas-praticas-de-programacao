package br.com.alura.loja.imposto;

import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeImpostos {
    public BigDecimal cacular(Orcamento orcamento, Imposto imposto) {
        return imposto.calcular(orcamento);
    }
}
