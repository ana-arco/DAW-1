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
        System.out.println(" - APLICACIÓN PARA CALCULAR EL DÍA EXACTO DE LA SIGUIENTE LUNA LLENA - ");
        System.out.println(" ");
        System.out.print("Introduce el día: ");
        day = sc.nextInt();
            if (day > 0 && day < 32) {
                System.out.println("¡Día guardado con éxito.!");
            } else {
                System.out.println("ERROR: Fecha no válida. El día debe ser entre 1 y 31.");
                return;
            }
           
        System.out.print("Introduce el número del mes: ");
        month = sc.nextInt();
            if (month > 0 && month < 12) {
                System.out.println("¡Mes guardado con éxito!");
            } else {
                System.out.println("ERROR: Fecha no válida. El año sólo tiene 12 meses.");
                return;
            }
            
        System.out.print("Introduce el año: ");
        year = sc.nextInt();
        // podría poner una función para validar y no repetir este bucle
        // también podría omitir las 3 validaciones y sustituirla por una sola, aunque me gusta ir línea a línea.

        if (year > 0 && year < 5000) {
                System.out.println("Año guardado con éxito!");
            } else {
                System.out.println("ERROR: Fecha no válida. El año está fuera del registro histórico.");
                return;
            }
        

        // --- 3. LÓGICA PARA DETERMINAR DÍAS DEL MES ---

        diasDelMes = switch (month) {
            case 2 -> 28;
            case 4, 6, 9, 11 -> 30;
            default -> 31;
        };

        // VALIDACIÓN EXTRA: ¿y si puso días que no pertenecen al mes?
        if (day > diasDelMes) {
            System.out.printf("\nERROR: El mes %d sólo tiene %d días.", month, diasDelMes);
            return;
        }

        // --- 4. COMPRUEBA LÓGICA DÍA SIGUIENTE ---

        // creación de variables necesarias para ejecutar la lógica
        int nextDay = day;
        int nextMonth = month;
        int nextYear = year;

        // PRIMERA CONDICIÓN -> si día es igual a día del mes entra en este bloque de código, si no cumple la condición sigue a la siguiente condición.
        if (day == diasDelMes) {
            // iguala el día siguiente a 1
            nextDay = 1;
            // le suma 1 a la variable siguiente mes (nextMonth)
            nextMonth = month + 1;

            // SEGUNDA CONDICÓN -> si el siguiente mes es mayor al número 12 entra en este bloque if
            if (nextMonth > 12 ) {

                // iguala el mes siguiente a 1
                nextMonth = 1;
                // le suma 1 a la variable año siguiente
                nextYear = year + 1;
            }

        // si no cumple ninguna condición    
        } else {
            // suma 1 a la variable día siguiente.     
            nextDay = day + 1; 
            }
        System.out.printf("\nEl día anterior fue el %d/%d/%d, la fecha siguiente es el %d/%d/%d.\n", day, month, year, nextDay, nextMonth, nextYear);
        System.out.println(" ");
        
        
    }
}
