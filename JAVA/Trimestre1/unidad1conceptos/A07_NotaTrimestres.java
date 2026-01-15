package trimestre1.unidad1conceptos;

/*Ejercicio 7.- Escribir un programa que solicite las notas del primer, segundo y tercer trimestre (notas enteras 
que se solicitarán al usuario). El programa debe mostrar la nota media del curso como se utiliza en el boletín de 
calificaciones (solo la parte entera) y como se usa en el expediente académico (con decimales). */

import java.util.Scanner;

public class A07_NotaTrimestres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la nota del trimestre 1: ");
        double nota1 = sc.nextInt();

        System.out.print("Introduce la nota del trimestre 2: ");
        double nota2 = sc.nextInt();
        
        System.out.print("Introduce la nota del trimestre 3: ");
        double nota3 = sc.nextInt();

        System.out.printf("Nota media del curso: %.0f \n", (nota1 + nota2 + nota3) / 3 );
        System.out.printf("Nota media del expediente: %.2f ", (nota1 + nota2 + nota3) / 3 );

    }
}
