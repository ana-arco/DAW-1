package unidad3_bucles;

import java.util.Scanner;

/*Implementa la aplicación ECO, que pide al usuario un número y muestra en pantalla la salida:
ECO
ECO
ECO
Se muestra ECO tantas veces como el número introducido por teclado. La salida anterior sería para el número 3 */


// solución dada
public class A04_For_ECO {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Escriba una número: ");
        int veces = sc.nextInt();
        for (int i = 1; i <= veces; i++) {
            System.out.println("Eco...");
        }
    }
}
