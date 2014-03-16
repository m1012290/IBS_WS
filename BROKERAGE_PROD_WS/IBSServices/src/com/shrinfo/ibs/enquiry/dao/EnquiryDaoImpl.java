package com.shrinfo.ibs.enquiry.dao;

import java.math.BigDecimal;

import org.hibernate.HibernateException;

import com.shrinfo.ibs.base.dao.BaseDBDAO;
import com.shrinfo.ibs.cmn.exception.BusinessException;
import com.shrinfo.ibs.cmn.vo.BaseVO;
import com.shrinfo.ibs.dao.utils.DAOUtils;
import com.shrinfo.ibs.dao.utils.MapperUtil;
import com.shrinfo.ibs.gen.pojo.IbsContact;
import com.shrinfo.ibs.gen.pojo.IbsCustomerEnquiry;
import com.shrinfo.ibs.vo.app.RecordType;
import com.shrinfo.ibs.vo.business.EnquiryVO;


public class EnquiryDaoImpl extends BaseDBDAO implements EnquiryDao {


    @Override
    public BaseVO getEnquiryDetail(BaseVO baseVO) {

        EnquiryVO enquiryVO = new EnquiryVO();

        if (null == baseVO) {
            throw new BusinessException("cmn.unknownError", null, "Customer details cannot be null");
        }
        if (!(baseVO instanceof EnquiryVO)) {
            throw new BusinessException("cmn.unknownError", null, "Customer details are invalid");
        }

        IbsCustomerEnquiry ibsCustomerEnquiry = null;

        try {
            ibsCustomerEnquiry =
                (IbsCustomerEnquiry) getHibernateTemplate().find(
                    " from IbsCustomerEnquiry ibsCustomerEnquiry where ibsCustomerEnquiry.id = ?",
                    BigDecimal.valueOf(((EnquiryVO) baseVO).getEnquiryNo())).get(0);
        } catch (HibernateException hibernateException) {
            throw new BusinessException("pas.gi.couldNotGetCustDetails", hibernateException,
                "Error while insured search");
        }

        MapperUtil.populateEnquiryVO(enquiryVO, ibsCustomerEnquiry);

        return enquiryVO;
    }

    
    @Override
    public BaseVO createEnquiry(BaseVO baseVO) {

        if (null == baseVO) {
            throw new BusinessException("cmn.unknownError", null, "Customer details cannot be null");
        }

        if (!(baseVO instanceof EnquiryVO)) {
            throw new BusinessException("cmn.unknownError", null, "Customer details are invalid");
        }
        EnquiryVO enquiryVO = (EnquiryVO) baseVO;
        IbsContact ibsContact =
            DAOUtils.constructIbsContactForRecType(enquiryVO, RecordType.ENQUIRY_CONTACT);
        saveOrUpdate(ibsContact);
        IbsCustomerEnquiry ibsEnquiry =
            (IbsCustomerEnquiry) ((ibsContact.getIbsCustomerEnquiries().toArray())[0]);
        enquiryVO.setEnquiryNo(ibsEnquiry.getEnquiryNo());
        return enquiryVO;
    }

}
