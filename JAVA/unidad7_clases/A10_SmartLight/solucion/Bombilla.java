package unidad7_clases.A10_SmartLight.solucion;

public class Bombilla {
    // Atributos
    public String nombre;
    private boolean encendida;
    private int intensidad;

    // Constructor
    public Bombilla(String nombre) {
        this.nombre = nombre;
        this.encendida = false; // Por defecto apagada
        this.intensidad = 0;
    }

    // Getter para 'encendida' (Convención: isNombre en booleanos)
    public boolean isEncendida() {
        return encendida;
    }

    // Getter para intensidad
    public int getIntensidad() {
        return intensidad;
    }

    // Setter para intensidad con lógica de control
    public void setIntensidad(int intensidad) {
        if (intensidad > 100) {
            this.intensidad = 100;
        } else if (intensidad < 0) {
            this.intensidad = 0;
        } else {
            this.intensidad = intensidad;
        }

        // Lógica de autogestión del estado
        this.encendida = (this.intensidad > 0);
    }

    public void imprimirEstado() {
        String estado = (encendida) ? "ENCENDIDA" : "APAGADA";
        System.out.println("Dispositivo: " + nombre + " | Estado: " + estado + " | Brillo: " + intensidad + "%");
    }
}
