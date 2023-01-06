package org.ar.miguel.E38;

import java.util.Scanner;
public class E38 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String numeroBinario = "";
        int numeroDecimal = 0, j = 0;
        System.out.println("enter a binary number");
        numeroBinario = s.nextLine();
        for (int i = numeroBinario.length() - 1; i >= 0; i--) {
            numeroDecimal = numeroDecimal + Integer.parseInt(numeroBinario.substring(i, i + 1)) * (int) Math.pow(2, j);
            j++;
        }
        System.out.println("Binary Number : " + numeroBinario);
        System.out.println("Decimal Number : " + numeroDecimal);
    }
}
