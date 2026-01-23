package unidad7_clases.A10_SmartLight;

/*
Actividad: El Gestor de Dispositivos "SmartLight" 
La empresa "IoT-Tech" nos pide programar el comportamiento de sus bombillas inteligentes. Los alumnos deben crear una clase Bombilla que controle el estado y la intensidad de la luz, asegurando que el hardware (simulado) no se rompa por valores incorrectos.

Requisitos de la Clase Bombilla:
Atributos:

nombre (String): Público. El nombre de la estancia (ej. "Salón").

encendida (boolean): Privado. Indica si la luz emite corriente.

intensidad (int): Privado. Un valor entre 0 y 100.

Reglas de Negocio (Lógica en Getters/Setters):

Getter/Setter de nombre: Estándar.

Getter de encendida: Estándar (usando isEncendida()).

Setter de intensidad: * Si el valor es > 100, se queda en 100.

Si el valor es < 0, se queda en 0.

Regla extra: Si la intensidad es > 0, la bombilla debe marcarse automáticamente como encendida = true. Si es 0, debe marcarse como false.

Método Especial: * imprimirEstado(): Muestra por consola el nombre, si está encendida y su brillo actual.

 */

public class Main {
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
