use student;
select * from student;
insert into student values(5,'pramod','kulkarni');
select * from student;
set autocommit = false;
insert into student values(6,'Charu','jagdale');
select * from student;
commit;

update student.student
set fName=upper(fName)
where studentid=5;
commit;

select * from marks;

select a.studentid,a.fName,b.m1,b.m2
from student.student a inner join student.marks b
on a.studentid = b.studentid;

select a.studentid,a.fName,b.m1,b.m2
from student.student a left outer join student.marks b
on a.studentid = b.studentid;

select a.studentid,a.fName,b.m1,b.m2
from student.student a right outer join student.marks b
on a.studentid = b.studentid;

select a.studentid,a.fName,b.m1,b.m2
from student.student a left outer join student.marks b
on a.studentid = b.studentid
where b.m1 is null;

describe marks;
describe city;
describe student;

select a.studentid,a.fName, (b.m1+b.m2) as total,c.cityName
from student.student a inner join student.marks b on a.studentid = b.studentid 
inner join connect d on a.studentid = d.studentid 
inner join city c on d.cityid = c.cityid;


