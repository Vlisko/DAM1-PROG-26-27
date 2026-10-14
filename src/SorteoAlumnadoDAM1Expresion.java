

import java.util.Random;

public class SorteoAlumnadoDAM1Expresion {
    public static void main(String[] args) {
        final int NUM_ALUMNOS = 31;

        Random rnd = new Random();
        int numeroElegido = rnd.nextInt(NUM_ALUMNOS) + 1;

        System.out.println("\nAlumn@ elegid@ (" + numeroElegido + ") -> ");

        String elegido = switch (numeroElegido) {
            case 1 -> "Juan A"; 
            case 2 -> "Matías C";
            case 3 -> "Pablo C";
            case 4 -> "David D"; 
            case 5 -> "Raúl E"; 
            case 6 -> "David E"; 
            case 7 -> "Marcos FC"; 
            case 8 -> "Pelayo F"; 
            case 9 -> "Marcos FS"; 
            case 10 -> "Brais G"; 
            case 11 -> "Fran L"; 
            case 12 -> "Marco L"; 
            case 13 -> "Maria M"; 
            case 14 -> "Tomas M"; 
            case 15 -> "Adán M"; 
            case 16 -> "Daniel M"; 
            case 17 -> "Diego M"; 
            case 18 -> "Lunna M"; 
            case 19 -> "Hendrix M"; 
            case 20 -> "Alexandre M"; 
            case 21 -> "Adrian N"; 
            case 22 -> "Adrian P"; 
            case 23 -> "Jorge P"; 
            case 24 -> "Martín R"; 
            case 25 -> "Juan S"; 
            case 26 -> "Martín S"; 
            case 27 -> "Aiko S"; 
            case 28 -> "Angel S"; 
            case 29 -> "Darianys V"; 
            case 30 -> "Yubay W"; 
            case 31 -> "Miguel L";            
        
            default -> "Número erróneo. No existe el alumno/a " + numeroElegido;            
        };

        System.out.println("Alumn@ elegid@: " + elegido);

        System.out.println("\n");
    }
}
