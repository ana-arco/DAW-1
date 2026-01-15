package unidad3_bucles;

import java.util.Scanner;

/* Desarrollar un juego que ayude a mejorar el cálculo mental de la suma. 
El jugador tendrá que introducir la solución de la suma de dos números aleatorios comprendidos entre 1 y 100. 
Mientras la solución introducida sea correcta, el juego continuará. En caso contrario, el programa terminará y 
mostrará el número de operaciones realizadas correctamente. */



// solución dada
public class A03_Do_While_Calculo {

    public static void main(String[] args) {
        int operando1, operando2;
        int resultado;
        int aciertos = 0;
        Scanner sc = new Scanner(System.in);
        
        do {
            operando1 = (int)(Math.random()*100+1);
            operando2 = (int)(Math.random()*100+1);
            System.out.print("Suma esto ---> "+operando1+"+"+operando2+"= ");
            resultado = sc.nextInt();  
            if (resultado == operando1 + operando2) aciertos++;       
        } while (resultado == operando1 + operando2);
        
        System.out.println("Tu número de aciertos es --> "+aciertos);
        
        
        
        
        
    }
    
}