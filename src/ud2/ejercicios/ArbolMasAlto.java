package ud2.ejercicios;

import java.util.Scanner;

/** @author Diego Méndez Villar **/

public class ArbolMasAlto {

    public static void main(String[] args) {

        int mayorAltura = -2;
        String arbolMayor = "";

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la etiqueta del árbol: ");
        String etiqueta = sc.nextLine();

        System.out.print("Introduce la altura del árbol en cm: (-1 para salir) ");
        int altura = Integer.parseInt(sc.nextLine());

        while (!etiqueta.isEmpty() && altura != -1) {

            if (altura > mayorAltura) {
                mayorAltura = altura;
                arbolMayor = etiqueta;
            }

            System.out.print("Introduce la etiqueta del árbol: ");
            etiqueta = sc.nextLine();

            System.out.print("Introduce la altura del árbol en cm: (-1 para salir) ");
            altura = Integer.parseInt(sc.nextLine());
        }

        sc.close();
        
        if (arbolMayor == "" || mayorAltura == -1) {
            System.out.println("No has introducido ningun dato");

        } else {
            System.out.println("El árbol más alto es el de etiqueta " + arbolMayor);
            System.out.println("Su altura es de " + mayorAltura + " cm");
        }
    }
}