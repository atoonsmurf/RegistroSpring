-- borra la bd si existe
DROP DATABASE IF EXISTS ciberclass;
-- creamos la bd
CREATE DATABASE ciberclass;
-- activamos la bd
USE ciberclass;


create table Carreras(
idcarrera	int not null primary key,
descripcion varchar(30)
);

create table Reserva(
codigo  int ,
nombre varchar(45),
apellido varchar(50),
idcarrera int,
fchregistro date null,
primary key (codigo),
foreign key (idcarrera) references Carreras(idcarrera)
);

-- INSERTS

insert into Carreras values (1, 'Computación e informática');
insert into Carreras values (2, 'Administración de empresas');
insert into Carreras values (3, 'Marketing');
insert into Carreras values (4, 'Diseño de interiores');
insert into Carreras values (5, 'Arquitectura');

insert into Reserva values (10, 'Sebastián','Sandoval',1,'2021-06-01');
insert into Reserva values (20, 'Humberto','Aguilar',2,'2020-03-27');
insert into Reserva values (30, 'Lucas','Torres',3,'2021-06-01');
insert into Reserva values (40, 'Mathias','Flores',4,'2020-03-27');
insert into Reserva values (50, 'José','Atúncar',5,'2021-06-01');

Select*from Carreras;
Select*from Reserva;

/*graficos de matriculas x carrera*/
select c.descripcion as carrera, count(*) as matriculas
from Reserva r join Carreras c on r.idcarrera = c.idcarrera
group by c.descripcion;