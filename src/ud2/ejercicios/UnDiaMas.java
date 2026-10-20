package ud2.ejercicios;

import java.util.Scanner;

import ud2.Util;

/** @author Yubay */

public class UnDiaMas {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el día: ");
        int dia = sc.nextInt();

        System.out.print("Introduce el mes: ");
        int mes = sc.nextInt();

        System.out.print("Introduce el año: ");
        int anio = sc.nextInt();
        sc.close();

        if (!Util.esFechaCorrecta(dia, mes, anio)) {
            System.out.println("La fecha no es correcta");
            return;
        }

        int diasMes = Util.getDiasMes(mes, anio);

        // Incrementar Fecha
        dia++;

        if (dia > diasMes) {
            dia = 1;
            mes++;
            if (mes > 12) {
                mes = 1;
                anio++;
            }
        }

        System.out.println("El día siguiente es: "
                + dia + "/" + mes + "/" + anio);
    }
}