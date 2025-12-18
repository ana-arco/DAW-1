// Clase Perro
public class Perro {
    // Atributos de la clase
    private String nombre;
    private String raza;
    private int edad;
    private String color;

    // Constructor sin parámetros (por defecto)
    public Perro() {
        this("Desconocido", "Desconocida"); // Llamada al constructor con nombre y raza
        this.edad = 0;
        this.color = "Desconocido";
    }

    // Constructor con nombre y raza
    public Perro(String nombre, String raza) {
        this.nombre = nombre;
        this.raza = raza;
    }

    // Constructor con todos los parámetros (nombre, raza, edad, color)
    public Perro(String nombre, String raza, int edad, String color) {
        this(nombre, raza); // Llamada al constructor con nombre y raza
        this.edad = edad;
        this.color = color;
    }

    // Método para hacer que el perro ladre
    public void ladrar() {
        System.out.println("El perro está ladrando.");
    }

    // Método para hacer que el perro coma
    public void comer() {
        System.out.println("El perro está comiendo.");
    }

    // Método para mostrar la información del perro
    public void mostrarInfo() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Raza: " + this.raza);
        System.out.println("Edad: " + this.edad);
        System.out.println("Color: " + this.color);
    }

    // Método principal para probar la clase
    public static void main(String[] args) {
        // Creando un objeto Perro usando el constructor por defecto
        Perro perro1 = new Perro();
        perro1.mostrarInfo();
        perro1.ladrar();
        perro1.comer();

        System.out.println();

        // Creando un objeto Perro usando el constructor con nombre y raza
        Perro perro2 = new Perro("Max", "Labrador");
        perro2.mostrarInfo();
        perro2.ladrar();
        perro2.comer();

        System.out.println();

        // Creando un objeto Perro usando el constructor con todos los parámetros
        Perro perro3 = new Perro("Bella", "Bulldog", 3, "Blanco");
        perro3.mostrarInfo();
        perro3.ladrar();
        perro3.comer();
    }
}
