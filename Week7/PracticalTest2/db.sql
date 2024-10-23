CREATE DATABASE workshop2_Se1501;
GO
USE workshop2_Se1501;
GO
CREATE TABLE Products (
    id INT IDENTITY(1,1) PRIMARY KEY,
    name NVARCHAR(255) NOT NULL,
    unit NVARCHAR(100) NOT NULL,
    category NVARCHAR(100) NOT NULL,
    price DECIMAL(18, 2) NOT NULL CHECK (price >= 0)
);
CREATE TABLE Categories (
    id INT IDENTITY(1,1) PRIMARY KEY,
    name NVARCHAR(255) NOT NULL,
    description NVARCHAR(100) NOT NULL
);
SELECT * FROM Products
SELECT * FROM Categories

INSERT INTO Products (name,unit,category,price) 
VALUES('Nokia','máy','Nokia - Hãng điện thoại',6);
INSERT INTO Products (name,unit,category,price) 
VALUES('IPPP','máy','Iphone - Hãng điện thoại',6.5);

INSERT INTO Categories(name,description) 
VALUES('Nokia','Hãng điện thoại');

DELETE FROM Products WHERE id = 1;

UPDATE Products SET name = 'Oppo',unit = 'máy', category = 'Oppo - Hãng điện thoại',  price=9 WHERE id = 2;
