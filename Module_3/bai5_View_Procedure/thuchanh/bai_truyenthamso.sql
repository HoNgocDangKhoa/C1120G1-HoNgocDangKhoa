use classicmodle;
delimiter $$
create procedure numBer1( in Num int)
begin
select* from customers
where customerNumber=Num;
end; $$
delimiter ; 
call numBer1(233);


-- Tham số loại OUT
DELIMITER $$
CREATE PROCEDURE GetCustomersCountByCity(
IN  in_city VARCHAR(50),
OUT total INT)
BEGIN
SELECT COUNT(customerNumber)
INTO total
FROM customers
WHERE city = in_city;
END; $$
DELIMITER ;
call GetCustomersCountByCity('Lyon',@total);
select @total;