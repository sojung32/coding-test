SELECT
    MIN(GRADE) GRADE
    , ID
    , EMAIL
FROM (
    SELECT
        'A' GRADE
        , DV.ID
        , DV.EMAIL
    FROM
        DEVELOPERS DV
    INNER JOIN
        SKILLCODES SK
        ON DV.SKILL_CODE & SK.CODE = SK.CODE
        AND SK.CATEGORY = 'Front End'
    INNER JOIN
        SKILLCODES SK2
        ON DV.SKILL_CODE & SK2.CODE = SK2.CODE
        AND SK2.NAME = 'Python'
    UNION
    SELECT
        'B' GRADE
        , DV.ID
        , DV.EMAIL
    FROM
        DEVELOPERS DV
    INNER JOIN
        SKILLCODES SK
        ON DV.SKILL_CODE & SK.CODE = SK.CODE
        AND SK.NAME = 'C#'
    UNION
    SELECT
        'C' GRADE
        , DV.ID
        , DV.EMAIL
    FROM
        DEVELOPERS DV
    INNER JOIN
        SKILLCODES SK
        ON DV.SKILL_CODE & SK.CODE = SK.CODE
        AND SK.CATEGORY = 'Front End'
) DV_SK
GROUP BY 
    ID, EMAIL
ORDER BY 
    GRADE ASC, ID ASC