SELECT
	 A.CD_EMP          AS CD_EMP
       , A.CD_FILIAL       AS CD_FILIAL
       , A.CD_VD           AS CD_VD
       , A.CD_IT           AS CD_IT
       , A.DT_VD           AS DT_VD
       , B.CD_CX           AS CD_CAIXA
       , B.CHV_NFCE        AS CHV_NFCE
       , A.CD_NT_OP        AS CD_NT_OP
       , A.CD_VEND         AS CD_VEND
       , A.CD_PROD         AS CD_PROD
       , A.CD_BARRA        AS CD_BARRA
       , A.QT_IT           AS QT_IT
       , A.VLR_IT          AS VLR_IT
       , A.TOT_IT          AS TOT_IT
       , A.VLR_CUSTO       AS VLR_CUSTO
       , A.VLR_CUSTO_MEDIO AS VLR_CUSTO_MEDIO
       , A.VLR_ICMS        AS VLR_ICMS
       , A.VLR_PIS         AS VLR_PIS
       , A.VLR_COFINS      AS VLR_COFINS
       , A.VLR_FECOP       AS VLR_FECOP
       , A.PERC_COMIS      AS PERC_COMIS

FROM PDV_VD_IT A WITH(NOLOCK)
     JOIN PDV_VD B  WITH(NOLOCK) ON B.CD_EMP = A.CD_EMP
          AND B.CD_FILIAL = A.CD_FILIAL
          AND B.CD_VD = A.CD_VD
     JOIN PRC_FILIAL C  WITH(NOLOCK) ON C.CD_FILIAL = B.CD_FILIAL;