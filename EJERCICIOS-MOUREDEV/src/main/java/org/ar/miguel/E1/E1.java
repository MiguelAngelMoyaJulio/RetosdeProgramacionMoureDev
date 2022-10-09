package org.ar.miguel.E1;

import java.util.Scanner;

public class E1 {
    public static void main(String[] args) {
        /*
         * Escribe una función que reciba dos palabras (String) y retorne
         * verdadero o falso (Bool) según sean o no anagramas.
         * - Un Anagrama consiste en formar una palabra reordenando TODAS
         *   las letras de otra palabra inicial.
         * - NO hace falta comprobar que ambas palabras existan.
         * - Dos palabras exactamente iguales no son anagrama.
         */
        int coincidencias = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("ingrese una palabra");
        String p1 = s.nextLine();
        System.out.println("ingrese otra palabra");
        String p2 = s.nextLine();
        p1.trim();
        p2.trim();
        process(p1,p2,coincidencias);
    }

    static void process(String p1 , String p2, int coincidencias) {
        if (p1.length() == p2.length()) {
            if (p1.equals(p2)) {
                System.out.println("las palabras ingresadas no forman son anagrama");
            } else {
                for (int i = 0; i < p1.length(); i++) {
                    for (int j = 0; j < p2.length(); j++) {
                        if (p1.substring(i, i + 1).equals(p2.substring(j, j + 1))) {
                            coincidencias++;
                        }
                    }
                }
                if (coincidencias == p1.length()) {
                    System.out.println("la palabra inicial es anagrama de la segunda");
                }
            }
        } else {
            System.out.println("las palabras ingresadas no son anagrama");
        }
    }
}
