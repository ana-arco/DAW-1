/*drop database coches;*/
create database if not exists coches;
use coches;

create table marcas (
	cifm int,
    nombre varchar(15),
    ciudad varchar(20)
);

create table coches (
	codcoche int,
    nombre varchar(15),
    modelo varchar(15),
    cifm int
);

create table distribucion (
	cantidad int,
    cifm int,
    codcoche int
);

create table concesionario (
	cifc int,
    nombre varchar(15),
    ciudad varchar(20)
);

create table ventas (
	cifc int,
    dni varchar(9),
    codcoche int,
    color varchar(10)
);

/*constraints*/
alter table marcas add constraint mar_cif_pk primary key (cifm);
alter table coches add constraint coc_cod_pk primary key (codcoche);
alter table coche add constraint coc_cif_fk foreign key (cifm) references marcas(coches);
alter table concesionario add constraint con_cif_pk primary key (cifc);
alter table clientes add constraint cli_dni_pk primary key (dni);
alter table distribucion add constraint dis_cod_pk primary key (cifc, codcoche);
alter table distribucion add constraint dis_cif_fk foreign key (cifc) references concesionario(cifc);
alter table distribucion add constraint dis_cod_fk foreign key (codcoche) references coches(codcoche);
alter table ventas add constraint ventas_pk primary key (cifc, codcoche, dni, color);
alter table ventas add constraint ventas_fk primary key (cifc, codcoche, dni, color);