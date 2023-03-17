SELECT FP.PRODUCT_ID, PRODUCT_NAME, sum(price * amount) as TOTAL_SALES
from food_product FP inner join food_order FO on FP.product_id = FO.product_id 
WHERE YEAR(FO.produce_date) = 2022 and month(FO.produce_date) = 5
group by FP.product_id
order by total_sales desc, product_id