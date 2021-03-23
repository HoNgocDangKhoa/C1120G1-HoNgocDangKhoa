/* Lấy thông tin các học viên, và cho biết các học viên đang theo học lớp nào, khóa nào */

select ma_hv, ten, ngay_sinh, dia_chi, lop.ma_lop, lop.khoa
from hoc_vien
inner join lop on hoc_vien.ma_lop = lop.ma_lop;

/* Lấy thông tin các học viên, 
và cho biết các học viên đang theo học lớp nào, khóa nào 
Bao gồm cả học viên đã đăng kí học nhưng chưa vào lớp*/
select ma_hv, ten, ngay_sinh, dia_chi, lop.ma_lop, lop.khoa
from hoc_vien
left join lop on hoc_vien.ma_lop = lop.ma_lop;

select ma_hv, ten, ngay_sinh, dia_chi, lop.ma_lop, lop.khoa
from hoc_vien
right join lop on hoc_vien.ma_lop = lop.ma_lop;

/* Lay tat ca thong tin cua hoc vien, lop */
select ma_hv, ten, ngay_sinh, dia_chi, lop.ma_lop, lop.khoa
from hoc_vien
left join lop on hoc_vien.ma_lop = lop.ma_lop
UNION
select ma_hv, ten, ngay_sinh, dia_chi, lop.ma_lop, lop.khoa
from hoc_vien
right join lop on hoc_vien.ma_lop = lop.ma_lop;

select ma_hv, ten, ngay_sinh, dia_chi, ma_lop
from hoc_vien
where dia_chi = 'Da Nang';

select ma_hv, ten, ngay_sinh, dia_chi, ma_lop
from hoc_vien
where ngay_sinh >= '2000-01-01';

select ma_lop, count(ma_hv) as so_luong
from hoc_vien
group by ma_lop
having ma_lop is not null and so_luong >= 2;

select ma_hv, ten, ngay_sinh, dia_chi, ma_lop
from hoc_vien
order by dia_chi, ngay_sinh desc;
