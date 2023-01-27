# Write your MySQL query statement below
select distinct t.id, (case when t.p_id is null then "Root" else
(case when t.id not in (select distinct(t2.p_id) from tree t2 where t2.p_id is not null) then "Leaf" else "Inner" end) end) as "type" from tree t group by t.id order by t.id;