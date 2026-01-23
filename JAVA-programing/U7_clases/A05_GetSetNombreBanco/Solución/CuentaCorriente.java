

package unidad7_clases.A05_GetSetNombreBanco.Solución;

public class CuentaCorriente {
    
    //Atributos de la clase
    
    String dni; 
    public String nombre; 
    private double saldo;
    static String banco = "BBVA"; 
    
    //Métodos de la clase
   
    CuentaCorriente(String dni, String nombre){
        this(dni, "", 0.0);
    }
  
    CuentaCorriente(String dni, String nombre ,double saldo){
        this.dni = dni;
        this.nombre = nombre;
        this.saldo = 0.0;
    }
    
    public void setSaldo(double saldo){
        if (saldo > 0) this.saldo = saldo;
        else System.out.println("No es un saldo válIdo");
   
    }
    
    public double getSaldo(){
        return this.saldo;
    }
    
    
    static void setBanco(String nuevoNombre) {
        banco = nuevoNombre;
    }
   
    static String getBanco() {
      return banco;
   }
    
    
    void mostrarInformacion(){ 
        System.out.println("Nombre: " + nombre);
        System.out.println("Dni: " + dni);
        System.out.println("Saldo: " + saldo + " euros");
        System.out.println("Banco: "+ banco);
    }
    
    void ingreso(double cant) { 
      saldo += cant;
    }
    
    void sacarDinero(double cant) {
        if (saldo >= cant) { 
            saldo -= cant;     
            System.out.println("Dinero retirado");
        } 
        else { 
            System.out.println("No hay dinero suficiente");
        }
    }
    
}

