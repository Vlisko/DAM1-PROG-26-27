package ud2.ejercicios;

import javax.swing.JOptionPane;

public class ComprobarHoraAiko {

    

    static void compruebaHora(int hora, int minutos, int segundos) {
        
        boolean esHoraCorrecta = !(hora < 0 || hora > 23 || minutos < 0 || minutos > 59 || segundos < 0 || segundos > 59);
        System.out.println(esHoraCorrecta);
    }

    static boolean esHoraCorrecta(int h, int m, int s) {
        return h >= 0 && h <= 23 && m >= 0 && m <= 59 && s >= 0 && s <= 59;
    }    


    public static void main(String[] args) {
        compruebaHora(0, 0, 0);
        compruebaHora(-1, 0, 0);
        compruebaHora(0, 60, 0);
        compruebaHora(0, 0, 60);

        System.out.println("esHoraCorrecta en consola: " + esHoraCorrecta(23, 59,59));
        JOptionPane.showMessageDialog(null, "esHoraCorrecta en GUI: " + esHoraCorrecta(23, 59,59));

    }
}