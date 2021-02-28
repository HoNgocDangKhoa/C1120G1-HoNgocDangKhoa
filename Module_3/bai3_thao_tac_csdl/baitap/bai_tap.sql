create database thu_vien;
use thu_vien;
create table loai_sach
(ma_ls int primary key,
ten_ls varchar (50) not null
);
create table sinh_vien
(ma_sv varchar(15) primary key,
ten_sv varchar(50) not null,
dia_chi varchar(500) not null,
email varchar(50) not null,
anh varchar(50) not null
);
create table phieu_muon 
(so_phieu int primary key ,
ten_ls varchar(50) not null,
ten_sv varchar(50) not null,
ngay_muon date not null,
ngay_tra date not null,
so_ngay_qh int,
trang_thai_sach  varchar(50),
ma_sv varchar(50),
foreign key (ma_sv) references sinh_vien(ma_sv)
);


create table sach
(ma_sach int primary key ,
ten_sach varchar(30) not null,
nha_xb varchar(30)not null,
tac_gia varchar(30)not null,
nam_xb date not null,
so_lan_xb int not null ,
gia int not null,
anh varchar(30) not null,
ma_ls int,
foreign key (ma_ls) references loai_sach(ma_ls),
ma_phieu int,
foreign key (ma_phieu) references phieu_muon(so_phieu)
);




