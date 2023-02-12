# Write your MySQL query statement below
SELECT e.event_day AS day, e.emp_id, SUM(e.out_time-e.in_time) as total_time
FROM employees e
GROUP BY e.emp_id, e.event_day;