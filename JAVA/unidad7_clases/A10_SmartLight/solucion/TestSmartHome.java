
package unidad7_clases.A10_SmartLight.solucion;

public class TestSmartHome {
    public static void main(String[] args) {
        Bombilla salon = new Bombilla("Lámpara Salón");

        // Intentamos un valor fuera de rango
        System.out.println("--- Ajustando intensidad a 150 ---");
        salon.setIntensidad(150);
        salon.imprimirEstado(); // Debería mostrar 100% y ENCENDIDA

        // Intentamos apagar bajando intensidad a 0
        System.out.println("\n--- Ajustando intensidad a 0 ---");
        salon.setIntensidad(0);
        salon.imprimirEstado(); // Debería mostrar 0% y APAGADA

        // Los alumnos verán que no pueden hacer esto:
        // salon.encendida = true; // ERROR: Es privado
    }
}