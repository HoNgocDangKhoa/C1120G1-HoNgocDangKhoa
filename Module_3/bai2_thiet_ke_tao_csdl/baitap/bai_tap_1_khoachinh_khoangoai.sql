drop database if exists bai_tap_1;
create database bai_tap_1;
use bai_tap_1;
create table customer
(customer_id int primary key,
fullname varchar(255) not null,
address varchar(255) not null,
email varchar(255) not null,
phone int(10) not null
);
create table accounts
( account_number int primary key,
 account_type varchar (255)not null,
 account_date int not null,
 balance int not null,
 customer_id int,
 foreign key (customer_id)references customer(customer_id)
);
create table transactions
(tran_number int primary key ,
account1_number int not null,
tran_date int not null,
amounts int not null,
descriptions varchar(200),
account_number int,
foreign key(account_number)references accounts(account_number)
);
