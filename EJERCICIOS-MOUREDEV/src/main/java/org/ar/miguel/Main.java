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

    static void e25() {
        /*
         * Crea un programa que calcule quien gana más partidas al piedra,
         * papel, tijera.
         * - El resultado puede ser: "Player 1", "Player 2", "Tie" (empate)
         * - La función recibe un listado que contiene pares, representando cada jugada.
         * - El par puede contener combinaciones de "R" (piedra), "P" (papel)
         *   o "S" (tijera).
         * - Ejemplo. Entrada: [("R","S"), ("S","R"), ("P","S")]. Resultado: "Player 2".
         */
        int p1 = 0;
        int p2 = 0;
        List<Juego> jugadas = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        int c = 0;
        System.out.println("cantidad de jugadas de jugadas a ingresar");
        c = Integer.parseInt(s.nextLine());
        for (int i = 0; i < c; i++) {
            Juego juego = new Juego();
            System.out.println("ingrese la jugada del jugador 1 y 2");
            juego.setPlayer1(s.nextLine());
            juego.setPlayer2(s.nextLine());
            jugadas.add(juego);
        }

        for (Juego juego : jugadas) {
//case player one with r
            if (juego.getPlayer1().equalsIgnoreCase("r") &&
                    juego.getPlayer2().equalsIgnoreCase("p")) {
                p2++;
            } else if (juego.getPlayer1().equalsIgnoreCase("r") &&
                    juego.getPlayer2().equalsIgnoreCase("t")) {
                p1++;
            }
//case player one with p
            if (juego.getPlayer1().equalsIgnoreCase("p") &&
                    juego.getPlayer2().equalsIgnoreCase("r")) {
                p1++;
            } else if (juego.getPlayer1().equalsIgnoreCase("p") &&
                    juego.getPlayer2().equalsIgnoreCase("t")) {
                p2++;
            }
//case player one with t
            if (juego.getPlayer1().equalsIgnoreCase("t") &&
                    juego.getPlayer2().equalsIgnoreCase("r")) {
                p2++;
            } else if (juego.getPlayer1().equalsIgnoreCase("t") &&
                    juego.getPlayer2().equalsIgnoreCase("p")) {
                p1++;
            }

        }
        System.out.println("puntos player 1 : " + p1);
        System.out.println("puntos player 2 : " + p2);

        if (p1 > p2) {
            System.out.println("gana el jugador 1");
        } else if (p2 > p1) {
            System.out.println("gana el jugador 2");
        } else {
            System.out.println("empate");
        }

    }

    static void e24() {
        /*
         * Quiero contar del 1 al 100 de uno en uno (imprimiendo cada uno).
         * ¿De cuántas maneras eres capaz de hacerlo?
         * Crea el código para cada una de ellas.
         */
        System.out.println("usando un bucle for");
        for (int i = 0; i < 100; i++) {
            System.out.println("numero " + (i + 1));
        }


        System.out.println("usando un bucle while");
        int i = 0;
        while (i < 100) {
            System.out.println("numero " + (i + 1));
            i++;
        }

        System.out.println("usando un bucle do-while");
        i = 0;
        do {
            System.out.println("numero " + (i + 1));
            i++;
        } while (i < 100);
    }

    static void e22() {
        /*
         * Crea una función que reciba dos array, un booleano y retorne un array.
         * - Si el booleano es verdadero buscará y retornará los elementos comunes
         *   de los dos array.
         * - Si el booleano es falso buscará y retornará los elementos no comunes
         *   de los dos array.
         * - No se pueden utilizar operaciones del lenguaje que
         *   lo resuelvan directamente.
         */
        String[] ar;
        String[] ar2;
        Scanner s = new Scanner(System.in);
        System.out.println("ingrese la dimension para los dos arrays");
        int d = Integer.parseInt(s.nextLine());
        ar = new String[d];
        ar2 = new String[d];

//        load the arrays
        for (int i = 0; i < ar.length; i++) {
            System.out.println("ingrese dato para el array1 y 2");
            String o = s.nextLine();
            ar[i] = o;
            String o1 = s.nextLine();
            ar2[i] = o1;
        }

        System.out.println("1.BUSCAR LOS ELEMENTOS EN COMÚN");
        System.out.println("2.BUSCAR LOS ELEMENTOS QUE NO TIENEN EN COMÚN");
        int op = Integer.parseInt(s.nextLine());
        boolean b;
        if (op == 1) {
            b = true;
        } else {
            b = false;
        }

        String[] newAr = new String[ar.length];
        newAr = conjunto(ar, ar2, b);

        for (String st : newAr) {
            if (st != null) {
                System.out.println(st);
            }
        }
    }

    static String[] conjunto(String[] a1, String[] a2, boolean c) {
        List<String> list = new ArrayList<>();
        String[] n;
        if (c == true) {
            n = new String[a1.length];
            for (int i = 0; i < a2.length; i++) {
                if (a1[i].equals(a2[i])) {
                    n[i] = a1[i];
                }
            }
        } else {
            n = new String[a1.length * 2];
            for (int i = 0; i < a2.length; i++) {
                if (!a1[i].equals(a2[i])) {
                    list.add(a1[i]);
                    list.add(a2[i]);
                }
            }

            for (int i = 0; i < list.size(); i++) {
                n[i] = list.get(i);
            }
        }
        return n;
    }

    static void e18() {
        /*
         * Crea una función que analice una matriz 3x3 compuesta por "X" y "O"
         * y retorne lo siguiente:
         * - "X" si han ganado las "X"
         * - "O" si han ganado los "O"
         * - "Empate" si ha habido un empate
         * - "Nulo" si la proporción de "X", de "O", o de la matriz no es correcta.
         *   O si han ganado los 2.
         * Nota: La matriz puede no estar totalmente cubierta.
         * Se podría representar con un vacío "", por ejemplo.
         */
        String[][] ma = new String[3][3];
        Scanner s = new Scanner(System.in);
        System.out.println("| 1,1 | 1,2 | 1,3 |");
        System.out.println("| 2,1 | 2,2 | 2,3 |");
        System.out.println("| 3,1 | 3,2 | 3,3 |");
        System.out.println("Ingrese los valores de la matriz");

        for (int i = 0; i < ma.length; i++) {
            for (int j = 0; j < ma.length; j++) {
                System.out.println("Posicion " + "| " + (i + 1) + "," + (j + 1) + " |");
                ma[i][j] = s.nextLine();
            }
        }

        if (amountX(ma) >= 1 && amountO(ma) >= 1) {
            System.out.println("Sistema Incompatible");
        }
        if (amountX(ma) == 1 && amountO(ma) == 0) {
            System.out.println("Gano X");
        }
        if (amountX(ma) == 0 && amountO(ma) == 1) {
            System.out.println("Gano O");
        }
        if (amountX(ma) == 0 && amountO(ma) == 0) {
            System.out.println("Empate");
        }


    }

    static int amountX(String[][] ma) {
        int t = 0;
        if (ma[0][0].equalsIgnoreCase("x") && ma[1][0].equalsIgnoreCase("x") && ma[2][0].equalsIgnoreCase("x")) {
            t++;
        }
        if (ma[0][1].equalsIgnoreCase("x") && ma[1][1].equalsIgnoreCase("x") && ma[2][1].equalsIgnoreCase("x")) {
            t++;
        }
        if (ma[0][2].equalsIgnoreCase("x") && ma[1][2].equalsIgnoreCase("x") && ma[2][2].equalsIgnoreCase("x")) {
            t++;
        }
        if (ma[0][0].equalsIgnoreCase("x") && ma[0][1].equalsIgnoreCase("x") && ma[0][2].equalsIgnoreCase("x")) {
            t++;
        }
        if (ma[1][0].equalsIgnoreCase("x") && ma[1][1].equalsIgnoreCase("x") && ma[1][2].equalsIgnoreCase("x")) {
            t++;
        }
        if (ma[2][0].equalsIgnoreCase("x") && ma[2][1].equalsIgnoreCase("x") && ma[2][2].equalsIgnoreCase("x")) {
            t++;
        }
        if (ma[0][0].equalsIgnoreCase("x") && ma[1][1].equalsIgnoreCase("x") && ma[2][2].equalsIgnoreCase("x")) {
            t++;
        }
        if (ma[0][2].equalsIgnoreCase("x") && ma[1][1].equalsIgnoreCase("x") && ma[2][0].equalsIgnoreCase("x")) {
            t++;
        }

        return t;
    }

    static int amountO(String[][] ma) {
        int t = 0;
        if (ma[0][0].equalsIgnoreCase("o") && ma[1][0].equalsIgnoreCase("o") && ma[2][0].equalsIgnoreCase("o")) {
            t++;
        }
        if (ma[0][1].equalsIgnoreCase("o") && ma[1][1].equalsIgnoreCase("o") && ma[2][1].equalsIgnoreCase("o")) {
            t++;
        }
        if (ma[0][2].equalsIgnoreCase("o") && ma[1][2].equalsIgnoreCase("o") && ma[2][2].equalsIgnoreCase("o")) {
            t++;
        }
        if (ma[0][0].equalsIgnoreCase("o") && ma[0][1].equalsIgnoreCase("o") && ma[0][2].equalsIgnoreCase("o")) {
            t++;
        }
        if (ma[1][0].equalsIgnoreCase("o") && ma[1][1].equalsIgnoreCase("o") && ma[1][2].equalsIgnoreCase("o")) {
            t++;
        }
        if (ma[2][0].equalsIgnoreCase("o") && ma[2][1].equalsIgnoreCase("o") && ma[2][2].equalsIgnoreCase("o")) {
            t++;
        }
        if (ma[0][0].equalsIgnoreCase("o") && ma[1][1].equalsIgnoreCase("o") && ma[2][2].equalsIgnoreCase("o")) {
            t++;
        }
        if (ma[0][2].equalsIgnoreCase("o") && ma[1][1].equalsIgnoreCase("o") && ma[2][0].equalsIgnoreCase("o")) {
            t++;
        }

        return t;
    }

    static void e19() {
        /*
         * Crea una función que reciba días, horas, minutos y segundos (como enteros)
         * y retorne su resultado en milisegundos.
         */
        Scanner s = new Scanner(System.in);
        int t = 0;
        int d = 0;
        int h = 0;
        int m = 0;
        int se = 0;
        System.out.println("ingrese la días, horas, minutos y segundos");
        d = Integer.parseInt(s.nextLine());
        h = Integer.parseInt(s.nextLine());
        m = Integer.parseInt(s.nextLine());
        se = Integer.parseInt(s.nextLine());
        t = d * 24 * 60 * 60 + (h * 60 * 60) + (m * 60) + se;
        System.out.println("tiempo en milisegundos " + (t * 1000));

    }

    static void e16() {
        /*
         * Crea una función que reciba un String de cualquier tipo y se encargue de
         * poner en mayúscula la primera letra de cada palabra.
         * - No se pueden utilizar operaciones del lenguaje que
         *   lo resuelvan directamente.
         */
        StringBuilder sb = new StringBuilder("");
        Scanner s = new Scanner(System.in);
        String p = "";
        String[] ar = new String[0];
        System.out.println("ingrese una oracion");
        List<String> specials = new ArrayList<>();

        p = s.nextLine();

//        cargo los caracateres especiales
        for (int i = 0; i < p.length(); i++) {
            if (p.substring(i, i + 1).equals(" ") ||
                    p.substring(i, i + 1).equals(",") ||
                    p.substring(i, i + 1).equals(".")) {
                specials.add(p.substring(i, i + 1));
            }
        }

        //      elimino los caracteres , y .
        String k = p.replace(",", " ");
        String j = k.replace(".", " ");

        ar = j.split(" ");
        String f = "";
        for (int i = 0; i < ar.length; i++) {
            String r = "";
            r = ar[i].substring(0, 1).toUpperCase() + ar[i].substring(1, ar[i].length());
            if (i < (ar.length - 1)) {
                f = f + r + specials.get(i);
            } else if (i >= ar.length - 1) {
                f = f + r;
            }
        }
        System.out.println(f);
    }

    static void e15() {
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

    static void e14() {
        /*
         * Escribe una función que calcule si un número dado es un número de Armstrong
         * (o también llamado narcisista).
         * Si no conoces qué es un número de Armstrong, debes buscar información
         * al respecto.
         */
        Scanner s = new Scanner(System.in);
        String p = "";
        int na = 0;
        int unidad = 0;
        int potencia = 0;
        System.out.println("ingrese un numero");
        p = s.nextLine();
        potencia = p.length();

        for (int i = 0; i < p.length(); i++) {
            unidad = Integer.parseInt(p.substring(i, i + 1));
            na = na + (int) Math.pow(unidad, potencia);
        }
        if (Integer.parseInt(p) == na) {
            System.out.println(p + " es numero de armstrong");
        } else {
            System.out.println(p + " no es numero de armstrong");
        }
    }

    static void e12() {
        /*
         * Escribe una función que reciba un texto y retorne verdadero o
         * falso (Boolean) según sean o no palíndromos.
         * Un Palíndromo es una palabra o expresión que es igual si se lee
         * de izquierda a derecha que de derecha a izquierda.
         * NO se tienen en cuenta los espacios, signos de puntuación y tildes.
         * Ejemplo: Ana lleva al oso la avellana.
         */
        boolean f = true;
        Scanner s = new Scanner(System.in);
        StringBuilder sb = new StringBuilder("");
        String p = "";
        String r = "";
        String n = "";
        System.out.println("ingrese una oracion");
        p = s.nextLine();

        for (int i = 0; i < p.length(); i++) {
            if (!p.substring(i, i + 1).equals(" ") &&
                    !p.substring(i, i + 1).equals(".") &&
                    !p.substring(i, i + 1).equals(",")) {
                sb.append(p.substring(i, i + 1));
            }
        }
        System.out.println(sb.toString());
        n = sb.toString();
        r = sb.reverse().toString();
        System.out.println(r);
        for (int i = 0; i < r.length(); i++) {
            if (!r.substring(i, i + 1).equalsIgnoreCase(n.substring(i, i + 1))) {
                f = false;
                break;
            }
        }
        if (f) {
            System.out.println("la palabra es palindromo");
        } else {
            System.out.println("la palabra no es palindromo");
        }


    }

    static void e13() {
        /*
         * Escribe una función que calcule y retorne el factorial de un número dado
         * de forma recursiva.
         */
        Scanner s = new Scanner(System.in);
        int n = 0;
        int f = 1;
        System.out.println("ingrese un numero");
        n = Integer.parseInt(s.nextLine());

        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        System.out.println("el factorial de " + n + " es : " + f);
    }

    static void e11() {
        /*
         * Crea una función que reciba dos cadenas como parámetro (str1, str2)
         * e imprima otras dos cadenas como salida (out1, out2).
         * - out1 contendrá todos los caracteres presentes en la str1 pero NO
         *   estén presentes en str2.
         * - out2 contendrá todos los caracteres presentes en la str2 pero NO
         *   estén presentes en str1.
         */
        Scanner s = new Scanner(System.in);
        StringBuilder sb1 = new StringBuilder("");
        StringBuilder sb2 = new StringBuilder("");
        String p = "";
        String p1 = "";
        System.out.println("ingrese dos palabras");
        p = s.nextLine();
        p1 = s.nextLine();
        for (int i = 0; i < p.length(); i++) {
            if (exists(p.substring(i, i + 1), p1) == false) {
                sb1.append(p.substring(i, i + 1));
            }
        }
        for (int i = 0; i < p1.length(); i++) {
            if (exists(p1.substring(i, i + 1), p) == false) {
                sb2.append(p1.substring(i, i + 1));
            }
        }
        System.out.println(sb1.toString());
        System.out.println(sb2.toString());

    }

    static boolean exists(String l, String p) {
        boolean f = false;
        for (int i = 0; i < p.length(); i++) {
            if (p.substring(i, i + 1).equals(l)) {
                f = true;
            }
        }
        return f;
    }

    static void e8() {
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

    static void e7() {
        Scanner s = new Scanner(System.in);
        String p = "";
        String[] listado = new String[0];
        List<String> listUnicos = new ArrayList<>();
        System.out.println("ingrese un frase");

        p = s.nextLine();
        System.out.println("frase completa : ");
        System.out.println(p);

        listado = p.split(" ");
        for (int i = 0; i < listado.length; i++) {
            int t = 0;
            for (int j = 0; j < listado.length; j++) {
                if (listado[i].equalsIgnoreCase(listado[j])) {
                    t++;
                }
            }
            System.out.println("palabra " + listado[i] + " cantidad de veces que aparece " + t);
        }
    }

    static void e6() {
        /*
         * Crea un programa que invierta el orden de una cadena de texto
         * sin usar funciones propias del lenguaje que lo hagan de forma automática.
         * - Si le pasamos "Hola mundo" nos retornaría "odnum aloH"
         */
        Scanner s = new Scanner(System.in);
        String f = "";
        StringBuilder sb = new StringBuilder("");
        System.out.println("ingrese la palabra");
        String p = s.nextLine();
        String[] ar = new String[p.length()];
        for (int i = 0; i < p.length(); i++) {
            ar[i] = p.substring(i, i + 1);
        }
        for (int i = ar.length - 1; i >= 0; i--) {
            sb.append(ar[i]);
        }
        System.out.println(sb.toString());

    }

    static void e4() {
        /*
         * Crea una única función (importante que sólo sea una) que sea capaz
         * de calcular y retornar el área de un polígono.
         * - La función recibirá por parámetro sólo UN polígono a la vez.
         * - Los polígonos soportados serán Triángulo, Cuadrado y Rectángulo.
         * - Imprime el cálculo del área de un polígono de cada tipo.
         */
        Scanner s = new Scanner(System.in);
        int op = 0;

        do {
            System.out.println("1.AREA DE UN TRIANGULO");
            System.out.println("2.AREA DE UN CUADRADO");
            System.out.println("3.AREA DE UN RECTANGULO");
            System.out.println("4.EXIT");
            System.out.println("ELIJA UNA OPCION");
            op = Integer.parseInt(s.nextLine());
            switch (op) {
                case 1:
                    System.out.println("ingrese la base y altura");
                    int b = Integer.parseInt(s.nextLine());
                    int a = Integer.parseInt(s.nextLine());
                    System.out.println("area : " + (b * a / 2));
                    break;
                case 2:
                    System.out.println("ingrese el lado");
                    int c = Integer.parseInt(s.nextLine());
                    System.out.println("area : " + (c * c));
                    break;
                case 3:
                    System.out.println("ingrese la base y altura");
                    int v = Integer.parseInt(s.nextLine());
                    int k = Integer.parseInt(s.nextLine());
                    System.out.println("area : " + (v * k));
                    break;
                default:
                    break;
            }
        } while (op != 4);
    }

    static void e3() {
        /*
         * Escribe un programa que se encargue de comprobar si un número es o no primo.
         * Hecho esto, imprime los números primos entre 1 y 100.
         */
        Scanner s = new Scanner(System.in);

        System.out.println("ingrese un número");
        int n = Integer.parseInt(s.nextLine());
        primo(n);
        for (int i = 1; i <= 100; i++) {
            primo(i);
        }
    }

    static void primo(int numero) {
        int t = 0;
        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                t++;
            }
        }
        if (t == 2) {
            System.out.println(numero + " es primo");
        }
//        else {
//            System.out.println(numero + " no es primo");
//        }
    }

    static void e2() {
        /*
         * Escribe un programa que imprima los 50 primeros números de la sucesión
         * de Fibonacci empezando en 0.
         * - La serie Fibonacci se compone por una sucesión de números en
         *   la que el siguiente siempre es la suma de los dos anteriores.
         *   0, 1, 1, 2, 3, 5, 8, 13...
         */
        Scanner s = new Scanner(System.in);
        System.out.println("ingrese la cantidad de elementos que desea ver");
        int n = Integer.parseInt(s.nextLine());
        int i = 1;
        int ant2 = 0;
        int ant = 0;
        int nu = 0;
        while (i <= n) {
            if (i == 1) {
                System.out.println(0);
            } else if (i == 2 || i == 3) {
                ant2 = 1;
                System.out.println(1);
                ant = ant2;
            } else {
                nu = ant2 + ant;
                System.out.println(nu);
                ant2 = ant;
                ant = nu;
            }
            i++;
        }
    }

    static void e1() {
        /*
         * Escribe una función que reciba dos palabras (String) y retorne
         * verdadero o falso (Bool) según sean o no anagramas.
         * - Un Anagrama consiste en formar una palabra reordenando TODAS
         *   las letras de otra palabra inicial.
         * - NO hace falta comprobar que ambas palabras existan.
         * - Dos palabras exactamente iguales no son anagrama.
         */
        int coincidencias = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("ingrese una palabra");
        String p1 = s.nextLine();
        System.out.println("ingrese otra palabra");
        String p2 = s.nextLine();
        p1.trim();
        p2.trim();
        if (p1.length() == p2.length()) {
            if (p1.equals(p2)) {
                System.out.println("las palabras ingresadas no forman son anagrama");
            } else {
                for (int i = 0; i < p1.length(); i++) {
                    for (int j = 0; j < p2.length(); j++) {
                        if (p1.substring(i, i + 1).equals(p2.substring(j, j + 1))) {
                            coincidencias++;
                        }
                    }
                }
                if (coincidencias == p1.length()) {
                    System.out.println("la palabra inicial es anagrama de la segunda");
                }
            }
        } else {
            System.out.println("las palabras ingresadas no son anagrama");
        }

    }

    static void e0() {
        /*
         * Escribe un programa que muestre por consola (con un print) los
         * números de 1 a 100 (ambos incluidos y con un salto de línea entre
         * cada impresión), sustituyendo los siguientes:
         * - Múltiplos de 3 por la palabra "fizz".
         * - Múltiplos de 5 por la palabra "buzz".
         * - Múltiplos de 3 y de 5 a la vez por la palabra "fizzbuzz".
         */
        for (int i = 0; i < 100; i++) {
            if ((i + 1) % 5 == 0 && (i + 1) % 3 == 0) {
                System.out.println((i + 1) + " fizzbuzz");
            } else if ((i + 1) % 5 == 0) {
                System.out.println((i + 1) + " buzz");
            } else if ((i + 1) % 3 == 0) {
                System.out.println((i + 1) + " fizz");
            }
        }
    }
}
