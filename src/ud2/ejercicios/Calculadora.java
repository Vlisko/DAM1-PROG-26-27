package ud2.ejercicios;

public class Calculadora {
    /**
     * 
     * @param operando1
     * @param operando2
     * @param operacion sumar(1), restar(2), multiplicar(3) o dividir(4)
     * @return Resultado de la operación
     */
    public static double calculadora(double operando1, double operando2, int operacion) {
        double resultado;

        switch (operacion) {
            case 1: resultado = operando1 + operando2; break;
            case 2: resultado = operando1 - operando2; break;
            case 3: resultado = operando1 * operando2; break;
            case 4: resultado = operando1 / operando2; break;
            default: resultado = 0;
        }
        
        return resultado;
    }

    public static void main(String[] args) {
        /*
        double prueba = 5 / 0.; // Devuelve Infinity de tipo double
        double prueba2 = 5 / 0; // Genera una ArithmeticException: / by zero
         */

        System.out.println(calculadora(2, 3, 1)); // 5
        System.out.println(calculadora(2, 3, 2)); // -1
        System.out.println(calculadora(2, 3, 3)); // 6
        System.out.println(calculadora(2, 3, 4)); // 0.6666
        System.out.println(calculadora(2, 0, 4)); // ???
        System.out.println(calculadora(2, 3, 5)); // 0
  
    }

}
