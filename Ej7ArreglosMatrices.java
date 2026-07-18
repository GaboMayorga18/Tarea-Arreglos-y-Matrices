package ej.pkg2;

import java.util.Scanner;

/**
 * @author Gabriel Mayorga
 */
public class Ej7ArreglosMatrices {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int[][] matriz = new int[4][4];
        int sumaTotal = 0;
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Ingrese valor para posicion [" + i + "][" + j + "]: ");
                matriz[i][j] = teclado.nextInt();
                sumaTotal += matriz[i][j];
            }
        }
        
        System.out.println("\n--- Resultados ---");
        System.out.println("Suma total de todos los elementos: " + sumaTotal);
    }
}
