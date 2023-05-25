package org.ar.miguel.E2022.E34;

import java.util.Scanner;

public class E34 {
    public static void main(String[] args) {
        /*
         * Enunciado: Dado un array de enteros ordenado y sin repetidos,
         * crea una función que calcule y retorne todos los que faltan entre
         * el mayor y el menor.
         * - Lanza un error si el array de entrada no es correcto.
         */
        Scanner s = new Scanner(System.in);
        int[] numeros;
        System.out.println("cuantos numeros vas a ingresar");
        int lenNumeros = Integer.parseInt(s.nextLine());
        numeros = new int[lenNumeros];

        for (int i = 0; i < lenNumeros; i++) {
            System.out.println("ingrese el numero");
            numeros[i] = Integer.parseInt(s.nextLine());
        }

        int max = numeros[0];

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > max) {
                max = numeros[i];
            }
        }

        int min = numeros[0];

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] < min) {
                min = numeros[i];
            }
        }

        System.out.println("máximo " + max);
        System.out.println("mínimo " + min);
        System.out.println("numeros restantes");
        for (int i = min + 1; i < max; i++) {
            System.out.println("numero " + i);
        }

    }
}
