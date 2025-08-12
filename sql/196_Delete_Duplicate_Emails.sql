delete from Person
where id not in (
    select min(id) from (select * from Person) as t1
    group by email
) 
