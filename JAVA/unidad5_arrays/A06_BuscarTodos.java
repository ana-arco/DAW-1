package unidad5_arrays;
/*Típico ejercicio de examen. */

/* 
 * 1. Pedir por pantalla el contenido del array.
 * 2. Llama al método que crea habitaciones al array.
 * 
 */

import java.util.Arrays;
import java.util.Scanner;

/*Ejercicio 7.- Realiza la función: 

int[]  buscarTodos  (int  t  []  ,  int  clave), 

que  crea  y  devuelve una tabla con todos los índices de los elementos donde se encuentra la clave de búsqueda.

En el caso de que clave no se encuentre en la tabla t, la función devolverá una tabla vacía. */

public class A06_BuscarTodos {
    public static void main(String[] args) {
        int aux[] = {1, 2, 5, 3, 2, 4, 2, 2, 1, 4, 5, 2};
        System.out.println(Arrays.toString(aux));
        System.out.print("Escriba un número del 1 al 5: ");
        int aBuscar = new Scanner(System.in).nextInt();
        int indices[] = buscarTodos(aux, aBuscar);

        System.out.printf("El número %d se encuentra en los indices: ", aBuscar);
        System.out.println(Arrays.toString(indices));
    }

    static int[] buscarTodos(int t[], int clave) {
        int encontradoEn[] = new int[0];

        for (int i = 0; i < t.length; i++) {
            if (t[i] == clave) {
                encontradoEn = Arrays.copyOf(encontradoEn, encontradoEn.length + 1);
                encontradoEn[encontradoEn.length - 1] = i;
            }
        }
        return encontradoEn;
    }
}
