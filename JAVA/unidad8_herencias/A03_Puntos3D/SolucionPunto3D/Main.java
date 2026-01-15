package ampliacion825;

public class Ampliacion825 {

    public static void main(String[] args) {
        Punto3D p1 = new Punto3D(1, 2, 3);
        Punto3D p2 = new Punto3D(2, 3, 4);
        System.out.println("p1: " + p1);
        System.out.println("p2: " + p2);
        System.out.println("distancia entre p1 y p2: " + p1.distancia(p2));
        Punto aux = new Punto(40, 40);
        System.out.println("Punto normal: " + aux);
    }

}
