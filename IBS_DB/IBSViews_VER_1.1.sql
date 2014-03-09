CREATE MATERIALIZED VIEW IBS_MAS_LOOKUP(CATEGORY, LEVEL_1, LEVEL_2, CODE, DESCRIPTION)
AS
  SELECT 'STATUS' as  category,
  'ALL' as Level_1,
  'ALL' as Level_2,
   to_char(code) as code,
   description as description
  FROM IBS_STATUS_MASTER
  UNION ALL
  SELECT 'USER' as category,
  'ALL' as Level_1,
  'ALL' as Level_2,
   LOGIN_NAME as code,
   description as description
   FROM IBS_USER
   UNION ALL
   SELECT 'ROLES' as category,
  'ALL' as Level_1,
  'ALL' as Level_2,
   NAME as code,
   description as description
   FROM IBS_ROLES
   UNION ALL
   SELECT 'COMPANY' as category,
   'ALL' as Level_1,
   'ALL' as Level_2,
    code as code,
    NAME as description
    FROM IBS_COMPANY
    UNION ALL
    SELECT 'COMPANYBRANCH' as category,
    'ALL' as Level_1,
   'ALL' as Level_2,
    COMPANY_CODE as code,
    NAME as description
    FROM IBS_COMPANY_BRANCH
    UNION ALL
    SELECT 'INSURANCECOMPANY' as category,
   'ALL' as Level_1,
   'ALL' as Level_2,
    CODE as code,
    NAME as description
    FROM IBS_INSURANCE_COMPANY
     UNION ALL
    SELECT 'INSURANCECOMPANYCONTACT' as category,
   'ALL' as Level_1,
   'ALL' as Level_2,
    COMPANY_CODE as code,
    COMPANY_NAME as description
    FROM IBS_INSURANCE_COMPANY_CONTACT
    UNION ALL
    SELECT 'PRODUCTMASTER' as category,
   'ALL' as Level_1,
   'ALL' as Level_2,
    NAME as code,
    SHORTNAME as description
    FROM IBS_PRODUCT_MASTER
    UNION ALL
    SELECT 'INSCOMPPRODUCTLINK' as category,
   'ALL' as Level_1,
   'ALL' as Level_2,
    COMPANY_CODE as code,
    'ALL' as description
    FROM IBS_INSURANCE_COMP_PROD_LINK;
    

