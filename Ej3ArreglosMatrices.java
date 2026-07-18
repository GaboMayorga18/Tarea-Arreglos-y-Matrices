package ej.pkg2;

import java.util.Scanner;

/**
 * @author Gabriel Mayorga
 */
public class Ej3ArreglosMatrices {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int[] numeros = new int[15];
        
        for (int i = 0; i < 15; i++) {
            System.out.print("Ingrese el numero entero " + (i + 1) + ": ");
            numeros[i] = teclado.nextInt();
        }
        
        int mayor = numeros[0];
        int menor = numeros[0];
        int posMayor = 0;
        int posMenor = 0;
        
        for (int i = 1; i < 15; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
                posMayor = i;
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
                posMenor = i;
            }
        }
        
        System.out.println("\n--- Resultados del Analisis ---");
        System.out.println("Numero mayor: " + mayor);
        System.out.println("Posicion donde se encuentra el mayor: " + posMayor);
        System.out.println("Numero menor: " + menor);
        System.out.println("Posicion donde se encuentra el menor: " + posMenor);
    }
}
