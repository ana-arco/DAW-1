/*Ejercicio 2.- Pedir dos números y mostrarlos ordenados de forma decreciente (Operador ternario). */

package trimestre1.unidad2_condicionales;

import java.util.Scanner;

public class A02_OperadorTernario {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        int numeroA = sc.nextInt();

        System.out.print("Introduce otro número: ");
        int numeroB = sc.nextInt();

        // se crea la variable 'mayor' para guardar el número mayor.
        // se crea la variable 'menor' para guardar el número menor.
            // cada variable se iguala con una condición ->
            // si numeroA es mayor a numeroB
            // ? opción 1 -> se iguala la variable al numeroA
            // : opción 2 -> se iguala la variable al numeroB
        int mayor = numeroA > numeroB ? numeroA : numeroB;
        int menor = numeroA < numeroB ? numeroA : numeroB;

        // ¿si quisieramos introducir un número más?

        System.out.printf("El número mayor es %d, el número menor es %d.", mayor, menor );
        sc.close();
    }
}
