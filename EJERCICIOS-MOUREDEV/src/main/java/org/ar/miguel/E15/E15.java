package org.ar.miguel.E15;

import java.util.Scanner;

public class E15 {
    public static void main(String[] args) {
        /*
         * Crea una función que calcule y retorne cuántos días hay entre dos cadenas
         * de texto que representen fechas.
         * - Una cadena de texto que representa una fecha tiene el formato "dd/MM/yyyy".
         * - La función recibirá dos String y retornará un Int.
         * - La diferencia en días será absoluta (no importa el orden de las fechas).
         * - Si una de las dos cadenas de texto no representa una fecha correcta se
         *   lanzará una excepción.
         */
        Scanner s = new Scanner(System.in);
        String f1 = "";
        String f2 = "";
        String fechaMenor = "";
        String fechaMayor = "";
        int cantidadDiasMayor = 0;
        int cantidadDiasMenor = 0;
        int t = 0;
        int me = 0;
        int ma = 0;
        System.out.println("ingrese las dos fechas dd/MM/yyyy");
        f1 = s.nextLine();
        f2 = s.nextLine();
//        System.out.println("cantidad de dias hasta fin de año");
//        System.out.println(f1.substring(0, 2));
//        System.out.println(f1.substring(3, 5));
//        System.out.println(f1.substring(6, 10));

        if (Integer.parseInt(f1.substring(6, 10)) > Integer.parseInt(f2.substring(6, 10))) {
            fechaMayor = f1;
            fechaMenor = f2;
            cantidadDiasMayor = diasTranscurridos(fechaMayor, "mayor");
            cantidadDiasMenor = diasTranscurridos(fechaMenor, "menor");
            ma = Integer.parseInt(f1.substring(6, 10));
            me = Integer.parseInt(f2.substring(6, 10));
            System.out.println("cantidad de dias : " + (cantidadDiasMayor + cantidadDiasMenor + 365 * (ma - me - 1)));
        } else if (Integer.parseInt(f2.substring(6, 10)) > Integer.parseInt(f1.substring(6, 10))) {
            fechaMayor = f2;
            fechaMenor = f1;
            cantidadDiasMayor = diasTranscurridos(fechaMayor, "mayor");
            cantidadDiasMenor = diasTranscurridos(fechaMenor, "menor");
            ma = Integer.parseInt(f1.substring(6, 10));
            me = Integer.parseInt(f2.substring(6, 10));
            System.out.println("cantidad de dias : " + (cantidadDiasMayor + cantidadDiasMenor + 365 * (ma - me - 1)) * -1);
        } else if (Integer.parseInt(f1.substring(3, 5)) > Integer.parseInt(f2.substring(3, 5))) {
            fechaMayor = f1;
            fechaMenor = f2;
            cantidadDiasMayor = diasTranscurridos(fechaMayor, "menor");
            cantidadDiasMenor = diasTranscurridos(fechaMenor, "menor");
            System.out.println("cantidad de días entre fechas " + (-cantidadDiasMayor + cantidadDiasMenor));
        } else if (Integer.parseInt(f2.substring(3, 5)) > Integer.parseInt(f1.substring(3, 5))) {
            fechaMayor = f2;
            fechaMenor = f1;
            cantidadDiasMayor = diasTranscurridos(fechaMayor, "menor");
            cantidadDiasMenor = diasTranscurridos(fechaMenor, "menor");
            System.out.println("cantidad de días entre fechas " + (-cantidadDiasMayor + cantidadDiasMenor));
        } else if (Integer.parseInt(f1.substring(0, 2)) > Integer.parseInt(f2.substring(0, 2))) {
            System.out.println("cantidad de días entre fechas " + (Integer.parseInt(f1.substring(0, 2)) - Integer.parseInt(f2.substring(0, 2))));
        } else if (Integer.parseInt(f2.substring(0, 2)) > Integer.parseInt(f1.substring(0, 2))) {
            System.out.println("cantidad de días entre fechas " + (Integer.parseInt(f2.substring(0, 2)) - Integer.parseInt(f1.substring(0, 2))));
        } else {
            System.out.println("las fechas son identicas");
        }

    }
    static int diasTranscurridos(String f, String c) {
        int diasPasados = 0;
        int diasTotal = 365;
        int dias = Integer.parseInt(f.substring(0, 2));
        int mes = Integer.parseInt(f.substring(3, 5));
        if (c.equalsIgnoreCase("mayor")) {
            if (mes == 1) {
                diasPasados = dias;
            } else if (mes == 2) {
                diasPasados = 31 + dias;
            } else if (mes == 3) {
                diasPasados = 59 + dias;
            } else if (mes == 4) {
                diasPasados = 90 + dias;
            } else if (mes == 5) {
                diasPasados = 120 + dias;
            } else if (mes == 6) {
                diasPasados = 151 + dias;
            } else if (mes == 7) {
                diasPasados = 181 + dias;
            } else if (mes == 8) {
                diasPasados = 212 + dias;
            } else if (mes == 9) {
                diasPasados = 243 + dias;
            } else if (mes == 10) {
                diasPasados = 273 + dias;
            } else if (mes == 11) {
                diasPasados = 304 + dias;
            } else if (mes == 12) {
                diasPasados = 334 + dias;
            }
        } else if (c.equalsIgnoreCase("menor")) {
            if (mes == 1) {
                diasPasados = dias;
            } else if (mes == 2) {
                diasPasados = 31 + dias;
            } else if (mes == 3) {
                diasPasados = 59 + dias;
            } else if (mes == 4) {
                diasPasados = 90 + dias;
            } else if (mes == 5) {
                diasPasados = 120 + dias;
            } else if (mes == 6) {
                diasPasados = 151 + dias;
            } else if (mes == 7) {
                diasPasados = 181 + dias;
            } else if (mes == 8) {
                diasPasados = 212 + dias;
            } else if (mes == 9) {
                diasPasados = 243 + dias;
            } else if (mes == 10) {
                diasPasados = 273 + dias;
            } else if (mes == 11) {
                diasPasados = 304 + dias;
            } else if (mes == 12) {
                diasPasados = 334 + dias;
            }
            diasPasados = 365 - diasPasados;
        }
        return diasPasados;
    }
}
