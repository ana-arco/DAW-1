-- Ejercicios de modificación de tablas by Ana Arco Izquierdo
/* 2.1. Añade una nueva columna llamada 'res_volcanico' en la tabla 'residuo' que por defecto tome el calor 'ceniza' */
alter table residuo add column res_volcanico varchar(50) default 'ceniza';

/* 2.2. Añade un índice que facilite búsquedas frecuentes de las empresas productoras por nombre de 
las empresas productoras por nombre de la empresa y actividad */
alter table empresaProductora add index indece (nombre_empresa, actividad);

/* 2.3. Los únicos centros de reciclaje de residuos de La Palma son 'Las Moreras (Mazo) y 'Punto Limpio (El Paso). */
alter table destino modify column nombre_destino enum('Las Moreras (Mazo)', 'Punto Limpio (El Paso)');

/* 2.4. Modifica la cantidad de traslado de manera que sea entero de 6 cifras (de las cuales 2 son la parte decimal),
 sin signo y que no admita nulos.*/
 alter table traslado modify column cantidad_traslado decimal(6,2) unsigned not null;
 
 /* 2.5. Cambia la clave primaria de la tabla destino por nombre_destino  y ciudad_destino.*/ 
 


