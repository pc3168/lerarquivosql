SELECT
	A.CD_VD
	,B.CGC
	,A.CD_FILIAL
	,A.DT_VD
	,A.VLR_DINH
	,A.VLR_CHQS
	,A.VLR_CARTAO
	,A.VLR_TICKETS
	,A.VLR_DUP
	,A.VLR_CONV
	,A.VLR_NCC
	,C.NSU_SITEF
	,C.NR_AUTORIZACAO
	,C.QTDE_PARCELAS
	,C.NM_OPERADORA_PDV
	,C.COD_BANDEIRA
	,C.VL_CARTAO
	,A.DT_ULT_ALT

FROM PDV_VD A
JOIN PRC_FILIAL B
	ON A.CD_FILIAL = B.CD_FILIAL
LEFT JOIN PDV_VD_TEF C
	ON A.CD_EMP = C.CD_EMP
	AND A.CD_FILIAL = C.CD_FILIAL
	AND A.CD_VD = C.CD_VD;