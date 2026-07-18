package ej.pkg2;

import java.util.Scanner;

/**
 * @author Gabriel Mayorga
 */
public class Ej2ArreglosMatrices {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        double[] numeros = new double[10];
        double suma = 0;
        double promedio;
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el numero real " + (i + 1) + ": ");
            numeros[i] = teclado.nextDouble();
            
            suma = suma + numeros[i];
        }
        
        promedio = suma / 10;
        
        System.out.println("\n--- Resultados ---");
        System.out.println("Suma total: " + suma);
        System.out.println("Promedio: " + promedio);
    }
}