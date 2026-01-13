package unidad7_clases.A12_ClaseCalendario;

/* 

Diseña la clase Calendario que representa una fecha concreta (año, mes y día). La clase debe disponer de los métodos:

-          Calendario(int año, int mes, int dia): que crea un objeto con los datos pasados como parámetros, siempre y cuando, la fecha que representen sea correcta.

-          void incrementarDia(): que incrementa en un día la fecha del calendario.

-          void incrementarMes(): que incrementa en un mes la fecha del calendario.

-          void incrementarAño(int cantidad): que incrementa la fecha del calendario en el número de años especificados. Ten en cuenta que el año 0 no existió.

-          void mostrar(): muestra la fecha por consola.

-          boolean iguales(Calendario otraFecha): que determina si la fecha invocante y la que se pasa como parámetro son iguales o distintas.

Por simplicidad, solo tendremos en consideración que existen meses con distinto número de días, pero no tendremos en cuenta los años bisiestos.

*/

public class Calendario {
    // 1. ATRIBUTOS
    private int year;
    private int month;
    private int day;

    // 2. CONSTRUCTOR CON VALIDACIONES INCLUIDAS
    public Calendario(int anio, int mes, int dia) {
        if (FechaCorrecta(anio, mes, dia)) {
            this.year = anio;
            this.month = mes;
            this.day = dia;
        } else {
            System.err.println("Error: La fecha " + dia + "/" + mes + "/" + anio + " no es válida.");
            // Inicializamos a una fecha por defecto para evitar nulos/errores
            this.year = 1;
            this.month = 1;
            this.day = 1;
        }
    }

    // 3. GETTERS Y SETTERS
    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public void setYear(int year) {
        // Solo cambiamos si el año no es 0
        if (year != 0) {
            this.year = year;
        } else {
             System.err.println("Error: El año 0 no existe.");
        }
    }

    public void setMonth(int month) {
        // Validamos si la fecha resultante (mismo año y día, nuevo mes) es válida
        if (FechaCorrecta(this.year, month, this.day)) {
            this.month = month;
        } else {
            System.err.println("Error: No se puede cambiar al mes " + month + " con el día actual (" + this.day + ").");
        }
    }

    public void setDay(int day) {
        // Validamos si la fecha resultante (mismo año y mes, nuevo día) es válida
        if (FechaCorrecta(this.year, this.month, day)) {
            this.day = day;
        } else {
            System.err.println("Error: El día " + day + " no es válido para el mes actual.");
        }
    }

    // 4. MÉTODOS

    // 4.1. MÉTODOS PRIVADOS PARA VALIDACIONES
    // Devuelve los días de un mes (ignorando bisiestos según enunciado)
    private int diasEnMes(int m) {
        // Truco: switch expression o array. Usaremos lógica clásica.
        if (m == 2) return 28;
        if (m == 4 || m == 6 || m == 9 || m == 11) return 30;
        return 31;
    }
    // Valida si los datos introducidos forman una fecha real
    private boolean FechaCorrecta(int y, int m, int d) {
        if (y == 0) return false; // El año 0 no existe
        if (m < 1 || m > 12) return false;
        if (d < 1 || d > diasEnMes(m)) return false;
        return true;
    }

    //4.2. MÉTODOS PÚBLICOS PARA ACCIONES CONCRETAS

    // MÉTODO 1 - void incrementarDia(): que incrementa en un día la fecha del calendario.
    public void incrementarDia() {
        day++;
        if (day > diasEnMes(month)) {
            day = 1;
            incrementarMes();
        }
    }

    // MÉTODO 2 - void incrementarMes(): que incrementa en un mes la fecha del calendario.
    /**
     * Incrementa un mes. 
     * Nota: Si estamos en día 31 y pasamos a un mes de 30 o 28 días,
     * ajustamos el día para que la fecha siga siendo válida.
     */
    public void incrementarMes() {
        month++;
        if (month > 12) {
            month = 1;
            incrementarAño(1);
        }
        
        // Ajuste: Ejemplo, si estamos a 31 de Enero y pasamos a Febrero (max 28),
        // el día debe bajarse a 28.
        int maxDiasNuevoMes = diasEnMes(month);
        if (day > maxDiasNuevoMes) {
            day = maxDiasNuevoMes;
        }
    }

    // MÉTODO 3. void incrementarAño(int cantidad): que incrementa la fecha del calendario en el número de años especificados. 
    // Ten en cuenta que el año 0 no existió.

    public void incrementarAño(int cantidad) {
        // Opción simple: sumamos y si cae en 0, sumamos 1 más
        // (Asumiendo que cantidad es positiva y vamos hacia el futuro)
        int anioDestino = year + cantidad;
        
        if (year < 0 && anioDestino >= 0) {
            // Si pasamos de AC a DC, hay que sumar 1 extra porque el 0 no cuenta
            anioDestino++;
        } else if (anioDestino == 0) {
            anioDestino = 1; 
        }
        
        this.year = anioDestino;
    }

    // MÉTODO 4 - void mostrar(): muestra la fecha por consola.
    public void mostrar() {
        System.out.println("Fecha: " + day + "/" + month + "/" + year);
    }

    // MÉTODO 3 boolean iguales(Calendario otraFecha): que determina si la fecha invocante y la que se pasa como parámetro son iguales o distintas.
    // Compara si dos objetos Calendario son iguales.
    
    public boolean iguales(Calendario otraFecha) {
        if (otraFecha == null) return false;
        return this.year == otraFecha.year &&
               this.month == otraFecha.month &&
               this.day == otraFecha.day;
    }

    


}
