package trimestre1.unidad1conceptos;



/*Ejercicio 1.- Diseñar un programa que pida al usuario su nombre, apellidos y edad y lo muestre por consola.*/

// package unidad1_conceptos;

import java.util.Scanner;

public class A01_PedirMostrar {
    public static void main(String[] args) {
        //crea una clase scanner para poder llamarla cada vez que queramos guardar algo introducido por consola.
        Scanner sc = new Scanner(System.in);
        
        //solicita nombre y guarda el nombre en la variable tipo string llamada nombre y comprueba imprimiendo por consola la variable creada.
        System.out.print("Hola, ¿cómo te llamas? ");
        String nombre = sc.nextLine();
        System.out.printf("¡Hola %s!\n", nombre);
        
        //solicita apellidos y guarda en la variable de tipo string llamada apellidos lo que se escribe por teclado y comprueba las 2 variables guardadas hasta aquí.
        System.out.print ("Introduce tus apellidos: ");
        String apellidos = sc.nextLine();        
        System.out.printf("Tu nombre y apellidos son: %s %s.\n", nombre, apellidos);
        
        //solicita edad, guarda un número entero en la variable tipo int llamada "edad" y comprueba mostrando por consola. 
        System.out.print("Ahora introduce tu edad: ");
        int edad = sc.nextInt();
        System.out.printf("Tu edad es %d", edad);

        //muestra todos los datos recogidos.
        System.out.printf("\n¡Bienvenidx %s %s! ¡Estás en tus %d, una edad perfecta!", nombre, apellidos, edad);
    }
}
