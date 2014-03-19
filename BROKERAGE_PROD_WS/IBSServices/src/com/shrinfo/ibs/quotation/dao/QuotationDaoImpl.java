package com.shrinfo.ibs.quotation.dao;

import java.util.List;

import org.hibernate.HibernateException;

import com.shrinfo.ibs.base.dao.BaseDBDAO;
import com.shrinfo.ibs.cmn.exception.BusinessException;
import com.shrinfo.ibs.cmn.vo.BaseVO;
import com.shrinfo.ibs.dao.utils.MapperUtil;
import com.shrinfo.ibs.gen.pojo.IbsQuoteComparisionHeader;
import com.shrinfo.ibs.vo.business.QuoteDetailVO;


public class QuotationDaoImpl extends BaseDBDAO implements QuotationDao {




    @Override
    public List<BaseVO> getQuotations(BaseVO baseVO) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public BaseVO getQuotation(BaseVO baseVO) {
        QuoteDetailVO quoteDetailVO = new QuoteDetailVO();

        if (null == baseVO) {
            throw new BusinessException("cmn.unknownError", null,
                "Quotation details cannot be null");
        }
        if (!(baseVO instanceof QuoteDetailVO)) {
            throw new BusinessException("cmn.unknownError", null, "Quotation details are invalid");
        }

        IbsQuoteComparisionHeader ibsQuoteComparisionHeader = null;

        try {
            ibsQuoteComparisionHeader =
                (IbsQuoteComparisionHeader) getHibernateTemplate().find(
                    " from IbsQuoteComparisionHeader ibsQuoteComparisionHeader "
                        + "where ibsQuoteComparisionHeader.id = ? ",
                    ((QuoteDetailVO) baseVO).getQuoteNo());
        } catch (HibernateException hibernateException) {
            throw new BusinessException("pas.gi.couldNotGetQuotationDetails", hibernateException,
                "Error while insured search");
        }

        MapperUtil.populateQuoteSlipDetailVO(quoteDetailVO, ibsQuoteComparisionHeader);

        return quoteDetailVO;
    }

    @Override
    public BaseVO createQuotation(BaseVO baseVO) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public BaseVO closeQuotation(BaseVO baseVO) {
        // TODO Auto-generated method stub
        return null;
    }



}
