package unidad8_herencias.A08_Computers;

public abstract class Ordenador {
    
    // ATRIBUTOS

    protected String codigo;
    protected double precio;

    // MÉTODOS
        // constructores
        // constructor por defecto
        public Ordenador() {
        }
        
        // constructor con todos los parámetros
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
        
        // @Override
        @Override
        public String toString() {
            return "Este es el ordenador con codigo " + codigo + " y precio de "  + precio + " euros.";
        }
}
