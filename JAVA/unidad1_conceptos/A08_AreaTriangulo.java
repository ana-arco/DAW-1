/*Ejercicio 8.- Realiza un programa que nos pida la base y la altura de un triángulo y muestre por pantalla su área. */

import java.util.Scanner;

public class A08_AreaTriangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la base del triángulo: ");
        double base = sc.nextDouble();

        System.out.print("Introduce la altura del triángulo: ");
        double altura = sc.nextDouble();

        System.out.printf("Si la base es de %.0f centímetros y la altura es de %.0f centímetros, el área del triángulo es: %.2f centímetros cuadrados.\n", base, altura, (base*altura/2));
        System.out.printf("Si la base es de %.2f metros y la altura es de %.2f metros, el área del triángulo es: %.2f metros cuadrados.", base, altura, (base*altura/2));

    }
}
