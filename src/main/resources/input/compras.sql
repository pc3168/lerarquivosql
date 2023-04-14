SELECT
      A.CD_PED AS COMPRA
	,B.CGC AS CNPJ
	,A.CD_FILIAL AS FILIAL
	,A.CD_PROD AS PRODUTO
	,A.CFOP AS CFOP
	,A.STS_NF AS STATUS
	,A.DT_EMI_NF AS DATA_EMISSAO
	,A.DT_ENT AS DATA_ENTRADA
	,A.NR_NF AS NUMERO
	,A.SERIE
	,A.MODELO
	,A.CD_FORN AS FORNECEDOR
	,A.CNPJ_EMITENTE AS CNPJ_FORNECEDOR
	,A.QT_IT AS QUANTIDADE
	,A.VLR_IT AS PRECO
	,A.VLR_TOT_PROD AS TOTAL_PRODUTO
	,A.VLR_TOT_IT AS TOTAL_ITEM
	,A.VLR_DESC_IT AS TOTAL_DESCONTO_ITEM
	,A.VLR_IPI_IT AS TOTAL_IPI_ITEM
	,A.VLR_FRETE_IT AS TOTAL_FRETE_ITEM
	,A.VLR_OUTROS_IT AS TOTAL_OUTROS_ITEM
	,A.VLR_NF AS TOTAL_GERAL
	,A.VLR_BASE_ICMS AS BASE_ICMS
	,A.ALIQ_ICMS AS PERCENTUAL_ICMS
	,A.VLR_ICMS_IT AS TOTAL_ICMS_ITEM
	,A.VLR_ICMS_SUBS_IT AS TOTAL_ICMS_ST_ITEM
	,A.VLR_ICMS_DESONERADO AS ICMS_DESONERADO
	,A.CST_PIS
	,A.VLR_PIS AS TOTAL_PIS
	,A.CST_COFINS
	,A.VLR_COFINS AS TOTAL_COFINS
	,A.CTR_LOTE AS LOTE
FROM V_EST_NF_ENT A
JOIN PRC_FILIAL B
	ON A.CD_FILIAL = B.CD_FILIAL;