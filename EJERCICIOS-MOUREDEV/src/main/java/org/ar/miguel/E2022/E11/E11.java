package org.ar.miguel.E2022.E11;

import java.util.Scanner;

public class E11 {
    public static void main(String[] args) {
        /*
         * Crea una función que reciba dos cadenas como parámetro (str1, str2)
         * e imprima otras dos cadenas como salida (out1, out2).
         * - out1 contendrá todos los caracteres presentes en la str1 pero NO
         *   estén presentes en str2.
         * - out2 contendrá todos los caracteres presentes en la str2 pero NO
         *   estén presentes en str1.
         */
        Scanner s = new Scanner(System.in);
        StringBuilder sb1 = new StringBuilder("");
        StringBuilder sb2 = new StringBuilder("");
        String p = "";
        String p1 = "";
        System.out.println("ingrese dos palabras");
        p = s.nextLine();
        p1 = s.nextLine();
        for (int i = 0; i < p.length(); i++) {
            if (exists(p.substring(i, i + 1), p1) == false) {
                sb1.append(p.substring(i, i + 1));
            }
        }
        for (int i = 0; i < p1.length(); i++) {
            if (exists(p1.substring(i, i + 1), p) == false) {
                sb2.append(p1.substring(i, i + 1));
            }
        }
        System.out.println(sb1.toString());
        System.out.println(sb2.toString());

    }

    static boolean exists(String l, String p) {
        boolean f = false;
        for (int i = 0; i < p.length(); i++) {
            if (p.substring(i, i + 1).equals(l)) {
                f = true;
            }
        }
        return f;
    }
}
