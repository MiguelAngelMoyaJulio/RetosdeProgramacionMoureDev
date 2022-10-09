package org.ar.miguel.E24;

public class E24 {
    public static void main(String[] args) {
        /*
         * Quiero contar del 1 al 100 de uno en uno (imprimiendo cada uno).
         * ¿De cuántas maneras eres capaz de hacerlo?
         * Crea el código para cada una de ellas.
         */
        System.out.println("usando un bucle for");
        for (int i = 0; i < 100; i++) {
            System.out.println("numero " + (i + 1));
        }


        System.out.println("usando un bucle while");
        int i = 0;
        while (i < 100) {
            System.out.println("numero " + (i + 1));
            i++;
        }

        System.out.println("usando un bucle do-while");
        i = 0;
        do {
            System.out.println("numero " + (i + 1));
            i++;
        } while (i < 100);

    }
}
