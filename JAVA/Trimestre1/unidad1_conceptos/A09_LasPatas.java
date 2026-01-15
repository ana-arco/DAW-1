/*Ejercicio 9.- Un biólogo está realizando un estudio de distintas especies de invertebrados y necesita una aplicación
que le ayude a contabilizar el número de patas que tienen en total todos los animales capturados durante una jornada de 
trabajo. Para ello, te ha solicitado que escribas una aplicación a la que hay que proporcionar:
- El número de hormigas capturadas (6 patas).
- El número de arañas capturadas (8 patas).
- El número de cochinillas capturadas (14 patas).
- La aplicación debe mostrar el número total de patas. */

import java.util.Scanner;

public class A09_LasPatas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int patas_hormigas = 6;
        final int patas_arañas = 8;
        final int patas_cochinillas = 14;
        
        System.out.print("¿Cuántas hormigas has capturado? ");
        int hormigas = sc.nextInt();

        System.out.print("¿Cuántas arañas has capturado? ");
        int arañas = sc.nextInt();

        System.out.print("¿Cuántas cochinillas has capturado? ");
        int cochinillas = sc.nextInt();

        System.out.printf("Has capturado %d patas: %d patas de hormigas, %d patas de arañas y %d patas de cochinillas.", (patas_hormigas*hormigas) + (patas_arañas*arañas) + (patas_cochinillas*cochinillas), patas_hormigas, patas_arañas, patas_cochinillas);

    }
}
