package trimestre1.unidad3_bucles;

/* Crea un programa en Java que genere un número aleatorio entre 1 y 100. 
Luego, pide al usuario que adivine el número. El programa debe indicar si la suposición es demasiado alta, 
demasiado baja o correcta. El juego continúa hasta que el usuario adivine el número. */

public class A51_AdivinarNumero {
    
}


/* solución dada

import java.util.Scanner;
import java.util.Random;

public class AdivinaElNumero {
    public static void main(String[] args) {
        Random random = new Random();
        int numeroSecreto = random.nextInt(100) + 1;
        int suposicion = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("¡Bienvenido al juego de adivinar el número!");
        System.out.println("He elegido un número entre 1 y 100. ¡Intenta adivinarlo!");

        while (suposicion != numeroSecreto) {
            System.out.print("Introduce tu suposición: ");
            suposicion = scanner.nextInt();

            if (suposicion < numeroSecreto) {
                System.out.println("Demasiado bajo. Intenta de nuevo.");
            } else if (suposicion > numeroSecreto) {
                System.out.println("Demasiado alto. Intenta de nuevo.");
            } else {
                System.out.println("¡Correcto! El número era " + numeroSecreto + ".");
            }
        }

        scanner.close();
    }
}

*/