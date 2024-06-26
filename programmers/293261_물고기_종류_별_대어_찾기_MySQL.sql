SELECT
    ID
    , FISH_NAME
    , MI.LENGTH
FROM 
    FISH_INFO FI
INNER JOIN (
        SELECT
            FISH_TYPE
            , MAX(LENGTH) LENGTH
        FROM
            FISH_INFO
        GROUP BY 
            FISH_TYPE
    ) MI
    ON FI.FISH_TYPE = MI.FISH_TYPE
    AND FI.LENGTH = MI.LENGTH
INNER JOIN 
    FISH_NAME_INFO NI
    ON FI.FISH_TYPE = NI.FISH_TYPE
ORDER BY
    ID ASC