create database coches;
use coches;

create table marcas (
	cifm int(11),
    nombre varchar(15),
    ciudad varchar(20)
);

create table coches (
	codcoche int(11),
    nombre varchar(15),
    modelo varchar(15)
);

create table distribucion (
	cantidad int(11)
);

create table concesionario (
	cifc int(11),
    nombre varchar(15),
    ciudad varchar(20)
);

create table ventas (
	cifc int(11),
    dni varchar(9),
    codcoche int(11),
    color varchar(10)
);