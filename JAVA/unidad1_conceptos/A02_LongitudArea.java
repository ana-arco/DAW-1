/*Ejercicio 2.- Diseñar una aplicación que calcule la longitud y el área de una circunferencia. Para ello, 
el usuario debe introducir el radio (que puede contener decimales).
Recordamos: Longitud = 2pi • Radio Área = pi. Radio^2*/

// package unidad1_conceptos;

import java.util.Scanner;

public class A02_LongitudArea {

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        //crea una variable de tipo escaner para llamarla en cualquier momento del main.
        Scanner sc = new Scanner(System.in);

        //solicita un radio y lo guardamos en un double llamado "radio".
        System.out.printf("\nDime cuál es el radio: ");
        double radio = sc.nextDouble();

        //crea la variable longitud para hacer el cálculo longitud llamándo a la clase math para coger el número PI.
        double longitud = 2 * Math.PI * radio;

        //crea la variable "area" para hacer el cálculo del área, llamando a la clase math para PI y la clase .pow para hacer un elevado.
        double area = Math.PI * Math.pow(radio, 2);

        //comprueba el radio.
        System.out.printf("\nTu dichoso radio es de %.2f centímetros.", radio);
        
        //muestra la longitud y el área.
        System.out.printf("\nAsí que la longitud será: %.2f centímetros, y el área %.2f centímetros cuadrados ¿vale?\n", longitud, area);
        
        //muestra valores en metros, no en centímetros.
        System.out.printf("\nEn metros se vería así: Longitud = %.2f metros. Área = %.2f metros.", longitud/100, area/100);
        sc.close();
    }
}