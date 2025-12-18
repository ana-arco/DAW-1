package 04_ModificadoresVisibilidad;

public class CuentaCorriente { // Clase pública: visible desde fuera
    
    private double saldo;    // private: no visible para otras clases
    public String nombre;    // public: visible para cualquier clase
    String dni;              // default: visible solo por clases vecinas

    // El constructor DEBE llamarse CuentaCorriente
    public CuentaCorriente(double saldo, String nombre, String dni) {
        this.saldo = saldo;
        this.nombre = nombre;
        this.dni = dni;
    }

    // si quieres poder leer el saldo


    public double setSaldo(double saldo) {
        this.saldo = saldo;
        return this.saldo;
    }

    public double getSaldo() {
        return this.saldo;
    }
}
