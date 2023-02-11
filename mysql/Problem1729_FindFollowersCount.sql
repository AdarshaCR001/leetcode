# Write your MySQL query statement below
SELECT f.user_id, count(f.user_id) AS followers_count
FROM followers f
GROUP BY f.user_id
ORDER BY f.user_id;