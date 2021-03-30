insert into usuarios(username,password,enable,nombre,apellido,email) values('vicmoss','$2a$10$Z9dxpnoNLYMyUeGPVDR53uxqa.vEjNcWPv..DHTOXBBQAcD963TlS',true,'victor','mosso','victor.mosso@gmail.com')
insert into usuarios(username,password,enable,nombre,apellido,email) values('andres','$2a$10$Xa1TcoBqto/S/7bC9NJ2FeOlkEZ9EzT5NLsGDkow8EjUGyABNagKe',true,'andy','guzman','andy.guzman@gmail.com')

insert into roles(id, nombre) values (1,'ROLE_ADMIN')
insert into roles(id, nombre) values (2,'ROLE_USER')

insert into users_to_rols(usuario_id,rol_id) values(1,1)
insert into users_to_rols(usuario_id,rol_id) values(2,1)
insert into users_to_rols(usuario_id,rol_id) values(2,2)