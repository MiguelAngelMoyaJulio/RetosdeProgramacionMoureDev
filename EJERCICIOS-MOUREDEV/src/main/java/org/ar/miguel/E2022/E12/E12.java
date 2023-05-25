package org.ar.miguel.E2022.E12;

import java.util.Scanner;

public class E12 {
    public static void main(String[] args) {
        /*
         * Escribe una función que reciba un texto y retorne verdadero o
         * falso (Boolean) según sean o no palíndromos.
         * Un Palíndromo es una palabra o expresión que es igual si se lee
         * de izquierda a derecha que de derecha a izquierda.
         * NO se tienen en cuenta los espacios, signos de puntuación y tildes.
         * Ejemplo: Ana lleva al oso la avellana.
         */
        boolean f = true;
        Scanner s = new Scanner(System.in);
        StringBuilder sb = new StringBuilder("");
        String p = "";
        String r = "";
        String n = "";
        System.out.println("ingrese una oracion");
        p = s.nextLine();

        for (int i = 0; i < p.length(); i++) {
            if (!p.substring(i, i + 1).equals(" ") &&
                    !p.substring(i, i + 1).equals(".") &&
                    !p.substring(i, i + 1).equals(",")) {
                sb.append(p.substring(i, i + 1));
            }
        }
        System.out.println(sb.toString());
        n = sb.toString();
        r = sb.reverse().toString();
        System.out.println(r);
        for (int i = 0; i < r.length(); i++) {
            if (!r.substring(i, i + 1).equalsIgnoreCase(n.substring(i, i + 1))) {
                f = false;
                break;
            }
        }
        if (f) {
            System.out.println("la palabra es palindromo");
        } else {
            System.out.println("la palabra no es palindromo");
        }

    }
}
