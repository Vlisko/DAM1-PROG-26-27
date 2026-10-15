package ud2.ejercicios;

/**@author Martín Rosales Soto */

import java.util.Scanner;

public class Suspensos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nota;
        boolean haySuspenso = false;

        System.out.println("=== Comprobar si hay suspensos ===");
        System.out.println("Introduce las calificaciones de los alumnos (0-10).");
        System.out.println("Introduce -1 para terminar.");
        System.out.println();

        while (true) {
            System.out.print("Nota: ");
            nota = sc.nextDouble();

            if (nota == -1) {
                break;
            }

            if (nota < 0 || nota > 10) {
                System.out.println("Nota no válida. Debe estar entre 0 y 10.");
                continue;
            }

            if (nota < 5) {
                haySuspenso = true;
            }
        }

        System.out.println();
        if (haySuspenso) {
            System.out.println("Sí, hay algún alumno suspendido.");
        } else {
            System.out.println("No hay ningún alumno suspendido.");
        }

        sc.close();
    }
}
