package ej.pkg2;

import java.util.Scanner;

/**
 * @author Gabriel Mayorga
 */
public class Ej5ArreglosMatrices {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int[] numeros = new int[12];
        int ingreso;
        
        for (int i = 0; i < 12; i++) {
            do {
                System.out.print("Ingrese el numero positivo " + (i + 1) + ": ");
                ingreso = teclado.nextInt();
            } while (ingreso <= 0);
            
            numeros[i] = ingreso + i;
        }
        
        System.out.println("\n--- Arreglo Modificado ---");
        for (int i = 0; i < 12; i++) {
            System.out.println("Posicion " + i + ": " + numeros[i]);
        }
    }
}