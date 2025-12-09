alter table alumno add edad numeric (3); -- ejemplo 1
alter table alumno add edad decimal(3,0); -- ejemplo 2
alter table alumno add constraint alu_eda_ck check (edad between 14 and 65);

alter table curso add constraint cur_num_hor_CK check(duracion_hora in (30, 40, 60));

/*
EJERCICIO 2:
Vamos a modificar las tablas que hemos creado en el apartado anterior:
1. Crea un nuevo atributo llamado Edad de tipo numérico a la tabla ALUMNOS.

Añade las siguientes restricciones:
2. Modifica el campo que has creado anteriormente para que la edad del alumno o alumna esté comprendida entre 14 y 65 años.
3. Modifica el campo Número de horas del CURSO de manera que solo pueda haber cursos con 30, 40 o 60 horas.
6. No podemos añadir un curso si su número máximo de alumnos es inferior a 15.
7. Elimina la restricción que controla los valores que puede tomar el atributo Sexo.
8. Elimina la columna Dirección de la tabla PROFESORES.
9. Cambia la clave primaria de la tabla PROFESORES por Nombre y Apellidos.
10. Renombra la tabla PROFESORES por TUTORES.
11. Elimina la tabla ALUMNOS.
12. Crea un usuario con tu nombre y clave BD02 y dale todos los privilegios sobre la tabla CURSOS.
13. Ahora al usuario anterior quítale permisos para modificar o actualizar la tabla CURSOS.



*/