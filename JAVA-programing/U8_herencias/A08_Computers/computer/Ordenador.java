
package computer;

public abstract class Ordenador {
    // ATRIBUTOS

    protected String codigo;
    protected double precio;

    // MÉTODOS
        // 1. Constructores
        // 2. Getter y setters
        // 3. Métodos de la clase y métodos abstractos
        // 4. @Override toString() y equals() 
    
        // constructores
            // constructor 1 - por defecto
        public Ordenador() {
        }
        
            // constructor 2 - con todos los parámetros
        public Ordenador(String codigo, double precio) {
            this.codigo = codigo;
            this.precio = precio;
            System.out.println("Este es el constructor de Ordenador con el codigo: " + codigo + " y precio de " + precio + " euros.");
        }
        
        // getters y setters
        public void setCodigo(String codigo) {
            this.codigo = codigo;
        }
        public void setPrecio(double precio) {
            this.precio = precio;
        }

        public String getCodigo() {
            return codigo;
        }

        public double getPrecio() {
            return precio;
        }

        // métodos y métodos abstractos
        abstract void rendimiento();
        abstract void slogan();
        
        // @Override
        @Override
        public String toString() {
            return "Este es el ordenador con codigo " + codigo + " y precio de "  + precio + " euros.";
        }
        
        @Override
        public  boolean equals(Object o) {
            Ordenador otroOrdenador = (Ordenador) o;
            boolean iguales;
            if (super.equals(o) && (otroOrdenador.equals(Ordenador) == otroOrdenador.getOrdenador())) {
                iguales = true;
            }
            return;
        }
}
