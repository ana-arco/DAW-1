package unidad7_clases.A03_perro;
/*
Debes crear una clase llamada Perro con las siguientes características:

Atributos:

Nombre (String)
Raza (String)
Edad (int)
Color (String)
Constructores:

Un constructor sin parámetros (por defecto).
Un constructor que reciba solo el nombre y la raza.
Un constructor que reciba todos los atributos: nombre, raza, edad y color.
Métodos:

ladrar(): Método que imprime "El perro está ladrando".
comer(): Método que imprime "El perro está comiendo".
mostrarInfo(): Método que imprime la información del perro
*/

public class perro {
    // Atributos de la clase
    String nombre;
    String raza;
    int edad;
    String color;


    // CONSTRUCTORES
    // CONSTRUCTOR 1 - constructor por defecto (sin parámetros)
    public perro() {
        this("desconocido", "desconocida", 0, "desconocido");
    }

    // CONSTRUCTOR 2 - constructor con nombre y raza
    public perro(String nombre, String raza) {
        this.nombre = nombre;
        this.raza = raza;
    }

    // CONSTRUCTOR 3 - constructor que reciba todos los atributos
    public perro(String nombre, String raza, int edad, String color) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.color = color;
    }

    // MÉTODOS
    // MÉTODO 1 - ladrar
    public void ladrar() {
        System.out.println(nombre + " está ladrando.");
    }

    
    public void comer() {
        System.out.println(nombre + " está comiendo.");
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
    }

}