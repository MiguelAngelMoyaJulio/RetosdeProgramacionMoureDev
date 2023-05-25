package org.ar.miguel.E2022.E4;

import java.util.Scanner;

public class E4 {
    public static void main(String[] args) {
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
}
