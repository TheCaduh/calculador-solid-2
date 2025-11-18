package com.duzion.calculadora;

public class Calculadora {
    // Calculadora realiza o cálculo usando uma operação definida externamente
    public int calcular(Operacao operacao, int a, int b) {
        return operacao.calcular(a, b);
    }
}

