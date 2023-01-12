package org.ar.miguel.E43;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/*
 * Enunciado: Este es un reto especial por Halloween.
 * Deberemos crear un programa al que le indiquemos si queremos realizar "Truco
 * o Trato" y un listado (array) de personas con las siguientes propiedades:
 * - Nombre de la niña o niño
 * - Edad
 * - Altura en centímetros
 *
 * Si las personas han pedido truco, el programa retornará sustos (aleatorios)
 * siguiendo estos criterios:
 * - Un susto por cada 2 letras del nombre por persona
 * - Dos sustos por cada edad que sea un número par
 * - Tres sustos por cada 100 cm de altura entre todas las personas
 * - Sustos: 🎃 👻 💀 🕷 🕸 🦇
 *
 * Si las personas han pedido trato, el programa retornará dulces (aleatorios)
 * siguiendo estos criterios:
 * - Un dulce por cada letra de nombre
 * - Un dulce por cada 3 años cumplidos hasta un máximo de 10 años por persona
 * - Dos dulces por cada 50 cm de altura hasta un máximo de 150 cm por persona
 * - Dulces: 🍰 🍬 🍡 🍭 🍪 🍫 🧁 🍩
 */
public class E43 {
    public static void main(String[] args) {
        Random r = new Random();
        List<String> sustosTruco = new ArrayList<>();
        List<String> sustosDulces = new ArrayList<>();
        List<Persona> personas = new ArrayList<>();
        String option = "";
        int cantidadLetras = 0, cantidadSustos = 0;
        int alturaTotal = 0;
        Scanner s = new Scanner(System.in);
        loadLists(personas, sustosDulces, sustosTruco);

        System.out.println("enter an option");
        option = s.nextLine();
        if (option.equalsIgnoreCase("truco")) {
            for (Persona p : personas) {
                alturaTotal = alturaTotal + p.getAltura();
                cantidadLetras = cantidadLetras + p.getNombre().length();
//                Dos sustos por cada edad que sea un número par
                if (p.getEdad() % 2 == 0) {
                    cantidadSustos = cantidadSustos + 2;
                }
            }
            //calculo Un susto por cada 2 letras del nombre por persona
            cantidadSustos = cantidadSustos + cantidadLetras / 2;
            cantidadSustos = cantidadSustos + (alturaTotal / 100) * 3;
            System.out.println("SUSTOS ACUMULUADO : " + cantidadSustos);
            for (int i = 0; i < cantidadSustos; i++) {
                int indiceSusto = r.nextInt(6);
                String susto = sustosTruco.get(indiceSusto);
                System.out.print(susto + " ");
                if ((i + 1) % 10 == 0) {
                    System.out.println("");
                }
            }
        } else if (option.equalsIgnoreCase("trato")) {
            for (Persona p : personas) {
                cantidadSustos = cantidadSustos + p.getNombre().length();
                if (p.getAltura() <= 150) {
                    cantidadSustos = cantidadSustos + (p.getAltura() / 50) * 2;
                }
                if (p.getEdad() <= 10) {
                    cantidadSustos = cantidadSustos + (p.getEdad() / 3) * 1;
                }
            }
            System.out.println("SUSTOS ACUMULUADO : " + cantidadSustos);
            for (int i = 0; i < cantidadSustos; i++) {
                int indiceDulce = r.nextInt(8);
                String dulce = sustosDulces.get(indiceDulce);
                System.out.print(dulce + " ");
                if ((i + 1) % 10 == 0) {
                    System.out.println("");
                }
            }
        }

    }

    static void loadLists(List<Persona> personas, List<String> sustosDulces, List<String> sustosTruco) {
        personas.add(new Persona("carlos", 24, 150));
        personas.add(new Persona("miguel", 60, 200));
        personas.add(new Persona("juan", 54, 160));
        personas.add(new Persona("camila", 40, 170));

        sustosTruco.add("susto 1");
        sustosTruco.add("susto 2");
        sustosTruco.add("susto 3");
        sustosTruco.add("susto 4");
        sustosTruco.add("susto 5");
        sustosTruco.add("susto 6");

        sustosDulces.add("dulce 1");
        sustosDulces.add("dulce 2");
        sustosDulces.add("dulce 3");
        sustosDulces.add("dulce 4");
        sustosDulces.add("dulce 5");
        sustosDulces.add("dulce 6");
        sustosDulces.add("dulce 7");
        sustosDulces.add("dulce 8");
    }
}
