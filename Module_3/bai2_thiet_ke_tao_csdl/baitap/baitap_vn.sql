create database baitap_vn;
use baitap_vn;

create table phong_ban
(ma_pb int primary key,
ten_pb varchar(50) not null
);
create table cong_trinh
(ma_ct int primary key,
ten_ct varchar(50) not null,
dia_diem varchar(200) not null,
ngay_cap date,
ngay_kc date,
ngay_ht date
);
create table nhan_vien
(ma_nv int primary key,
ho_ten varchar(50) not null,
ngay_sinh date not null,
phai varchar(50) not null,
dia_chi varchar(200) not null,
ma_pb int not null,
foreign key(ma_pb) references phong_ban(ma_pb)
);
create table bao_hiem
(ma_bh int primary key,
ngay_cap date not null,
thoi_han varchar(50) not null,
ma_nv int not null,
foreign key(ma_nv) references nhan_vien(ma_nv)
);
create table phan_cong
(ma_ct int not null,
ma_nv int not null,
so_nc int ,
primary key(ma_ct,ma_nv),
foreign key(ma_ct)references cong_trinh(ma_ct),
foreign key(ma_nv)references nhan_vien(ma_nv)
);
