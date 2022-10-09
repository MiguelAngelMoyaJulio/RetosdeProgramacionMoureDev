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

class Juego {
    private String player1;
    private String player2;

    public Juego(String player1, String player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public Juego() {
    }

    public String getPlayer1() {
        return player1;
    }

    public void setPlayer1(String player1) {
        this.player1 = player1;
    }

    public String getPlayer2() {
        return player2;
    }

    public void setPlayer2(String player2) {
        this.player2 = player2;
    }
}

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

    static void e32() {
        /*
         * Dado un listado de números, encuentra el SEGUNDO más grande.
         */
        List<Integer> list = new ArrayList<>();

        Scanner s = new Scanner(System.in);
        int t = 0;
        System.out.println("cuantos numeros vas a ingresar?");
        t = Integer.parseInt(s.nextLine());

        for (int i = 0; i < t; i++) {
            list.add(Integer.parseInt(s.nextLine()));
        }

        int max = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }
        int min = max;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < min) {
                min = list.get(i);
            }
        }
        int smax = min;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > smax && list.get(i) < max) {
                smax = list.get(i);
            }
        }

        System.out.println("el segundo máximo es : " + smax);
        System.out.println("el máximo es : " + max);
        System.out.println("el mínimo es : " + min);

    }

    static void e30() {
        /*
         * Crea una función que reciba un texto y muestre cada palabra en una línea,
         * formando un marco rectangular de asteriscos.
         * - ¿Qué te parece el reto? Se vería así:
         *   **********
         *   * ¿Qué   *
         *   * te     *
         *   * parece *
         *   * el     *
         *   * reto?  *
         *   **********
         */
        String[] palabras = new String[0];
        String p = "";
        Scanner s = new Scanner(System.in);
        int maxLen = 0;
        System.out.println("ingrese una frase");
        p = s.nextLine();
        palabras = p.split(" ");
        maxLen = palabras[0].length();
//      got the largest word
        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i].length() > maxLen) {
                maxLen = palabras[i].length();
            }
        }


        for (int i = 0; i < maxLen + 2; i++) {
            System.out.print("*");
        }
        System.out.println();
        for (int i = 0; i < palabras.length; i++) {
            String res = "";
            res = res + "*" + palabras[i];
            for (int j = 0; j < (maxLen - palabras[i].length()); j++) {
                res = res + " ";
            }
            res = res + "*";
            System.out.println(res);
        }

        for (int i = 0; i < maxLen + 2; i++) {
            System.out.print("*");
        }
    }

    static void e29() {
        /*
         * Crea una función que ordene y retorne una matriz de números.
         * - La función recibirá un listado (por ejemplo [2, 4, 6, 8, 9]) y un parámetro
         *   adicional "Asc" o "Desc" para indicar si debe ordenarse de menor a mayor
         *   o de mayor a menor.
         * - No se pueden utilizar funciones propias del lenguaje que lo resuelvan
         *   automáticamente.
         */
        Scanner s = new Scanner(System.in);
        int[] numeros;
        int aux = 0;
        System.out.println("ingrese la cantidad de numeros que vas a ingresar");
        int n = Integer.parseInt(s.nextLine());
        numeros = new int[n];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("ingrese un numero");
            numeros[i] = Integer.parseInt(s.nextLine());
        }


        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = 0; j < numeros.length - 1; j++) {
                if (numeros[j] > numeros[j + 1]) {
                    aux = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = aux;
                }
            }
        }
        System.out.println("como quiere ver los datos");
        String r = s.nextLine();
        if (r.equalsIgnoreCase("asc")) {
            for (int i = 0; i < numeros.length; i++) {
                System.out.println("numeros " + numeros[i]);
            }
        } else if (r.equalsIgnoreCase("desc")) {
            for (int i = numeros.length - 1; i >= 0; i--) {
                System.out.println("numeros " + numeros[i]);
            }
        }
    }

    static void e27() {
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
