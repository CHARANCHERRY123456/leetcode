    select d.name as Department,e.name as Employee ,e.salary as Salary from Employee as e
    left join Department as d
    on d.id = e.departmentId
    where (salary,departmentId) in (
        select salary,departmentId from (
        select * , 
            row_number() over (partition by departmentId order by salary desc) as rn
        from (
            select salary,departmentId from Employee
            group by salary,departmentId
        ) as t1
        ) t2
        where rn<=3
    ) 
