# Write your MySQL query statement below


SELECT * 
FROM cinema
WHERE id MOD 2 = 1 AND description != 'boring'
ORDER BY rating DESC;
