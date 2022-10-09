package org.ar.miguel.E18;

import java.util.Scanner;

public class E18 {
    public static void main(String[] args) {
        /*
         * Crea una función que analice una matriz 3x3 compuesta por "X" y "O"
         * y retorne lo siguiente:
         * - "X" si han ganado las "X"
         * - "O" si han ganado los "O"
         * - "Empate" si ha habido un empate
         * - "Nulo" si la proporción de "X", de "O", o de la matriz no es correcta.
         *   O si han ganado los 2.
         * Nota: La matriz puede no estar totalmente cubierta.
         * Se podría representar con un vacío "", por ejemplo.
         */
        String[][] ma = new String[3][3];
        Scanner s = new Scanner(System.in);
        System.out.println("| 1,1 | 1,2 | 1,3 |");
        System.out.println("| 2,1 | 2,2 | 2,3 |");
        System.out.println("| 3,1 | 3,2 | 3,3 |");
        System.out.println("Ingrese los valores de la matriz");

        for (int i = 0; i < ma.length; i++) {
            for (int j = 0; j < ma.length; j++) {
                System.out.println("Posicion " + "| " + (i + 1) + "," + (j + 1) + " |");
                ma[i][j] = s.nextLine();
            }
        }

        if (amountX(ma) >= 1 && amountO(ma) >= 1) {
            System.out.println("Sistema Incompatible");
        }
        if (amountX(ma) == 1 && amountO(ma) == 0) {
            System.out.println("Gano X");
        }
        if (amountX(ma) == 0 && amountO(ma) == 1) {
            System.out.println("Gano O");
        }
        if (amountX(ma) == 0 && amountO(ma) == 0) {
            System.out.println("Empate");
        }
    }
    static int amountX(String[][] ma) {
        int t = 0;
        if (ma[0][0].equalsIgnoreCase("x") && ma[1][0].equalsIgnoreCase("x") && ma[2][0].equalsIgnoreCase("x")) {
            t++;
        }
        if (ma[0][1].equalsIgnoreCase("x") && ma[1][1].equalsIgnoreCase("x") && ma[2][1].equalsIgnoreCase("x")) {
            t++;
        }
        if (ma[0][2].equalsIgnoreCase("x") && ma[1][2].equalsIgnoreCase("x") && ma[2][2].equalsIgnoreCase("x")) {
            t++;
        }
        if (ma[0][0].equalsIgnoreCase("x") && ma[0][1].equalsIgnoreCase("x") && ma[0][2].equalsIgnoreCase("x")) {
            t++;
        }
        if (ma[1][0].equalsIgnoreCase("x") && ma[1][1].equalsIgnoreCase("x") && ma[1][2].equalsIgnoreCase("x")) {
            t++;
        }
        if (ma[2][0].equalsIgnoreCase("x") && ma[2][1].equalsIgnoreCase("x") && ma[2][2].equalsIgnoreCase("x")) {
            t++;
        }
        if (ma[0][0].equalsIgnoreCase("x") && ma[1][1].equalsIgnoreCase("x") && ma[2][2].equalsIgnoreCase("x")) {
            t++;
        }
        if (ma[0][2].equalsIgnoreCase("x") && ma[1][1].equalsIgnoreCase("x") && ma[2][0].equalsIgnoreCase("x")) {
            t++;
        }

        return t;
    }

    static int amountO(String[][] ma) {
        int t = 0;
        if (ma[0][0].equalsIgnoreCase("o") && ma[1][0].equalsIgnoreCase("o") && ma[2][0].equalsIgnoreCase("o")) {
            t++;
        }
        if (ma[0][1].equalsIgnoreCase("o") && ma[1][1].equalsIgnoreCase("o") && ma[2][1].equalsIgnoreCase("o")) {
            t++;
        }
        if (ma[0][2].equalsIgnoreCase("o") && ma[1][2].equalsIgnoreCase("o") && ma[2][2].equalsIgnoreCase("o")) {
            t++;
        }
        if (ma[0][0].equalsIgnoreCase("o") && ma[0][1].equalsIgnoreCase("o") && ma[0][2].equalsIgnoreCase("o")) {
            t++;
        }
        if (ma[1][0].equalsIgnoreCase("o") && ma[1][1].equalsIgnoreCase("o") && ma[1][2].equalsIgnoreCase("o")) {
            t++;
        }
        if (ma[2][0].equalsIgnoreCase("o") && ma[2][1].equalsIgnoreCase("o") && ma[2][2].equalsIgnoreCase("o")) {
            t++;
        }
        if (ma[0][0].equalsIgnoreCase("o") && ma[1][1].equalsIgnoreCase("o") && ma[2][2].equalsIgnoreCase("o")) {
            t++;
        }
        if (ma[0][2].equalsIgnoreCase("o") && ma[1][1].equalsIgnoreCase("o") && ma[2][0].equalsIgnoreCase("o")) {
            t++;
        }

        return t;
    }
}
