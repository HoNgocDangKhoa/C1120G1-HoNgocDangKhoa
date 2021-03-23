use classicmodels;
create or replace view customer_view as 
select customerNumber,customerName,phone
 from customers;
 select*from customer_view;
 drop view customer_view;