select p.product_name , sum(o.unit) as unit  
from Orders as o left join Products as p
on o.product_id = p.product_id
where date_format(order_date , "%y-%m") = "20-02"
group by o.product_id
having sum(o.unit) >= 100
