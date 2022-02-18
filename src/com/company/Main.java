package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Calculadora calculadora = new Calculadora();
        System.out.println(calculadora.soma(12,13));
        System.out.println(calculadora.subtracao(15,5));
        System.out.println(calculadora.multiplicacao(2,3));
        System.out.println((calculadora.divisao(10,2)));

        Saudacao saudacao = new Saudacao();
        System.out.println(saudacao.cumprimentar(12));
        System.out.println(saudacao.cumprimentar(5));
        System.out.println(saudacao.cumprimentar(20));

        Emprestimo emprestimo = new Emprestimo();
        System.out.println(emprestimo.calcularParcela(1500,2));
        System.out.println(emprestimo.calcularParcela(4000,3));
        System.out.println(emprestimo.calcularParcela(4000,4));

        CalculoArea calculoArea = new CalculoArea();
        System.out.println(calculoArea.calcula(10));
        System.out.println(calculoArea.calcula(10,12));
        System.out.println(calculoArea.calcula(3,2,3));
    }

}

