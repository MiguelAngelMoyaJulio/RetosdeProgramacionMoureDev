package org.ar.miguel.E47;

import java.util.Scanner;

public class E47 {
    public static void main(String[] args) {
        String[] vocalesVector = {"a", "e", "i", "o", "u"};
        String vocalMaxRep = "";
        Vocal[] vocales = new Vocal[5];
        vocales[0] = new Vocal("a");
        vocales[1] = new Vocal("e");
        vocales[2] = new Vocal("i");
        vocales[3] = new Vocal("o");
        vocales[4] = new Vocal("u");
        int max = 0;
        Scanner s = new Scanner(System.in);
        String pal = "";
        System.out.println("enter a new word");
        pal = s.nextLine();

        for (int i = 0; i < pal.length(); i++) {
            if (pal.substring(i, i + 1).equalsIgnoreCase("a")) {
                vocales[0].increaseCantidad();
            } else if (pal.substring(i, i + 1).equalsIgnoreCase("e")) {
                vocales[1].increaseCantidad();
            } else if (pal.substring(i, i + 1).equalsIgnoreCase("i")) {
                vocales[2].increaseCantidad();
            } else if (pal.substring(i, i + 1).equalsIgnoreCase("o")) {
                vocales[3].increaseCantidad();
            } else if (pal.substring(i, i + 1).equalsIgnoreCase("u")) {
                vocales[4].increaseCantidad();
            }
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("vocal : " + vocales[i].getNombre() + " cantidad : " + vocales[i].getCantidad());
        }

        for (int i = 0; i < 5; i++) {
            if (max < vocales[i].getCantidad()) {
                max = vocales[i].getCantidad();
                vocalMaxRep = vocales[i].getNombre();
            }
        }
        System.out.println("vocal que se repite con mas frecuencia : "+ vocalMaxRep);
    }

}
