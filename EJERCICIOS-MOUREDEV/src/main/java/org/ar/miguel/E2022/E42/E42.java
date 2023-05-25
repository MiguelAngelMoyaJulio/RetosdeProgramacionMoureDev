package org.ar.miguel.E2022.E42;

import java.util.Scanner;

/*
 * Enunciado: Crea una función que transforme grados Celsius en Fahrenheit
 * y viceversa.
 *
 * - Para que un dato de entrada sea correcto debe poseer un símbolo "°"
 *   y su unidad ("C" o "F").
 * - En caso contrario retornará un error.
 * - ¿Quieres emplear lo aprendido en este reto?
 *   Revisa el reto mensual y crea una App:
 * (g°C × 9/5) + 32 C A F
 * (g°F − 32) × 5/9 F A C
 */
public class E42 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int option = 0;
        do {
            System.out.println("1.CONVERSION DE CELSIUS A FAHRENHEIT");
            System.out.println("2.CONVERSION DE FAHRENHEIT A CELSIUS");
            System.out.println("3.SALIR");
            option = Integer.parseInt(s.nextLine());
            switch (option) {
                case 1: aFahrenheit(s);
                    ;
                    break;
                case 2: aCelsius(s);
                    ;
                    break;
                default:
                    break;
            }
        } while (option != 3);

    }

    static void aFahrenheit(Scanner s) {
        double t = 0;
        System.out.println("ingrese la temperatura en celsius");
        t = Double.parseDouble(s.nextLine());
        double conversion = t * 1.8 + 32;
        System.out.println(t + " en fahrenheit es : " + conversion);
    }

    static void aCelsius(Scanner s) {
        double t = 0;
        System.out.println("ingrese la temperatura en fahrenheit");
        t = Double.parseDouble(s.nextLine());
        double conversion = ((t - 32)*5)/9;
        System.out.println(t + " en celsius es : " + conversion);
    }
}
