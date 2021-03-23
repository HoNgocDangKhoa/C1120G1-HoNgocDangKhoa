drop database if exists CaseStudy;
create database CaseStudy;
use CaseStudy;
create table ViTri
(ID_vitri int auto_increment primary key,
Ten_vitri varchar(45) not null
);
create table TrinhDo
(ID_trinhdo int auto_increment primary key,
Trinhdo varchar(45) not null
);
create table BoPhan
(ID_bophan int auto_increment primary key,
Ten_bophan varchar(45) not null
);
create table NhanVien
(ID_nhanvien int auto_increment primary key,
Hoten_NV varchar(45) not null,
ID_vitri int ,
foreign key(ID_vitri) references ViTri(ID_vitri),
ID_trinhdo int,
foreign key(ID_trinhdo) references TrinhDo(ID_trinhdo),
ID_bophan int,
foreign key(ID_bophan) references BoPhan(ID_bophan),
Ngay_Sinh date not null,
So_CMND varchar(45) not null,
Luong varchar(45) not null,
SDT varchar(45) not null,
Email varchar(45) ,
DiaChi varchar(45) 
);
create table LoaiKhach
(ID_loaikhach int auto_increment primary key,
Ten_loaikhach varchar(45) not null
);
create table KhachHang
(ID_khachhang int auto_increment primary key,
ID_loaikhach int,
foreign key (ID_loaikhach) references LoaiKhach(ID_loaikhach),
Ho_Ten varchar(45) not null,
Ngay_Sinh date not null,
So_CMND varchar(45) not null,
SDT varchar(45) not null,
Email varchar(45) ,
DiaChi varchar(45) not null
);
create table KieuThue
(ID_kieuthue int auto_increment primary key,
Ten_kieuthue varchar(45) not null,
Gia int not null
);
create table LoaiDichVu
(ID_loaidichvu int auto_increment primary key,
Ten_loaidichvu varchar(45) not null
);

create table DichVu
(ID_dichvu int auto_increment primary key,
Ten_DichVu varchar(45) not null,
DienTich int not null,
SoTang int not null,
SoNguoiToiDa varchar(45) not null,
ChiPhiThue varchar(45) not null,
ID_kieuthue int,
foreign key(ID_kieuthue) references KieuThue(ID_kieuthue),
ID_loaidichvu int,
foreign key (ID_loaidichvu) references LoaiDichVu(ID_loaidichvu),
TrangThai varchar(45) not null
);
create table HopDong
(ID_hopdong int auto_increment primary key,
ID_nhanvien int,
foreign key(ID_nhanvien) references NhanVien(ID_nhanvien),
ID_khachhang int,
foreign key(ID_khachhang) references KhachHang(ID_khachhang),
ID_dichvu int,
foreign key (ID_dichvu) references DichVu(ID_dichvu),
NgayLamHopDong date not null,
NgayKetThuc date ,
TienDatCoc int not null,
TongTien int not null
);
create table DichVuDiKem
(ID_dichvudikem int auto_increment primary key,
Ten_DichvuDiKem varchar(45),
Gia int not null,
DonVi int not null,
TrangThaiKhaDung varchar(45)
);
create table HopDongChiTiet
(ID_hopdongchitiet int auto_increment primary key,
ID_hopdong int,
foreign key(ID_hopdong)references HopDong (ID_hopdong),
ID_dichvudikem int,
foreign key(ID_dichvudikem) references DichVuDiKem(ID_dichvudikem) ,
SoLuong int not null
);
insert into ViTri(Ten_vitri)
values
("Le tan"),
("Phuc vu"),
("Chuyen vien"),
("Giam sat"),
("Quan ly"),
("Giam doc");
insert into TrinhDo(Trinhdo)
values
("Trung cap"),
("Cao dang"),
("Dai hoc"),
("Sau dai hoc");
insert into BoPhan(Ten_bophan)
values
("Sale-Marketing"),
("Hanh chinh"),
("Phuc vu"),
("Quan ly");
insert into NhanVien(Hoten_NV,ID_vitri,ID_trinhdo,ID_bophan,Ngay_Sinh,So_CMND,Luong,SDT,Email,DiaChi)
values
("Hoang Le Quang",1,1,3,"2004-01-01","111111111",350,"0901234567",null,null),
("Hoang Nu Khanh Quynh",2,2,3,"2002-01-01","222222222",370,"0902345678",null,null),
("Trinh Thi Khanh Ngoc",3,3,1,"1990-01-01","333333333",400,"0903456789",null,null),
("Nguyen Van A",4,2,2,"1989-01-01","444444444",500,"0904567890",null,null),
("Kim Ly",5,3,2,"1995-01-01","555555555",700,"0905678901",null,null),
("Tran Van Chanh",6,4,4,"1980-01-01","666666666",1300,"0906789012",null,null);
insert into LoaiKhach(Ten_loaikhach)
values
("Diamond"),
("Platinum"),
("Gold"),
("Silver"),
("Member");
insert into KhachHang(ID_loaikhach,Ho_Ten,Ngay_Sinh,So_CMND,SDT,Email,DiaChi)
values
(1,"NVA","2004-01-01","111111111","0901234567",null,"Da Nang"),
(1,"NVB","2019-10-01","222222222","0902345678",null,"Quang Ngai"),
(1,"NVC","1990-01-01","333333333","0903456789",null,"Hue"),
(5,"NVD","1989-01-01","444444444","0904567890",null,"Quang Nam"),
(3,"NVE","2019-11-01","555555555","0905678901",null,"Da Nang"),
(4,"NVF","1980-01-01","666666666","0906789012",null,"Vinh");
insert into KieuThue(Ten_kieuthue,Gia)
values
("Nam",80),
("Thang",90),
("Ngay",100),
("Gio",110);
insert into LoaiDichVu(Ten_loaidichvu)
values
("Villa"),
("House"),
("Room");
insert into DichVu(Ten_DichVu,DienTich,SoTang,SoNguoiToiDa,ChiPhiThue,ID_kieuthue,ID_loaidichvu,TrangThai)
values
("Villa 1",100,3,10,500,3,1,"Available"),
("House 1",60,2,6,300,2,2,"Available"),
("Room 1",40,2,3,250,1,3,"Not available"),
("Villa 2",80,2,8,400,2,1,"Available"),
("Room 2",30,1,2,200,4,3,"Not available");
insert into HopDong(ID_nhanvien,ID_khachhang,ID_dichvu,NgayLamHopDong,NgayKetThuc,TienDatCoc,TongTien)
values
(1,2,2,"2018-12-12","2019-03-12",100,10000000),
(1,1,5,"2019-11-12","2019-08-12",200,500000),
(2,5,4,"2020-01-12","2020-10-12",300,400000000),
(5,1,5,"2021-01-12",null,100,8000000),
(4,3,3,"2019-12-01","2021-05-01",400,15000000);
insert into DichVuDiKem(Ten_DichvuDiKem,Gia,DonVi,TrangThaiKhaDung)
values
("Massage",10,1,"not available"),
("Karaoke",15,1,"available"),
("Thuc an",20,1,"not available"),
("Nuoc uong",15,1,"not available"),
("Thue xe",50,1,"available");
insert into HopDongChiTiet(ID_hopdong,ID_dichvudikem,SoLuong)
values
(1,1,3),
(2,3,3),  
(4,1,1),
(2,4,1);
-- 2.	Hiển thị thông tin của tất cả nhân viên có trong hệ thống có tên bắt đầu là một trong các ký tự “H”, 
-- “T” hoặc “K” và có tối đa 15 ký tự.
select * from NhanVien
where (Hoten_NV like 'h%' or Hoten_NV like"k%" or Hoten_NV like "t%") and length(Hoten_NV)<15;

-- 3.	Hiển thị thông tin của tất cả khách hàng có độ tuổi từ 18 đến 50 tuổi và có địa chỉ ở “Đà Nẵng” hoặc “Quảng Trị”.-- 
select ID_loaikhach,Ho_Ten,Ngay_Sinh,So_CMND,SDT,Email,DiaChi, timestampdiff(Year,Ngay_Sinh,now())as dotuoi 
from KhachHang
having (dotuoi>18 and dotuoi<50) and (DiaChi='Da Nang'or DiaChi='Quang Tri');

select ID_loaikhach,Ho_Ten,Ngay_Sinh,So_CMND,SDT,Email,DiaChi, timestampdiff(Year,Ngay_Sinh,now())as dotuoi 
from KhachHang
having (dotuoi>18 and dotuoi<50) and (DiaChi in ('Da Nang', 'Quang Tri'));
-- 4.	Đếm xem tương ứng với mỗi khách hàng đã từng đặt phòng bao nhiêu lần. Kết quả hiển thị được sắp xếp tăng dần theo số lần đặt phòng của khách hàng. 
-- Chỉ đếm những khách hàng nào có Tên loại khách hàng là “Diamond”.
select  count(HopDong.ID_khachhang) as solan, hopdong.ID_khachhang,khachhang.ID_loaikhach from HopDong
inner join KhachHang
on KhachHang.ID_khachhang=HopDong.ID_khachhang
group by HopDong.ID_khachhang
having KhachHang.ID_loaikhach=1
order by solan;

-- 5.	Hiển thị IDKhachHang, HoTen, TenLoaiKhach, IDHopDong, TenDichVu, NgayLamHopDong, NgayKetThuc, TongTien 
-- (Với TongTien được tính theo công thức như sau: ChiPhiThue + SoLuong*Gia, với SoLuong và Giá là từ bảng DichVuDiKem)
--  cho tất cả các Khách hàng đã từng đặt phỏng.
--  (Những Khách hàng nào chưa từng đặt phòng cũng phải hiển thị ra).

select KhachHang.ID_khachhang,KhachHang.ho_ten,LoaiKhach.Ten_loaikhach,HopDong.ID_hopdong,DichVu.Ten_DichVu,
HopDong.NgaylamHopDong,HopDong.NgayKetThuc, sum( DichVu.ChiPhiThue + HopDongchiTiet.SoLuong*DichVuDiKem.Gia) as TongTien
from KhachHang
left join LoaiKhach on KhachHang.ID_loaikhach=LoaiKhach.ID_loaikhach
left join HopDong on KhachHang.ID_khachhang=HopDong.ID_khachhang
left join DichVu on HopDong.ID_dichvu=DichVu.ID_dichvu
left join HopDongchiTiet on HopDong.ID_hopdong=HopDongchiTiet.ID_hopdong
left join DichVuDiKem on HopDongchiTiet.ID_dichvudikem=DichVuDiKem.ID_dichvudikem
group by HopDong.ID_hopdong;

-- 6.	Hiển thị IDDichVu, TenDichVu, DienTich, ChiPhiThue, TenLoaiDichVu 
-- của tất cả các loại Dịch vụ chưa từng được Khách hàng thực hiện đặt từ quý 1 của năm 2019 (Quý 1 là tháng 1, 2, 3).

select ID_dichvu, Ten_DichVu, DienTich, ChiPhiThue, LoaiDichVu.Ten_loaidichvu 
from DichVu
 inner join LoaiDichVu 
 group by dichvu.ID_dichvu
 having DichVu.id_dichvu  in
 ( select HopDong.ID_dichvu from HopDong where HopDong.NgayLamHopDong  between '2019-01-01' and '2019-03-31')
 ;

-- 7.	Hiển thị thông tin IDDichVu, TenDichVu, DienTich, SoNguoiToiDa, ChiPhiThue, TenLoaiDichVu
--  của tất cả các loại dịch vụ đã từng được Khách hàng đặt phòng trong năm 2018 
-- nhưng chưa từng được Khách hàng đặt phòng  trong năm 2019.


select ID_dichvu, Ten_DichVu, DienTich, SoNguoiToiDa,ChiPhiThue,LoaiDichVu.Ten_loaidichvu
from DichVu
 inner join LoaiDichVu 
  group by dichvu.ID_dichvu;
   

-- 8.	Hiển thị thông tin HoTenKhachHang có trong hệ thống, với yêu cầu HoThenKhachHang không trùng nhau.
-- Học viên sử dụng theo 3 cách khác nhau để thực hiện yêu cầu trên.-- 
-- Cách 1:
select distinct Ho_Ten from KhachHang;
-- Cách 2:
select Ho_Ten from KhachHang
group by Ho_Ten;
-- Cách 3:
select Ho_Ten from KhachHang
union
select Ho_Ten from KhachHang;

-- 9.	Thực hiện thống kê doanh thu theo tháng, nghĩa là tương ứng với mỗi tháng trong năm 2019 thì sẽ có bao nhiêu khách hàng thực hiện đặt phòng.
select month(NgayLamHopDong)  as thang, count(ID_khachhang) as SoLuong from HopDong
where year(NgayLamHopDong) = 2019
group by thang
order by thang desc;


-- 10.	Hiển thị thông tin tương ứng với từng Hợp đồng thì đã sử dụng bao nhiêu Dịch vụ đi kèm.
--  Kết quả hiển thị bao gồm IDHopDong, NgayLamHopDong, NgayKetthuc, TienDatCoc, SoLuongDichVuDiKem (được tính dựa trên việc count các IDHopDongChiTiet).
select HopDong.ID_hopdong, NgayLamHopDong, NgayKetthuc, TienDatCoc , count(HopDongChiTiet.soluong) as SoLuongDichVuDiKem
from HopDong
inner join HopDongChiTiet on HopDong.ID_hopdong = HopDongCHiTiet.ID_hopdong
group by HopDong.ID_hopdong;



-- 11.	Hiển thị thông tin các Dịch vụ đi kèm đã được sử dụng bởi những Khách hàng có TenLoaiKhachHang là “Diamond” 
-- và có địa chỉ là “Vinh” hoặc “Quảng Ngãi”.
select Ten_DichvuDiKem,Gia,DonVi,TrangThaiKhaDung from DichVuDiKem
inner join HopdongChiTiet on DichVuDiKem.ID_dichvudikem = HopdongChiTiet.ID_dichvudikem
inner join HopDong on HopdongChiTiet.ID_hopdong=HopDong.ID_hopdong
inner join KhachHang on HopDong.ID_khachhang=KhachHang.ID_khachhang
inner join LoaiKhach on KhachHang.ID_loaikhach=LoaiKhach.ID_loaikhach
	where LoaiKhach.Ten_loaikhach='Diamond' and (KhachHang.DiaChi='Vinh'or KhachHang.DiaChi='Quang Ngai');
    
--     12.	Hiển thị thông tin IDHopDong, TenNhanVien, TenKhachHang, SoDienThoaiKhachHang, TenDichVu, SoLuongDichVuDikem (được tính dựa trên tổng Hợp đồng chi tiết), 
--     TienDatCoc của tất cả các dịch vụ đã từng được khách hàng đặt vào 3 tháng cuối năm 2019 nhưng chưa từng được khách hàng đặt vào 6 tháng đầu năm 2019.
select 	HopDong.ID_hopdong,
		NhanVien.Hoten_NV,
		KhachHang.Ho_Ten,
		KhachHang.SDT,
		DichVu.Ten_Dichvu,
		sum(HopDongChitiet.SoLuong) as SoLuongDichVuDikem ,
        HopDong.TienDatCoc
 from HopDong
 inner join NhanVien on HopDong.ID_nhanvien=NhanVien.ID_nhanvien
 inner join KhachHang on HopDong.ID_khachhang = KhachHang.ID_khachhang
 inner join DichVu on HopDong.ID_dichvu = DichVu.ID_dichvu
 inner join HopDongChiTiet on Hopdong.ID_hopdong = HopDongChiTiet.ID_hopdong
 where HopDong.ID_dichvu in 
		(select ID_dichvu from HopDong where month(NgayLamHopDong) in ('10','11','12') and year(NgayLamHopDong) = '2019')
    and HopDong.ID_dichvu not in 
		(select ID_dichvu from HopDong where month(NgayLamHopDong) in ('1','2','3','4','5','6') and year(NgayLamHopDong) = '2019')
group by HopDong.ID_dichvu;

 
   --  13.	Hiển thị thông tin các Dịch vụ đi kèm được sử dụng nhiều nhất bởi các Khách hàng đã đặt phòng. 
--     (Lưu ý là có thể có nhiều dịch vụ có số lần sử dụng nhiều như nhau).
select      DichVuDiKem.ID_dichvudikem,
			DichVuDiKem.Ten_DichvuDiKem,
			DichVuDiKem.Gia,
			DichVuDiKem.DonVi,
			DichVuDiKem.TrangThaiKhaDung from DichVuDiKem;
--  inner join HopDongChiTiet on DichVuDiKem.ID_dichvudikem=HopDongChiTiet.ID_dichvudikem
--   inner join HopDong on HopDongChiTiet.ID_hopdong=HopDong.ID_hopdong
--   inner join Khachhang on HopDong.ID_khachhang = KhachHang.ID_khachhang;


-- 14.	Hiển thị thông tin tất cả các Dịch vụ đi kèm chỉ mới được sử dụng một lần duy nhất.
--  Thông tin hiển thị bao gồm IDHopDong, TenLoaiDichVu, TenDichVuDiKem, SoLanSuDung.

select  HopDong.ID_hopdong,
		LoaiDichVu.Ten_loaidichvu,
		DichVuDiKem.Ten_dichvudikem,
		HopDongChiTiet.SoLuong 
from HopDong
inner join HopDongChiTiet on HopDong.ID_hopdong= HopDongChiTiet.ID_hopdong
inner join DichVuDiKem on HopDongChiTiet.ID_dichvudikem = DichVuDiKem.ID_dichvudikem
inner join DichVu on HopDong.ID_dichvu = DichVu.ID_dichvu
inner join LoaiDichVu on HopDong.ID_dichvu= DichVu.ID_dichvu
where HopDongChiTiet.SoLuong = 1;

--  15.	Hiển thi thông tin của tất cả nhân viên bao gồm IDNhanVien, HoTen, TrinhDo, TenBoPhan, SoDienThoai, DiaChi
--  mới chỉ lập được tối đa 3 hợp đồng từ năm 2018 đến 2019.
select NhanVien.ID_nhanvien, NhanVien.hoten_nv, TrinhDo.trinhdo, BoPhan.Ten_BoPhan, NhanVien.SDT, NhanVien.DiaChi  from NhanVien
inner join TrinhDo on NhanVien.ID_trinhdo = TrinhDo.ID_trinhdo
inner join BoPhan on NhanVien.ID_bophan= BoPhan.ID_bophan
inner join HopDong on NhanVien.ID_nhanvien = HopDong.ID_nhanvien
where NhanVien.ID_nhanvien in (select HopDong.ID_nhanvien  where year(NgayLamHopDong) in (2018, 2019))
group by NhanVien.ID_nhanvien
having count(NhanVien.ID_nhanvien) <3;


-- 16.	Xóa những Nhân viên chưa từng lập được hợp đồng nào từ năm 2017 đến năm 2019.


-- SET SQL_SAFE_UPDATES = 0;
-- delete from NhanVien
-- where NhanVien.ID_nhanvien not  in (select HopDong.ID_nhanvien from HopDong where  year(NgayLamHopDong) in (2017,2018, 2019));

















-- 17.	Cập nhật thông tin những khách hàng có TenLoaiKhachHang từ  Platinium lên Diamond, 
-- chỉ cập nhật những khách hàng đã từng đặt phòng với tổng Tiền thanh toán trong năm 2019 là lớn hơn 10.000.000 VNĐ.
-- create view loaikhach1
-- as
-- select * from KhachHang;
-- UPDATE loaikhach1
-- set loaikhach1.Id_loaikhach= 1

-- where loaikhach1.Id_loaikhach =2 and loaikhach.ID_khachhang in(select HopDong.ID_khachhang where sum(HopDong.TongTien)>10000000 );
-- select * from loaikhach1;