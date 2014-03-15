package com.shrinfo.ibs.search.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;

import com.shrinfo.ibs.base.dao.BaseDBDAO;
import com.shrinfo.ibs.cmn.exception.BusinessException;
import com.shrinfo.ibs.cmn.logger.Logger;
import com.shrinfo.ibs.cmn.utils.Utils;
import com.shrinfo.ibs.cmn.vo.BaseVO;
import com.shrinfo.ibs.gen.pojo.IbsRecordTypes;
import com.shrinfo.ibs.gen.pojo.IbsVInsuredSearch;
import com.shrinfo.ibs.vo.business.ContactVO;
import com.shrinfo.ibs.vo.business.CustomerVO;
import com.shrinfo.ibs.vo.business.InsuredVO;
import com.shrinfo.ibs.vo.business.SearchItemVO;
import com.shrinfo.ibs.vo.business.SearchVO;


public class SearchDaoImpl extends BaseDBDAO implements SearchDao {

    private static final Logger LOGGER = Logger.getLogger(SearchDaoImpl.class);

    @Override
    public BaseVO getSearchResult(BaseVO baseVO) {


        // Testing the code to retrieve the records
        //
        List<IbsRecordTypes> ibsRecordTypes =
            getHibernateTemplate().find("from IbsRecordTypes ibsRecordTypes");
        System.out.println("ibsRecordTypes-->" + ibsRecordTypes);
        SearchVO searchVO = new SearchVO();

        if (null == baseVO) {
            throw new BusinessException("cmn.unknownError", null, "Search critaria cannot be null");
        }
        if (!(baseVO instanceof SearchItemVO)) {
            throw new BusinessException("cmn.unknownError", null, "Search critaria is invalid");
        }
        SearchItemVO searchItemVO = (SearchItemVO) baseVO;

        searchVO.setSearchItems(fetchInsuredSearchResults(searchItemVO));

        return searchVO;
    }


    private List<SearchItemVO> fetchInsuredSearchResults(SearchItemVO searchItem) {

        List<SearchItemVO> searchResults = new ArrayList<SearchItemVO>();

        List<IbsVInsuredSearch> ibsVInsuredSearch = null;
        // List<Object> ibsVInsuredSearch = null;
        try {
            ibsVInsuredSearch =
                getHibernateTemplate().find(getQuery(searchItem),
                    searchItem.getCustomerDetails().getName(),
                    searchItem.getCustomerDetails().getContactAndAddrDets().getEmailId());
        } catch (HibernateException hibernateException) {
            throw new BusinessException("pas.gi.couldNotGetCustDetails", hibernateException,
                "Error while insured search");
        }
        SearchItemVO itemVO = null;
        for (IbsVInsuredSearch insuredSearch : ibsVInsuredSearch) {
            itemVO = new SearchItemVO();
            populate(itemVO, insuredSearch);
            searchResults.add(itemVO);
        }
        return searchResults;
    }

    private String getQuery(SearchItemVO searchItem) {

        StringBuffer buffer = new StringBuffer();
        buffer.append(" from IbsVInsuredSearch ibsVInsuredSearch where ibsVInsuredSearch.custName = ?"
            + " and ibsVInsuredSearch.email = ?");

        return buffer.toString();
    }

    private void populate(SearchItemVO itemVO, IbsVInsuredSearch ibsVInsuredSearch) {

        if (null == itemVO) {
            itemVO = new SearchItemVO();
        }

        CustomerVO customerVO = new CustomerVO();
        customerVO.setName(ibsVInsuredSearch.getCustName());
        ContactVO contactVO = new ContactVO();
        contactVO.setEmailId(ibsVInsuredSearch.getEmail());
        contactVO.setEmailId(ibsVInsuredSearch.getMobNo());
        customerVO.setContactAndAddrDets(contactVO);

        itemVO.setCustomerDetails(customerVO);

        InsuredVO insuredVO = new InsuredVO();
        insuredVO.setName(ibsVInsuredSearch.getInsuredName());

        itemVO.setInsuredDetails(insuredVO);

        itemVO.setEnquiryNum(ibsVInsuredSearch.getId().getEnquiryNo().longValue());
        if (!Utils.isEmpty(ibsVInsuredSearch.getPolicyNo())) {
            itemVO.setPolicyNum(ibsVInsuredSearch.getPolicyNo());
        }
        if (!Utils.isEmpty(ibsVInsuredSearch.getQuotationNo())) {
            itemVO.setQuotationNum(ibsVInsuredSearch.getQuotationNo().longValue());
        }
    }
}
