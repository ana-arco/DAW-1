package unidad8_herencias.A07_Instrumento;
/* Crear la clase abstracta Instrumento, que almacena en una tabla las notas musicales de una melodía (dentro de una misma octava). 
El método add() añade nuevas notas musicales. La clase también dispone del método abstracto interpretar() que, 
en cada sub. clase que herede de Instrumento, mostrará por consola las notas musicales según las interprete. 
-- Utilizar enumerados para definir las notas musicales. */

abstract class instrumento {
    protected char nota; //'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'
}
