package org.ar.miguel.E2022.E50;

import java.util.Scanner;

/*
 * Enunciado: Crea una función que sea capaz de encriptar y desencriptar texto
 * utilizando el algoritmo de encriptación de Karaca
 * (debes buscar información sobre él).
 */
public class E50 {
    public static void main(String[] args) {
        String pal = "";
        String res = "";
        StringBuilder[] palArr;
        String[] palAuxArr = new String[0];
        Scanner s = new Scanner(System.in);

        System.out.println("enter a word");
        pal = s.nextLine();
        System.out.println("encript? s/n");
        res = s.nextLine();
        pal = pal.toLowerCase();
        palAuxArr = pal.split(" ");
        palArr = new StringBuilder[palAuxArr.length];
        if (res.equalsIgnoreCase("s")) {

            for (int i = 0; i < palAuxArr.length; i++) {
                StringBuilder sb = new StringBuilder(palAuxArr[i]);
                palArr[i] = sb.reverse();
            }


            for (int i = 0; i < palArr.length; i++) {
                for (int j = 0; j < palArr[i].length(); j++) {
                    if (palArr[i].substring(j, j + 1).equalsIgnoreCase("a")) {
                        palArr[i].replace(j, j + 1, "1");
                    } else if (palArr[i].substring(j, j + 1).equalsIgnoreCase("e")) {
                        palArr[i].replace(j, j + 1, "2");
                    } else if (palArr[i].substring(j, j + 1).equalsIgnoreCase("i")) {
                        palArr[i].replace(j, j + 1, "3");
                    } else if (palArr[i].substring(j, j + 1).equalsIgnoreCase("o")) {
                        palArr[i].replace(j, j + 1, "4");
                    } else if (palArr[i].substring(j, j + 1).equalsIgnoreCase("u")) {
                        palArr[i].replace(j, j + 1, "5");
                    }
                }
                palArr[i].append("aca");
            }
            System.out.println("FRASE ORIGINAL ");
            for (int i = 0; i < palAuxArr.length ; i++)
            {
                System.out.print(palAuxArr[i]+" ");
            }
            System.out.println("");
            System.out.println("FRASE ENCRIPTADA ");
            for (int i = 0; i < palArr.length; i++) {
                System.out.print(palArr[i]+" ");
            }
        } else if (res.equalsIgnoreCase("n")) {
            for (int i = 0; i < palAuxArr.length; i++) {
                StringBuilder sb = new StringBuilder(palAuxArr[i]);
                palArr[i] = sb.reverse();
            }
            for (int i = 0; i < palArr.length; i++) {
                for (int j = 0; j < palArr[i].length(); j++) {
                    if (palArr[i].substring(0, 3).equalsIgnoreCase("aca")) {
                        palArr[i].replace(0, 3, "   ");
                    }
                }
            }
            for (int i = 0; i < palArr.length; i++) {
                for (int j = 0; j < palArr[i].length(); j++) {
                    if (palArr[i].substring(j, j + 1).equalsIgnoreCase("1")) {
                        palArr[i].replace(j, j + 1, "a");
                    } else if (palArr[i].substring(j, j + 1).equalsIgnoreCase("2")) {
                        palArr[i].replace(j, j + 1, "e");
                    } else if (palArr[i].substring(j, j + 1).equalsIgnoreCase("3")) {
                        palArr[i].replace(j, j + 1, "i");
                    } else if (palArr[i].substring(j, j + 1).equalsIgnoreCase("4")) {
                        palArr[i].replace(j, j + 1, "o");
                    } else if (palArr[i].substring(j, j + 1).equalsIgnoreCase("5")) {
                        palArr[i].replace(j, j + 1, "u");
                    }
                }
            }

            System.out.println("FRASE ORIGINAL ");
            for (int i = 0; i < palAuxArr.length ; i++)
            {
                System.out.print(palAuxArr[i]+" ");
            }
            System.out.println("");
            System.out.println("FRASE DESENCRIPTADA ");
            for (int i = 0; i < palArr.length; i++) {
                System.out.print(new String(palArr[i]).trim()+" ");
            }
        }

    }
}
