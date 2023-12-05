select s.st_no,s.st_name,m.major_name,s.st_score from student s join major m on s.major_no=m.major_no where s.st_no is'20100001';
select s.st_no,s.st_name,m.major_name,s.st_score from student s join major m on s.major_no=m.major_no where s.st_name like'%김%';

select * from student;
update student set st_name = '김동현' , st_score = 4.2 , major_no  = 6 where st_no like '20112222';