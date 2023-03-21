SELECT HISTORY_ID, CAR_ID, 
date_format(START_DATE, '%Y-%m-%d') as START_DATE, 
date_format(END_DATE, '%Y-%m-%d') as END_DATE, 
if(DATEDIFF(end_date, start_date) < 29, '단기 대여', '장기 대여') as RENT_TYPE
from car_rental_company_rental_history
where start_date >= '2022-09-01' and start_date < '2022-10-01'
order by history_id desc
