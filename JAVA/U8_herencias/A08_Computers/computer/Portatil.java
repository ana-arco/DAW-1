
package computer;


public class Portatil extends Ordenador {
    double peso;
    /*String static final = "Ideal para sus viajes!";*/

    // MÉTODOS DE LA CLASE PORTATIL
        // 1. Constructores
        // 2. Getter y setters
        // 3. Métodos de la clase y métodos abstractos
        // 4. @Override toString() y equals() 

        // constructor por defecto
        public Portatil() {
            super();
            System.out.println("Este es el constructor por defecto.");
        }
        
        // constructor con parámetros
        public Portatil(String codigo, double precio, double peso) {
            super();
            this.peso = peso;
            System.out.println("Este es el constructor de Portatil con parámetros.");

        }

        // 3. Métodos abstractos
        @Override
        public void rendimiento() {
            System.out.println("El portatil tiene de rendimiento 2000 Pulsos");
        }
        
        @Override
        public void slogan() {
            System.out.println("Ideal para sus viajes!");
        }
}
