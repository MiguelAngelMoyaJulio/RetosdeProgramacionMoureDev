package org.ar.miguel.E2022.E0;

public class E0 {
    public static void main(String[] args) {
        /*
         * Escribe un programa que muestre por consola (con un print) los
         * números de 1 a 100 (ambos incluidos y con un salto de línea entre
         * cada impresión), sustituyendo los siguientes:
         * - Múltiplos de 3 por la palabra "fizz".
         * - Múltiplos de 5 por la palabra "buzz".
         * - Múltiplos de 3 y de 5 a la vez por la palabra "fizzbuzz".
         */
        for (int i = 0; i < 100; i++) {
            if ((i + 1) % 5 == 0 && (i + 1) % 3 == 0) {
                System.out.println((i + 1) + " fizzbuzz");
            } else if ((i + 1) % 5 == 0) {
                System.out.println((i + 1) + " buzz");
            } else if ((i + 1) % 3 == 0) {
                System.out.println((i + 1) + " fizz");
            }
        }

    }
}
