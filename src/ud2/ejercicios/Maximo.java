package ud2.ejercicios;

/** @author Diego Méndez Villar **/

public class Maximo {

    public static int maximo(int a, int b) {
        return a > b ? a : b;

    }

    public static int maximo(int a, int b, int c) {
        int maximo = maximo(a, b);
        return maximo(maximo, c);
    }

    public static int maximo(int a, int b, int c, int d) {
        int maximo = maximo(a, b);
        maximo = maximo(maximo, c);
        return maximo(maximo, d);

    }

    public static void main(String[] args) {
        System.out.println(maximo(4, 9));
        System.out.println(maximo(4, 9, 6));
        System.out.println(maximo(4, 9, 25, 16 ));

    }

}
