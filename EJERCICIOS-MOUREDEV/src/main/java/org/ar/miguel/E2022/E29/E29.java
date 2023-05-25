package org.ar.miguel.E2022.E29;

import java.util.Scanner;

public class E29 {
    public static void main(String[] args) {
        /*
         * Crea una función que ordene y retorne una matriz de números.
         * - La función recibirá un listado (por ejemplo [2, 4, 6, 8, 9]) y un parámetro
         *   adicional "Asc" o "Desc" para indicar si debe ordenarse de menor a mayor
         *   o de mayor a menor.
         * - No se pueden utilizar funciones propias del lenguaje que lo resuelvan
         *   automáticamente.
         */
        Scanner s = new Scanner(System.in);
        int[] numeros;
        int aux = 0;
        System.out.println("ingrese la cantidad de numeros que vas a ingresar");
        int n = Integer.parseInt(s.nextLine());
        numeros = new int[n];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("ingrese un numero");
            numeros[i] = Integer.parseInt(s.nextLine());
        }


        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = 0; j < numeros.length - 1; j++) {
                if (numeros[j] > numeros[j + 1]) {
                    aux = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = aux;
                }
            }
        }
        System.out.println("como quiere ver los datos");
        String r = s.nextLine();
        if (r.equalsIgnoreCase("asc")) {
            for (int i = 0; i < numeros.length; i++) {
                System.out.println("numeros " + numeros[i]);
            }
        } else if (r.equalsIgnoreCase("desc")) {
            for (int i = numeros.length - 1; i >= 0; i--) {
                System.out.println("numeros " + numeros[i]);
            }
        }

    }
}
