package br.com.estudo4;

import java.sql.SQLOutput;

/**
  *Classe principal dps exercícios de Aula 1 de Métodos.
 */
public class Main {

    public static void main(String[] args) {

        // Calculadora

        System.out.println("Exercícios calculadora");
        Calculadora.soma(3, 6);
        Calculadora.subtracao(9, 1.8);
        Calculadora.multiplicacao(7, 8);
        Calculadora.divisao(5, 2.5);

        // Mensagem

        System.out.println("Exercício mensagem");
        Mensagem.obterMesagem(9);
        Mensagem.obterMesagem(14);
        Mensagem.obterMesagem(1);

        // Empréstimo

        System.out.println("Exercício empréstimo");
        Emprestimo.calcular(1000, Emprestimo.getDuasparcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresparcelas());
        Emprestimo.calcular(1000,  5);

    }
}
