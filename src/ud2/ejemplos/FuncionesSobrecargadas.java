package ud2.ejemplos;

public class FuncionesSobrecargadas {

    public static int suma(int a, int b) {
        return a + b;
    }

    public static double suma(int a, double pesoA, int b, double pesoB) {
        return a * pesoA + b * pesoB;
    }

    public static int multiplicar(int a, int b) {
        return a * b;
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }

    public static int multiplicar(int a, int b, int c) {
        return a * b * c;
    }

    public static void main(String[] args) {
        System.out.println(suma(2, 3)); // 5
        System.out.println(suma(2, 0.25, 3, 0.75)); // 3.25

        System.out.println(multiplicar(5, 5.0));
        System.out.println(multiplicar(5, 5));
        System.out.println(multiplicar(5, 5, 5));
    }
}
