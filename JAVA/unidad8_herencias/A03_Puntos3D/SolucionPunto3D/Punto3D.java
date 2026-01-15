package A03_Puntos3D.SolucionPunto3D;

public class Punto3D extends Punto {

    Integer z;

    public Punto3D(Integer z, Integer x, Integer y) {
        super(x, y);
        setZ(z);
    }

    public void setZ(Integer z){
        this.z = z;
    }

    public Integer getZ(){
        return z;
    }

    double distancia(Punto3D otro) {
        return Math.sqrt((x - otro.x) * (x - otro.x) + 
                (y - otro.y) * (y - otro.y) + (z - otro.z) * (z - otro.z));
    }

    @Override
    public String toString() {
        return super.toString() + ", z=" + z;
    }

    
}
