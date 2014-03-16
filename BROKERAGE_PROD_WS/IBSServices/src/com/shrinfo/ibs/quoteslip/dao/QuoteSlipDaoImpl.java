package com.shrinfo.ibs.quoteslip.dao;

import org.hibernate.HibernateException;

import com.shrinfo.ibs.base.dao.BaseDBDAO;
import com.shrinfo.ibs.cmn.exception.BusinessException;
import com.shrinfo.ibs.cmn.vo.BaseVO;
import com.shrinfo.ibs.dao.utils.MapperUtil;
import com.shrinfo.ibs.gen.pojo.IbsQuoteSlipHeader;
import com.shrinfo.ibs.vo.business.QuoteDetailVO;


public class QuoteSlipDaoImpl extends BaseDBDAO implements QuoteSlipDao {

    @Override
    public BaseVO getQuoteSlipDetails(BaseVO baseVO) {

        QuoteDetailVO quoteDetailVO = new QuoteDetailVO();

        if (null == baseVO) {
            throw new BusinessException("cmn.unknownError", null, "Customer details cannot be null");
        }
        if (!(baseVO instanceof QuoteDetailVO)) {
            throw new BusinessException("cmn.unknownError", null, "Customer details are invalid");
        }

        IbsQuoteSlipHeader ibsQuoteSlipHeader = null;

        try {
            ibsQuoteSlipHeader =
                (IbsQuoteSlipHeader) getHibernateTemplate().find(
                    " from IbsQuoteSlipHeader ibsQuoteSlipHeader where ibsCustomerEnquiry.id = ? "
                        + "and ibsCustomerEnquiry.quoteSlipVersion = ?",
                    ((QuoteDetailVO) baseVO).getQuoteSlipId(),
                    ((QuoteDetailVO) baseVO).getQuoteSlipId()).get(0);
        } catch (HibernateException hibernateException) {
            throw new BusinessException("pas.gi.couldNotGetCustDetails", hibernateException,
                "Error while insured search");
        }

        MapperUtil.populateQuoteSlipDetailVO(quoteDetailVO, ibsQuoteSlipHeader);

        return quoteDetailVO;
    }


    @Override
    public BaseVO createQuoteSlip(BaseVO baseVO) {
        // TODO Auto-generated method stub
        return null;
    }    

}
