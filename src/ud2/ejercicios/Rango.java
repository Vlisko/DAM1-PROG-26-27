package ud2.ejercicios;

/** @author Matías Centeno Plá */
public class Rango {
    public static void main(String[] args) {
        rango(2, 10);
        System.out.println();
        rango(22, 2);
    }

    public static void rango(int a, int b) {

        if (a > b) {
            for (int i = --a; i > b; i--) {
                System.out.print(i + " | ");
            }
        }

        if (b > a) {

            for (int i = --b; i > a; i--) {
                System.out.print(i + " | ");
            }
        }
    }
}
