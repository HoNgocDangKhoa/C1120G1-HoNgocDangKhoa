create database my_database;
use  my_database;
create table contacts
(contacts_id int(11) not null auto_increment,
last_name varchar(30) not null,
first_name varchar(25),
birthday date,
constraint contacts_pk primary key(contacts_id));
select*from contacts;
create table suppliers
(supplier_id int (11) not null auto_increment,
supplier_name varchar(50) not null,
supplier_rep varchar (30) not null default 'tbd',
constraint suppliers_pk primary key(supplier_id)
);
drop table mon_hoc,suppliers;
alter table contacts
modify khoa_name varchar (20) not null default "abc"
after contacts_id;
alter table contacts
modify last_name varchar(50) null;
insert into contacts (last_name,birthday,first_name)
values('long','1993-02-21','nhat');
    
select * from contacts;
alter table contacts
rename to people;
