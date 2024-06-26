SELECT
    YEAR(DIFFERENTIATION_DATE) YEAR
    , (MAX_ED.MAX_SIZE - SIZE_OF_COLONY) AS YEAR_DEV
    , ID
FROM
    ECOLI_DATA ED
LEFT OUTER JOIN (
    SELECT
        YEAR(DIFFERENTIATION_DATE) DYEAR
        , MAX(SIZE_OF_COLONY) MAX_SIZE
    FROM
        ECOLI_DATA
    GROUP BY
        DYEAR
) MAX_ED
ON YEAR(DIFFERENTIATION_DATE) = MAX_ED.DYEAR
ORDER BY
    YEAR ASC, YEAR_DEV ASC