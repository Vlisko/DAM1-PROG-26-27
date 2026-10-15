package ud2.ejemplos;

public class EjemploAmbito {
    public static int numero = 45; // Variable de clase
    public static int i = 764645;

    public static void main(String[] args) {
        System.out.println(numero);
        System.out.println(i);

        int i = 0;    // variables locales o de método
        int j = 1;

        if (j == 1) {
            int z = 1; // Variable de bloque
            System.out.println(i);
            System.out.println(numero);

        }

        metodo1();
        System.out.println(i);
        // System.out.println(z); z no es accesible aquí
        System.out.println(j);

        metodo2(i);

        System.out.println(i);

        System.out.println(metodo3(i));

        metodo4(i);
        metodo4(++i);
        

    }

    public static void metodo1() {
        System.out.println(numero);
        int i = 3;
        System.out.println(i);
    }

    public static void metodo2(int i) {
        i++;
        System.out.println(i);
    }

    public static int metodo3(int i) {
        i++;
        return i;
    }    

    public static void metodo4(int i) {
        if (i == 0)
            return;

        i++;
        System.out.println(i);
    }

}
