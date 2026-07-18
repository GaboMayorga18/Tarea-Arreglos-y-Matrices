package ej.pkg2;

import java.util.Scanner;

/**
 * @author Gabriel Mayorga
 */
public class Ej4ArreglosMatrices {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int[] numeros = new int[20];
        int cantPares = 0;
        int cantImpares = 0;
        int sumaPares = 0;
        int sumaImpares = 0;
        
        for (int i = 0; i < 20; i++) {
            System.out.print("Ingrese el numero entero " + (i + 1) + ": ");
            numeros[i] = teclado.nextInt();
            
            if (numeros[i] % 2 == 0) {
                cantPares++;
                sumaPares += numeros[i];
            } else {
                cantImpares++;
                sumaImpares += numeros[i];
            }
        }
        
        System.out.println("\n--- Resultados ---");
        System.out.println("Cantidad de numeros pares: " + cantPares);
        System.out.println("Cantidad de numeros impares: " + cantImpares);
        System.out.println("Suma de los pares: " + sumaPares);
        System.out.println("Suma de los impares: " + sumaImpares);
    }
}