package ud2;
/**
 * @author Darianys Rosales
 */

import java.util.Random;
import java.util.Scanner;

public class NumeroSecreto {
    public static void main(String[] args) {
        Random rnd = new Random();
        int numSecreto = rnd.nextInt(1, 100 + 1);

        Scanner sc = new Scanner(System.in);
        System.out.println("Introducir el número que crea que es el secreto \n(-1 para rendirse o déspues de acertar):");
        int num = sc.nextInt();

        while (num != -1) {
            if (num < numSecreto) {
                System.out.println("El número secreto es mayor...");
            }else if (num > numSecreto) {
                System.out.println("El número secreto es menor...");
            }else{
                System.out.println("Es el número secreto");
            }    
            num = sc.nextInt();
        }
        sc.close();
    }
}
