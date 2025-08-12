select COALESCE(
    (
        -- actual restult without handling null case
        select salary  from Employee
        where salary in (
                -- give the salary which is top 2 to use limit we are using this extenral query
                select salary from (
                    -- actual query that return the top 2 salary 
                    select salary from Employee
                    group by salary
                    order by salary desc
                    limit 1 offset 1
            ) as t2
        )
        limit 1
    ),
    NULL
) as SecondHighestSalary
