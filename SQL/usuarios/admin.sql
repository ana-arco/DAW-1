-- ejercicio 1
create database AGENDA;
use AGENDA;

create table AMIGOS (
	id int auto_increment primary key,
    nombre varchar(50),
    telefono numeric
);
alter table amigos drop primary key;

insert into AMIGOS value (4, 'ana', 958112233);
insert into amigos value (3, 'ana1', 958223344);
insert into amigos value (2, 'ana2', 958334455);

-- ejercicio 2
create user 'ana_ae1'@'localhost' identified by 'ana_ae1';
grant select, insert on agenda.* to ana_ae1;

-- ejercicio 3
create user 'ana_ae3' identified by 'ana_ae3';
grant create, insert on agenda.* to ana_ae3;
alter user 'ana_ae3' 
	with max_queries_per_hour 250
	max_user_connections 20;
revoke create on agenda.* from 'ana_ae2';

-- ejercicio 4
	-- 1. crear rol
create role 'mantenimiento';
	-- 2. dar permisos
		-- darle permisos al rol modificar (update), crear, borrar (delete (datos) drop (campos), y ver (select)
grant update, create, drop on agenda.* to mantenimiento;
grant drop on agenda.* to mantenimiento;
		-- ver sólo nombre de la tabla amigos de la base de datos agenda
grant select(nombre) on agenda.amigos to mantenimiento;
	-- 3. asignar rol a los dos usuarios creados anteriormente 1 y 3 por ejemplo
grant mantenimiento to ana_ae1, ana_ae3;
    -- 4. activar rol
set default role mantenimiento to ana_ae1, ana_ae3;
