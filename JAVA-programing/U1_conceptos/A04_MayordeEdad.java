package U1_conceptos;

/* Realizar una aplicación que solicite al usuario su edad y le indique si es mayor de 
edad (mediante un literal booleano: true o false). */


import java.util.Scanner;

public class A04_MayordeEdad {
    public static void main(String[] args) {
        //crea clase scanner para guardar datos introducidos por consola.
        Scanner sc = new Scanner(System.in);

        //solicita edad y guarda el número entero positivo en una variable tipo int llamada edad.
        System.out.print("Introduce la edad: ");
        int edad = sc.nextInt();

        //crea una variable de tipo boolean llamada "mayorEdad" y comprueba si la variable "Edad" es mayor o igual a 18.
        boolean mayorEdad = edad >= 18;

        //muestra resultado true o false añadiendo el nombre de la variable booleano.
        System.out.println("¿Es mayor de edad? " + mayorEdad);
    }
}
