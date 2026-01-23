package unidad8_herencias.A01_ClaseHora;

/* Diseñar la clase Hora, que representa un instante de tiempo compuesto por la hora (de O a 23) y los minutos. 

Dispone de los métodos:

Hora (hora, minuto), que construye un objeto con los datos pasados como parámetros.

void inc (), que incrementa la hora en un minuto.

boolean setMinutos(valor), que asigna un valor, si es válido, a los minutos. Devuelve true o false según haya sido posible modificar los minutos o no.

boolean setHora(valor), que asigna un valor, si está comprendido entre 0 y 23, a la hora. Devuelve true o false según haya sido posible cambiar la hora o no.

String toString(), que devuelve un String con la representación de la hora. */

public class A01_ClaseHora {
    // 1. ATRIBUTOS
    public int h;
    public int m;

    // 2. CONSTRUCTOR
    // constructor por defecto

    // 3. GETTER & SETTERS

    public boolean setMinutos(){
        if (m > 0 && m < 60) {
            
        }
        return false;
    }

    public boolean setHora(){
        return false;

    }

    // 4. MÉTODOS

    // Método que construye un objeto con los datos pasados como parámetros
    public void Hora(){
        
    }

    // Método que incrementa la hora en un minuto
    public void incrementarMinuto() {
        m++;
    }

    // Método para devolver un String con la representación de la hora.
    public String toString(){
        return null;

    }

    
}
