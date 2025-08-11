WITH daily_totals AS (
    SELECT visited_on, SUM(amount) AS daily_sum
    FROM Customer
    GROUP BY visited_on
)
SELECT visited_on,
       SUM(daily_sum) OVER (
           ORDER BY visited_on
           ROWS BETWEEN 6 PRECEDING AND CURRENT ROW
       ) AS amount,
       round(avg(daily_sum) OVER (
           ORDER BY visited_on
           ROWS BETWEEN 6 PRECEDING AND CURRENT ROW
       ),2) AS average_amount
FROM daily_totals
ORDER BY visited_on
limit 6 , 18446744073709551615;
