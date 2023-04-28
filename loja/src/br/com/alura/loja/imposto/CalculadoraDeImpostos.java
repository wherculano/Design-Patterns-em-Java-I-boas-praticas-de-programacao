package br.com.alura.loja.imposto;

import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeImpostos {
    public BigDecimal cacular(Orcamento orcamento, TipoImposto tipoImposto){
        return switch (tipoImposto) {
            case ISS -> orcamento.getValor().multiply(new BigDecimal("0.06"));
            case ICMS -> orcamento.getValor().multiply(new BigDecimal("0.1"));
            default -> BigDecimal.ZERO;
        };
    }
}
