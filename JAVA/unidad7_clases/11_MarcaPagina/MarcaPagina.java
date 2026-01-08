package unidad7_clases.11_MarcaPagina;

/*
Escribe la clase MarcaPagina, que ayuda a llevar el control de la lectura de un libro. Deberá disponer de métodos para:

- Incrementar la página leída,

- Para obtener información de la última página que se ha leído

- Para comenzar desde el principio una nueva lectura del mismo libro.
*/

public class MarcaPagina {
    

    // Atributos
    public String titulo;
    public int paginasTotales;
    private int paginaActual;
    private String lector;


    // Constructor
    public MarcaPagina(String titulo, int paginasTotales, String lector) {
        this.titulo = titulo;
        this.paginasTotales = paginasTotales;
        this.lector = lector;
        this.paginaActual = 0; // Comienza desde el principio
    }

    // Métodos

    // 1. Método para incrementar página leída  
    public void incrementarPagina() {
        paginaActual++;
    }

    // 2. Método para obtener información de la última página leída
    public void informacionUltimaPagina() {
        lector = lector + " ha leído hasta la página " + paginaActual + " del libro '" + titulo + "'.";
    }

    // 3. Método para comenzar desde el principio una nueva lectura del mismo libro.
    public void nuevaLectura() {
        paginaActual = 0;
    }
}
