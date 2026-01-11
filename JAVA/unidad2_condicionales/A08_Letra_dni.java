package unidad2_condicionales;

import java.util.Scanner;

/* El DNI consta de un entero de 8 dígitos seguido de una letra que se obtiene a partir del número de la siguiente forma: 

    letra = numero DNI módulo 23 (cuenta también el 0) (Ciclos de Identidad)
Basándote en es información, elige la letra a partir de la numeración de la siguiente tabla:
0 - T, 1 - R, 2 - W, 3 - A, 4 - G, 5 - M, 6 - Y, 7 - F, 8 - P, 9 - D, 10 - X, 11 - B, 12 - N, 
13 - J, 14 - Z, 15 - S, 16 - Q, 17 - V, 18 - H, 19 - L, 20 - C, 21 - K, 22 - E.

y diseña una aplicación en la que dado un número de DNI, calcule la letra que le corresponde. 
Observa que un número de 8 dígitos está dentro del rango del tipo int.

    */
public class A08_Letra_dni {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroDNI;

        String tablaLetras = "TRWAGMYFPDXBNJZSQVHLCKE";

        System.out.println("=== CÁLCULO LETRA DNI ===");
        System.out.print("Introduce tu número de DNI (sin letra): ");
        numeroDNI = sc.nextInt();

        // 1. VALIDACIÓN
        // Si el número es negativo, el módulo falla o da cosas raras.
        if (numeroDNI < 0 || numeroDNI > 99999999) {
            System.out.println("ERROR: Número incorrecto.");
            System.out.println("Saliendo del sistema...");
            sc.close();
            return;
        }

        // 2. EL CÁLCULO (Corrección de la errata del enunciado)
        // Usamos % 23 para obtener restos del 0 al 22.
        int resto = numeroDNI % 23;

        // 3. OBTENCIÓN DE LA LETRA
        char letra = tablaLetras.charAt(resto);

        System.out.println("\n-----------------------------");
        System.out.println("Resto de la división: " + resto);
        System.out.println("Letra correspondiente: " + letra);
        System.out.println("DNI COMPLETO: " + numeroDNI + "-" + letra);
        System.out.println("-----------------------------");

        sc.close();


    }
}
