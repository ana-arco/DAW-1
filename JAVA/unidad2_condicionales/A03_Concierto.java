/*Ejercicio 3.- Escribir un programa que calcule el dinero recaudado en un concierto. La aplicación solicitará 
el aforo máximo del local, el precio por entrada (suponemos que todas las entradas tienen el mismo precio) 
y el número de entradas vendidas. Hay que tener en cuenta que, si el número de entradas vendidas no supera 
el 20% del aforo del local, se cancela el concierto. Si el número de entradas vendidas no supera el 50% del 
aforo del local, se realiza una rebaja del 25% del precio de la entrada. */

package unidad2_condicionales;

import java.util.Scanner;

/**
 * Programa que calcula la recaudación final de un concierto basándose en
 * el aforo del local, el precio de la entrada y el número de entradas vendidas.
 * Aplica descuentos o cancela el evento según reglas de negocio predefinidas.
 *
 * @author Ana Arco
 */

public class A03_Concierto {
    /**
     * Método principal que ejecuta el programa.
     * Pide los datos por consola, calcula la recaudación y muestra el resultado final.
     *
     * @param args Argumentos de la línea de comandos (no se utilizan en este programa).
     */
    public static void main(String[] args) {
        //Crea una clase de tipo Scanner llamada sc para poder usarla cada vez que queramos guardar valores introducidos por consola.
        Scanner sc = new Scanner(System.in);
        
        //--- 1. DECLARACIÓN DE VARIABLES ---
        int aforo, entradas;
        double precio, descuento, recaudacion;

        // --- 2. ENTRADA DE DATOS DEL USUARIO ---
        System.out.println("----------- Calculadora de Recaudación del Concierto ---------");
        System.out.println("");

        System.out.print("Introduce el aforo máximo del local: ");
        aforo = sc.nextInt();

        System.out.print("Introduce el precio de la entrada (demiales con ','): ");
        precio = sc.nextDouble();

        System.out.print("Introduce número de entradas vendidas: ");
        entradas = sc.nextInt();

        // Se cierra el Scanner aquí, ya que no se necesitarán más datos de entrada.
        sc.close();

        System.out.printf("\nEl aforo del local es de %d butacas, se han vendido %d entradas y el precio de la entrada es de %.2f euros.\n", aforo, entradas, precio);
        System.out.println("-----------------------------------------------------------------------");

        // --- 3. LÓGICA DEL PROGRAMA ---
        // Se condicionan los 3 escenarios, del más restrictivo al más general.
        if (entradas < aforo * 0.20) {
            // Escenario 1 : Se cancela el concierto si la venta de entradas no supera el 20%.
            recaudacion = 0;
            System.out.println("Lo sentimos. El concierto está cancelado.\n");
        } else if (entradas < aforo * 0.50) {
            // Escenario 2: Si la venta de entradas es mayor al 20% y menor del 50% se aplica el 25% descuento a cada entrada.
            descuento = precio * 0.25;
            double precioconDescuento = precio - descuento;
            recaudacion = precioconDescuento * entradas;
            System.out.printf("INFO: Cada entrada tiene un descuento de %.2f euros.\n", descuento);
        } else {
            // Escenario 3: El resto de los casos.
            recaudacion = precio * entradas;
            System.out.println("INFO: Venta normal sin descuentos.\n");
        }
        // --- 4. SALIDA DEL RESULTADO FINAL ---
        // Se muestra la recaudación calculada, formateada a dos decimales.
        System.out.printf("\nLa recaudación es de %.2f euros.\n", recaudacion);
    }
}