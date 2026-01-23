package examen;


public class Portatil extends Ordenador{
    
    int peso;
    static final String SLOGAN = "Ideal para sus viajes";
    
    public Portatil(int peso, String codigo, double precio){
        super(codigo,precio);
        setPeso(peso);
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public void rendimiento(){
        System.out.println("2000 pulsos");
    }
    
    @Override
    public String toString() {
        return super.toString() + " El peso es: " + getPeso();
    }
    
    @Override
    public boolean equals(Object o) {
        Portatil otroPortatil = (Portatil) o; 
        boolean iguales;
        if ((super.equals(o))&&(this.peso == otroPortatil.peso && this.peso == otroPortatil.peso)){
            iguales = true; 
        } else {
            iguales = false;
        }
        return iguales;
    }
    
    

   
    
    
    
    
    
}
