create database academia;
use academia;

create table profesor(
	nombre_profesor varchar(255),
    apellido1_profesor varchar(255),
    apellido2_profesor varchar(255),
    nif_profesor varchar(255),
    direccion varchar(255),
    titulacion varchar(255),
    salario decimal(10,2) not null,
    constraint pro_nif_pk primary key(nif_profesor),
    constraint pro_nom_ap1_ap2_uni unique(nombre_profesor, apellido_1_profesor, apellido_2_profesor)
);

create table curso (
	nombre_curso varchar(255),
    codigo_curso int unsigned not null auto_increment,
    nif_curso varchar(255),
    numero_alumno tinyint unsigned,
    fecha_inicio date,
    fecha_final date,
    duracion_hora int unsigned not null,
    constraint cur_cod_pk primary key(codigo_curso),
    constraint cur_nif_fk foreign key(nif_curso) references profesor(nif_profesor),
    constraint cur_nom_uni unique(nombre_curso),
    constraint cur_fec_che check(fecha_final >= fecha_inicio)
); 

create table alumno(
	nombre varchar(255),
    apellido_1_alumno varchar(255),
    apellido_2_alumno varchar(255),
    nif_alumno varchar(9),
    direccion varchar(255),
    sexo enum('H', 'M'),
    fecha_nacimiento date,
    codigo_curso int unsigned,
    constraint alu_nif_pk primary key(nif_alumno),
    constraint alu_cod_fk foreign key(codigo_curso) references curso (codigo_curso)    
);



/*
Tabla ALUMNOS recogerá información sobre el alumnado: Nombre, Apellido1, Apellido2, NIF, Dirección, Sexo, Fecha de Nacimiento y Curso en el que se matricula.

Tabla CURSOS con los siguientes campos: Nombre del Curso, Código del Curso que lo identifica, NIF del Profesor, Máximo número de alumnos/as recomendado, Fecha de inicio, Fecha final, Número de horas totales del curso. Los alumnos/as no pueden compaginar varios cursos a la vez.

Tabla PROFESORES con los siguientes campos: Nombre, Apellido1, Apellido2, NIF, Dirección, Titulación, Salario.

Debes elegir los nombres más adecuados para los atributos teniendo en cuenta las reglas.
Debes elegir los tipos de datos adecuados en función del contenido de los campos.
Debes establecer las siguientes restricciones:

El alumno o alumna debe matricularse en un curso antes de que se le pueda dar de alta.
En un curso, el número de horas es un dato que no puede faltar, es obligatorio que contenga información.
En la tabla PROFESORES, el atributo Salario no puede estar vacío.
Dos cursos no pueden llamarse de la misma forma.
Dos profesores no pueden llamarse igual.
Podremos diferenciar las tuplas de la tabla CURSOS por el Código del Curso.
Podremos diferenciar las tuplas de la tabla PROFESORES y ALUMNOS por el NIF.
La fecha de comienzo del curso nunca puede ser menor que la fecha de finalización.
El dominio del atributo sexo es M (mujer) y H (hombre).
Se debe cumplir la regla de integridad referencial
*/




