package com.shrinfo.ibs.quoteslip.svc;

import java.util.List;

import com.shrinfo.ibs.base.service.BaseService;
import com.shrinfo.ibs.cmn.vo.BaseVO;
import com.shrinfo.ibs.insured.dao.InsuredDao;
import com.shrinfo.ibs.quoteslip.dao.QuoteSlipDao;
import com.shrinfo.ibs.vo.business.InsuredVO;
import com.shrinfo.ibs.vo.business.QuoteDetailVO;



public class QuoteSlipServicempl extends BaseService implements QuoteSlipService {

    QuoteSlipDao quoteSlipDao;

    InsuredDao insuredDao;

    @Override
    public Object invokeMethod(String methodName, Object... args) {
        Object returnValue = null;

        if ("getQuoteSlipDetails".equals(methodName)) {
            returnValue = getQuoteSlipDetails((BaseVO) args[0]);
        }
        if ("getInsuredDetails".equals(methodName)) {
            returnValue = getInsuredDetails((BaseVO) args[0]);
        }
        if ("createQuoteSlip".equals(methodName)) {
            returnValue = createQuoteSlip((BaseVO) args[0]);
        }
        if ("emailQuoteSlip".equals(methodName)) {
            // returnValue = emailQuoteSlip( (BaseVO) args[ 0 ], args );
        }

        return returnValue;
    }



    @Override
    public BaseVO getQuoteSlipDetails(BaseVO baseVO) {
        return quoteSlipDao.getQuoteSlipDetails(baseVO);
    }

    @Override
    public BaseVO getInsuredDetails(BaseVO baseVO) {
        return insuredDao.getInsuredetails(baseVO);
    }

    @Override
    public BaseVO createQuoteSlip(BaseVO baseVO) {
        InsuredVO insuredVO = (InsuredVO) insuredDao.createInsuredDetails(baseVO);
        QuoteDetailVO quoteDetailVO = (QuoteDetailVO) quoteSlipDao.createQuoteSlip(baseVO);
        quoteDetailVO.setInsuredDetails(insuredVO);
        return quoteDetailVO;
    }

    @Override
    public BaseVO emailQuoteSlip(BaseVO baseVO, List<BaseVO> companies) {
        // TODO Auto-generated method stub
        return null;
    }




    public void setQuoteSlipDao(QuoteSlipDao quoteSlipDao) {
        this.quoteSlipDao = quoteSlipDao;
    }




    public void setInsuredDao(InsuredDao insuredDao) {
        this.insuredDao = insuredDao;
    }

}
