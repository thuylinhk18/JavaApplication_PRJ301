create database miniTest;
use miniTest;
CREATE TABLE Users (
    id INT  NOT NULL,
    fullName VARCHAR(100) NOT NULL,
    PRIMARY KEY (id)
);
Select * from  Users;
INSERT INTO Users (id,fullName) VALUES (1,'Nguyen Van A');
INSERT INTO Users (id,fullName) VALUES (2,'Tran Thi B');