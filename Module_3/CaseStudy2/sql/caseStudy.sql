drop database if exists casestudy2;
create database casestudy2;
use  casestudy2;
CREATE TABLE `position` (
    position_id INT AUTO_INCREMENT PRIMARY KEY,
    position_name VARCHAR(45)
);

CREATE TABLE education_degree (
    education_degree_id INT AUTO_INCREMENT PRIMARY KEY,
    education_degree_name VARCHAR(45)
);

CREATE TABLE division (
    division_id INT AUTO_INCREMENT PRIMARY KEY,
    division_name VARCHAR(45)
);
CREATE TABLE `role` (
    role_id INT AUTO_INCREMENT PRIMARY KEY,
    role_name VARCHAR(45)
);
CREATE TABLE `user` (
    username VARCHAR(255) PRIMARY KEY,
    userpassword VARCHAR(255)
);
CREATE TABLE user_role (
    role_id INT,
    FOREIGN KEY (role_id)
        REFERENCES `role` (role_id)
        ON UPDATE CASCADE ON DELETE CASCADE,
    username VARCHAR(255),
    FOREIGN KEY (username)
        REFERENCES `user` (username)
        ON UPDATE CASCADE ON DELETE CASCADE
);

CREATE TABLE attach_service (
    attach_service_id INT AUTO_INCREMENT PRIMARY KEY,
    attach_service_name VARCHAR(45) NOT NULL,
    attach_service_cost DOUBLE NOT NULL,
    attach_service_unit INT NOT NULL,
    attach_service_status VARCHAR(45)
);

CREATE TABLE customer_type (
    customer_type_id INT PRIMARY KEY AUTO_INCREMENT,
    customer_type_name VARCHAR(45)
);

CREATE TABLE customer (
    customer_id VARCHAR(45) PRIMARY KEY,
    customer_type_id INT,
    FOREIGN KEY (customer_type_id)
        REFERENCES customer_type (customer_type_id)
        ON UPDATE CASCADE ON DELETE CASCADE,
    customer_name VARCHAR(255) NOT NULL,
    customer_birthday DATE NOT NULL,
    customer_gender BIT(1) NOT NULL,
    customer_id_card VARCHAR(45) NOT NULL,
    customer_phone VARCHAR(45) NOT NULL,
    customer_email VARCHAR(45),
    customer_address VARCHAR(45)
);
CREATE TABLE employee (
    employee_id INT PRIMARY KEY AUTO_INCREMENT,
    employee_name VARCHAR(45) NOT NULL,
    employee_birthday DATE NOT NULL,
    employee_id_card VARCHAR(45) NOT NULL,
    employee_salary DOUBLE NOT NULL,
    employee_phone VARCHAR(45) NOT NULL,
    employee_email VARCHAR(45),
    employee_address VARCHAR(45),
    position_id INT NOT NULL,
    FOREIGN KEY (position_id)
        REFERENCES `position` (position_id)
        ON UPDATE CASCADE ON DELETE CASCADE,
    education_degree_id INT NOT NULL,
    FOREIGN KEY (education_degree_id)
        REFERENCES education_degree (education_degree_id)
        ON UPDATE CASCADE ON DELETE CASCADE,
    division_id INT NOT NULL,
    FOREIGN KEY (division_id)
        REFERENCES division (division_id)
        ON UPDATE CASCADE ON DELETE CASCADE,
    username VARCHAR(255),
    FOREIGN KEY (username)
        REFERENCES `user` (username)
        ON UPDATE CASCADE ON DELETE CASCADE
);
CREATE TABLE service_type (
    service_type_id INT AUTO_INCREMENT PRIMARY KEY,
    service_type_name VARCHAR(45)
);
CREATE TABLE rent_type (
    rent_type_id INT AUTO_INCREMENT PRIMARY KEY,
    rent_type_name VARCHAR(45),
    rent_type_cost DOUBLE
);
CREATE TABLE service (
    service_id VARCHAR(45) PRIMARY KEY,
    service_name VARCHAR(45) NOT NULL,
    service_area INT,
    service_cost DOUBLE NOT NULL,
    service_max_people INT,
    rent_type_id INT NOT NULL,
    FOREIGN KEY (rent_type_id)
        REFERENCES rent_type (rent_type_id)
        ON UPDATE CASCADE ON DELETE CASCADE,
    service_type_id INT NOT NULL,
    FOREIGN KEY (service_type_id)
        REFERENCES service_type (service_type_id)
        ON UPDATE CASCADE ON DELETE CASCADE,
    standar_room VARCHAR(45),
    description_other_convenience VARCHAR(45),
    pool_area DOUBLE,
    number_of_floors INT
);
CREATE TABLE contract (
    contract_id INT PRIMARY KEY AUTO_INCREMENT,
    contract_start_day DATETIME NOT NULL,
    contract_end_day DATETIME NOT NULL,
    contract_deposit DOUBLE NOT NULL,
    contract_total_money DOUBLE NOT NULL,
    employee_id INT NOT NULL,
    FOREIGN KEY (employee_id)
        REFERENCES employee (employee_id)
        ON UPDATE CASCADE ON DELETE CASCADE,
    customer_id VARCHAR(45) NOT NULL,
    FOREIGN KEY (customer_id)
        REFERENCES customer (customer_id)
        ON UPDATE CASCADE ON DELETE CASCADE,
    service_id VARCHAR(45) NOT NULL,
    FOREIGN KEY (service_id)
        REFERENCES service (service_id)
        ON UPDATE CASCADE ON DELETE CASCADE
);
CREATE TABLE contract_detail (
    contract_detail_id INT AUTO_INCREMENT PRIMARY KEY,
    contract_id INT,
    FOREIGN KEY (contract_id)
        REFERENCES contract (contract_id)
        ON UPDATE CASCADE ON DELETE CASCADE,
    attach_service_id INT,
    FOREIGN KEY (attach_service_id)
        REFERENCES attach_service (attach_service_id)
        ON UPDATE CASCADE ON DELETE CASCADE,
    quantity INT NOT NULL
);
insert into `position`(position_name)
values  ('Giam Doc'), ('Quan Ly'), ('Giam Sat'), ('Chuyen Vien'), ('Phuc Vu'), ('Le Tan');
insert into education_degree(education_degree_name)
values('Trung Cap'), ('Cao Dang'), ('Dai Hoc'), ('Sau Dai Hoc');
insert into division(division_name)
values('Sale_Marketing'), ('Hanh Chinh'), ('Phuc Vu'), ('Quan Ly');
insert into customer_type(customer_type_name)
values('Diamond'), ('Platinium'), ('Gold'), ('Silver'), ('Members');
insert into rent_type(rent_type_name, rent_type_cost)
values('Year', 140000), ('Month', 15000), ('Day', 500), ('Hour', 100);
insert into service_type(service_type_name)
values('Villa'), ('House'), ('Room');
insert into attach_service(attach_service_name, attach_service_cost, attach_service_unit, attach_service_status)
values 	('Massage', 35, 1, 'Available'),
		('Karaoke', 10, 1, 'Available'),
        ('Food', 25, 1, 'Available'),
        ('Drink', 10, 1, 'Available'),
        ('RentalCar', 40, 1, 'Available');
insert into `role`(role_name)
values 	('Admin'),
		('Giam Doc'),
		('Quan Ly'),
        ('Giam Sat'),
        ('Nhan Vien'),
        ('Nguoi Dung');
insert into `user`(username, userpassword)
values 	('admin', 'admin'),
		('giamdoc', 'giamdoc'),
        ('quanly', 'quanly'),
        ('giamsat', 'giamsat'),
        ('nhanvien', 'nhanvien'),
        ('nguoidung', 'nguoidung');
insert into user_role(role_id, username)
values	(1, 'admin'),
		(2, 'giamdoc'),
        (3, 'quanly'),
        (4, 'giamsat'),
        (5, 'nhanvien'),
        (6, 'nguoidung');
insert into employee(employee_name, position_id, education_degree_id,division_id, username, employee_birthday, 
employee_id_card, employee_salary, employee_phone, employee_email, employee_address)
values 	('Trần Quốc Hoàng', 1, 2, 4, 'giamdoc','1995/12/12', '123123123', '300000', '0909123111', 'hoangtq@gmail.com', 'Quảng Nam'),
		('Ngọc Thuần', 2, 2, 4, 'quanly','2000/10/05', '123123444', 400000, '0909123121', 'thuanng@gmail.com', 'TP HCM'),
		('Lê Quang',  3, 3, 4, 'giamsat','1998/02/11', '123123555', 900000, '0909123345', 'quangle@gmail.com', 'Huế'),
		('Trần Hoàng Sang',  4, 2, 2, 'nhanvien','1995/04/04', '123123777', '300000', '0909123333', 'sangth@gmail.com', 'Quảng Bình'),
		('Bùi Khoa',  2, 3, 2, 'admin','1999/04/25', '123123999', '250000', '0909123222', 'khoa@gmail.com', 'Quảng Trị'),
        ('Lệnh Hồ Xung ', 5, 3, 3, 'nhanvien','1996/12/12', '123123127', '600000', '0909123111', 'xungtq@gmail.com', 'Quảng Nam'),
		('Doãn Chí Bình', 6, 1, 3, 'nguoidung','1992/10/05', '123123446', 100000, '0909123121', 'binh@gmail.com', 'TP HCM');
insert into customer(customer_id,customer_type_id, customer_name, customer_birthday, customer_gender, customer_id_card, customer_phone,customer_email, customer_address)
values	('KH-3',3, 'Rosicky','1995/04/05', 1, '345345345', 0908111222, 'tomas@gmail.com','Czech'),
		('KH-33',3, 'Arteta', '2000/03/05', 1, '111222333', 0908111333, 'mikel@gmail.com', 'Spain'),
		('KH-32',2, 'Wenger', '2001/11/11', 1, '343444555', 0908111444, 'wenger@gmail.com', 'France'),
		('KH-31',1, 'Gemma Atkinson', '2001/04/05', 0, '111111111', 0908111545, 'gemmath@gmail.com', 'England'),
		('KH-34',2,'Cheryl Cole', '1994/12/12', 0, '020202021', 0908111666,'coleth@gmail.com','USA'),
        ('KH-35', 4,'Joachim Low', '1986/12/12', 1, '027699843', 0976798223,'low@gmail.com','Germany');
insert into service(service_id,service_name, service_area, service_max_people, service_cost, rent_type_id, service_type_id,
standar_room, description_other_convenience, pool_area, number_of_floors)
values  ('DV-1',"Villa 1",100,5,1000,1,1,'Luxury','Balcony', 40, 3),
		('DV-2',"House 1",60,4,600,2,2,'Suite','Bathtub', null, 2),
		('DV-3',"Room 1",40,3,300,3,3, null, null, null, null),
		('DV-4',"Villa 2",80,5,800,4,1,'Luxury','Balcony', 40, 3),
		('DV-5',"Room 2",30,2,200,2,3, null, null, null, null),
        ('DV-6',"House 2",50,4,600,2,2,'Suite','Bathtub', null, 2);
  
insert into contract(employee_id, customer_id, service_id, contract_start_day, contract_end_day, contract_deposit, contract_total_money)
values 	(3,'KH-3','DV-1',"2018-12-12","2019-03-12",100,0),
		(1,'KH-33','DV-5',"2019-01-12","2019-08-12",100,0),
		(2,'KH-32','DV-4',"2020-01-12","2020-10-12",100,0),
		(5,'KH-31','DV-6',"2021-01-12","2020-10-12",100,0),
		(4,'KH-34','DV-3',"2019-05-01","2021-05-01",100,0),
        (6,'KH-35','DV-2',"2016-12-12","2019-03-12",100,0);
       
        insert into contract_detail(contract_id,attach_service_id,quantity)
values 	(1,2,4),
		(2,3,3),
		(4,3,3),
		(5,2,4),
		(6,1,5),
		(3,2,6)