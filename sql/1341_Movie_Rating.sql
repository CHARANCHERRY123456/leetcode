select min(name) as results from Users
where user_id in (
    select user_id from MovieRating
    group by user_id
    having  count(rating) = (
        select max(count) from (
        select count(rating) as count from MovieRating
        group by user_id) as t1
    )
)
union  all
select min(title) as result from Movies
where movie_id in (
    select movie_id from MovieRating
    where month(created_at)=2 and year(created_at)=2020
    group by movie_id
    having round(avg(rating),4) = (
        select round(max(arating),4) from (
            select avg(rating) as arating from MovieRating
            where month(created_at)=2 and year(created_at)=2020
            group by movie_id
        ) as t1
    )
)
