# Write your MySQL query statement below
select Product.product_name , Sales.year ,  Sales.price from sales left join 
Product on Product.product_id = sales.product_id;
