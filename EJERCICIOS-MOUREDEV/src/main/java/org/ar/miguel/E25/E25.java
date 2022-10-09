package org.ar.miguel.E25;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class E25 {
    public static void main(String[] args) {
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
}
