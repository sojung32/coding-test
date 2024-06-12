SELECT
    SCORE
    , EMP.EMP_NO
    , EMP_NAME
    , POSITION
    , EMAIL
FROM (
    SELECT
        SUM(SCORE) SCORE
        , EMP_NO
    FROM
        HR_GRADE
    WHERE
        YEAR = 2022
    GROUP BY
        EMP_NO
) GRD
INNER JOIN 
    HR_EMPLOYEES EMP
    ON EMP.EMP_NO = GRD.EMP_NO
ORDER BY
    SCORE DESC
LIMIT 1