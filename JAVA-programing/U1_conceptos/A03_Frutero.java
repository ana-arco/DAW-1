package trimestre1.unidad1conceptos;

/*Ejercicio 3.- Un frutero necesita calcular los beneficios anuales que obtiene de la venta de manzanas y peras. 
Por este motivo, es necesario diseñar una aplicación que solicite las ventas (en kilos) de cada 
semestre para cada fruta. La aplicación mostrará el importe total sabiendo que el precio del kilo 
de manzanas está fijado en 2,35 € y el kilo de peras en 1,95 €.*/

//package unidad1_conceptos;

import java.util.Scanner;

public class A03_Frutero {
    public static void main(String[] args) {
        //crea variable escaner para llamarla en cualquier momento del programa y guarda el valor introducido por consola.
        Scanner sc = new Scanner(System.in);

        //crea variable con valor fijo.
        final double precioManzanas = 2.35;
        final double precioPeras = 1.95;
        
        //solicita kilos del primer semestre de manzanas y lo guarda en un double.
        System.out.print("Introduce cuántos kilos de manzanas vendiste el primer semestre del año: ");
        double kgmanzanas1 = sc.nextDouble();

        //solicita kilos del segundo semestre y lo guarda
        System.out.print("¿Y el segundo semestre?: ");
        double kgmanzanas2 = sc.nextDouble();

        //calcula el total de kilos y lo guarda en la variable.
        double totalkgmanzanas = kgmanzanas1 + kgmanzanas2;

        //comprueba las tres variables usadas hasta ahora, semestre 1 y 2 más el total de manzanas
        System.out.printf("Si en el primer semestre vendiste %.2f kg y en el segundo semenstre vendiste %.2f kg, en total vendiste %.2f kilos de manzanas.\n", kgmanzanas1, kgmanzanas2, totalkgmanzanas);
        System.out.printf("Si el kilo de manzanas cuesta %.2f euros, el total de manzanas cuesta %.2f euros.\n", precioManzanas, precioManzanas * totalkgmanzanas);
        
        //muestra un espacio por consola para separar y organizar la secuencia de ejecución.
        System.out.println();


        //mismo procedimiento pero con peras, copiar y pegar cambiando los nombres "manzana" a "peras".
        
        System.out.print("Introduce cuántos kilos de peras vendiste el primer semestre del año: ");
        double kgperas1 = sc.nextDouble();
        System.out.print("¿Y el segundo semestre?: ");
        double kgperas2 = sc.nextDouble();
        double totalkgperas = kgperas1 + kgperas2;
        System.out.printf("Si en el primer semestre vendiste %.2f kg y en el segundo semenstre vendiste %.2f kg, en total vendiste %.2f kilos de peras.\n", kgperas1, kgperas2, totalkgperas);
        System.out.printf("Si el kilo de peras cuesta %.2f euros, el total de peras cuesta %.2f euros.\n", precioPeras, precioPeras * totalkgperas );
        System.out.println();

        double beneficiosManzanas = precioManzanas * totalkgmanzanas;
        double beneficiosPeras = precioPeras * totalkgperas;

        //comprueba y muestra el cálculo total haciendo la suma y multiplación en la misma línea formateada, ahorrando líneas y creación de más variables.
        System.out.printf("Los beneficios anuales obtenidos sumando las ventas de todos los kilos son de %.2f euros.", beneficiosManzanas + beneficiosPeras /*(totalkgperas * precioPeras) + (totalkgmanzanas*precioManzanas)*/);
    }
}
