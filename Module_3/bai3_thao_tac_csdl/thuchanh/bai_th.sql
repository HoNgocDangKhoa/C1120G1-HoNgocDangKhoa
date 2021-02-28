use classicmodels;
select productCode, productName, buyprice, quantityInStock from products
where buyprice > 90.76 and quantityInStock > 1010;

select productCode,productName,buyprice,productlines.textDescription 
from products
inner join productlines 
on products.productline=productlines.productline
where buyprice > 80.0 and buyprice < 90.0;

select productCode, productName, buyprice, quantityInStock,productVendor,productLine 
from products 
where productLine = 'Classic Cars' or productVendor = 'Min Lin Diecast'