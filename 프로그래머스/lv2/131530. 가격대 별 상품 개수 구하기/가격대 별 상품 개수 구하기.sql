-- 코드를 입력하세요
-- 금액을 원하는 구간 단위로 나누기 
-- FLOOR()함수 : 버리기

SELECT
    FLOOR(PRICE/10000)*10000 AS PRICE_GROUP 
    , COUNT(PRODUCT_ID) AS PRODUCTS
from product
group by FLOOR(PRICE/10000)
order by FLOOR(PRICE/10000)
;