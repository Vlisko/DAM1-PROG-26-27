package ud2.ejercicios;

/**
 * @author: apesqfern
*/

import java.util.Scanner;

public class EstadisticaNotas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int aprobado = 0;
        int suspenso = 0;
        System.out.print("Introduce la nota (-1 para salir): ");
        int nota = sc.nextInt();
        while (nota != -1) {
            if (nota >= 5) {
                aprobado++;
            } else {
                suspenso++;
            }
            System.out.print("Introduce la nota (-1 para salir): ");
            nota = sc.nextInt();
        }
        System.out.println("Hay " + aprobado + " alumnos aprobados y " + suspenso + " alumnos suspensos");

    }

}
