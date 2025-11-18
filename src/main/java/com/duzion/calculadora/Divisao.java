package com.duzion.calculadora;

public class Divisao implements Operacao{
    @Override
    public int calcular(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divisao por zero nao permitida");
        }
        return a / b;
    }
}
