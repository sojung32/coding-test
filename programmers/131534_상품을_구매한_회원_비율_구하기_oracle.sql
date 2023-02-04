SELECT
    YEAR
    , TO_NUMBER(MONTH) MONTH
    , PUCHASED_USERS
    , ROUND(PUCHASED_USERS / (SELECT COUNT(1) FROM USER_INFO WHERE TO_CHAR(JOINED, 'YYYY') = '2021'), 1) PUCHASED_RATIO
FROM (
    SELECT
        TO_CHAR(SALES_DATE, 'YYYY') YEAR
        , TO_CHAR(SALES_DATE, 'MM')  MONTH
        , COUNT(DISTINCT OS.USER_ID) PUCHASED_USERS
    FROM
        ONLINE_SALE OS
    INNER JOIN
        USER_INFO UI
        ON OS.USER_ID = UI.USER_ID
        AND TO_CHAR(UI.JOINED, 'YYYY') = '2021'
    GROUP BY
        TO_CHAR(SALES_DATE, 'YYYY')
        , TO_CHAR(SALES_DATE, 'MM')
)
ORDER BY
    YEAR, MONTH