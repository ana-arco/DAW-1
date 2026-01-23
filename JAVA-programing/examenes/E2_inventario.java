package trimestre1.examenes;




public class E2_inventario {
    /* Se declara:
        - Constante capacidad máxima.
        - Los 3 arrays static con el tamaño constante.
        Se inicia la variable estática 'cantidadActual' inicializada en 0.
    */


        /* MOSTRAR MENÚ -> 
            1. responsabilidad:imprime texto con las opciones; 
            2. entrada: no hay entrada de datos; 
            3. salida: sólo hay salida de datos (void)
        */

        public static void mostrarManu() {

        }

        /* MOSTRAR INVENTARIO -> 
            1. responsabilidad: recorre los arrays e imprime las zapatillas que existen; 
            2. entrada: necesita acceso a los 3 arrays (marcas, códigos, precios), mostrar cantidadActual de productos;
            3. salida: sólo muestra datos (void)
        */

        public static void mostrarInventario() {

        }

        /* BUSCAR PRODUCTO ->
            1. responsabilidad: buscar si un código o una marca ya existe (mejor buscar por marca);
            2. entrada: necesita los arrays 'cantidadActual' y 'valorBuscado' (Ej:"Nike")
            3. salida: ¿Qué nos sirve más?
                ¿true/false? (Nos dice si está, pero no dónde).
                ¿Un int con la posición (índice)? (Si devuelve 3, está en la posición 3. Si devuelve -1, no existe).
                Recomendación: Que devuelva el índice (int).
        */

        /* AGREGAR PRODUCTO 
            Responsabilidad: Pedir datos al usuario, validar que no exista (usando la función de buscar) y guardar en los arrays.
            Entrada: Los 3 arrays y la cantidadActual.
            Salida: Al terminar de agregar, la cantidad de zapatillas cambia. ¿Qué debería devolver esta función para actualizar el contador en el main?
        */

}