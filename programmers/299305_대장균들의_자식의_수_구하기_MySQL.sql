SELECT
    PED.ID
    , COUNT(CED.ID) CHILD_COUNT
FROM
    ECOLI_DATA PED
LEFT OUTER JOIN
    ECOLI_DATA CED
    ON PED.ID = CED.PARENT_ID
GROUP BY
    PED.ID
ORDER BY
    ID ASC