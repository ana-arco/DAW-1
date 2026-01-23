package examenes;



import java.util.Scanner;

/* Simula las operaciones básicas de un cajero automático, permitiendo al usuario
 * consultar saldo, ingresar y retirar dinero de forma segura y modular.
 * @author ANA ARCO
 * 
 * OPCIONES:
 * 1. Consultar Saldo
 * 2. Ingresar dinero
 * 3. Retirar dinero
 * 4. Salir
 * 
 * REQUISITOS TÉCNICOS:
 * 1. VARIABLES: 
 * double saldo = 1000.00;
 * int opcion;
 * double saldoActual;
 * 
 * 2. FUNCIONES:
 * void mostrarMenu(): imprime el menú por consola.
 * void consultarSaldo(): recibe el saldo como parámetro y lo muestra por pantalla.
 * double ingresarDinero(double saldoActual): recibe el saldo actual, pide al usuario la cantidad a ingresar, realiza la suma, y devuelve el nuevo saldo actualizado.
 * double retirarDinero(double saldoActual): recibe saldo actual, pide al usuario cuánto quiere retirar,y realiza la validación.
 *      condición 1: si cantidad a retirar es <= a saldo, resta y devuelve saldo acutalizado.
 *      condición 2: si cantidad a retirar es > que el saldo, muestra mensaje de error ("Saldo insuficiente") y muestra saldo sin modificar.
 * 
 * FLUJO DEL PROGRAMA
 * Main debe contener do-while, hacer siempre el do.
 * Dentro del switch llama a la función que haya seleccionado el usuario.
 * 
 * IMPORTANTE:
 * SALDO se actualizará en el main según lo que devuelva cada función. 
 */

public class cajeroAutomatico {
    
    // Método principal que ejecuta el programa
    public static void main(String[] args) {
        double saldo = 1000.0;
        int opcion = 0;

        Scanner sc = new Scanner(System.in);

        do { 
            mostrarMenu();
            opcion = sc.nextInt();

            switch (opcion) {
                case 1 -> /*System.out.println("Consultando saldo ...")*/ consultarSaldo(saldo);
                case 2 -> /*System.out.println("Vamos a ingresar dinero ...");*/ saldo = ingresarDinero(saldo, sc);
                case 3 -> System.out.println("Vamos a retirar dinero ...");
                case 4 -> System.out.println("Gracias por utilizar nuestros servicios. ¡Hasta pronto!");
                default -> System.out.println("Error: Introduce una opción valida. Intentalo de nuevo.");
            }

        } while (opcion != 4);

        sc.close();
    }

    public static void mostrarMenu() {
        System.out.println("\n**** BIENVENIDO AL CAJERO AUTOMÁTICO DE ANA ARCO");
        System.out.println("1. Consultar saldo.");
        System.out.println("2. Ingresar dinero.");
        System.out.println("3. Retirar dinero.");
        System.out.println("4. Salir.");
        
        System.out.print("\nElige una opción: ");
    }

    public static void consultarSaldo(double saldoActual) {
        System.out.printf("Tu saldo actual es: %.2f €.\n", saldoActual);
    }

    public static double ingresarDinero (double saldoActual, Scanner sc) {
        System.out.println("¿Cuánto dinero quiere ingresar?");
        double ingreso = sc.nextDouble();

        if (ingreso > 0 ) {
            saldoActual = saldoActual + ingreso;
            System.out.printf("Ingreso realizado correctamente.");
        } else {
            System.out.println("Error: No se puede ingresar una cantidad menor a 0.");
        }
        return saldoActual;
        
    }
}
