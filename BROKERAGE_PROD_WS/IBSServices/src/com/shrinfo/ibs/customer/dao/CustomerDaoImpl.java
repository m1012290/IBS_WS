package com.shrinfo.ibs.customer.dao;

import org.hibernate.HibernateException;

import com.shrinfo.ibs.base.dao.BaseDBDAO;
import com.shrinfo.ibs.cmn.exception.BusinessException;
import com.shrinfo.ibs.cmn.utils.Utils;
import com.shrinfo.ibs.cmn.vo.BaseVO;
import com.shrinfo.ibs.gen.pojo.IbsCustomer;
import com.shrinfo.ibs.vo.business.ContactVO;
import com.shrinfo.ibs.vo.business.CustomerVO;


public class CustomerDaoImpl extends BaseDBDAO implements CustomerDao {



    @Override
    public BaseVO getCustomer(BaseVO baseVO) {

        CustomerVO customerVO = new CustomerVO();

        if (null == baseVO) {
            throw new BusinessException("cmn.unknownError", null, "Customer details cannot be null");
        }
        if (!(baseVO instanceof CustomerVO)) {
            throw new BusinessException("cmn.unknownError", null, "Customer details are invalid");
        }

        IbsCustomer ibsCustomer = null;

        try {
            ibsCustomer =
                (IbsCustomer) getHibernateTemplate().find(
                    " from IbsCustomer ibsCustomer where ibsCustomer.id = ?",
                    ((CustomerVO) baseVO).getCustomerId()).get(0);
        } catch (HibernateException hibernateException) {
            throw new BusinessException("pas.gi.couldNotGetCustDetails", hibernateException,
                "Error while insured search");
        }

        populateCustomerVO(customerVO, ibsCustomer);

        return customerVO;
    }

    @Override
    public BaseVO createCustomer(BaseVO baseVO) {
        // TODO Auto-generated method stub
        return null;
    }

    private void populateCustomerVO(CustomerVO customerVO, IbsCustomer ibsCustomer) {

        if(Utils.isEmpty(ibsCustomer)){
            return;
        }
        
        if(Utils.isEmpty(customerVO)){
            customerVO = new CustomerVO();
        }
        customerVO.setName(ibsCustomer.getName());
        customerVO.setCategory(ibsCustomer.getCategory());
        customerVO.setClassification(ibsCustomer.getClassification());
        customerVO.setCustomerId(ibsCustomer.getId().longValue());
        customerVO.setGroup(ibsCustomer.getCustGroup());
        //customerVO.setIsStatusActive(ibsCustomer.get)
        customerVO.setSalutation(ibsCustomer.getSalutation());
        customerVO.setSourceOfBusiness(ibsCustomer.getSource());
        
        ContactVO contactVO = new ContactVO();
        contactVO.setEmailId(ibsCustomer.getIbsContact().getPrimaryEmailId());
        contactVO.setMobileNo(ibsCustomer.getIbsContact().getPrimaryMobileNo());
        //contactVO.setAddress(ibsCustomer.getIbsContact().getAddress());
    }

}
