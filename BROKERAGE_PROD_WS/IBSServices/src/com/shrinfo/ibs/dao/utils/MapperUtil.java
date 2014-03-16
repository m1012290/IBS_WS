package com.shrinfo.ibs.dao.utils;

import com.shrinfo.ibs.cmn.utils.Utils;
import com.shrinfo.ibs.gen.pojo.IbsContact;
import com.shrinfo.ibs.gen.pojo.IbsCustomer;
import com.shrinfo.ibs.gen.pojo.IbsCustomerEnquiry;
import com.shrinfo.ibs.gen.pojo.IbsInsuredMaster;
import com.shrinfo.ibs.gen.pojo.IbsProductMaster;
import com.shrinfo.ibs.gen.pojo.IbsQuoteSlipHeader;
import com.shrinfo.ibs.vo.business.AddressVO;
import com.shrinfo.ibs.vo.business.ContactVO;
import com.shrinfo.ibs.vo.business.CustomerVO;
import com.shrinfo.ibs.vo.business.EnquiryVO;
import com.shrinfo.ibs.vo.business.InsuredVO;
import com.shrinfo.ibs.vo.business.ProductVO;
import com.shrinfo.ibs.vo.business.QuoteDetailVO;



public class MapperUtil {

    public static void populateCustomerVO(CustomerVO customerVO, IbsCustomer ibsCustomer) {

        if (Utils.isEmpty(ibsCustomer) || Utils.isEmpty(customerVO)) {
            return;
        }
        customerVO.setName(ibsCustomer.getName());
        customerVO.setCategory(ibsCustomer.getCategory());
        customerVO.setClassification(ibsCustomer.getClassification());
        customerVO.setCustomerId(ibsCustomer.getId().longValue());
        customerVO.setGroup(ibsCustomer.getCustGroup());
        // customerVO.setIsStatusActive(ibsCustomer.get)
        customerVO.setSalutation(ibsCustomer.getSalutation());
        customerVO.setSourceOfBusiness(ibsCustomer.getSource());

        ContactVO contactVO = new ContactVO();
        contactVO.setEmailId(ibsCustomer.getIbsContact().getPrimaryEmailId());
        contactVO.setMobileNo(ibsCustomer.getIbsContact().getPrimaryMobileNo());
        // contactVO.setAddress(ibsCustomer.getIbsContact().getAddress());

    }

    public static void populateContactVO(ContactVO contactVO, IbsContact ibsContact) {

        contactVO.setAlternateEmailId1(ibsContact.getAlternateEmailId1());
        contactVO.setAlternateEmailId2(ibsContact.getAlternateEmailId2());
        contactVO.setAlternateLandlineNo1(ibsContact.getAlternateLandlineNo1());
        contactVO.setAlternateLandLineNo2(ibsContact.getAlternateLandlineNo2());
        contactVO.setAlternateMobileNo1(ibsContact.getAlternateMobileNo1());
        contactVO.setEmailId(ibsContact.getPrimaryEmailId());
        contactVO.setFaxNo(ibsContact.getFaxno());
        contactVO.setFirstName(ibsContact.getFaxno());
        contactVO.setIsStatusActive(ibsContact.getIsStatusActive());
        contactVO.setLandlineNo(ibsContact.getPrimaryLandlineNo());
        contactVO.setLastName(ibsContact.getLastName());
        contactVO.setMiddleName(ibsContact.getMiddleName());
        contactVO.setMobileNo(ibsContact.getPrimaryMobileNo());
        contactVO.setRecordType(ibsContact.getRecordType());
        // contactVO.setRecordTypeDesc(ibsContact.getRecordType());
        AddressVO addressVO = new AddressVO();
        populateAddressVO(addressVO, ibsContact);
        contactVO.setAddress(addressVO);

    }

    public static void populateAddressVO(AddressVO addressVO, IbsContact ibsContact) {
        // TODO
    }

    public static void populateProductVO(ProductVO productVO, IbsProductMaster ibsProductMaster) {

        if (!Utils.isEmpty(productVO) || !Utils.isEmpty(ibsProductMaster)) {
            return;
        }
        productVO.setCategory(ibsProductMaster.getCategorisation());
        productVO.setIsStatusActive(ibsProductMaster.getStatus());
        productVO.setName(ibsProductMaster.getName());
        productVO.setProductClass(ibsProductMaster.getClass_().intValue());
        productVO.setShortName(ibsProductMaster.getShortname());
        productVO.setSubClass(ibsProductMaster.getSubclass().intValue());

    }

    public static void populateEnquiryVO(EnquiryVO enquiryVO, IbsCustomerEnquiry ibsCustomerEnquiry) {

        if (Utils.isEmpty(enquiryVO) || Utils.isEmpty(ibsCustomerEnquiry)) {
            return;
        }

        enquiryVO.setEnquiryNo(ibsCustomerEnquiry.getEnquiryNo().longValue());
        enquiryVO.setEnquirySme(ibsCustomerEnquiry.getEnquirySubjectmatterExpert());
        ProductVO productVO = new ProductVO();
        populateProductVO(productVO, ibsCustomerEnquiry.getIbsProductMaster());
        enquiryVO.setProduct(productVO);
        enquiryVO.setDescription(ibsCustomerEnquiry.getEnquiryDescription());
        ContactVO contactVO = new ContactVO();
        populateContactVO(contactVO, ibsCustomerEnquiry.getIbsContact());
        enquiryVO.setEnquiryContact(contactVO);
        enquiryVO.setIsStatusActive(ibsCustomerEnquiry.getIsActive());

    }

    public static void populateInsuredVO(InsuredVO insuredVO, IbsInsuredMaster ibsInsuredMaster) {

        // insuredVO.setIsStatusActive(ibsInsuredMaster.get)
        insuredVO.setName(ibsInsuredMaster.getName());
        insuredVO.setSalutation(ibsInsuredMaster.getSalutation());
        insuredVO.setSourceOfBusiness(ibsInsuredMaster.getSource());
        ContactVO contactVO = new ContactVO();
        MapperUtil.populateContactVO(contactVO, ibsInsuredMaster.getIbsContact());
        insuredVO.setContactAndAddrDetails(contactVO);
        CustomerVO customerVO = new CustomerVO();
        MapperUtil.populateCustomerVO(customerVO, ibsInsuredMaster.getIbsCustomer());
        insuredVO.setCustomerDetails(customerVO);
    }

    public static void populateQuoteSlipDetailVO(QuoteDetailVO quoteDetailVO,
            IbsQuoteSlipHeader ibsQuoteSlipHeader) {
        // TODO Auto-generated method stub

    }


}
