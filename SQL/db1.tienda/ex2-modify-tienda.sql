/* ----------------------------------------------------------------- tabla STOCK*/

/*una columna tipo fecha llamada FechaaUltimaEntrada y que tome por defecto el valor de la fecha actual. */
ALTER TABLE stock ADD ultFecha DATE;
ALTER TABLE stock MODIFY ultFecha DATE DEFAULT (CURRENT_DATE);

/*una columna llamada 'beneficio' contendrá el porcentaje de beneficio. El valor que almacena debe ser 1, 2, 3, 4 o 5.*/
ALTER TABLE stock ADD beneficio numeric(1) CONSTRAINT sto_ben_chk check (beneficio >=1 and beneficio <= 5);

/* ---------------------------------------------------------------- tabla PRODUCTO*/
ALTER TABLE producto producto DROP COLUMN descripcion;

/* ---------------------------------------------------------------- tabla FAMILIA*/

/* ---------------------------------------------------------------- tabla TIENDA*/

/*
A)  Modificar las tablas creadas en el ejercicio anterior siguiendo las indicaciones. Los ejercicios se incluirán en un script llamado ModificaTienda.sql. Cada uno de ellos, como en el ejercicio anterior, irá precedido de un comentario con el enunciado.
    
    Añadir a la tabla STOCK
        Una columna de tipo fecha llamada FechaUltimaEntrada que por defecto tome el valor de la fecha actual.
        Una columna llamada Beneficio que contendrá el tipo de porcentaje de beneficio que esa tienda aplica en ese producto. Se debe controlar que el valor que almacene sea 1,2, 3, 4 o 5.
    
    En la tabla PRODUCTO
        Eliminar de la tabla producto la columna Descripción.
        Añadir una columna llamada perecedero que únicamente acepte los valores: S o N.
        Modificar el tamaño de la columna Denoproducto a 50.
    
    En la tabla FAMILIA
        Añadir una columna llamada IVA, que represente el porcentaje de IVA y únicamente pueda contener los valores 21,10,ó 4.
    
    En la tabla tienda
        La empresa desea restringir el número de tiendas con las que trabaja, de forma que no pueda haber más de una tienda en una misma zona (la zona se identifica por el código postal). Definir mediante DDL las restricciones necesarias para que se cumpla en el campo correspondiente..
B) Renombra la tabla STOCK por PRODXTIENDAS.
C) Elimina la tabla FAMILIA y su contenido si lo tuviera.
D) Crea un usuario llamado C##INVITADO siguiendo los pasos de la unidad 1 y dale todos los privilegios sobre la tabla PRODUCTO.
E) Retira los permisos de modificar la estructura de la tabla y borrar contenido de la tabla PRODUCTO al usuario anterior.

*/