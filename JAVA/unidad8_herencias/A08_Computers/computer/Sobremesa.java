
package computer;

public class Sobremesa extends Ordenador {
    // ATRIBUTOS
    private Torre tipoTorre;
    
    // MÉTODOS
        // 1. Constructores
        // 2. Getter y setters
        // 3. Métoods de la clase y métodos abstractos
        // 4. @Override toString() y equals()
    
    // Constructor por defecto con todos los datos 
    public Sobremesa(String codigo, double precio, double peso, Torre tipoTorre) {
        super(codigo, precio);
        setTipoTorre(tipoTorre);
    }
    
    // getters y setters 
    public Torre getTipoTorre() {
        return tipoTorre;
    }
    
    public void setTipoTorre(Torre tipoTorre) {
        this.tipoTorre = tipoTorre;
    }
    
    // Método abstracto
    @Override
    public void rendimiento() {
        System.out.println("4000 pulsos");
    }
    
    @Override
    public void slogan() {
        System.out.println("Es el que más pesa, pero el que menos cuesta.");
    }
    
    
    
    
}
