/**
 * 
 */
package com.shrinfo.ibs.dao.utils;

import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

import com.shrinfo.ibs.cmn.utils.Utils;
import com.shrinfo.ibs.cmn.vo.BaseVO;
import com.shrinfo.ibs.gen.pojo.IbsCompany;
import com.shrinfo.ibs.gen.pojo.IbsCompanyBranch;
import com.shrinfo.ibs.gen.pojo.IbsContact;
import com.shrinfo.ibs.gen.pojo.IbsCustomer;
import com.shrinfo.ibs.gen.pojo.IbsCustomerEnquiry;
import com.shrinfo.ibs.gen.pojo.IbsInsuranceCompany;
import com.shrinfo.ibs.gen.pojo.IbsInsuranceCompanyContact;
import com.shrinfo.ibs.gen.pojo.IbsInsuredMaster;
import com.shrinfo.ibs.gen.pojo.IbsProductMaster;
import com.shrinfo.ibs.gen.pojo.IbsQuoteSlipDetail;
import com.shrinfo.ibs.gen.pojo.IbsQuoteSlipHeader;
import com.shrinfo.ibs.gen.pojo.IbsStatusMaster;
import com.shrinfo.ibs.vo.app.RecordType;
import com.shrinfo.ibs.vo.business.ContactVO;
import com.shrinfo.ibs.vo.business.CustomerVO;
import com.shrinfo.ibs.vo.business.EnquiryVO;
import com.shrinfo.ibs.vo.business.InsuredVO;
import com.shrinfo.ibs.vo.business.ProductUWFieldVO;
import com.shrinfo.ibs.vo.business.ProductVO;
import com.shrinfo.ibs.vo.business.QuoteDetailVO;


/**
 * @author Sunil Kumar
 * 
 */
public class DAOUtils {

    @SuppressWarnings("unchecked")
    public static IbsContact constructIbsContactForRecType(BaseVO baseVO, RecordType recordType) {
        IbsContact ibsContact = null;
        if (!Utils.isEmpty(baseVO)) {

            switch (recordType) {
                case USER:
                    break;
                case CUSTOMER:
                    CustomerVO customerVO = (CustomerVO) baseVO;
                    ibsContact = constructIbsContact(customerVO.getContactAndAddrDets());
                    IbsCustomer ibsCustomer = constructIbsCustomer(baseVO);
                    ibsCustomer.setIbsContact(ibsContact);
                    ibsContact.setIbsCustomers(constructSetOfPOJOForRecType(recordType
                            .getPojoClass()));
                    ibsContact.getIbsCustomers().add(ibsCustomer);
                    break;
                case COMPANY:
                    ibsContact = new IbsContact();
                    IbsCompany ibsCompany = constructIbsCompany(baseVO);
                    ibsContact.setIbsCompanies(constructSetOfPOJOForRecType(recordType
                            .getPojoClass()));
                    ibsContact.getIbsCompanies().add(ibsCompany);
                    break;
                case INSURANCE_COMPANY:
                    break;
                case COMPANY_BRANCH:
                    break;
                case PORTFOLIO:
                    break;
                case INSURED:
                    InsuredVO insuredVO = (InsuredVO) baseVO;
                    ibsContact = constructIbsContact(insuredVO.getContactAndAddrDetails());
                    IbsInsuredMaster ibsInsuredMaster = constructIbsInsuredMaster(baseVO);
                    ibsContact.setIbsInsuredMasters(constructSetOfPOJOForRecType(recordType
                            .getPojoClass()));
                    ibsContact.getIbsInsuredMasters().add(ibsInsuredMaster);
                    break;
                case ENQUIRY_CONTACT:
                    EnquiryVO enquiryVO = (EnquiryVO) baseVO;
                    ibsContact = constructIbsContact(enquiryVO.getEnquiryContact());
                    IbsCustomerEnquiry ibsCustomerEnquiry = constructIbsCustEnquiry(baseVO);
                    ibsCustomerEnquiry.setIbsContact(ibsContact);
                    ibsContact.setIbsCustomerEnquiries(constructSetOfPOJOForRecType(recordType
                            .getPojoClass()));
                    ibsContact.getIbsCustomerEnquiries().add(ibsCustomerEnquiry);
                    break;
            }
        }
        return ibsContact;
    }

    private static IbsContact constructIbsContact(BaseVO baseVO) {
        ContactVO contactDets = (ContactVO) baseVO;
        IbsContact ibsContact = new IbsContact();
        if (null != contactDets.getAddress())
            ibsContact.setAddress(contactDets.getAddress().getAddress());
        ibsContact.setAlternateEmailId1(contactDets.getAlternateEmailId1());
        ibsContact.setAlternateEmailId2(contactDets.getAlternateEmailId2());
        ibsContact.setAlternateLandlineNo1(contactDets.getAlternateLandlineNo1());
        ibsContact.setAlternateLandlineNo2(contactDets.getAlternateLandLineNo2());
        ibsContact.setAlternateMobileNo1(contactDets.getAlternateMobileNo1());
        ibsContact.setAlternateMobileNo2(contactDets.getAlternateMobileNo2());
        ibsContact.setCity(contactDets.getAddress().getCity());
        ibsContact.setCountry(contactDets.getAddress().getCountry());
        ibsContact.setFaxno(contactDets.getFaxNo());
        ibsContact.setFirstName(contactDets.getFirstName());
        ibsContact.setLastName(contactDets.getLastName());
        ibsContact.setLocationLattitude(Integer.valueOf(contactDets.getAddress().getLattitude()));
        ibsContact.setLocationLongitude(Integer.valueOf(contactDets.getAddress().getLongitude()));
        ibsContact.setMiddleName(contactDets.getMiddleName());
        ibsContact.setPobox(contactDets.getAddress().getPoBox());
        ibsContact.setPrimaryEmailId(contactDets.getEmailId());
        ibsContact.setPrimaryLandlineNo(contactDets.getLandlineNo());
        ibsContact.setPrimaryMobileNo(contactDets.getMobileNo());
        ibsContact.setTitle(contactDets.getTitle());
        return ibsContact;
    }

    //
    private static <T> Set<T> constructSetOfPOJOForRecType(Class<T> setType) {
        return new HashSet<T>();
    }

    private static IbsCustomer constructIbsCustomer(BaseVO baseVO) {
        CustomerVO customerVO = (CustomerVO) baseVO;
        IbsCustomer ibsCustomer = new IbsCustomer();
        ibsCustomer.setId(customerVO.getCustomerId());
        ibsCustomer.setCategory(customerVO.getCategory());
        ibsCustomer.setClassification(customerVO.getClassification());
        ibsCustomer.setCustGroup(customerVO.getGroup());
        ibsCustomer.setName(customerVO.getName());
        ibsCustomer.setSalesExecutive(customerVO.getSalesExecutive());
        ibsCustomer.setSalutation(customerVO.getSalutation());
        ibsCustomer.setSource(customerVO.getSourceOfBusiness());
        ibsCustomer.setStatus(Long.valueOf("1"));
        long currentTime = System.currentTimeMillis();
        ibsCustomer.setRecCreDate(new Date(currentTime));
        ibsCustomer.setRecUpdDate(new Date(currentTime));
        return ibsCustomer;
    }

    private static IbsCompany constructIbsCompany(BaseVO baseVO) {
        return null;
    }

    private static IbsCompanyBranch constructIbsCompanyBranch(BaseVO baseVO) {
        return null;
    }

    private static IbsInsuranceCompany constructIbsInsCompany(BaseVO baseVO) {
        return null;
    }

    private static IbsInsuranceCompanyContact constructIbsInsCompanyContact(BaseVO baseVO) {
        return null;
    }

    private static IbsInsuredMaster constructIbsInsuredMaster(BaseVO baseVO) {
        InsuredVO insuredVO = (InsuredVO) baseVO;
        IbsInsuredMaster ibsInsured = new IbsInsuredMaster();
        ibsInsured.setName(insuredVO.getName());
        ibsInsured.setSalutation(insuredVO.getSalutation());
        ibsInsured.setSource(insuredVO.getSourceOfBusiness());
        ibsInsured.setIbsCustomer(constructIbsCustomer(insuredVO.getCustomerDetails()));
        return null;
    }

    private static IbsCustomerEnquiry constructIbsCustEnquiry(BaseVO baseVO) {

        EnquiryVO enquiryVO = (EnquiryVO) baseVO;
        IbsCustomerEnquiry customerEnquiry = new IbsCustomerEnquiry();
        customerEnquiry.setEnquiryDescription(enquiryVO.getDescription());
        customerEnquiry.setEnquiryNo(enquiryVO.getEnquiryNo());
        customerEnquiry.setEnquirySubjectmatterExpert(enquiryVO.getEnquirySme());
        customerEnquiry.setIbsProductMaster(constructIbsProduct(enquiryVO.getProduct()));
        customerEnquiry.setIbsCustomer(constructIbsCustomer(enquiryVO.getCustomerDetails()));
        //customerEnquiry.setIbsContact(constructIbsContact(enquiryVO.getEnquiryContact()));
        customerEnquiry.setIsActive(enquiryVO.getIsStatusActive());
        if (null != enquiryVO.getType())
            customerEnquiry.setType(enquiryVO.getType().getEnquiryType());

        return customerEnquiry;
    }

    public static IbsQuoteSlipHeader constructIbsQuoteSlipHeader(BaseVO baseVO) {

        QuoteDetailVO quoteDetailVO = (QuoteDetailVO) baseVO;
        IbsQuoteSlipHeader slipHeader = new IbsQuoteSlipHeader();
        slipHeader.setCustomerId(quoteDetailVO.getCustomerId());
        slipHeader.setEnquiryNo(quoteDetailVO.getEnquiryNum());
        slipHeader.setIbsProductMaster(constructIbsProduct(quoteDetailVO.getProductDetails()));
        slipHeader.setIbsQuoteSlipDetails(constructIbsQuoteSlipDetails(quoteDetailVO));

        IbsStatusMaster ibsStatusMaster = new IbsStatusMaster();
        ibsStatusMaster.setCode((long) quoteDetailVO.getStatusCode());
        slipHeader.setIbsStatusMaster(ibsStatusMaster);
        slipHeader.setInsuredId(quoteDetailVO.getInsuredDetails().getId());
        slipHeader.setInsuredName(quoteDetailVO.getInsuredDetails().getName());
        slipHeader.setPolicyStartDate((Date) quoteDetailVO.getPolicyVO().getPolicyEffectiveDate());
        slipHeader.setPolicyExpiryDate((Date) quoteDetailVO.getPolicyVO().getPolicyExpiryDate());
        slipHeader.setQuoteSlipDate((Date) quoteDetailVO.getQuoteSlipDate());
        slipHeader.setQuoteSlipEmailed(quoteDetailVO.getIsClosingSlipEmailed());
        // slipHeader.setRemarks(quoteDetailVO.get)
        slipHeader.setSubClass(String.valueOf(quoteDetailVO.getProductDetails().getSubClass()));

        return slipHeader;
    }

    private static Set<IbsQuoteSlipDetail> constructIbsQuoteSlipDetails(BaseVO baseVO) {

        QuoteDetailVO quoteDetailVO = (QuoteDetailVO) baseVO;
        ProductVO productVO = quoteDetailVO.getProductDetails();
        Set<IbsQuoteSlipDetail> slipDetailList = new HashSet<IbsQuoteSlipDetail>();
        IbsQuoteSlipDetail slipDetail = null;
        for (ProductUWFieldVO uwFieldVO : productVO.getUwFieldsList()) {
            slipDetail = new IbsQuoteSlipDetail();
            // slipDetail.setEnquiryNo(quoteDetailVO.getEnquiryNum());
            // slipDetail.setIbsProductMaster(ibsProductMaster)
            // slipDetail.setEnquiryCompanyCode(quoteDetailVO)
            slipDetail.setProductUwFieldAnswer(uwFieldVO.getFieldValue());
            // slipDetail.set

            slipDetailList.add(slipDetail);
        }
        return slipDetailList;
    }

    private static IbsProductMaster constructIbsProduct(ProductVO productDetails) {
        // TODO Auto-generated method stub
        return null;
    }

}
