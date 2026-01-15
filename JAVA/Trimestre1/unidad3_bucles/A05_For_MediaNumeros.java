package unidad3_bucles;

import java.util.Scanner;

/*Pedir diez números enteros por teclado y mostrar la media. */

// solución dada
public class A05_For_MediaNumeros {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n; 
      int suma = 0; 
      double media; 

       for (int i = 1; i <= 10; i++) {
           System.out.println("Escriba un número: ");

           n = sc.nextInt();
           suma += n; 
       }
       media = suma / 10.0; 
      System.out.println("La media es: " + media); 
   }
}