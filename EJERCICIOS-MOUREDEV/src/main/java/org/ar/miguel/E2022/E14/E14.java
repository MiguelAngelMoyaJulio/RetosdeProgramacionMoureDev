package org.ar.miguel.E2022.E14;

import java.util.Scanner;

public class E14 {
    public static void main(String[] args) {
        /*
         * Escribe una función que calcule si un número dado es un número de Armstrong
         * (o también llamado narcisista).
         * Si no conoces qué es un número de Armstrong, debes buscar información
         * al respecto.
         */
        Scanner s = new Scanner(System.in);
        String p = "";
        int na = 0;
        int unidad = 0;
        int potencia = 0;
        System.out.println("ingrese un numero");
        p = s.nextLine();
        potencia = p.length();

        for (int i = 0; i < p.length(); i++) {
            unidad = Integer.parseInt(p.substring(i, i + 1));
            na = na + (int) Math.pow(unidad, potencia);
        }
        if (Integer.parseInt(p) == na) {
            System.out.println(p + " es numero de armstrong");
        } else {
            System.out.println(p + " no es numero de armstrong");
        }

    }
}
