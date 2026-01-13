-- Consultar privilegios
select * from mysql.user; -- todos los usuarios creados, y permisos sobre todo el servidor.
select * from mysql.db; -- privilegios a una sola base de datos.
select * from mysql.tables_priv; -- consulta los privilegios en una table.
select * from mysql.comulns_priv; -- consulta los privilegios en una columna.