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

}
