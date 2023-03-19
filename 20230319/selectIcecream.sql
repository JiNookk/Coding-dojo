-- 코드를 입력하세요
SELECT F.FLAVOR
from first_half F right join july J on F.shipment_id = J.shipment_id
group by J.flavor
order by (F.total_order + sum(J.total_order)) desc
LIMIT 3
