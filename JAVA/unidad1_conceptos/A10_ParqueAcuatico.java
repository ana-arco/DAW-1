/*Ejercicio 10.- Una empresa que gestiona un parque acuático te solicita una aplicación que les ayude 
a calcular el importe que hay que cobrar en la taquilla por la compra de una serie de entradas (cuyo 
número será introducido por el usuario). Existen dos tipos de entrada: infantiles (15,50€) y de adultos (20€). 
En el caso de que el importe total sea igual o superior a 100€, se aplicará automáticamente un bono descuento del 5%.*/

import java.util.Scanner;

public class A10_ParqueAcuatico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final double precioInfantiles = 15.50;
        final double precioAdultos = 20;

        System.out.print("¿Cuántas entradas infantiles desea? ");
        int entradasInfantiles = sc.nextInt();

        System.out.print("¿Cuántas entradas adultos desea? ");
        int entradasAdultos = sc.nextInt();

        double importeTotal = (precioInfantiles*entradasInfantiles)+(precioAdultos*entradasAdultos);
        System.out.printf("Ha seleccionado %d entradas infantiles y %d entradas adulto por el importe de %.2f euros.\n", entradasInfantiles, entradasAdultos, (precioInfantiles*entradasInfantiles)+(precioAdultos*entradasAdultos));

        double descuento = importeTotal >= 100 ? importeTotal*5/100 : 0;
        double importeFinal = importeTotal - descuento;

        System.out.printf("El importe final es %.2f euros, porque el descuento ha sido %.2f euros.", importeFinal, descuento);

        //boolean descuentoBoolean = importeTotal >= 100;
        //System.out.printf("¡Enhorabuena! Al ser un importe total superior a 100€ tiene un descuento del 5%, se le descuentan %.2f euros, el importe final sería %.2f euros.", );

    }
}
