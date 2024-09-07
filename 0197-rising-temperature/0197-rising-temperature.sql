# Write your MySQL query statement below
# join the table with itself self join 
# use datediff to check if there is consecutive day difference

select w1.id
from weather w1, weather w2
where datediff(w1.recordDate ,w2.recordDate) = 1 and w1.temperature > w2.temperature;