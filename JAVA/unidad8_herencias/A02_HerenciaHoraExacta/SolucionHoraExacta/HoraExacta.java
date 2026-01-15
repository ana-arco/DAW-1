package A02_HerenciaHoraExacta.SolucionHoraExacta;

public class HoraExacta extends Hora { 
    
    protected int segundos; 

    public HoraExacta(int hora, int minutos, int segundos) {
        super(hora,minutos);
        setSegundos(segundos);     
    }

    public void setSegundos(int segundos) {
        if (0 <= segundos && segundos < 60) { 
            this.segundos = segundos; 
        }
        else this.segundos = 0;
    }

    @Override 
    public void inc() {
        segundos++;
        if (segundos > 59) { 
            segundos = 0; 
            super.inc(); 
        }
    }

    @Override 
    public String toString() {
        String result = super.toString(); 
        result += ":" + segundos; 
        return result;
    }
}
