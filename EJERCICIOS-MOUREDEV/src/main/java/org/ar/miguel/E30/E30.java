package org.ar.miguel.E30;

import java.util.Scanner;

public class E30 {
    public static void main(String[] args) {
        /*
         * Crea una función que reciba un texto y muestre cada palabra en una línea,
         * formando un marco rectangular de asteriscos.
         * - ¿Qué te parece el reto? Se vería así:
         *   **********
         *   * ¿Qué   *
         *   * te     *
         *   * parece *
         *   * el     *
         *   * reto?  *
         *   **********
         */
        String[] palabras = new String[0];
        String p = "";
        Scanner s = new Scanner(System.in);
        int maxLen = 0;
        System.out.println("ingrese una frase");
        p = s.nextLine();
        palabras = p.split(" ");
        maxLen = palabras[0].length();
//      got the largest word
        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i].length() > maxLen) {
                maxLen = palabras[i].length();
            }
        }


        for (int i = 0; i < maxLen + 2; i++) {
            System.out.print("*");
        }
        System.out.println();
        for (int i = 0; i < palabras.length; i++) {
            String res = "";
            res = res + "*" + palabras[i];
            for (int j = 0; j < (maxLen - palabras[i].length()); j++) {
                res = res + " ";
            }
            res = res + "*";
            System.out.println(res);
        }

        for (int i = 0; i < maxLen + 2; i++) {
            System.out.print("*");
        }

    }
}
