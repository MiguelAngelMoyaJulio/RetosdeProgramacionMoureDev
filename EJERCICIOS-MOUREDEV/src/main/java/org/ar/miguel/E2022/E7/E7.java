package org.ar.miguel.E2022.E7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class E7 {
    public static void main(String[] args) {
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
}
