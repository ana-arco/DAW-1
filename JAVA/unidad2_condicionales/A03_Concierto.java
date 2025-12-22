/*Ejercicio 3.- Escribir un programa que calcule el dinero recaudado en un concierto. La aplicación solicitará 
el aforo máximo del local, el precio por entrada (suponemos que todas las entradas tienen el mismo precio) 
y el número de entradas vendidas. Hay que tener en cuenta que, 
    Condición 1 -> Si el número de entradas vendidas no supera el 20% del aforo del local, se cancela el concierto. 
    Condición 2 -> Si el número de entradas vendidas no supera el 50% del aforo del local, se realiza una rebaja del 25% del precio de la entrada. */

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

        System.out.println("");
        System.out.println("-------------------------------------------------------------------------------------------------------------------");

        System.out.println("Confirmación de los datos:");
        System.out.printf("\nEl aforo del local es de %d butacas. \nEl precio de la entrada es de %.2f euros. \nSe han vendido %d entradas. \n", aforo, precio, entradas);
        System.out.println("");
        
        // --- 3. LÓGICA DEL PROGRAMA ---
        // Se condicionan los 3 escenarios, *del más restrictivo al más general*.

        // Escenario 1 : Se cancela el concierto si la venta de entradas no supera el 20%.
        // Condición -> si entradas es menor que el aforo multiplicado por 0.20 (así se calcula el 20% con un sólo cálculo)
        
        if (entradas < aforo * 0.20) {
            // se imprime o se muestra el mensaje de cancelación del concierto.
            System.out.println("INFO: Lo sentimos. El concierto está cancelado.");
            // si cumple la condición la variable recaudación se iguala a 0.
            recaudacion = 0;

            // Escenario 2: Si la venta de entradas es mayor al 20% y menor del 50% se aplica el 25% descuento a cada entrada.
            // Condición -> si entradas es menor que el aforo multiplicado por 0.50 (así se calcula el 50% con un sólo cálculo)
        
            } else if (entradas < aforo * 0.50) {
                    // se calcula el descuento en una variable a parte = precio multiplicado por 0.25 
                    descuento = precio * 0.25;
                    // se calcula el precio con descuento en otra variable = precimo menos descuento calculado en la variable anterior.
                    double precioconDescuento = precio - descuento;
                    // se calcula la recaudación en la variable = multiplicando el precio con descuento por el número de entradas.
                    recaudacion = precioconDescuento * entradas;

                    // se imprime esta información por consola.
                    System.out.printf("\nINFO: Cada entrada tiene un descuento de %.2f euros.", descuento);

                // Escenario 3: El resto de los casos. El caso normal.
                } else {
                    
                    recaudacion = precio * entradas;
                    System.out.println("INFO: Venta normal sin descuentos.");
                }

                // --- 4. SALIDA DEL RESULTADO FINAL ---
                // Se muestra la recaudación calculada, formateada con dos decimales.
                System.out.printf("\nRECAUDACIÓN: La recaudación es de %.2f euros.\n", recaudacion);
                System.out.println("");
            }
}