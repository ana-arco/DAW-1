
package ampliacion825;

public class Punto {
    protected Integer x;
    protected Integer y;

    public Punto(Integer x, Integer y) {
        setX(x);
        setY(y);
    }
    
    public void setX(Integer x){
        this.x = x;
    }

    public Integer getX(){
        return x;
    }

    public void setY(Integer y){
        this.y = y;
    }

    public Integer getY(){
        return y;
    }

    public double distancia(Punto otro){
        return Math.sqrt((x-otro.x)*(x-otro.x)+(y-otro.y)*(y-otro.y));
    }

    @Override
    public String toString() {
        return "x=" + x + ", y=" + y ;
    }
     
}
