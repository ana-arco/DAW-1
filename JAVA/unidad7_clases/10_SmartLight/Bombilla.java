package unidad7_clases.10_SmartLight;

public class Bombilla {

    // Atributos
    public String nombre;
    private boolean encendida;
    private int intensidad;

    // Constructor por defecto
    public Bombilla ( String nombre, int intensidad ) {
        this.nombre = nombre;
        this.encendidad = false;
        this.intensidad = 0;
    }

    // Getter
    public String getNombre() {
        return nombre;
    }
    public boolean getEncendida() {
        return encendida;
    }
    public int getIntensidad() {
        return intensidad;
    }

    // Setter
    public void setNombre (String nombre) {
        this.nombre = nombre;
    }
    public void setEncendida (boolean encendida) {
        this.encendida = encendida;
    }
    public void setIntensidad(int intensidad) {
        if ( intensidad < 0) {
            this.intensidad = 0;
            this.encendida = false;
        } else if ( intensidad > 100 ) {
            this.intensidad = 100;
            this.encendida = true;
        } else {
            this.intensidad = intensidad;
        }

        // lógica de autogestión
        this.encendida = (this.intensidad > 0);
        
    }

    // Método Especial
    public void imprimirEstado() {
        System.out.printf("El coche de nombre %s,  ", nombre );

        System.out.println("El coche se llama: " + nombre);
        System.out.println("¿Está encendido?: " + encendida);
        System.out.println("Su brillo actual es:" + intensidad);
    }


}
