create database student;
use student;
show tables;

create table city(cityid varchar(6) primary key,
cityName varchar(30) not null );
show tables;
describe city;
insert into city values('c1','Pune'),('c2','Mumbai'),('c3','Delhi'),('c4','Chennai'),('c5','Banglore');
select * from city;

create table student(studentId int primary key, fName varchar (30)not null , lName varchar(20) not null);
insert into student values(1,'utkarsh','pathak'),(2,'ram','babu'),(3,'Mahesh','Babu'),(4,'Chinna','Swami');
select * from student;

create table marks(studentId int references student.student (studentId), testNo int ,m1 int check(m1 between 0 and 25) ,m2 int check(m2 between 0 and 25));
insert into marks values(1,1,24,23),(1,2,23,20),(2,1,22,20),(3,1,16,20),(4,1,23,20);
select * from marks;

create table connect(studentId int references student.student (studentId), cityid varchar(6) references city(cityid));
insert into connect values(1,'c1'),(2,'c2'),(3,'c3'),(4,'c4');
select * from connect;

