package org.ar.miguel.E44;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * Enunciado: Crea una función que retorne el número total de bumeranes de
 * un array de números enteros e imprima cada uno de ellos.
 * - Un bumerán (búmeran, boomerang) es una secuencia formada por 3 números
 *   seguidos, en el que el primero y el último son iguales, y el segundo
 *   es diferente. Por ejemplo [2, 1, 2].
 * - En el array [2, 1, 2, 3, 3, 4, 2, 4] hay 2 bumeranes ([2, 1, 2]
 *   y [4, 2, 4]).
 */
public class E44 {
    public static void main(String[] args) {
        Integer[] vectorNum = new Integer[8];

        List<Integer[]> listado = new ArrayList<>();

        Scanner s = new Scanner(System.in);

        for (int i = 0; i < vectorNum.length; i++) {
            System.out.println("enter a number");
            vectorNum[i] = Integer.parseInt(s.nextLine());
        }

        for (int i = 0; i <= vectorNum.length - 3; i++) {
//            System.out.println(vectorNum[i]);
            if (vectorNum[i] == vectorNum[i + 2]) {
                if (vectorNum[i] != vectorNum[i + 1]) {
                    Integer[] bumeran = new Integer[3];
                    bumeran[0] = vectorNum[i];
                    bumeran[1] = vectorNum[i + 1];
                    bumeran[2] = vectorNum[i + 2];
                    listado.add(bumeran);
                }
            }
        }
        System.out.println("cantidad de bumeran : " + listado.size());
        for (Integer[] arr: listado) {
            for (int i = 0; i < arr.length; i++)
            {
                System.out.print(arr[i]+" ");
            }
            System.out.println("");
        }
    }
}
