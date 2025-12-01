package unidad2_condicionales;

import java.util.Scanner;

/*
 * Actividad de Aula 6 - Un segundo tarde. Escribir un programa que pida una hora de la siguiente 
 * forma: hora, minutos y segundos. El programa debe mostrar qué hora será un segundo más tarde. 
 * Por ejemplo: hora actual [10:41:59] -› hora actual +1 segundo: [10:42:00]
 * @author ANA ARCO
 */

public class A06_UnSegundoTarde {

    /**
     * Método principal que solicita al usuario una hora completa (hora, minutos, segundos).
     * Primero, valida que los datos introducidos correspondan a una hora real y lógica.
     * Si la validación es exitosa, calcula la hora que será un segundo más tarde, manejando
     * correctamente los desbordamientos de minutos, horas y el reinicio a medianoche.
     * Si la validación falla, informa al usuario con un mensaje de error.
     *
     * @param args Argumentos de la línea de comandos (no se utilizan en este programa).
     */
    
    public static void main(String[] args) {
        // --- 1. PREPARACIÓN ENTRADA DE DATOS ---
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce los segundos: ");
        int segundo_actual = sc.nextInt();

        System.out.print("Introduce los minutos: ");
        int minuto_actual = sc.nextInt();

        System.out.print("Introduce las horas: ");
        int hora_actual = sc.nextInt();

        // Antes de realizar cualquier cálculo, se comprueba que la hora completa sea válida.
        // Esto asegura que el programa sea robusto y no procese datos sin sentido,
        // y con el else informa al usuario inmediatamente si la entrada es incorrecta.

        // --- 2. VALIDACIONES ---
        if ((segundo_actual < 60 && segundo_actual >= 0) &&
        (minuto_actual < 60 && minuto_actual >= 0) &&
        (hora_actual < 24 && hora_actual >= 0 )) {

            // --- 3. LÓGICA DEL CÁLCULO
            // Creación de las nuevas variables asignando los valores que recoge el paso anterior.
            int segundo_siguiente = segundo_actual + 1;
            int minuto_siguiente = minuto_actual;
            int hora_siguiente = hora_actual;

            // --- 4. COMPROBACIÓN DE DESBORDAMIENTOS ---
            // Se comprueba la variable siguiente, no la actual.
            if (segundo_siguiente == 60) {
                segundo_siguiente = 0;
                minuto_siguiente = minuto_actual + 1;

                if (minuto_siguiente == 60) {
                    minuto_siguiente = 0;
                    hora_siguiente = hora_actual + 1;

                    if (hora_siguiente == 24) {
                        hora_siguiente = 0;
                    }
                }
            
            }
            // --- 5. SALIDA RESULTADOS
            System.out.printf("La hora actual es -> %02d:%02d:%02d, la hora siguiente es -> %02d:%02d:%02d.", 
            hora_actual, minuto_actual, segundo_actual, hora_siguiente, minuto_siguiente, segundo_siguiente);

        } else {
            // --- 5. SALIDA RESULTADOS
            System.out.printf("La hora introducida no es válida, inténtalo de nuevo.");
        }
        
        
    }

}
