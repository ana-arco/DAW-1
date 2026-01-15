package trimestre1.unidad6_strings;

public class A01_Invertida {
    public static void main(String[] args) {
        
    }

    /**
     * Devuelve una nueva cadena que es la inversa de la cadena proporcionada.
     *
     * @param texto La cadena de caracteres original que se va a invertir.
     * @return Una nueva cadena con el orden de los caracteres invertido.
     */

    public static String invertirCadena(String texto) {

        // 2. ¡TU TURNO!
        // Escribe aquí la lógica que diseñamos:
        //
        // a. Crea un StringBuilder:
           StringBuilder resultado = new StringBuilder();
        //
        // b. Escribe el bucle 'for' que va desde el final hacia el principio:
        //    (Recuerda: i = texto.length() - 1; i >= 0; i--)
        //
        // c. Dentro del bucle, añade el carácter al StringBuilder:
        //    resultado.append( ... );
        //
        // d. Devuelve el resultado como un String:
           return resultado.toString();
    }
}
