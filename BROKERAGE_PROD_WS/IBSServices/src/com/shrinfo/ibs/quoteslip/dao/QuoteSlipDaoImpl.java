package com.shrinfo.ibs.quoteslip.dao;

import org.hibernate.HibernateException;

import com.shrinfo.ibs.base.dao.BaseDBDAO;
import com.shrinfo.ibs.cmn.exception.BusinessException;
import com.shrinfo.ibs.cmn.exception.SystemException;
import com.shrinfo.ibs.cmn.vo.BaseVO;
import com.shrinfo.ibs.dao.utils.DAOUtils;
import com.shrinfo.ibs.dao.utils.MapperUtil;
import com.shrinfo.ibs.dao.utils.NextSequenceValue;
import com.shrinfo.ibs.gen.pojo.IbsQuoteSlipHeader;
import com.shrinfo.ibs.gen.pojo.IbsQuoteSlipHeaderId;
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
                    " from IbsQuoteSlipHeader ibsQuoteSlipHeader where ibsQuoteSlipHeader.id.id = ? "
                        + "and ibsQuoteSlipHeader.id.quoteSlipVersion = ?",
                    ((QuoteDetailVO) baseVO).getQuoteSlipId(),
                    ((QuoteDetailVO) baseVO).getQuoteSlipVersion()).get(0);
        } catch (HibernateException hibernateException) {
            throw new BusinessException("pas.gi.couldNotGetCustDetails", hibernateException,
                "Error while insured search");
        }

        MapperUtil.populateQuoteSlipDetailVO(quoteDetailVO, ibsQuoteSlipHeader);

        return quoteDetailVO;
    }


    @Override
    public BaseVO createQuoteSlip(BaseVO baseVO) {

        if (null == baseVO) {
            throw new BusinessException("cmn.unknownError", null, "Customer details cannot be null");
        }
        if (!(baseVO instanceof QuoteDetailVO)) {
            throw new BusinessException("cmn.unknownError", null, "Customer details are invalid");
        }
        QuoteDetailVO quoteDetailVO = (QuoteDetailVO) baseVO;
        IbsQuoteSlipHeader quoteSlipHeader = null;

        try {
            quoteSlipHeader = DAOUtils.constructIbsQuoteSlipHeader(quoteDetailVO);
            IbsQuoteSlipHeaderId quoteSlipHeaderId = new IbsQuoteSlipHeaderId();
            quoteSlipHeaderId.setId(NextSequenceValue.getNextSequence("IBS_QUOTE_SLIP_HEADER_SEQ",
                getHibernateTemplate()));
            quoteSlipHeaderId.setQuoteSlipVersion(1l);
            quoteSlipHeader.setId(quoteSlipHeaderId);
            saveOrUpdate(quoteSlipHeader);

            quoteDetailVO.setQuoteSlipId(quoteSlipHeader.getId().getId());
            quoteDetailVO.setQuoteSlipVersion(quoteSlipHeader.getId().getQuoteSlipVersion());
        } catch (HibernateException hibernateException) {
            throw new BusinessException("pas.gi.couldNotSaveQuoteSlipDetails", hibernateException,
                "Error while saving Quote Slip data");
        } catch (Exception exception) {
            throw new SystemException("pas.gi.couldNotSaveQuoteSlipDetails", exception,
                "Error while saving Quote Slip data");
        }
        return quoteDetailVO;
    }

}
