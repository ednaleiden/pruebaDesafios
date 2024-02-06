package org.example.Desafio2;

import java.util.ArrayList;
import java.util.List;

public class Desafio2 {

    public static List<Integer> cuadradosOrdenados(List<Integer> numeros, int s) {
        List<Integer> resultado = new ArrayList<>();

        for (int numero : numeros) {
            int cuadrado = numero * numero;

            if (cuadrado >= 0 && cuadrado <= s * s) {
                resultado.add(cuadrado);
            }
        }

        return resultado;
    }

    public static void main(String[] args) {
        int s = 6;

        List<Integer> lista1 = List.of(1, 2, 3, 5, 6, 8, 9);
        System.out.println(cuadradosOrdenados(lista1, s));

        List<Integer> lista2 = List.of(-2, -1);
        System.out.println(cuadradosOrdenados(lista2, s));

        List<Integer> lista3 = List.of(-6, -5, 0, 5, 6);
        System.out.println(cuadradosOrdenados(lista3, s));

        List<Integer> lista4 = List.of(-10, 10);
        System.out.println(cuadradosOrdenados(lista4, s));
    }
}
