
select distinct t1.product_id , coalesce(t2.price , 10) as price 
from Products as t1 left join 
-- give product_id , possible price if set
(
    select product_id ,new_price as price from Products
    where (product_id , change_date) in 
    (
        -- give product , needed date
        select product_id , max(change_date) from Products
        where change_date <= "2019-08-16"
        group by product_id
    )
) as t2
on t1.product_id = t2.product_id
