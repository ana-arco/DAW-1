package trimestre1.unidad3_bucles;

/* Realiza un programa que nos pida un número n y que nos diga cuantos números primos hay entre 1 y n. Un número primo es aquel que solo es divisible por 1 y por el mismo. Veamos un ejemplo para n=8.

1 - primo

2 - primo 

3 - primo

4 - no primo

5 - primo

6 - no primo

7 - primo

8 - no primo

5 Números primos en total */

public class A08_NumerosPrimos {
    
}



/* solución dada
import java.util.Scanner;

public class Main {

   public static void main(String[] args) {
      System.out.println("Escriba un número:");
      int hasta = new Scanner(System.in).nextInt();
      
      System.out.println("1 -> primo");
      for(int num=2; num<= hasta; num++) {
         boolean esPrimo = true;
         int i=2;
         while (i<num && esPrimo) {
            if (num%i == 0) {
               esPrimo = false;
            }
            i++;
         }
         System.out.print(num+ " -> ");
         if (esPrimo) {
            System.out.println("primo");
         } else {
            System.out.println("no primo");
         }
      }
   }
   
}
*/