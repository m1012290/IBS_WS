package com.shrinfo.ibs.test.services;

import java.util.ArrayList;
import java.util.List;

import com.shrinfo.ibs.cmn.utils.Utils;
import com.shrinfo.ibs.quoteslip.svc.QuoteSlipService;
import com.shrinfo.ibs.vo.business.ContactVO;
import com.shrinfo.ibs.vo.business.CustomerVO;
import com.shrinfo.ibs.vo.business.InsuredVO;
import com.shrinfo.ibs.vo.business.ProductUWFieldVO;
import com.shrinfo.ibs.vo.business.ProductVO;
import com.shrinfo.ibs.vo.business.QuoteDetailVO;


public class TestQuoteSlipServices {

    public static void main(String[] args) {
        Utils.setAppContext(Utils.loadSpringBeansFactory("config/applicationcontext.xml"));

        QuoteSlipService quoteSlipService = (QuoteSlipService) Utils.getBean("quoteSlipSvc");

        QuoteDetailVO quoteDetailVO = new QuoteDetailVO();

        quoteDetailVO.setEnquiryNum(23l);
        quoteDetailVO.setCustomerId(80l);

        InsuredVO insuredVO = new InsuredVO();
        CustomerVO customerVO = new CustomerVO();
        customerVO.setCustomerId(80l);
        customerVO.setCategory("Retail");
        customerVO.setClassification("");
        customerVO.setGroup("");
        customerVO.setIsStatusActive("Y");
        customerVO.setName("cumstomer saveupdated");
        customerVO.setSalutation("Mr");
        customerVO.setSourceOfBusiness("source");
        ContactVO contactVO = new ContactVO();
        contactVO.setEmailId("customer_save@ibs.com");
        contactVO.setMobileNo("888888888");
        contactVO.getAddress().setLattitude("1");
        contactVO.getAddress().setLongitude("1");
        customerVO.setContactAndAddrDets(contactVO);
        insuredVO.setCustomerDetails(customerVO);
        insuredVO.setContactAndAddrDetails(contactVO);
        insuredVO.setIsStatusActive("Y");
        insuredVO.setName("insured insert");
        insuredVO.setSalutation("Dir");
        insuredVO.setSourceOfBusiness("time pass");
        ProductVO productVO = new ProductVO();
        productVO.setProductClass(0);
        ProductUWFieldVO fieldVO = new ProductUWFieldVO();
        fieldVO.setUwFieldId(1l);
        fieldVO.setFieldName("name");
        fieldVO.setFieldType("text");
        fieldVO.setFieldValue("field value name");
        List<ProductUWFieldVO> fieldVOs = new ArrayList<ProductUWFieldVO>();
        fieldVOs.add(fieldVO);
        productVO.setUwFieldsList(fieldVOs);

        quoteDetailVO.setInsuredDetails(insuredVO);
        quoteDetailVO.setProductDetails(productVO);
        quoteDetailVO.setStatusCode(1);

        quoteSlipService.createQuoteSlip(quoteDetailVO);

    }



}
