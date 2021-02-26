create database bai_th_3;
use bai_th_3;
create table customers
(id int auto_increment primary key,
name varchar(255),
address varchar(255),
email varchar(255)
);
create table orders
(id int auto_increment,
staff varchar(255),
primary key(id),
cutomer_id int,
foreign key (cutomer_id)references customers(id)
);
