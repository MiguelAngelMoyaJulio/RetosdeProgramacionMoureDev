package org.ar.miguel.E19;

import java.util.Scanner;

public class E19 {
    public static void main(String[] args) {
        /*
         * Crea una función que reciba días, horas, minutos y segundos (como enteros)
         * y retorne su resultado en milisegundos.
         */
        Scanner s = new Scanner(System.in);
        int t = 0;
        int d = 0;
        int h = 0;
        int m = 0;
        int se = 0;
        System.out.println("ingrese la días, horas, minutos y segundos");
        d = Integer.parseInt(s.nextLine());
        h = Integer.parseInt(s.nextLine());
        m = Integer.parseInt(s.nextLine());
        se = Integer.parseInt(s.nextLine());
        t = d * 24 * 60 * 60 + (h * 60 * 60) + (m * 60) + se;
        System.out.println("tiempo en milisegundos " + (t * 1000));

    }
}
