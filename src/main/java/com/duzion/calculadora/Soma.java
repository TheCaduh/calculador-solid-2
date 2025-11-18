package com.duzion.calculadora;

public class Soma implements Operacao{
    @Override
    public int calcular(int a, int b) {
        return a + b;
    }
}
