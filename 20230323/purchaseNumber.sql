SELECT YEAR(sales_date) as YEAR, MONTH(sales_date) as MONTH, GENDER, count(DISTINCT I.user_id) as USERS
FROM user_info I right join online_sale S on I.user_id = S.user_id
GROUP BY YEAR, MONTH, GENDER HAVING GENDER IS NOT NULL
ORDER BY YEAR asc, MONTH asc, GENDER asc
