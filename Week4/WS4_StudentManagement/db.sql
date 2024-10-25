create database student_week4
go
use student_week4
go

create table student(
id nvarchar(30) not null unique,
firstName nvarchar(30) not null,
lastname nvarchar(30) not null,
email nvarchar(50) unique
);
go
select * from student;

insert into student(id,firstName,lastname,email) values('DE181042''Trang','Pham','thuytrang@gmail.com')
delete from student where id = 5
UPDATE student SET firstName = 'Hi', lastname= 'Ho', email='hiho@gmail.com' WHERE id = '1'
select firstName,lastName,email from student where id='1'