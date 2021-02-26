create database my_database;
use my_database;
create table mon_hoc(
	ma_mh int,
    ten_mh varchar(255),
    so_tc int
);
insert into mon_hoc(ma_mh,ten_mh,so_tc)
values 
(2,'Toan',3),
(3,'Ly',3),
(4,'Sinh',3);
select * from mon_hoc;
insert into mon_hoc(ma_mh,ten_mh,so_tc)
values 
(2,'Van',3),
(3,'Su',3),
(4,'Dia',3);
update mon_hoc
set so_tc = 888
where so_tc = 3;
select * from mon_hoc;
alter table mon_hoc
drop ma_mh;
SET SQL_SAFE_UPDATES = 0;
update mon_hoc
set ten_mh='the duc'
where ten_mh='toan';
 


