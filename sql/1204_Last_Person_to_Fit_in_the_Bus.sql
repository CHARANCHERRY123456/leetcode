select person_name
from 
-- get the cumulative sum order by tunr
(
    select person_name , sum(weight) over (order by turn) as w 
    from Queue
) as cs
where w <= 1000
order by w desc
limit 1
