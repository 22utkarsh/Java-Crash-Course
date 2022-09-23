use student;
select * from student;
update student.student set fName=lower(fname) where true;

create database employee;
use employee;
create table employees(empId varchar(6) primary key,
empName varchar(30) not null, salary varchar(20) , empTax varchar(20) );

select * from employees;

show tables;

describe student;

select * from student;

commit;
update student.student
set student_id=studentId, f_name=fName ,l_name=lName;
alter table student drop column studentId;
alter table student drop column fName;
alter table student drop column lName;

alter table student rename column f_name to fname;
alter table student rename column l_name to lname;


select fname from student where fname like "%sh";
select * from student.student;

select * from marks;

select a.student_id, a.fname, b.testNo, b.m1,b.m2 from student.student a inner join marks b on (a.student_id = b.studentId);

create database emailservice;
use emailservice;
select * from email;


create table userregister(username varchar(20) primary key , password varchar(100) , role varchar(20));

insert into userregister values ('utkarsh22', '$2a$12$bK9qIKPYQQuwNNsjDCfwf.psHz0h2f.YChNgvROZpX8LrNHlQnCSC' , 'student'


