SELECT
    TO_NUMBER(TO_CHAR(START_DATE, 'MM')) MONTH
    , CAR_ID
    , COUNT(1) RECORDS
FROM 
    CAR_RENTAL_COMPANY_RENTAL_HISTORY
WHERE 
    CAR_ID IN (
            SELECT
                CAR_ID
            FROM 
                CAR_RENTAL_COMPANY_RENTAL_HISTORY 
            WHERE
                TO_CHAR(START_DATE, 'YYYY-MM') >= '2022-08'
                AND TO_CHAR(START_DATE, 'YYYY-MM') <= '2022-10'
            GROUP BY
                CAR_ID
            HAVING
                COUNT(1) >= 5
        )
    AND TO_CHAR(START_DATE, 'YYYY-MM') >= '2022-08'
    AND TO_CHAR(START_DATE, 'YYYY-MM') <= '2022-10'
GROUP BY
    TO_NUMBER(TO_CHAR(START_DATE, 'MM')), CAR_ID
ORDER BY
    TO_NUMBER(TO_CHAR(START_DATE, 'MM')), CAR_ID DESC