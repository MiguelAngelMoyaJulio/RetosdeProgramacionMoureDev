package org.ar.miguel.E13;

import java.util.Scanner;

public class E13 {
    public static void main(String[] args) {
        /*
         * Escribe una función que calcule y retorne el factorial de un número dado
         * de forma recursiva.
         */
        Scanner s = new Scanner(System.in);
        int n = 0;
        int f = 1;
        System.out.println("ingrese un numero");
        n = Integer.parseInt(s.nextLine());

        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        System.out.println("el factorial de " + n + " es : " + f);

    }
}
