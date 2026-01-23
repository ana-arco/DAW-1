package unidad7_clases.A12_ClaseCalendario;

/* 

Diseña la clase Calendario que representa una fecha concreta (año, mes y día). La clase debe disponer de los métodos:

-          [constructor con todas las propiedades] Calendario(int año, int mes, int dia): que crea un objeto con los datos pasados como parámetros, siempre y cuando, la fecha que representen sea correcta.
                hay que poner setters para hacer todas las validaciones

-          void incrementarDia(): que incrementa en un día la fecha del calendario.
                otro objeto de la clase calendario tendría que tener las mismas propiedades

-          void incrementarMes(): que incrementa en un mes la fecha del calendario.

-          void incrementarAño(int cantidad): que incrementa la fecha del calendario en el número de años especificados. Ten en cuenta que el año 0 no existió.

-          void mostrar(): muestra la fecha por consola.

-          boolean iguales(Calendario otraFecha): que determina si la fecha invocante y la que se pasa como parámetro son iguales o distintas.

Por simplicidad, solo tendremos en consideración que existen meses con distinto número de días, pero no tendremos en cuenta los años bisiestos.

crear un array para los días del mes 

*/

public class Main {
    public static void main(String[] args) {
        System.out.println("--- PRUEBA 1: Crear fecha correcta ---");
        Calendario fecha1 = new Calendario(2023, 12, 31);
        fecha1.mostrar();

        System.out.println("\n--- PRUEBA 2: Incrementar día (cambio de año)");
        fecha1.incrementarDia();
        fecha1.mostrar();

        System.out.println("\n--- PRUEBA 3: Control de mes (31 Enero -> Febrero) ---");
        // fuerza la fecha al 31 enero
        fecha1.setMonth(1);
        fecha1.setDay(31);
        fecha1.incrementarMes();
        fecha1.mostrar();

        System.out.println("\n--- PRUEBA 4: Setters con validación ---");
        System.out.println("Intentando poner día 50...");
        fecha1.setDay(50); // debería dar error de consola
        fecha1.mostrar(); // la fecha no debería cambiar

        System.out.println("\n--- PRUEBA 5: Año 0 ---");
        Calendario fechaHistorica = new Calendario(-1, 12, 31);
        fechaHistorica.mostrar();
        System.out.println("Incrementamos año (del -1 debería pasar al 1):");
        fechaHistorica.incrementarAño(1);
        fechaHistorica.mostrar(); // Debería ser 1/12/31
    }
}
