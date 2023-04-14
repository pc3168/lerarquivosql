SELECT
       A.CD_EMP                       AS CD_EMP
     , A.CD_PROD                      AS CD_PROD
     , A.CD_BARRA                     AS CD_BARRA
     , A.TP_CD_BARRA                  AS TP_CD_BARRA
     , A.QTDE_EMBALAGEM               AS QTDE_EMBALAGEM
     , ISNULL(A.DT_ULT_ALT, A.DT_CAD) AS DT_ULT_ALT
FROM EST_PROD_CD_BARRA A;