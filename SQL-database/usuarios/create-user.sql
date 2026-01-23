-- Crear usuarios
create user 'anaarco1' identified by 'anaarco1';
create user 'anaarco2' identified by 'anaarco2';
create user anonimo@localhost;
create user alumno@'192.168.0.%' identified by 'alumno';
create user 'anaarco3' identified by 'anaarco3';

-- Restricciones de usuarios (siempre desde el create)
create user 'anaarco4' identified by 'anaarco4'
	with max_queries_per_hour 20
    max_updates_per_hour 10
    max_connections_per_hour 5
    max_user_connections 2;
drop user anaarco4;

-- Cambiar contraseña de un usuario
alter user anaarco4 identified by 'user4';
alter user anaarco3 identified by 'user3';

-- Dar privilegios
grant all on tienda.* to 'anaarco2'@'%' with grant option;
grant all on *.* to 'anaarco2'@'%' with grant option; -- mejor no hacer.
grant update, select on tienda.Producto to 'anaarco1';
grant all on tienda.* to 'anaarco3'@'%' with grant option;
grant all on tienda.tienda to anaarco4;

-- Quitar privilegios
revoke insert on tienda.producto from 'anaarco1';
revoke insert on tienda.* from 'anaarco3';
