# Write your MySQL query statement below
update Salary s set sex=case when sex = "m" then "f" else "m" end;