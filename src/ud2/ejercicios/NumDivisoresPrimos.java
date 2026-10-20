package ud2.ejercicios;

import java.util.Scanner;
/**
 * @author mmartbarr
 * NumDivisoresPrimos
 */

public class NumDivisoresPrimos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número-> ");
        int numero = sc.nextInt();
        sc.close();

        int contador = 0;

        for (int i = 2; i <= numero; i++) {
            if (numero % i == 0) {
                boolean primo = true;
                
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        primo = false;
                        
                    }
                    
                }
                        
                if (primo) {
                    contador++;
                    
                }
                    

            }
            
            
        } 
        System.err.println(contador);
    }
    
}