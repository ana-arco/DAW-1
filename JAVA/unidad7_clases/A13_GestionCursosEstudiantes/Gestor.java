package unidad7_clases.A13_GestionCursosEstudiantes;

/*
    Existen gestores que administran las cuentas bancarias y atienden a sus propietarios.

    Cada cuenta, en caso de tenerlo, cuenta con un único gestor. Diseñar la clase “Gestor” de la que interesa guardar su nombre, teléfono y el importe máximo autorizado con el que pueden operar. Con respecto a los gestores, existen las siguientes restricciones:

        • Un gestor tendrá siempre un nombre y un teléfono.

        • Si no se asigna, el importe máximo autorizado por operación será de 10.000 euros.

        • Un gestor, una vez asignado, no podrá cambiar su número de teléfono. Y todo el mundo podrá consultarlo.

    El nombre será público y el importe máximo solo será visible por clases vecinas.

    Modificar la clase CuentaCorriente para que pueda disponer de un objeto Gestor. Escribir los métodos necesarios.
*/

public class Gestor {

    // 1. ATRIBUTOS
    
    // "El nombre será público"
    public String nombre; 
    
    // "No podrá cambiar su número de teléfono" -> final
    // "Todo el mundo podrá consultarlo" -> private con Getter público
    private final String telefono; 
    
    // "Solo será visible por clases vecinas" -> (package-private / default)
    // No ponemos ni public ni private
    double importeMaximo; 

    // 2. CONSTRUCTORES
    
    /**
     * Constructor principal.
     * Si no se asigna importe, será 10.000 por defecto.
     */
    public Gestor(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.importeMaximo = 10000.0; // Valor por defecto
    }

    /**
     * Constructor opcional por si queremos especificar el importe al crear.
     */
    public Gestor(String nombre, String telefono, double importeMaximo) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.importeMaximo = importeMaximo;
    }

    // 3. MÉTODOS
    
    // Getter para el teléfono (para que "todo el mundo pueda consultarlo")
    public String getTelefono() {
        return telefono;
    }
    
    // No hacemos Setter para teléfono porque es 'final'
    
    // Getter para importe (opcional, pero útil si la clase vecina necesita leerlo)
    double getImporteMaximo() {
        return importeMaximo;
    }
}
