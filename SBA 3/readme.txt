create table students(
studId int primary key,
studName varchar(20),
sem int):


insert into students values(1,'rohit',1);
insert into students values(2,'sachin',1);
insert into students values(3,'hardik',1);
insert into students values(4,'bumrah',1);
insert into students values(5,'krunal',1);
insert into students values(6,'virat',2);
insert into students values(7,'Abd',2);
insert into students values(8,'chahal',2);
insert into students values(9,'umesh',2);
insert into students values(10,'finch',2);
insert into students values(11,'dhoni',3);
insert into students values(12,'raina',3);
insert into students values(13,'jadeja',3);
insert into students values(14,'bravo',3);
insert into students values(15,'rayudu',3);
insert into students values(16,'rahane',4);
insert into students values(17,'smith',4);
insert into students values(18,'butler',4);
insert into students values(19,'Benstocks',4);
insert into students values(20,'robin',4);
insert into students values(21,'warner',5);
insert into students values(22,'kane',5);
insert into students values(23,'manish',5);
insert into students values(24,'hooda',5);
insert into students values(25,'jhony',5);



create table attendance(
studId int,
studName varchar(20),
sem int,
AttendanceDate date,
AttendanceStatus varchar(6));




