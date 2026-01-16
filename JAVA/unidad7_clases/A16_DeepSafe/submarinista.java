package unidad7_clases.A16_DeepSafe;

public class submarinista {
    
    // atributos
    public String nombre;
    private int oxigeno;
    private double profundidad;
    
    // getter
    public String getNombre() {
        return nombre;
    }
    public int getOxigeno() {
        return oxigeno;
    }
    public double getProfundidad() {
        return profundidad;
    }
    

    // setter
    public void setOxigeno(int oxigeno) {
        this.oxigeno = oxigeno;
        if (oxigeno > 100 ) {
            oxigeno = 100;
        }
        if (oxigeno < 0) {
            oxigeno = 0;
        } else if (oxigeno < -20) {
            System.out.println("¡ALERTA! Nivel de oxigeno crítico.");
        }
    }
    public void setProfundidad(double profundidad) {
        this.profundidad = profundidad;
        
        if (profundidad < 0 ) {
            profundidad = 0.0;
        }
        if ( profundidad > 40 ) {
            System.out.println("¡AVISO! Se ha alcanzado el límite de buceo recreativo.");
        }
    }

    // método especial
    public return double sumergirse(double metros) {
        return metros;
    }




    
}
