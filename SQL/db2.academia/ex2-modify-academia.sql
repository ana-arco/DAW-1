/*  EJERCICIO 2: Vamos a modificar las tablas que hemos creado en el apartado anterior:*/
/*Necesito cambiar la columna nombre de la tabla profesores para llamarla nombre_profesor*/
alter table profesor rename column nombre to nombre_profesor;
ALTER TABLE profesor RENAME COLUMN apellido_1_profesor to apellido1_profesor;
ALTER TABLE profesor RENAME COLUMN apellido_2_profesor to apellido2_profesor;

/*1. Crea un nuevo atributo llamado Edad de tipo numérico a la tabla ALUMNOS.*/
alter table alumnoedadedad add edad numeric (3); -- ejemplo 1
alter table alumno add edad decimal(3,0); -- ejemplo 2

/*Añade las siguientes restricciones:*/
/*2. Modifica el campo que has creado anteriormente para que la edad del alumno o alumna esté comprendida entre 14 y 65 años.*/
alter table alumno add constraint alu_eda_ck check (edad between 14 and 65);

/* 3. Modifica el campo Número de horas del CURSO de manera que solo pueda haber cursos con 30, 40 o 60 horas.*/
ALTER TABLE curso add constraint cur_num_hor_CK check(duracion_hora in (30, 40, 60));

/*4. No podemos añadir un curso si su número máximo de alumnos es inferior a 15.*/
ALTER TABLE curso ADD CONSTRAINT cur_num_ck CHECK (numero_alumno >= 15);

/*5. Elimina la restricción que controla los valores que puede tomar el atributo Sexo.*/
ALTER TABLE alumno MODIFY sexo enum('M', 'F');

/*6. Elimina la columna Dirección de la tabla PROFESORES.*/
ALTER TABLE profesor DROP COLUMN direccion;

/*7. Cambia la clave primaria de la tabla PROFESORES por Nombre y Apellidos.*/
alter table curso drop constraint cur_nif_fk;
alter table profesor drop primary key;
alter table profesor add constraint pro_naa_pk primary key (nombre_profesor, apellido1_profesor, apellido2_profesor);

/*8. Renombra la tabla PROFESORES por TUTORES.*/
rename table profesor to tutor;

/*9. Elimina la tabla ALUMNOS.*/
drop table alumno;

/*10. Crea un usuario con tu nombre y clave BD02 y dale todos los privilegios sobre la tabla CURSOS.*/


/*11. Ahora al usuario anterior quítale permisos para modificar o actualizar la tabla CURSOS.*/

