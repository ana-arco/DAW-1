-- Crea un usuario administrador llamada ADMIN y con ese usuario tienes que hacer el resto del examen y no usar más el usuario root.

create user ADMIN identified by 'admin';
grant all on *.* to ADMIN with grant option; 

-- *.* es todo el servidor mysql.db es sobre todas las bases de datos, 
-- mysql es dentro de la base de datos mysql que coja la tabla db.