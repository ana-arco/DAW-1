package unidad3_bucles;

import java.util.Scanner;

/* Ejercicio - Pide al usuario dos variables numericas positivas o negativos, con decimales o sin decimales.
Si es cero, no es posible, sigue ejecutando.
Con esas dos variables se va a sumar, restar y multiplicar.
Imprimir.
*/

public class A01_BubleSuperFacil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double numA = 0;
        double numB = 0;

        System.out.println(" ===  JUEGO DE NÚMEROS === ");
        System.out.println("Instrucciones: no se puede calcular con el cero.");
        System.out.println("=================================================");
        System.out.println(" ");

        do { 
            
            do { 
                System.out.print("Introduce un número positivo o negativo, decimal o entero: ");
                numA = sc.nextDouble();

                if (numA == 0) {
                    System.out.println("Error: el número cero no es válido.");
                }
                
                System.out.print("Introduce otro número: ");
                numB = sc.nextDouble();
                
                if (numB == 0 ) {
                    System.out.println("Error: el número cero no es válido.");
                    
                }
            } while (numA == 0 || numB == 0);
            
            Menu();
            int option = sc.nextInt();

            switch (option) {
            case 1 : 
                System.out.printf("Sumamos %.3f + %.3f = %.3f", numA, numB, (numA + numB));
                break;
            
            case 2 : 
                System.out.printf("Restamos %.3f - %.3f = %.3f", numA, numB, (numA - numB));
                break;
            
            case 3 : 
                System.out.printf("Multiplicamos %.3f x %.3f = %.3f", numA, numB, (numA * numB));
                break;
            
            case 4 : 
                System.out.println("Saliendo del sistema...");
                return;
            
            default : 
                System.out.println("Error: opción no válida.");
                System.out.println("Elige una opción posible:");
                break;
            }

            System.out.println(" ");
            System.out.println("\n---> Reiniciando para nuevos números...\n");
        } while (true);
        
    }
        // funcioón menu
        public static void Menu() {
        System.out.println(" ------------------------------ ");
        System.out.println("MENÚ DE OPERACIONES");
        System.out.println(" ------------------------------");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Salir del sistema");
        System.out.print("Elige una opción: ");
    
    }
}
