
package examen;

public abstract class Ordenador {
    
    
    //Atributos ==========================================
    
    private String codigo;
    private double precio; 
    
    //Métodos =============================================
    
    // Constructor
    public Ordenador(String codigo, double precio){
        setCodigo(codigo);
        setPrecio(precio);
    }
    
    // Getter y Setters
    public void setCodigo(String codigo){
        this.codigo = codigo;
    }
    
    public String getCodigo(){
        return this.codigo;
    }
    
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }
    
    //Métodos abstractos
    
    abstract void rendimiento();
    
    
    //Metodos de la clase Object
    
     @Override 
    public String toString() {
        return "Su codigo es: " + codigo + " y su precio es: " + precio;
    }
    
    
    @Override
    public boolean equals(Object o) {
        Ordenador otroOrdenador = (Ordenador) o; 
        boolean iguales;
        if (this.codigo.equals(otroOrdenador.codigo) && this.precio == otroOrdenador.precio){
            iguales = true; 
        } else {
            iguales = false;
        }
        return iguales;
    }
    
    

}
