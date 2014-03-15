package com.shrinfo.ibs.quoteslip.svc;

import java.util.List;

import com.shrinfo.ibs.base.service.BaseService;
import com.shrinfo.ibs.cmn.vo.BaseVO;


/**
 * 
 * @author Rahul
 * 
 */

public class QuoteSlipServicempl extends BaseService implements QuoteSlipService {
    
    @Override
    public Object invokeMethod( String methodName, Object... args ){
        Object returnValue = null;

        if( "getQuoteSlipDetails".equals( methodName ) ){
            returnValue = getQuoteSlipDetails( (BaseVO) args[ 0 ] );
        }
        if( "createQuoteSlip".equals( methodName ) ){
            returnValue = createQuoteSlip( (BaseVO) args[ 0 ] );
        }
        if( "emailQuoteSlip".equals( methodName ) ){
            //returnValue = emailQuoteSlip( (BaseVO) args[ 0 ], args );
        }

        return returnValue;
    }



    @Override
    public BaseVO getQuoteSlipDetails(BaseVO baseVO) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public BaseVO createQuoteSlip(BaseVO baseVO) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public BaseVO emailQuoteSlip(BaseVO baseVO, List<BaseVO> companies) {
        // TODO Auto-generated method stub
        return null;
    }
}
