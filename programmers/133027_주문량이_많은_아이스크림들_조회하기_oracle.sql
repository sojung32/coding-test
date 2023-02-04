SELECT
    FLAVOR
FROM (
    SELECT
        ROW_NUMBER() OVER(ORDER BY NVL(FH.TOTAL_ORDER, 0) + NVL(J.TOTAL_ORDER, 0) DESC) RN
        , FH.FLAVOR
        , NVL(FH.TOTAL_ORDER, 0) + NVL(J.TOTAL_ORDER, 0) TOTAL_ORDER
    FROM (
        SELECT
            FLAVOR
            , SUM(TOTAL_ORDER) TOTAL_ORDER
        FROM 
            FIRST_HALF
        GROUP BY
            FLAVOR
    ) FH
    LEFT OUTER JOIN (
        SELECT
            FLAVOR
            , SUM(TOTAL_ORDER) TOTAL_ORDER
        FROM 
            JULY
        GROUP BY
            FLAVOR
    ) J ON FH.FLAVOR = J.FLAVOR
)
WHERE
    RN <= 3
ORDER BY
    RN