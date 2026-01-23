package unidad7_clases.A13_GestionCursosEstudiantes;

public class CuentaCorriente {
    String dni;
    double saldo;
    Gestor gestor; // La referencia al Gestor

    public CuentaCorriente(String dni, double saldo) {
        this.dni = dni;
        this.saldo = saldo;
    }

    public void setGestor(Gestor gestor) {
        this.gestor = gestor;
    }

    public void mostrarGestor() {
        System.out.println("--- Info Gestor de la cuenta " + dni + " ---");
        if (gestor != null) {
            System.out.println("Nombre: " + gestor.nombre);
            System.out.println("Tlf: " + gestor.getTelefono());
            // Podemos ver el importe porque estamos en el mismo paquete
            System.out.println("Importe Max: " + gestor.importeMaximo + "€");
        } else {
            System.out.println("No hay gestor asignado.");
        }
    }
}
