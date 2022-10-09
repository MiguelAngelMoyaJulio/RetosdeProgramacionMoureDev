package org.ar.miguel.E8;

import java.util.Scanner;

public class E8 {
    public static void main(String[] args) {
        String p = "";
        StringBuilder sb = new StringBuilder("");
        int c = 0;
        int r = 0;
        int d = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("ingrese un numero");
        int numero = Integer.parseInt(s.nextLine());
        System.out.println("numero decimal : " + numero);
        c = numero / 2;
        r = numero - 2 * c;
        sb.append(Integer.toString(r));
        while (c != 1) {
            numero = c;
            c = numero / 2;
            r = numero - 2 * c;
            sb.append(Integer.toString(r));
        }
        sb.append(Integer.toString(c));
        System.out.println("numero binario : " + sb.reverse());

    }
}
