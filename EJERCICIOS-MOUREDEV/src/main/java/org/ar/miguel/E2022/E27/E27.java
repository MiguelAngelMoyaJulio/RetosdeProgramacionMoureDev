package org.ar.miguel.E2022.E27;

import java.util.Scanner;

public class E27 {
    public static void main(String[] args) {
        /*
         * Crea un programa que determine si dos vectores son ortogonales.
         * - Los dos array deben tener la misma longitud.
         * - Cada vector se podría representar como un array. Ejemplo: [1, -2]
         */
        int[] n1 = new int[2];
        int[] n2 = new int[2];
        int t = 0;
        Scanner s = new Scanner(System.in);

        for (int i = 0; i < 2; i++) {
            System.out.println("ingrese los datos para ambos vectores");
            n1[i] = Integer.parseInt(s.nextLine());
            n2[i] = Integer.parseInt(s.nextLine());
        }

        t = n1[0] * n2[0] + n1[1] * n2[1];

        if (t == 0) {
            System.out.println("los vectores son ortoganales");
        } else {
            System.out.println("los vectores no son ortoganales");
        }

    }
}
