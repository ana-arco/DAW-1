package unidad3_bucles;

import java.util.Scanner;

/* Diseñar un programa que muestre, para cada número introducido por teclado, si es par, si es positivo y su cuadrado. 
El proceso se repetirá hasta que el número introducido sea cero. */


// solución dada
public class A01_While_PositivoCuadrado {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca número: ");
        int num = sc.nextInt(); 
        
        while (num != 0){
            //Comprobación de si es par o impar
            if (num%2 == 0)System.out.println("Es par");
            else System.out.println("Es impar");
            //Comprobar si es positivo
            if (num > 0) System.out.println("Es positivo");
            else System.out.println("Es negativo");
            //Realizar el cuadrado
            System.out.println("El cuadrado de "+num+" es "+num*num);
            System.out.print("Introduzca número: ");
            num = sc.nextInt(); 
            
        }
       
        
        
        
    }
        
 
}  
