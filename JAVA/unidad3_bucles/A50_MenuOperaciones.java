package unidad3_bucles;

/* Realiza un menú con las siguientes opciones:
----------------------------------------------------
1. Calcula la suma de dos números
2. Muestra la tabla de multiplicar de un número
3. Calcula el área de un triángulo
4. Calcula del descuento X sobre un Precio Y
0. Salir
-------------------------------------------------------
El menú debe repetirse hasta que el usuario decida salir.
 */

public class A50_MenuOperaciones {
    
}



/* solución dada

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("----------------------------------------------------");
            System.out.println("1. Calcula la suma de dos números");
            System.out.println("2. Muestra la tabla de multiplicar de un número");
            System.out.println("3. Calcula el área de un triángulo");
            System.out.println("4. Calcula del descuento X sobre un Precio Y");
            System.out.println("0. Salir");
            System.out.println("-------------------------------------------------------");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingresa el primer número: ");
                    int num1 = scanner.nextInt();
                    System.out.print("Ingresa el segundo número: ");
                    int num2 = scanner.nextInt();
                    System.out.println("La suma es: " + (num1 + num2));
                    break;

                case 2:
                    System.out.print("Ingresa un número para mostrar su tabla de multiplicar: ");
                    int numTabla = scanner.nextInt();
                    System.out.println("Tabla de multiplicar de " + numTabla + ":");
                    for (int i = 1; i <= 10; i++) {
                        System.out.println(numTabla + " x " + i + " = " + (numTabla * i));
                    }
                    break;

                case 3:
                    System.out.print("Ingresa la base del triángulo: ");
                    double base = scanner.nextDouble();
                    System.out.print("Ingresa la altura del triángulo: ");
                    double altura = scanner.nextDouble();
                    double area = (base * altura) / 2;
                    System.out.println("El área del triángulo es: " + area);
                    break;

                case 4:
                    System.out.print("Ingresa el precio original: ");
                    double precio = scanner.nextDouble();
                    System.out.print("Ingresa el porcentaje de descuento: ");
                    double descuento = scanner.nextDouble();
                    double precioFinal = precio - (precio * (descuento / 100));
                    System.out.println("El precio después del descuento es: " + precioFinal);
                    break;

                case 0:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida. Por favor, intenta de nuevo.");
                    break;
            }

            System.out.println(); // Espacio adicional entre opciones

        } while (opcion != 0);

        scanner.close();
    }
}


*/