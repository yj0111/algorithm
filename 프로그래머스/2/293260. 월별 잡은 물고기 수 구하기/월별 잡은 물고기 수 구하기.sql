SELECT COUNT(*) AS FISH_COUNT, MONTH(TIME) AS MONTH
FROM FISH_INFO FI 
GROUP BY MONTH(TIME)
ORDER BY MONTH(TIME);