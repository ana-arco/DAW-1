package U2_condicionales;

import java.util.Scanner;

/*Ejercicio 5.- Idear un programa que solicite al usuario un número comprendido 
entre 1 y 7, correspondiente a un día de la semana. Se debe mostrar el nombre 
del día de la semana al que corresponde. Por ejemplo, el número 1 corresponde 
a «lunes» y el 6 a «sábado». */

/*
 * Programa que solicite al usuario un número comprendido 
 * entre 1 y 7, correspondiente a un día de la semana. Se debe mostrar el nombre 
 * del día de la semana al que corresponde.
 * @autor ANA ARCO
 */

public class A05_DiaSemana {
/**
 * Método main - método principal que se encarga de la ejecución del programa.
 * Pide un número por consola, lo procesa y muestra el día de la semana o
 * un mensaje de error si el número no es válido.
 *
 * @param args Argumentos de la línea de comandos (no se utilizan).
 */
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        // --- 1. INICIALIZACIÓN DE HERRAMIENTAS ---
        // Se crea un objeto Scanner para leer la entrada del teclado del usuario.
        Scanner sc = new Scanner(System.in);

        // --- 2. ENTRADA DE DATOS ---
        // Se solicita al usuario que introduzca el número y se muestra un mensaje claro, Se lee el valor entero introducido y se guarda en la variable 'dia'.
        
        System.out.print("Introduce un número del 1 al 7: ");
        int dia = sc.nextInt();
        String nombreDia;

        // --- 3. LÓGICA DE PROCESAMIENTO Y SALIDA ---
        // Se utiliza una estructura 'switch' para evaluar el valor de la variable 'dia'.

            nombreDia = switch (dia) {
                case 1 -> "El Lunes es el día 1.";
                case 2 -> "El Martes es el día 2.";
                case 3 -> "El Miércoles es el día 3.";
                case 4 -> "El Jueves es el día 4";
                case 5 -> "El Viernes es el día 5.";
                case 6 -> "El Sábado es el día 6.";
                case 7 -> "El Domingo es el día de descanso.";
                default -> "Error: El número introducido no es válido.";
            };

            // Para una mayor independencia y favorecer la reutilización de código, imprimimos por pantalla fuera del switch.
            System.out.println(nombreDia);

            // --- 4. CIERRE DE RECURSOS ---
            sc.close();
    }
}
