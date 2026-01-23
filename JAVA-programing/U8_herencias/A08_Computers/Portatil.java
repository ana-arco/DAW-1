package unidad8_herencias.A08_Computers;

public class Portatil extends Ordenador {
    // ATRIBUTOS DE LA CLASE PORTATIL
    double peso;

    // MÉTODOS DE LA CLASE PORTATIL
        // 1. Constructores
        // 2. Getter y setters
        // 3. Métodos de la clase y métodos abstractos
        // 4. @Override toString() y equals() 

        // constructor por defecto
        public Portatil() {
            super("", 0.0);
            System.out.println("Este es el constructor por defecto.");
        }
        
        // constructor con parámetros
        public Portatil(String codigo, double precio, double peso) {
            super(codigo, precio);
            this.peso = peso;
            System.out.println("Este es el constructor de Portatil con parámetros.");

        }

        // 3. Métodos abstractos
        public void rendimiento() {
            System.out.println("El portatil tiene de rendimiento 2000 Pulsos");
        }
}
