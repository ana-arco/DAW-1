package JAVA.unidad7_clases.A11_MarcaPagina;

/*
Escribe la clase MarcaPagina, que ayuda a llevar el control de la lectura de un libro. Deberá disponer de métodos para:

- Incrementar la página leída,

- Para obtener información de la última página que se ha leído

- Para comenzar desde el principio una nueva lectura del mismo libro.
*/

public class MarcaPagina {
    

    // 1. Atributos
    private String titulo; // es mejor no ponerle titulo para poder usar este marcapaginas en cualquier libro
    private int paginasTotales;
    private int paginaActual;
    private String lector;


    // 2. Constructor
    public MarcaPagina(String titulo, int paginasTotales, String lector) {
        this.titulo = titulo;
        this.paginasTotales = paginasTotales;
        this.lector = lector;
        this.paginaActual = 0; // Comienza desde el principio
    }

    // 3. Getter y Setters
    /* Por cada atributo debería haber un get y un set.
    
    */
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getPaginasTotales() {
        return paginasTotales;
    }
    public void setPaginasTotales(int paginasTotales) {
        this.paginasTotales = paginasTotales;
    }
    
    public String getLector() {
        return lector;
    }
    public void setLector(String lector) {
        this.lector = lector;
    }

    public int getPaginaActual() {
        return paginaActual;
    }
    public void setPaginaActual(int paginaActual) {
        this.paginaActual = paginaActual;
    }


    // 4. Métodos pra lógica del marca páginas

    // 1. Método para incrementar página leída  
    public void incrementarPagina() {
        // antes de sumar una página deberíamos validar que la pagina actual es menos a las páginas totales
        if (paginaActual < paginasTotales) {
            paginaActual++;
        } else {
            System.out.println("¡Libro terminado!");
        }
        
    }

    // 2. Método para obtener información de la última página leída
    public String informacionUltimaPagina() {
        String mensaje = lector + " ha leído hasta la página " + paginaActual + " del libro '" + titulo + "'.";
        return mensaje;
    } 

    // 3. Método para comenzar desde el principio una nueva lectura del mismo libro.
    public void nuevaLectura() {
        paginaActual = 0;
        System.out.println("Lectura reiniciada.");
    }
}
