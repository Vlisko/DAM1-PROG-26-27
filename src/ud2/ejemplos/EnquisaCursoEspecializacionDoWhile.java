package ud2.ejemplos;

import java.util.Scanner;

public class EnquisaCursoEspecializacionDoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = sc.nextInt();
        int ciberseguridad = 0;
        int desenvolvemento = 0;
        int intelixencia = 0;

        do {
            mostrarMenu();

            if (opcion != 0) {
                // Incrementar el contador correspondiente
                System.out.println("Gracias. Hemos registrado tu respuesta.");
            }

        } while (opcion != 0);
        sc.close();
        System.out.println("=================================================================\n");

    }

    public static void mostrarMenu() {
        System.out.println("Introduce un número del 0 al 4 teniendo en cuenta su significado:");
        System.out.println("=================================================================\n");
        System.out.println("1. Ciberseguridad en contornos das tecnoloxías da información");
        System.out.println("2. Desenvolvemento de videoxogos e realidade virtual");
        System.out.println("3. Intelixencia artificial e big data");
        System.out.println("4. Ningún curso");
        System.out.println("0. Saír");
    }
}
