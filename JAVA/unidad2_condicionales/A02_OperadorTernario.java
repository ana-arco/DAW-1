/*Ejercicio 2.- Pedir dos números y mostrarlos ordenados de forma decreciente (Operador ternario). */

package unidad2_condicionales;

import java.util.Scanner;

public class A02_OperadorTernario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        int numeroA = sc.nextInt();

        System.out.print("Introduce otro número: ");
        int numeroB = sc.nextInt();

        int mayor = numeroA > numeroB ? numeroA : numeroB;
        int menor = numeroA < numeroB ? numeroA : numeroB;

        System.out.printf("El número mayor es %d, el número menor es %d.", mayor, menor );

    }
}
