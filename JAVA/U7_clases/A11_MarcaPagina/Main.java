package unidad7_clases.A11_MarcaPagina;

/*
Escribe la clase MarcaPagina, que ayuda a llevar el control de la lectura de un libro. Deberá disponer de métodos para:

- Incrementar la página leída,

- Para obtener información de la última página que se ha leído

- Para comenzar desde el principio una nueva lectura del mismo libro.
*/

public class Main {
    public static void main(String[] args) {
        System.out.println("INICIO DEL PROGRAMA == MARCA PÁGINAS ==");

        // 1. Se crea un objeto (instancianodo la clase)
        //  Se le pasa el Título, las páginasTotales y el LEctor
        MarcaPagina miMarcador = new MarcaPagina("El árbol de la ciencia", 130, "Ana");

        // 2. Se implementan acciones sobre el método a través de las funciones construidas en la clase 
        // Probamos a leer un poco...
        System.out.println("Leyendo...");
        miMarcador.incrementarPagina();
        miMarcador.incrementarPagina();
        miMarcador.incrementarPagina();

        // 3. Se comprueba que el método devuelve información con el String
        // lo podríamos guardar en una variable e imprimir sólo la variable.
        String info = miMarcador.informacionUltimaPagina();
        System.out.println("Ahora mismo vas por la página número " + info);

        // 4. 

    }
}
