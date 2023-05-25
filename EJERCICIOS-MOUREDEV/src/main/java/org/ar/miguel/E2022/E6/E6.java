package org.ar.miguel.E2022.E6;

import java.util.Scanner;

public class E6 {
    public static void main(String[] args) {
        /*
         * Crea un programa que invierta el orden de una cadena de texto
         * sin usar funciones propias del lenguaje que lo hagan de forma automática.
         * - Si le pasamos "Hola mundo" nos retornaría "odnum aloH"
         */
        Scanner s = new Scanner(System.in);
        String f = "";
        StringBuilder sb = new StringBuilder("");
        System.out.println("ingrese la palabra");
        String p = s.nextLine();
        String[] ar = new String[p.length()];
        for (int i = 0; i < p.length(); i++) {
            ar[i] = p.substring(i, i + 1);
        }
        for (int i = ar.length - 1; i >= 0; i--) {
            sb.append(ar[i]);
        }
        System.out.println(sb.toString());

    }
}
