package org.ar.miguel.E2022.E32;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class E32 {
    public static void main(String[] args) {
        /*
         * Dado un listado de números, encuentra el SEGUNDO más grande.
         */
        List<Integer> list = new ArrayList<>();

        Scanner s = new Scanner(System.in);
        int t = 0;
        System.out.println("cuantos numeros vas a ingresar?");
        t = Integer.parseInt(s.nextLine());

        for (int i = 0; i < t; i++) {
            list.add(Integer.parseInt(s.nextLine()));
        }

        int max = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }
        int min = max;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < min) {
                min = list.get(i);
            }
        }
        int smax = min;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > smax && list.get(i) < max) {
                smax = list.get(i);
            }
        }

        System.out.println("el segundo máximo es : " + smax);
        System.out.println("el máximo es : " + max);
        System.out.println("el mínimo es : " + min);
    }
}
