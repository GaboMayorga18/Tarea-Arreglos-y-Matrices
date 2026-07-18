package ej.pkg2;

import java.util.Scanner;

/**
 * @author Gabriel Mayorga
 */
public class Ej9ArreglosMatrices {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int[][] matriz = new int[5][5];
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Ingrese valor para posicion [" + i + "][" + j + "]: ");
                matriz[i][j] = teclado.nextInt();
            }
        }
        
        int mayor = matriz[0][0];
        int menor = matriz[0][0];
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (matriz[i][j] > mayor) {
                    mayor = matriz[i][j];
                }
                if (matriz[i][j] < menor) {
                    menor = matriz[i][j];
                }
            }
        }
        
        System.out.println("\n--- Resultados ---");
        System.out.println("Mayor valor: " + mayor);
        System.out.println("Menor valor: " + menor);
    }
}