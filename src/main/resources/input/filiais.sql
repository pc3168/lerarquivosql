SELECT
    CAST(A.CD_FILIAL AS NUMERIC(15)) AS FILIAL,
    A.NM_FANT                        AS IDENTIFICACAO,
    B.DS_CID                         AS CIDADE,
    CAST(B.UF AS VARCHAR(2))         AS ESTADO,
    A.END_FILILAL                    AS ENDERECO,
    A.BAIRRO                         AS BAIRRO,
    CAST(A.CEP AS VARCHAR(10))       AS CEP,
    A.CGC                            AS CNPJ,
    A.INSC_EST                       AS INSCRICAO_ESTADUAL,
    'N'                              AS DRIVE_THRU,
	CASE WHEN A.FLAG_NAO_PARTIC_INDIC = 0
        THEN 'S'
        ELSE 'N'
    END                              AS ATIVA,
    A.NM_FANT                        AS NOME_FANTASIA,
    A.RZ_FILIAL                      AS RAZAO_SOCIAL,
	CASE WHEN (select C.CD_FILIAL from prc_filial_config C where C.cd_chave = 'ENTREGA_GESTAO' and C.valor = 1 AND C.CD_FILIAL = A.CD_FILIAL) = A.CD_FILIAL THEN 'S' ELSE 'N' END AS ENTREGA,
    A.CGC AS INSCRICAO_FEDERAL,
    A.DT_ULT_ALT AS DATA_ALTERACAO

  FROM PRC_FILIAL A
  JOIN GLB_CID    B
    ON B.CD_CID = A.CD_CID;