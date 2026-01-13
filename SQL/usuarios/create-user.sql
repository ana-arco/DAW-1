-- Crear usuarios
create user 'anaarco1' identified by 'anaarco1';
create user 'anaarco2' identified by 'anaarco2';
create user anonimo@localhost;
create user alumno@'192.168.0.%' identified by 'alumno';

-- Dar privilegios
grant all on tienda.* to 'anaarco2'@'%' with grant option;
grant all on *.* to 'anaarco2'@'%' with grant option; -- mejor no hacer.
grant update, select on tienda.Producto to 'anaarco1';

-- Quitar privilegios
revoke insert on tienda.producto from 'anaarco1';
