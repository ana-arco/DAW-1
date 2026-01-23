package unidad7_clases.A13_GestionCursosEstudiantes;

public class Main {
    public static void main(String[] args) {
        // 1. Probamos a crear Gestores
        // Gestor con valores por defecto (importe 10.000)
        Gestor g1 = new Gestor("Antonio López", "666111222");
        
        // Gestor VIP con importe personalizado
        Gestor g2 = new Gestor("Sara Connor", "666999888", 500000.0);

        // 2. Probamos la visibilidad (Encapsulamiento)
        System.out.println("--- Pruebas de Visibilidad ---");
        System.out.println("Nombre (public): " + g1.nombre); 
        // System.out.println(g1.telefono); // <-- ESTO DARÍA ERROR (es private)
        System.out.println("Teléfono (getter): " + g1.getTelefono());
        
        // El importe es visible aquí porque TestBanco está en el mismo paquete
        System.out.println("Importe (default): " + g1.importeMaximo); 

        // 3. Probamos la relación con CuentaCorriente
        CuentaCorriente miCuenta = new CuentaCorriente("12345678Z", 500.0);

        System.out.println("\nEstado inicial:");
        miCuenta.mostrarGestor(); // Debería decir que no hay gestor

        System.out.println("\nAsignando gestor...");
        miCuenta.setGestor(g2); // Le asignamos a Sara
        miCuenta.mostrarGestor();
        
        // 4. Intento de cambiar teléfono (Comentario explicativo)
        // g2.telefono = "0000"; // <-- ERROR: No se puede porque es FINAL
        System.out.println("\nNota: No se puede cambiar el teléfono del gestor (es final).");
    }
}
