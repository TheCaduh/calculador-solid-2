package com.duzion.calculadora;

public class OperacaoFactory {

    public Operacao getOperacao(String simbolo) {
        switch (simbolo) {
            case "+":
                return new Soma();
            case "-":
                return new Subtracao();
            case "*":
                return new Multiplicacao();
            case "/":
                return new Divisao();
            default:
                throw new IllegalArgumentException("Operação inválida: " + simbolo);
        }
    }
}
