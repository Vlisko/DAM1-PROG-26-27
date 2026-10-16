package ud2.ejercicios;

/** @author Jpineport */

import java.util.Scanner;

public class EsVocal {
    public static void main(String[] args) {
        System.out.println('€');
        Scanner sc = new Scanner(System.in);
        System.out.print("Escribe una letra >>> ");
        char x = sc.next().charAt(0);
        sc.close();

        System.out.print("Es vocal : " + isVowel(x));
    }

    public static boolean isVowel(char x) {
        switch (x) {
            case 'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u', 'á':
                return true;
            default:
                return false;
        }
    }
}
