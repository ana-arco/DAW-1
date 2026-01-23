-- Documento para creación de base de datos y tablas by Ana Arco Izquierdo
create database residuo;
use residuo;

drop database residuo;
drop table if exists EmpresaProductora;
drop table if exists Residuo;
drop table if exists Traslado;


create table empresaProductora (
	nif_empresa varchar(15) ,
    nombre_empresa varchar(30) not null,
    ciudad_empresa varchar(50) not null,
    actividad varchar(255),
    od_empresa varchar(255)
);
ALTER TABLE empresaProductora add constraint emp_nif_pk primary key (nif_empresa);

create table residuo (
	nif_empresa varchar(15),
    cod_residuo varchar(15),
    toxicidad varchar(15),
    cantidad_residuo decimal(10,2),
    od_residuo varchar(255)
);
alter table residuo add constraint res_cod_pk primary key (cod_residuo);
alter table residuo add constraint res_nif_fk foreign key (nif_empresa) references empresaProductora (nif_empresa);
alter table residuo drop constraint res_nif_fk;

create table destino (
	cod_destino varchar(15),
    nombre_destino varchar(20),
    ciudad_destino varchar(20),
    od_destino varchar(255)    
);
alter table destino add constraint des_cod_pk primary key (cod_destino);


create table traslado (
	nif_empresa varchar(15),
    cod_residuo varchar(15),
    fecha_envio date,
    cod_destino varchar(15),
    envase enum('T', 'F'),
    fecha_llegada date,
    tratamiento varchar(255),
    cantidad_traslado decimal(10,2),
    od_traslado varchar(255)
    
);
alter table traslado add constraint tra_nif_cod_pk primary key (nif_empresa, cod_residuo);