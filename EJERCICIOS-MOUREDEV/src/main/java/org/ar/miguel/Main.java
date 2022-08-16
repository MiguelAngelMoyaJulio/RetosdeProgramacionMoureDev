package org.ar.miguel;

import jdk.nashorn.internal.runtime.regexp.joni.ScanEnvironment;

import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
        e20();
    }

    static void e20() {
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
                System.out.println("Posicion "+"| " + (i + 1) + "," + (j + 1) + " |");
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

    static void e7() {
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

    static void e6() {
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

    static void e5() {
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
