package org.ar.miguel.E40;

import java.util.Scanner;

public class E40 {
    public static void main(String[] args) {
        int num = 3;
        Scanner s = new Scanner(System.in);
        System.out.println("enter the number");
        num = Integer.parseInt(s.nextLine());
        for (int i = 0; i < num; i++) {
            String r = "";
            for (int j = num - i; j > 0; j--) {
                r = r + " ";
            }
            System.out.println(r+binomioNewton(1,1,i));
        }
    }

    static String binomioNewton(int firstTerm, int secoTerm, int pote) {
        String r = "";
        int res = 0;
        for (int i = 0; i <= pote; i++) {
            res = combinacion(pote, i) * (int) Math.pow(firstTerm, pote - i) * (int) Math.pow(secoTerm, i);
            r = r + Integer.toString(res)+ " ";
        }
        return r;
    }

    static int combinacion(int numUp, int numDown) {
        int com = 0;
        com = factorial(numUp) / (factorial(numDown) * factorial(numUp - numDown));
        return com;
    }

    static int factorial(int number) {
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }

}
