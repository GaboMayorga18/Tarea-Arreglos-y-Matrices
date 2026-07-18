package ej.pkg2;

import java.util.Scanner;

/**
 * @author Gabriel Mayorga
 */
public class Ej8ArreglosMatrices {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int[][] matriz = new int[4][4];
        int sumaDiagonal = 0;
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Ingrese valor para posicion [" + i + "][" + j + "]: ");
                matriz[i][j] = teclado.nextInt();
            }
        }
        
        System.out.println("\n--- Elementos de la Diagonal Principal ---");
        for (int i = 0; i < 4; i++) {
            System.out.print(matriz[i][i] + " ");
            sumaDiagonal += matriz[i][i];
        }
        
        System.out.println("\n\nSuma de la diagonal principal: " + sumaDiagonal);
    }
}
