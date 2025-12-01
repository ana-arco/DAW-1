/*Ejercicio 1.- Crear un programa en Java que permita almacenar las notas de un grupo de alumnos, 
calcular la media, y encontrar la nota más alta y la más baja. Poner una clase de los alumnos que queramos.*/

/*1. Preguntar al usuario "¿Cuántos alumnos hay en clase? y guardar ese número. 
2. Crear un array con esa longitud para guardar todas esas notas.
3. Preguntar por las notas de los alumnos condicionando que sean números enteros entre 0 y 1
4.
*/ 

package unidad5_arrays;

import java.util.Scanner;
//import javax.print.attribute.standard.NumberOfDocuments;

public class A01_GrupoAlumnos {
    public static void main(String[] args) {
        // clase para introducir datos por teclado. // Se crea el array.
        Scanner sc = new Scanner(System.in);
        int nota[] = {2, 5, 7, 8, 9};

        int mayor;
        int menor;
        int sumaTotal;
        double media;

        System.out.print("¿Cuántos alumnos hay? ");
        

        // Pedir valores por teclado hasta llegar a la posición N
        /*do {
            System.out.println("Introduce una nota: ");
            nota[n] = sc.nextInt();
        } while (i <= 5);*/

        for (int i = 0; i < nota.length; i++ ) {
            System.out.print("Introduce una nota: ");
            nota [i]= sc.nextInt();
            //while ()
        }
        
        System.out.print("Notas introducidas: " + nota[0] + nota[1] + nota[2] +nota[3] + nota[5] / 5);
        
        

    }
}
