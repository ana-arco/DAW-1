package U7_clases.A17_Lista;
/* ENUNCIADO
Las listas son estructuras dinámicas de datos donde se pueden insertar o eliminar elementos de un determinado tipo sin limitación de espacio.

Implementar la clase Lista correspondiente a una lista de números de la clase Integer. Los números se guardarán en una tabla que se redimensionará con las inserciones y eliminaciones, aumentando o disminuyendo la capacidad de la lista según el caso.

Entre los métodos de la clase, se incluirán las siguientes tareas:

Un constructor que inicialice la tabla con un tamaño 0.
Obtener el número de elementos insertados en la lista.
Insertar un número al final de la lista.
Insertar un número al principio de la lista.
Insertar un número en un lugar de la lista cuyo índice, que es el de la tabla, se pasa como parámetro.
Añadir al final de la lista los elementos de otra lista que se pasa como parámetro.
Eliminar un elemento cuyo índice en la lista se pasa como parámetro.
Obtener el elemento cuyo índice se pasa como parámetro.
Buscar un número en la lista, devolviendo el índice del primer lugar donde se encuentre. Si no está, devolverá - 1.
Mostrar los elementos de la lista por consola.

*/
public class Main {

   public static void main(String[] args) {
      Lista l1 = new Lista();
      Lista l2 = new Lista();

      l1.insertarFinal(4);
      l1.insertarFinal(5);
      l1.insertarFinal(6);
      l1.mostrar();

      l1.insertarPrincipio(3);
      l1.insertarPrincipio(2);
      l1.insertarPrincipio(1);
      l1.mostrar();

      l1.insertar(2, 99);
      l1.mostrar();

      l1.eliminar(2);
      l1.mostrar();

      System.out.println(l1.buscar(4));

      l2.insertarFinal(10);
      l2.insertarFinal(20);
      l2.insertarFinal(30);
      l2.insertarFinal(40);
      l2.insertarFinal(50);
      l2.mostrar();

      l1.insertarFinal(l2);
      l1.mostrar();
   }
}
