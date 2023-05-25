package org.ar.miguel.E2022.E16;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class E16 {
    public static void main(String[] args) {
        /*
         * Crea una función que reciba un String de cualquier tipo y se encargue de
         * poner en mayúscula la primera letra de cada palabra.
         * - No se pueden utilizar operaciones del lenguaje que
         *   lo resuelvan directamente.
         */
        StringBuilder sb = new StringBuilder("");
        Scanner s = new Scanner(System.in);
        String p = "";
        String[] ar = new String[0];
        System.out.println("ingrese una oracion");
        List<String> specials = new ArrayList<>();

        p = s.nextLine();

//        cargo los caracateres especiales
        for (int i = 0; i < p.length(); i++) {
            if (p.substring(i, i + 1).equals(" ") ||
                    p.substring(i, i + 1).equals(",") ||
                    p.substring(i, i + 1).equals(".")) {
                specials.add(p.substring(i, i + 1));
            }
        }

        //      elimino los caracteres , y .
        String k = p.replace(",", " ");
        String j = k.replace(".", " ");

        ar = j.split(" ");
        String f = "";
        for (int i = 0; i < ar.length; i++) {
            String r = "";
            r = ar[i].substring(0, 1).toUpperCase() + ar[i].substring(1, ar[i].length());
            if (i < (ar.length - 1)) {
                f = f + r + specials.get(i);
            } else if (i >= ar.length - 1) {
                f = f + r;
            }
        }
        System.out.println(f);

    }
}
