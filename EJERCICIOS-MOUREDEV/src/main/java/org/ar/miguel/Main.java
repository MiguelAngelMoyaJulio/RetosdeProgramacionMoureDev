package org.ar.miguel;

import com.sun.javafx.image.IntPixelGetter;
import com.sun.jmx.snmp.EnumRowStatus;
import jdk.nashorn.internal.runtime.regexp.joni.ScanEnvironment;

import java.lang.reflect.Array;
import java.net.Inet4Address;
import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.sql.SQLOutput;
import java.text.DecimalFormat;
import java.util.*;

class Detalle {
    private int repeticion;
    private String pala;

    public Detalle(int repeticion, String pala) {
        this.repeticion = repeticion;
        this.pala = pala;
    }

    public int getRepeticion() {
        return repeticion;
    }

    public void setRepeticion(int repeticion) {
        this.repeticion = repeticion;
    }

    public String getPala() {
        return pala;
    }

    public void setPala(String pala) {
        this.pala = pala;
    }
}

public class Main {
    public static void main(String[] args) {
        e35();
    }

    static void e35() {
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

    static void e34() {
        /*
         * Enunciado: Dado un array de enteros ordenado y sin repetidos,
         * crea una función que calcule y retorne todos los que faltan entre
         * el mayor y el menor.
         * - Lanza un error si el array de entrada no es correcto.
         */
        Scanner s = new Scanner(System.in);
        int[] numeros;
        System.out.println("cuantos numeros vas a ingresar");
        int lenNumeros = Integer.parseInt(s.nextLine());
        numeros = new int[lenNumeros];

        for (int i = 0; i < lenNumeros; i++) {
            System.out.println("ingrese el numero");
            numeros[i] = Integer.parseInt(s.nextLine());
        }

        int max = numeros[0];

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > max) {
                max = numeros[i];
            }
        }

        int min = numeros[0];

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] < min) {
                min = numeros[i];
            }
        }

        System.out.println("máximo " + max);
        System.out.println("mínimo " + min);
        System.out.println("numeros restantes");
        for (int i = min + 1; i < max; i++) {
            System.out.println("numero " + i);
        }
    }

}
