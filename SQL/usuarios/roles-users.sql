-- Crear el rol
create role if not exists conultar;

-- Dar permisos al rol
grant permisos to consultar;

-- Asignar rol
grant consultar to anaarco1;

-- Activar rol para cada usuario
set default role consultar to anaarco1;