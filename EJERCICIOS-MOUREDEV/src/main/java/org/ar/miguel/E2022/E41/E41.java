package org.ar.miguel.E2022.E41;

import java.util.Scanner;

/*
 * Enunciado: Crea una función que calcule el valor del parámetro perdido
 * correspondiente a la ley de Ohm.
 * - Enviaremos a la función 2 de los 3 parámetros (V, R, I), y retornará
 *   el valor del tercero (redondeado a 2 decimales).
 * - Si los parámetros son incorrectos o insuficientes, la función retornará
 *   la cadena de texto "Invalid values".
 *   V=RXI
 *   R=V/I
 *   I=V/R
 */
public class E41 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String res = "";
        double v = -1, r = -1, i = -1;
        System.out.println("quiere cargar V? s/n");
        res = s.nextLine();
        if (res.equalsIgnoreCase("s")) {
            System.out.println("ingrese el valor de V");
            v = Double.parseDouble(s.nextLine());
        }
        System.out.println("quiere cargar R? s/n");
        res = s.nextLine();
        if (res.equalsIgnoreCase("s")) {
            System.out.println("ingrese el valor de R");
            r = Double.parseDouble(s.nextLine());
        }
        System.out.println("quiere cargar I? s/n");
        res = s.nextLine();
        if (res.equalsIgnoreCase("s")) {
            System.out.println("ingrese el valor de I");
            i = Double.parseDouble(s.nextLine());
        }
        leyOhm(v, r, i);
    }

    static void leyOhm(double V, double R, double I) {
        if ((V == -1 && R == -1 && I == -1) || (V == -1 && R == -1)
                || (I == -1 && R == -1) || (V == -1 && I == -1)) {
            System.out.println("datos insuficiente");
        } else {
            if (V == -1) {
                System.out.println("V = " + (R * I));
            } else if (R == -1 && I >= 0) {
                if (I > 0) {
                    System.out.println("R = " + (V / I));
                } else {
                    System.out.println("la corriente no puede ser cero");
                }
            } else if (I == -1 && R >= 0) {
                if (R > 0) {
                    System.out.println("I = " + (V / R));
                } else {
                    System.out.println("la resistencia no puede ser cero");
                }
            }
        }
    }
}
