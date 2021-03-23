use classicmodle;
DELIMITER $$
create procedure Customer()
Begin
select* from customers
where customerNumber = 233;
End; $$
DELIMITER ;
call Customer();




drop procedure  Customer;


