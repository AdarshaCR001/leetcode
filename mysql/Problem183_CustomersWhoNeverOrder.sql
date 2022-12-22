# Write your MySQL query statement below
select c.name as Customers from Customers c left join Orders o ON o.customerId=c.id
where o.customerId is null;