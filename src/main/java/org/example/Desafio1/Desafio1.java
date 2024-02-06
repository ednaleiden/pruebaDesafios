package org.example.Desafio1;

import java.util.ArrayList;
import java.util.List;

public class Desafio1 {

    public static List<Integer> cambiarPosiciones(List<Integer> numeros, int s) {
        List<Integer> resultado = new ArrayList<>();

        for (int numero : numeros) {
            String numeroStr = String.valueOf(numero);

                //construye el metodo modificado
            StringBuilder nuevoNumeroStr = new StringBuilder();
                //itera caracteres
            for (char digito : numeroStr.toCharArray()) {
                //convuerte a entero el caracter
                int digitoInt = Character.getNumericValue(digito);

                if (digitoInt < s) {
                    nuevoNumeroStr.insert(0, digitoInt);
                }
            }
                //revisa el numero modificado tenga menos digitos
            if (nuevoNumeroStr.length() > 0) {
                resultado.add(Integer.parseInt(nuevoNumeroStr.reverse().toString()));
            }
        }

        return resultado;
    }

    public static void main(String[] args) {
        int s = 6;

        List<Integer> lista1 = List.of(1, 2, 3, 4, 5, 6);
        System.out.println(cambiarPosiciones(lista1, s));

        List<Integer> lista2 = List.of(10, 20, 30, 40);
        System.out.println(cambiarPosiciones(lista2, s));

        List<Integer> lista3 = List.of(6);
        System.out.println(cambiarPosiciones(lista3, s));

        List<Integer> lista4 = List.of(66);
        System.out.println(cambiarPosiciones(lista4, s));

        List<Integer> lista5 = List.of(65);
        System.out.println(cambiarPosiciones(lista5, s));

        List<Integer> lista6 = List.of(6, 2, 1);
        System.out.println(cambiarPosiciones(lista6, s));

        List<Integer> lista7 = List.of(60, 6, 5, 4, 3, 2, 7, 7, 29, 1);
        System.out.println(cambiarPosiciones(lista7, s));


    }
}
