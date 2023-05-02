create database carrito;
use carrito;

create table productos(
 
  id_producto int not null primary key auto_increment,
  nombre varchar(20) not null,
  precio double not null,
  cantidad int not null
);

insert into productos(nombre, precio, cantidad) values("Lapiz",15,8);
insert into productos(nombre, precio, cantidad) values("Cuaderno",20.50,9);
insert into productos(nombre, precio, cantidad) values("Pegamento",11, 5);
insert into productos(nombre, precio, cantidad) values("Colores",50.50,3);
insert into productos(nombre, precio, cantidad) values("Grapas",10,78);
insert into productos(nombre, precio, cantidad) values("Plumon negro",17,10);
insert into productos(nombre, precio, cantidad) values("Carpeta",11,10);
insert into productos(nombre, precio, cantidad) values("Boligrafo",10,6);
insert into productos(nombre, precio, cantidad) values("Caja clip",30.50,10);
insert into productos(nombre, precio, cantidad) values("Tijeras",40,5);

select * from productos;


