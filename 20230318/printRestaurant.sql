-- 코드를 입력하세요
SELECT I.REST_ID, REST_NAME, FOOD_TYPE, FAVORITES, ADDRESS, 
round(sum(review_score) / count(review_score), 2) as SCORE
from rest_info I join rest_review R on I.rest_id = R.rest_id
where address like '서울%'
group by rest_name
order by score desc, favorites desc
