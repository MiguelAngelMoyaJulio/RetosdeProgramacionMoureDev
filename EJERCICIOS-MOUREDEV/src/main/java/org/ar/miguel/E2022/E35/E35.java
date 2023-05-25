package org.ar.miguel.E2022.E35;

import java.text.DecimalFormat;
import java.util.Scanner;

public class E35 {
    public static void main(String[] args) {
        /*
         * Enunciado: Crea un programa que calcule el daño de un ataque durante
         * una batalla Pokémon.
         * - La fórmula será la siguiente: daño = 50 * (ataque / defensa) * efectividad
         * - Efectividad: x2 (súper efectivo), x1 (neutral), x0.5 (no es muy efectivo)
         * - Sólo hay 4 tipos de Pokémon: Agua, Fuego, Planta y Eléctrico
         *   (buscar su efectividad)
         * - El programa recibe los siguientes parámetros:
         *  - Tipo del Pokémon atacante.
         *  - Tipo del Pokémon defensor.
         *  - Ataque: Entre 1 y 100.
         *  - Defensa: Entre 1 y 100.
         */
        DecimalFormat df = new DecimalFormat("#.##");
        Scanner s = new Scanner(System.in);
        String atacante = "";
        String defensa = "";
        double ataque = 0;
        double defe = 0;
        double daño = 0;

        System.out.println("Ataque : ingrese el tipo del pokemon atancante y la cantidad");
        atacante = s.nextLine();
        ataque = Double.parseDouble(s.nextLine());
        System.out.println("Defensa : ingrese el tipo del pokemon y la cantidad");
        defensa = s.nextLine();
        defe = Double.parseDouble(s.nextLine());

//        agua
        if (atacante.equalsIgnoreCase("agua") && defensa.equalsIgnoreCase("agua")) {
            daño = 50 * (ataque / defe) * 0.5;
            System.out.println("Tipo atacante : " + atacante);
            System.out.println("Tipo defensa : " + defensa);
            System.out.println("daño causado : " + df.format(daño));
        }

        if (atacante.equalsIgnoreCase("agua") && defensa.equalsIgnoreCase("fuego")) {
            daño = (50 * (ataque / defe) * 2);
            System.out.println("Tipo atacante : " + atacante);
            System.out.println("Tipo defensa : " + defensa);
            System.out.println("daño causado : " + df.format(daño));
        }

        if (atacante.equalsIgnoreCase("agua") && defensa.equalsIgnoreCase("planta")) {
            daño = 50 * (ataque / defe) * 0.5;
            System.out.println("Tipo atacante : " + atacante);
            System.out.println("Tipo defensa : " + defensa);
            System.out.println("daño causado : " + df.format(daño));
        }

        if (atacante.equalsIgnoreCase("agua") && defensa.equalsIgnoreCase("electrico")) {
            daño = 50 * (ataque / defe) * 1;
            System.out.println("Tipo atacante : " + atacante);
            System.out.println("Tipo defensa : " + defensa);
            System.out.println("daño causado : " + df.format(daño));
        }

        //        fuego
        if (atacante.equalsIgnoreCase("fuego") && defensa.equalsIgnoreCase("agua")) {
            daño = 50 * (ataque / defe) * 0.5;
            System.out.println("Tipo atacante : " + atacante);
            System.out.println("Tipo defensa : " + defensa);
            System.out.println("daño causado : " + df.format(daño));
        }

        if (atacante.equalsIgnoreCase("fuego") && defensa.equalsIgnoreCase("fuego")) {
            daño = 50 * (ataque / defe) * 0.5;
            System.out.println("Tipo atacante : " + atacante);
            System.out.println("Tipo defensa : " + defensa);
            System.out.println("daño causado : " + df.format(daño));
        }

        if (atacante.equalsIgnoreCase("fuego") && defensa.equalsIgnoreCase("planta")) {
            daño = 50 * (ataque / defe) * 2;
            System.out.println("Tipo atacante : " + atacante);
            System.out.println("Tipo defensa : " + defensa);
            System.out.println("daño causado : " + df.format(daño));
        }

        if (atacante.equalsIgnoreCase("fuego") && defensa.equalsIgnoreCase("electrico")) {
            daño = 50 * (ataque / defe) * 1;
            System.out.println("Tipo atacante : " + atacante);
            System.out.println("Tipo defensa : " + defensa);
            System.out.println("daño causado : " + df.format(daño));
        }

        //        electrico
        if (atacante.equalsIgnoreCase("electrico") && defensa.equalsIgnoreCase("agua")) {
            daño = 50 * (ataque / defe) * 2;
            System.out.println("Tipo atacante : " + atacante);
            System.out.println("Tipo defensa : " + defensa);
            System.out.println("daño causado : " + df.format(daño));
        }

        if (atacante.equalsIgnoreCase("electrico") && defensa.equalsIgnoreCase("fuego")) {
            daño = 50 * (ataque / defe) * 1;
            System.out.println("Tipo atacante : " + atacante);
            System.out.println("Tipo defensa : " + defensa);
            System.out.println("daño causado : " + df.format(daño));
        }

        if (atacante.equalsIgnoreCase("electrico") && defensa.equalsIgnoreCase("planta")) {
            daño = 50 * (ataque / defe) * 0.5;
            System.out.println("Tipo atacante : " + atacante);
            System.out.println("Tipo defensa : " + defensa);
            System.out.println("daño causado : " + df.format(daño));
        }

        if (atacante.equalsIgnoreCase("electrico") && defensa.equalsIgnoreCase("electrico")) {
            daño = 50 * (ataque / defe) * 0.5;
            System.out.println("Tipo atacante : " + atacante);
            System.out.println("Tipo defensa : " + defensa);
            System.out.println("daño causado : " + df.format(daño));
        }
        //        planta
        if (atacante.equalsIgnoreCase("planta") && defensa.equalsIgnoreCase("agua")) {
            daño = 50 * (ataque / defe) * 2;
            System.out.println("Tipo atacante : " + atacante);
            System.out.println("Tipo defensa : " + defensa);
            System.out.println("daño causado : " + df.format(daño));
        }

        if (atacante.equalsIgnoreCase("planta") && defensa.equalsIgnoreCase("fuego")) {
            daño = 50 * (ataque / defe) * 0.5;
            System.out.println("Tipo atacante : " + atacante);
            System.out.println("Tipo defensa : " + defensa);
            System.out.println("daño causado : " + df.format(daño));
        }

        if (atacante.equalsIgnoreCase("planta") && defensa.equalsIgnoreCase("planta")) {
            daño = 50 * (ataque / defe) * 0.5;
            System.out.println("Tipo atacante : " + atacante);
            System.out.println("Tipo defensa : " + defensa);
            System.out.println("daño causado : " + df.format(daño));
        }

        if (atacante.equalsIgnoreCase("planta") && defensa.equalsIgnoreCase("electrico")) {
            daño = 50 * (ataque / defe) * 0.5;
            System.out.println("Tipo atacante : " + atacante);
            System.out.println("Tipo defensa : " + defensa);
            System.out.println("daño causado : " + df.format(daño));
        }

    }
}
