package A02_HerenciaHoraExacta.SolucionHoraExacta;

public class Hora {

    protected int hora, minutos; 

    public Hora(){
        setHora(0);
        setMinutos(0);
    }

    public Hora(int hora, int minutos) { 
        setHora(hora);
        setMinutos(minutos);
    }

    public void inc() { 
        minutos++;
        if (minutos > 59) { 
            minutos = 0; 
            hora++; 
            if (hora > 23) { 
                hora = 0; 
            }
        }
    }

    public void setMinutos(int minutos) {
        if (0 <= minutos && minutos < 60) { 
            this.minutos = minutos;
        }
        else this.minutos = 0;
    }

    public void setHora(int hora) {
        if (0 <= hora && hora < 24) { 
            this.hora = hora;
        }
        else this.hora = 0;
    }

    @Override 
    public String toString() {
        String result;
        result = hora + ":" + minutos;
        return result;
    }
}

