--find the owner of the employee 

(select e1.employee_id ,case when e2.department_id is not null then e2.department_id else e1.department_id end as department_id from 
(select employee_id,department_id from Employee) as e1 
left join Employee as e2
on e1.employee_id = e2.employee_id and e2.primary_flag = "Y"
group by e1.employee_id)
