with  location_clean as (
    select * from Insurance
    group by lat,lon
    having count(*) = 1
),
valid_pids as (
    select group_concat(pid) as gpid , tiv_2015 from Insurance
    group by tiv_2015
    having count(tiv_2015) != 1
)
select round(sum(tiv_2016),2)  as tiv_2016 from valid_pids as v join location_clean as l
on find_in_set(l.pid, v.gpid) > 0
