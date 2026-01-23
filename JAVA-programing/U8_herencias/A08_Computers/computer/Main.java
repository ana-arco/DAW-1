
package computer;

public class Main {

    public static void main(String[] args) {
        System.out.println(" *** Creación de objetos de tipo 'ordenador' *** ");
        
        Ordenador ordenador1 = new Sobremesa(Torre.ATX, "QPWOEIRUTY", 400);
        
        Sobremesa x = (Sobremesa)ordenador1;
        
        System.out.println(ordenador1);
        
        System.out.println(Portatil.SLOGAN);
        
        Sobremesa f = new Sobremesa(Torre.ATX);
        
        System.out.println(f == ordenador1);
        
        System.out.println(f.equals(ordenador1));
        
    }
    
}
