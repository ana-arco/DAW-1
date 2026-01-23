/*Ejercicio 6.- Un economista te ha encargado un programa para realizar cálculos con el IVA. La aplicación 
debe solicitar la base imponible y el IVA que se debe aplicar. Muestra el importe correspondiente al IVA y 
al total. */

package U1_conceptos;

import java.util.Scanner;

public class A06_CalcularIVA {
    public static void main(String[] args) {
        //crea una "variable" de tipo <scanner> que se llama "sc". Cada vez que llamamos a sc llamamos a la función (System.in) que es para introducir parámetros por consola. 
        //"Esta definición es simplemente para empezar".
        Scanner sc = new Scanner(System.in);

        System.out.println("\nPrograma para calcular el IVA correspondiente a una base imponible.");

        //solicita base imponible y la guarda
        System.out.print("Introduce la base imponible: ");
        double baseImponible = sc.nextDouble();

        //solicita iva y lo guarda
        System.out.print("Introduce el IVA: ");
        double IVA = sc.nextDouble();

        //calcula el importe correspondiente al IVA
        double importeIVA = baseImponible * IVA / 100;

        //comprueba IVA
        //System.out.printf("El importe del iva es: %.2f euros", importeIVA);

        //muestro el total
        System.out.printf("El importe del iva es %.2f euros, por tanto el importe total es: %.2f euros.", importeIVA, (baseImponible - importeIVA));

    }
}
