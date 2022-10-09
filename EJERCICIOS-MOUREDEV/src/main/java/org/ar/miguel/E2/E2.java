package org.ar.miguel.E2;

import java.util.Scanner;

public class E2 {
    public static void main(String[] args) {
        /*
         * Escribe un programa que imprima los 50 primeros números de la sucesión
         * de Fibonacci empezando en 0.
         * - La serie Fibonacci se compone por una sucesión de números en
         *   la que el siguiente siempre es la suma de los dos anteriores.
         *   0, 1, 1, 2, 3, 5, 8, 13...
         */
        Scanner s = new Scanner(System.in);
        System.out.println("ingrese la cantidad de elementos que desea ver");
        int n = Integer.parseInt(s.nextLine());
        int i = 1;
        int ant2 = 0;
        int ant = 0;
        int nu = 0;
        while (i <= n) {
            if (i == 1) {
                System.out.println(0);
            } else if (i == 2 || i == 3) {
                ant2 = 1;
                System.out.println(1);
                ant = ant2;
            } else {
                nu = ant2 + ant;
                System.out.println(nu);
                ant2 = ant;
                ant = nu;
            }
            i++;
        }

    }
}

