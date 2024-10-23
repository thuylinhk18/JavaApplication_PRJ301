create database cookie_adminDB;
use cookie_adminDB;

create table Admin(
userName VARCHAR(20) primary key,
password VARCHAR(30) NOT NULL,
role int, 
)
go
insert into Admin values('sa','123',1);
insert into Admin values('admin','123',1);
go
select userName,password from Admin 
where userName = ? and password = ?