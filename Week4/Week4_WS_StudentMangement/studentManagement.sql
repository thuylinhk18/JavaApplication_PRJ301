create database student
go
use student;
go

create table Students(
 id INT NOT NULL identity(1,1),     
    firstName VARCHAR(50) NOT NULL,  
    lastName VARCHAR(50) NOT NULL,      
    email VARCHAR(100) NOT NULL,        
    PRIMARY KEY (id),                   
);
insert into Students (firstName,lastName,email) values('Linh','Thuy','linhpttde181042@fpt.edu.vn');
insert into Students (firstName,lastName,email) values('A','B','abcde181042@fpt.edu.vn');

select * from Students
drop table Students;