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
    
	
	

	
CREATE VIEW IBS_INSURED_SEARCH(CUST_ID, CUST_NAME, EMAIL, MOB_NO, INSURED_NAME, ENQUIRY_NO, QUOTATION_NO, POLICY_NO, CUST_CONTACT_ID, INSURED_ID)
AS
  select X.CID AS CUST_ID, X.CNAME AS CUST_NAME, Z.primary_email_id AS EMAIL, z.primary_mobile_no MOB_NO, X.C_CONTACTID AS CUST_CONTACT_ID,  X.IID AS INSURED_ID, X.INAME AS INSURED_NAME, X. ENO AS ENQUIRY_NO, X.QID AS QUOTATION_NO, Y.PNUM AS POLICY_NO FROM
(select a.id as CID, a.contact_id as C_CONTACTID, a.name as CNAME, b.name as INAME, b.id as IID, c.enquiry_no as ENO, D.id as QID from 
ibs_customer A, ibs_insured_master B, ibs_customer_enquiry C, 
ibs_quote_slip_header D
where 
a.id= b.customer_id and a.id = c.customer_id
and c.enquiry_no = d.enquiry_no (+) 
) X,
(
select a.name as CNAME, b.name as INAME, c.enquiry_no as ENO, D.id as QID, e.policy_no as PNUM from 
ibs_customer A, ibs_insured_master B, ibs_customer_enquiry C, 
ibs_quote_slip_header D, ibs_uw_transaction_header E
where 
a.id= b.customer_id and a.id = c.customer_id and a.id = D.customer_id and a.id = e.customer_id
and c.enquiry_no = d.enquiry_no and d.id = e.quote_slip_id and d.quote_slip_version = e.quote_slip_version
) Y, ibs_contact Z
 where X.QID = Y.QID (+) and X.C_CONTACTID = Z.ID;
    



