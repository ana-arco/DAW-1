package unidad3_bucles;

/* Crea un programa en Java que le pida al usuario que ingrese una frase y luego cuente cuántas 
vocales (a, e, i, o, u) hay en esa frase, ignorando las mayúsculas. */

public class A52_ContarVocales {
    
}




/* solución dada

import java.util.Scanner;

public class ContadorDeVocales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce una frase: ");
        String frase = scanner.nextLine();
        
        int contadorVocales = 0;

        for (int i = 0; i < frase.length(); i++) {
            char letra = Character.toLowerCase(frase.charAt(i));

            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                contadorVocales++;
            }
        }

        System.out.println("El total de vocales en la frase es: " + contadorVocales);
        scanner.close();
    }
}

*/
