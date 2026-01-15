/*Ejercicio 5.- Diseñar un algoritmo que nos indique si podemos salir a la calle. Existen aspectos 
que influirán en esta decisión: si está lloviendo y si hemos terminado nuestras tareas. Solo podremos 
salir a la calle si no está lloviendo y hemos finalizado nuestras tareas. Existe una opción en la que, 
indistintamente de lo anterior, podremos salir a la calle: el hecho de que tengamos que ir a la biblioteca 
(para realizar algún trabajo, entregar un libro, etc.). Solicitar al usuario (mediante un booleano) si llueve, 
si ha finalizado las tareas y si necesita ir a la biblioteca. El algoritmo debe mostrar mediante un booleano 
(true o false) si es posible que se le otorgue permiso para ir a la calle. */

// package unidad1_conceptos;

import java.util.Scanner;

public class A05_PuedoSalir {
    public static void main(String[] args) {
        //crea variable scanner, la llama sc para poder llamarla en otra parte del main.
        Scanner sc = new Scanner(System.in);

        //solicita los tres booleanos.
        System.out.print("¿Está lloviendo? True/False ");
        boolean lluvia = sc.nextBoolean();

        System.out.print("¿Has finalizado las tareas? true/false ");
        boolean tareas = sc.nextBoolean();

        System.out.print("¿Necesita ir a la biblioteca? true/false ");
        boolean biblioteca = sc.nextBoolean();

        //condiciona sólo salir, según lo pone en el enunciado: sólo podrá salir si NO llueve, SÍ tareas, y no especifica nada de la biblioteca.
        boolean salir = !lluvia && tareas || biblioteca;

        System.out.print("¿Puedes salir? " + salir);
    }
}
