-- 코드를 입력하세요
SELECT USER_ID , NICKNAME , SUM(PRICE) AS TOTAL_SALES
FROM USED_GOODS_BOARD USG , USED_GOODS_USER UGU
WHERE USG.WRITER_ID = UGU.USER_ID
AND USG.STATUS = 'DONE'
GROUP BY USER_ID
HAVING TOTAL_SALES >= 700000
ORDER BY TOTAL_SALES 
;