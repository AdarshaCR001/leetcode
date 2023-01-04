# Write your MySQL query statement below
select d.name as Department, e.name as Employee, e.salary as Salary
from (select  e.departmentId, max(e.salary) as salary
from Employee e
group by e.departmentId) as a,
Employee e join Department d on e.departmentId=d.id
where e.salary=a.salary and e.departmentId=a.departmentId ;