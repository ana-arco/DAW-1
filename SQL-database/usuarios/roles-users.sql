-- Crear el rol
create role if not exists precios;

-- Dar permisos al rol
grant insert, update, delete on tienda.producto to precios;

-- Asignar rol
grant precios to anaarco1, anaarco2;

-- Activar rol para cada usuario
set default role precios to anaarco1, anaarco2;