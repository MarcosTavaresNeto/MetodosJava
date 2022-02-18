package com.company;

public class Emprestimo {

    public static double calcularParcela( double vlr, int parcela) {
        if (vlr > 2000) {
            if (parcela <= 3) {
                return (vlr * 1.3) / parcela;
            }
        } else if (vlr <= 2000) {
            if (parcela <= 2) {
                return (vlr * 1.2) / parcela;
            }
        }

        System.out.println("Emprestimo não aceito");
        return 0;
    }
}
