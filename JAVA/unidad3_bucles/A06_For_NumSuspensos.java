package unidad3_bucles;

/*Pedir 5 calificaciones de alumnos y decir al final si hay algún suspenso */

public class A06_For_NumSuspensos {
    
}


// solución dada
public class Main {

    public static void main(String[] args) {Scanner sc = new Scanner(System.in);
        int suspensos = 0; 
        for (int i = 0; i < 5; i++) {
            System.out.print("Introduzca nota (de 0 a 10): ");
            int notas = sc.nextInt();
            if (notas < 0 || notas > 10) {
                System.out.println("La nota no es correcta");
                i--;
            }
            if ( notas >= 0 && notas < 5) suspensos++; 
        }
    System.out.println("Numero de suspensos: "+ suspensos);
    }
}