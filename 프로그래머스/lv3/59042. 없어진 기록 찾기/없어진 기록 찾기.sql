-- 코드를 입력하세요
SELECT AO.ANIMAL_ID, AO.NAME
FROM ANIMAL_OUTS AO 
LEFT JOIN ANIMAL_INS AI
ON AI.ANIMAL_ID = AO.ANIMAL_ID
WHERE AI.DATETIME IS NULL
ORDER BY AO.ANIMAL_ID
;

# -- 쉬운 방법
# SELECT ANIMAL_ID, NAME 
# FROM ANIMAL_OUTS
# WHERE ANIMAL_ID NOT IN (
#     SELECT ANIMAL_ID FROM ANIMAL_INS I 
# )
# 