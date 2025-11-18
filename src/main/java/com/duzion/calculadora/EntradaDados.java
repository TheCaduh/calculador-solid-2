package com.duzion.calculadora;

import java.util.Scanner;

public class EntradaDados {
    private Scanner scanner;

    public EntradaDados() {
        this.scanner = new Scanner(System.in);
    }

    // Metodo para ler um inteiro do usuário
    public int lerNumero(String mensagem) {
        System.out.print(mensagem);
        return scanner.nextInt();
    }

    // Metodo para ler a operação desejada
    public String lerOperacao() {
        System.out.print("Digite a operação (+, -, *, /): ");
        return scanner.next();
    }

    public void fechar() {
        scanner.close();
    }
}
