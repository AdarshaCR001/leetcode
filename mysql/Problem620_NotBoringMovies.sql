# Write your MySQL query statement below
select c.* from Cinema c
where c.description != "boring" and c.id%2!=0
order by c.rating desc;