/*Ejercicio 4.- Crear una aplicación que solicite al usuario una fecha (día, mes y año) y muestre la fecha 
correspondiente al día siguiente. Febrero tiene 28 días.


// 1. Preguntar al usuario por el día, mes y año.

// 2. Averiguar cuántos días tiene el mes introducido.
   Si el mes es 4, 6, 9, o 11 -> tiene 30 días.
   Si el mes es 2 -> tiene 28 días.
   Para cualquier otro mes -> tiene 31 días.

// 3. Calcular la fecha del día siguiente.
   Si el día introducido NO es el último día del mes:
      día_siguiente = día + 1
      mes_siguiente = mes (no cambia)
      año_siguiente = año (no cambia)

   Si SÍ es el último día del mes:
      día_siguiente = 1
      mes_siguiente = mes + 1

      // Comprobar si este cambio de mes provoca un cambio de año.
      Si mes_siguiente es mayor que 12:
         mes_siguiente = 1
         año_siguiente = año + 1
      Si no,
         año_siguiente = año (no cambia)

// 4. Mostrar la fecha del día siguiente.*/

package unidad2_condicionales;

import java.util.Scanner;

/**
 * Ejercicio 4: Solicita una fecha (día, mes, año) y muestra la fecha correspondiente al día siguiente.
 * 
 * @author ANA ARCO IZQUIERDO
 */

public class A04_DiaSiguiente {
     /**
     * Método principal que ejecuta el programa.
     * Pide los datos por consola, calcula la fecha del día siguiente
     * y muestra el resultado.
     *
     * @param args Argumentos de la línea de comandos (no se utilizan).
     */
    public static void main(String[] args) {        
        
        // --- 1. PREPARACIÓN DE RECURSOS Y VARIABLES ---
        Scanner sc = new Scanner(System.in);
        int day, month, year;
        int diasDelMes; // Esta variable es clave para el contador.
        
        
        // --- 2. ENTRADA DE DATOS DEL USUARIO ---
        System.out.print("Introduce el día: ");
        day = sc.nextInt();
            
        System.out.print("Introduce el número del mes: ");
        month = sc.nextInt();
            
        System.out.print("Introduce el año: ");
        year = sc.nextInt();
        

        // --- 3. LÓGICA PARA DETERMINAR DÍAS DEL MES ---

        diasDelMes = switch (month) {
            case 2 -> 28;
            case 4, 6, 9, 11 -> 30;
            default -> 31;
        };

        // --- 4. COMPRUEBA LÓGICA DÍA SIGUIENTE ---

        int nextDay = day;
        int nextMonth = month;
        int nextYear = year;

        if (day == diasDelMes) {
            nextDay = 1;
            nextMonth = month + 1;

            if (nextMonth > 12 ) {
            nextMonth = 1;
            nextYear = year + 1;
            }

        } else {
            nextDay = day + 1; 
        }
        System.out.printf("\nEl día siguiente de %d/%d/%d es %d/%d/%d.", day, month, year, nextDay, nextMonth, nextYear);
    }
}
