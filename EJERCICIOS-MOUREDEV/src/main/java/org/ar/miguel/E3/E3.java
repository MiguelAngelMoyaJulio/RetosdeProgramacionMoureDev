package org.ar.miguel.E3;

import java.util.Scanner;

public class E3 {
    public static void main(String[] args) {
        /*
         * Escribe un programa que se encargue de comprobar si un número es o no primo.
         * Hecho esto, imprime los números primos entre 1 y 100.
         */
        Scanner s = new Scanner(System.in);

        System.out.println("ingrese un número");
        int n = Integer.parseInt(s.nextLine());
        primo(n);
        for (int i = 1; i <= 100; i++) {
            primo(i);
        }
    }

    static void primo(int numero) {
        int t = 0;
        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                t++;
            }
        }
        if (t == 2) {
            System.out.println(numero + " es primo");
        }
//        else {
//            System.out.println(numero + " no es primo");
//        }
    }
}
