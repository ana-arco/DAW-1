/* 
Diseñar la clase CuentaCorriente, que almacena los datos: DNI y nombre del titular, así como el saldo. Las operaciones típicas con una cuenta corriente son:
·      Crear una cuenta: se necesita el DNI y nombre del titular. El saldo inicial será 0.
·      Sacar dinero: el método debe indicar si ha sido posible llevar a cabo la operación, si existe saldo suficiente.
·      Ingresar dinero: se incrementa el saldo.
·      Mostrar información: muestra la información disponible de la cuenta corriente.

La inicialización se hace con el constructor.

1. Clase
2. Atributos (ámbito global, se pueden usar en cualquier método)
3. Métodos.


*/

package JAVA.unidad7_clases;

import java.util.Scanner;

public class CuentaCorriente {
    String dni; // ahora es null
    String nombre; // ahora es null
    double saldo; // ahora es 0.00

    // CONSTRUCTOR
    CuentaCorriente (String dni, String nombre, double saldo) {
        this.dni = dni;
        this.nombre = nombre;
        this.saldo = saldo;
    }

    // MÉTODO MAIN
    public static void main(String[] args) {
        CuentaCorriente cuenta1 = new CuentaCorriente( );
        cuenta1.dni = "3434345J";
        cuenta1.nombre = "Ana";
        cuenta1.saldo = 223.5;
    }

    // MÉTODOS DE LA CLASE CuentaCorriente
    void ingreso(double cantidad) {
        saldo += cantidad;
    }

    

}












































/* 
/
    public static void main(String[] args) {
        /* */
        Scanner scanner = new Scanner(System.in);
        int option;
        System.out.print("Elige una opción:");
        imprimirMenu();
        do { 
            switch (option) {
                case 1 -> CrearCuenta();
                case 2 -> SacarDinero();
                case 3 -> IngresarDinero();
                case 4 -> MostrarDatos();  
                    
                default -> System.out.println("Error: Opción no válida");
            }
        } while (true);
              // El enunciado dice saldo inicial 0
    }
    }

    /*Menú de operaciones */
    public static void imprimirMenu() {
        System.out.println("1. Crear cuenta");
        System.out.println("2. Sacar dinero");
        System.out.println("3. Ingresar dinero");
        System.out.println("4. Mostrar datos");
    }

    /* MÉTODOS DE LA CLASE CuentaCorriente */

    /*CREAR CUENTA */
    public void CrearCuenta {
        System.out.println("");
    }

    /*SACAR DINERO */
    public void SacarDinero {
        // Hacer comprobación de saldo suficiente, 
    }

    /*INGRESAR DINERO */
    public void IngresarDinero {

    }

    /*MOSTRAR DATOS */
    public void MostrarDatos {

    }


}
 

*/
