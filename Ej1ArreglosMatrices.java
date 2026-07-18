package ej.pkg2;

import java.util.Scanner;

/**
 * @author Gabriel Mayorga
 */
public class Ej1ArreglosMatrices {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int[] numeros = new int[10];
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el numero para la posicion " + i + ": ");
            numeros[i] = teclado.nextInt();
        }
        
        System.out.println("\n--- Valores Almacenados ---");
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Posicion " + i + ": " + numeros[i]);
        }
    }
}
