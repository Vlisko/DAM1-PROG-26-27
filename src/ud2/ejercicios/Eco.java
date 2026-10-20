package ud2.ejercicios;

import java.util.Scanner;

public class Eco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        int n = sc.nextInt();

        int i = 0;

        while (i < n) {
            System.out.println("Eco...");
            i++;
        }
        sc.close();
    }
}