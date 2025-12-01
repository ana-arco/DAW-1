/*Ejercicio 1.- Implementar un programa que pida por teclado un número decimal e indique si es un número 
casi-cero, que son aquellos, positivos o negativos, que se acercan a 0 por menos de 1 unidad, aunque 
curiosamente el O no se considera un número casi-cero. Ejemplos de números casi-cero son el 0,3, el -0,99 
o el 0,123; algunos números que no se consideran casi-ceros son: el 12,3, el 0 o el -1. */

package unidad2_condicionales;

import java.util.Scanner;

public class A01_CasiCero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número decimal (con coma, no punto): ");
        double numero = sc.nextDouble();

        boolean casicero = numero > -1 && numero < 1 && numero != 0;
        System.out.printf("¿El número " + numero + " es casi cero? " + casicero);
    }
}
