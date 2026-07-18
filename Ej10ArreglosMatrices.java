package ej.pkg2;

import java.util.Scanner;

/**
 * @author Gabriel Mayorga
 */
public class Ej10ArreglosMatrices {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int[][] matriz = new int[3][5];
        int ingreso;
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Ingrese valor para posicion [" + i + "][" + j + "]: ");
                ingreso = teclado.nextInt();
                matriz[i][j] = ingreso + (i * j);
            }
        }
        
        System.out.println("\n--- Matriz Resultante ---");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
