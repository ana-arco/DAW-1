-- Consultar privilegios
select * from mysql.user; -- todos los usuarios creados, y permisos sobre todo el servidor.
select * from mysql.db; -- privilegios a una sola base de datos.
select * from mysql.tables_priv; -- consulta los privilegios en una table.
select * from mysql.columns_priv; -- consulta los privilegios en una columna.

show grants; -- desde el usuario que quieras ver los privilegios
select current_role(); -- consultar el rol del usuario actual