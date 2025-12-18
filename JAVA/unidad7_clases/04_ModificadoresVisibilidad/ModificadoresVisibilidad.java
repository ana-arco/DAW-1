/* Modificar la visibilidad de la clase CuentaCorriente para que sea visible desde clases externas 
y la visibilidad de sus atributos para que:

• saldo no sea visible para otras clases.

• nombre sea público para cualquier clase.

• dni solo sea visible por clases vecinas.

Realizar un programa para comprobar la visibilidad de los atributos. */

package 04_ModificadoresVisibilidad;

public class ModificadoresVisibilidad {
    public static void main(String[] args) {
        // 1. Instanciamos la clase que está en el otro archivo
        CuentaCorriente miCuenta = new CuentaCorriente(1500.50, "Alex", "12345678W");

        // 2. Probamos visibilidad
        miCuenta.nombre = "Ana Arco"; // OK: es público
        miCuenta.dni = "99999999Z";          // OK: somos vecinos de paquete
        
        // miCuenta.saldo = 2000;            // ERROR: saldo es privado
        
        System.out.println("Nombre: " + miCuenta.nombre);
        System.out.println("DNI: " + miCuenta.dni);
    }
}
