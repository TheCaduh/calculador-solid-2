package com.duzion.calculadora;

import com.duzion.calculadora.Calculadora;
import com.duzion.calculadora.EntradaDados;
import com.duzion.calculadora.Operacao;
import com.duzion.calculadora.OperacaoFactory;

public class Main {
    public static void main(String[] args) {
        // Responsável pela entrada de dados
        EntradaDados entrada = new EntradaDados();

        // Lê os números e a operação
        int num1 = entrada.lerNumero("Digite o primeiro número: ");
        int num2 = entrada.lerNumero("Digite o segundo número: ");
        String simbolo = entrada.lerOperacao();

        // Responsável por obter a operação correta
        OperacaoFactory factory = new OperacaoFactory();
        Operacao operacao;
        try {
            operacao = factory.getOperacao(simbolo); // Pode lançar exceção
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
            entrada.fechar();
            return;
        }

        // Responsável por calcular o resultado
        Calculadora calculadora = new Calculadora();
        try {
            int resultado = calculadora.calcular(operacao, num1, num2);
            System.out.println("Resultado: " + resultado);
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }

        entrada.fechar();
    }
}

