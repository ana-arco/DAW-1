/* DNI - Crear un programa que solicite al usuario un número de DNI y muestre la letra correspondiente. */
package unidad2_condicionales;
import java.util.Scanner;

/*la siguiente tabla:
0 - T, 1 - R, 2 - W, 3 - A, 4 - G, 5 - M, 6 - Y, 7 - F, 8 - P, 9 - D, 10 - X, 11 - B, 12 - N, 
13 - J, 14 - Z, 15 - S, 16 - Q, 17 - V, 18 - H, 19 - L, 20 - C, 21 - K, 22 - E.*/
   
public class A08_DNI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numDNI;

        System.out.print("Introduce el número del dni (sin letra): ");
        numDNI = sc.nextInt();

        // 1. VALIDACIÓN
        // Si el número es negativo, el módulo falla o da cosas raras.
        if (numDNI < 1000000 || numDNI > 99999999) {
            System.out.println("ERROR: Número incorrecto.");
            System.out.println("Saliendo del sistema...");
            sc.close();
            return;
        }

        // Para elegir la letra, necesitamos saber el resto de la cuenta que se hace con el número del DNI introducido:

        int resto = numDNI % 23;

        // Se usa el switch para asignar el valor a 'letra'
        char letra = switch (resto) {
            case 0 -> 'T';
            case 1 -> 'R';
            case 2 -> 'W';
            case 3 -> 'A';
            case 4 -> 'G';
            case 5 -> 'M';
            case 6 -> 'Y';
            case 7 -> 'F';
            case 8 -> 'P';
            case 9 -> 'D';
            case 10 -> 'X';
            case 11 -> 'B';
            case 12 -> 'N';
            case 13 -> 'J';
            case 14 -> 'Z';
            case 15 -> 'S';
            case 16 -> 'Q';
            case 17 -> 'V';
            case 18 -> 'H';
            case 19 -> 'L';
            case 20 -> 'C';
            case 21 -> 'K';
            case 22 -> 'E';
            default -> '?';
        };

        System.out.println("La letra correspondiente es " + letra);
        System.out.println("DNI completo: " + numDNI + letra);
    }
}
