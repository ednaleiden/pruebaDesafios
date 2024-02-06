package org.example.Desafio3;

import java.util.Arrays;

public class Desafio3 {

    public static int cantidadMinimaCambio(int[] monedas) {
        Arrays.sort(monedas);

        int resultado = 1;

        for (int moneda : monedas) {
            if (moneda <= resultado) {
                //actualiza el resultado sumándole el valor de la moneda
                resultado += moneda;
            } else {
                //revisa si el resultamo es mayot a la moneda
                break;
            }
        }

        return resultado;
    }

    public static void main(String[] args) {
        int[] monedas1 = {5, 7, 1, 1, 2, 3, 22};
        System.out.println(cantidadMinimaCambio(monedas1));

        int[] monedas2 = {1, 1, 1, 1, 1};
        System.out.println(cantidadMinimaCambio(monedas2));

        int[] monedas3 = {1, 5, 1, 1, 1, 10, 15, 20, 100};
        System.out.println(cantidadMinimaCambio(monedas3));

        int[] monedas4 = {1, 2, 2, 2, 2, 2};
        System.out.println(cantidadMinimaCambio(monedas4));
    }
}

