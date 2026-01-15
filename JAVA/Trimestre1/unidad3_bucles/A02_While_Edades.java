package unidad3_bucles;

import java.util.Scanner;

/*Implementar una aplicación para calcular datos estadísticos de las edades de los alumnos de un centro educativo. 
Se introducirán datos hasta que uno de ellos sea negativo, y se mostrará: la suma de todas las edades introducidas, 
la media, el número de alumnos y cuántos son mayores de edad. */


// solución dada
public class A02_While_Edades {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int sumaEdades = 0; 
      int contadorAlumnos = 0, 
              contadorMayorEdad = 0; 
      double media; 

      System.out.print("Introduzca edad: ");
      int edad = sc.nextInt();

      while (edad >= 0) { 
         sumaEdades += edad; 
         contadorAlumnos++; 
         if (edad >= 18) { 
            contadorMayorEdad++; 
         }
         System.out.print("Introduzca edad: ");
         edad = sc.nextInt(); 
      }
      media = (double) sumaEdades / contadorAlumnos; 

      System.out.println("Suma de todas las edades: " + sumaEdades);
      System.out.println("Media: " + media);
      System.out.println("Número total de alumnos: " + contadorAlumnos);
      System.out.println("Mayores de edad: " + contadorMayorEdad);
   }
}