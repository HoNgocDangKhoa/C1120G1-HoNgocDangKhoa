create database baitap;
use baitap;
create table sinhvien
(id int  ,
ten varchar(50) not null,
tuoi int not null,
khoa_hoc varchar(50) not null,
so_tien int not null
);
insert into sinhvien (id,ten,tuoi,khoa_hoc,so_tien)
value
(1,'Sang',20,'CNTT',400000),
(2,'Long',21,'CNTT',320000),
(3,'Nghia',23,'KTCN',500000),
(4,'Thanh',19,'KTDN',300000), 
(5,'Huong',24,'CK',200000),
(5,'Huong',22,'CK',500000);
select ten,sum(so_tien) as so_tien from sinhvien 
where ten='Huong';
select distinct (ten) from sinh_vien;