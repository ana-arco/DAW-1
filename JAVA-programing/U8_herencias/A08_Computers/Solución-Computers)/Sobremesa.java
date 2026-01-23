
package examen;


public class Sobremesa extends Ordenador {
    
    static final String SLOGAN = "Mas pesa más cuesta";
    
    private Torre tipoTorre;
    
    
      public Sobremesa(Torre tipoTorre, String codigo, double precio){
        super(codigo,precio);
        setTipoTorre(tipoTorre);
    }
    
    //Metodos

    public void setTipoTorre(Torre tipoTorre) {
        this.tipoTorre = tipoTorre;
    }

    public Torre getTipoTorre() {
        return tipoTorre;
    }
      
    
    @Override
    public void rendimiento(){
        System.out.println("4000 pulsos");
    }
    
    
     @Override
    public String toString() {
        return super.toString() + " El tipo de torre es: " + getTipoTorre();
    }
    
    
    @Override
    public boolean equals(Object o) {
        Sobremesa otroSobremesa = (Sobremesa) o; 
        boolean iguales = false;
        if (super.equals(o) && (getTipoTorre() == otroSobremesa.getTipoTorre())){
            iguales = true; 
        } 
        return iguales;
    }
    
    
}
