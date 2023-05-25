package org.ar.miguel.E2022.E22;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class E22 {
    public static void main(String[] args) {
        /*
         * Crea una función que reciba dos array, un booleano y retorne un array.
         * - Si el booleano es verdadero buscará y retornará los elementos comunes
         *   de los dos array.
         * - Si el booleano es falso buscará y retornará los elementos no comunes
         *   de los dos array.
         * - No se pueden utilizar operaciones del lenguaje que
         *   lo resuelvan directamente.
         */
        String[] ar;
        String[] ar2;
        Scanner s = new Scanner(System.in);
        System.out.println("ingrese la dimension para los dos arrays");
        int d = Integer.parseInt(s.nextLine());
        ar = new String[d];
        ar2 = new String[d];

//        load the arrays
        for (int i = 0; i < ar.length; i++) {
            System.out.println("ingrese dato para el array1 y 2");
            String o = s.nextLine();
            ar[i] = o;
            String o1 = s.nextLine();
            ar2[i] = o1;
        }

        System.out.println("1.BUSCAR LOS ELEMENTOS EN COMÚN");
        System.out.println("2.BUSCAR LOS ELEMENTOS QUE NO TIENEN EN COMÚN");
        int op = Integer.parseInt(s.nextLine());
        boolean b;
        if (op == 1) {
            b = true;
        } else {
            b = false;
        }

        String[] newAr = new String[ar.length];
        newAr = conjunto(ar, ar2, b);

        for (String st : newAr) {
            if (st != null) {
                System.out.println(st);
            }
        }

    }

    static String[] conjunto(String[] a1, String[] a2, boolean c) {
        List<String> list = new ArrayList<>();
        String[] n;
        if (c == true) {
            n = new String[a1.length];
            for (int i = 0; i < a2.length; i++) {
                if (a1[i].equals(a2[i])) {
                    n[i] = a1[i];
                }
            }
        } else {
            n = new String[a1.length * 2];
            for (int i = 0; i < a2.length; i++) {
                if (!a1[i].equals(a2[i])) {
                    list.add(a1[i]);
                    list.add(a2[i]);
                }
            }

            for (int i = 0; i < list.size(); i++) {
                n[i] = list.get(i);
            }
        }
        return n;
    }
}
