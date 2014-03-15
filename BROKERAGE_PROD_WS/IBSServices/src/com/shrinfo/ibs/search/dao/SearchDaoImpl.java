package com.shrinfo.ibs.search.dao;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;

import com.shrinfo.ibs.base.dao.BaseDBDAO;
import com.shrinfo.ibs.cmn.exception.BusinessException;
import com.shrinfo.ibs.cmn.logger.Logger;
import com.shrinfo.ibs.cmn.utils.Utils;
import com.shrinfo.ibs.cmn.vo.BaseVO;
import com.shrinfo.ibs.gen.pojo.IbsVInsuredSearch;
import com.shrinfo.ibs.vo.business.SearchItemVO;
import com.shrinfo.ibs.vo.business.SearchVO;


public class SearchDaoImpl extends BaseDBDAO implements SearchDao {

    private static final Logger LOGGER = Logger.getLogger(SearchDaoImpl.class);

    @Override
    public BaseVO getSearchResult(BaseVO baseVO) {


        SearchVO searchVO = new SearchVO();

        if (null == baseVO) {
            throw new BusinessException("cmn.unknownError", null, "Search critaria cannot be null");
        }
        if (!(baseVO instanceof SearchItemVO)) {
            throw new BusinessException("cmn.unknownError", null, "Search critaria is invalid");
        }
        SearchItemVO searchItemVO = (SearchItemVO) baseVO;

        searchVO.setSearchItems(fetchInsuredSearchResults(searchItemVO));

        LOGGER.info("search results: " + searchVO.toString());

        return searchVO;
    }


    @SuppressWarnings("unchecked")
    private List<SearchItemVO> fetchInsuredSearchResults(SearchItemVO searchItem) {

        List<SearchItemVO> searchResults = new ArrayList<SearchItemVO>();

        List<IbsVInsuredSearch> ibsVInsuredSearch = null;
        try {
            ibsVInsuredSearch =
                getHibernateTemplate()
                        .find(
                            "from IbsVInsuredSearch ibsVInsuredSearch where ibsVInsuredSearch.custName = ?"
                                + " and ibsVInsuredSearch.email = ? and ibsVInsuredSearch.mobNo = ? and ibsVInsuredSearch.insuredName = ? and"
                                + " ibsVInsuredSearch.id.enquiryNo = ? and ibsVInsuredSearch.quotationNo = ? and ibsVInsuredSearch.policyNo = ?",
                            searchItem.getCustomerName(), searchItem.getCustomerEmail(),
                            searchItem.getCustomerMob(), searchItem.getInsuredName(),
                            BigDecimal.valueOf(searchItem.getEnquiryNum()),
                            BigDecimal.valueOf(searchItem.getQuotationNum()),
                            searchItem.getPolicyNum());
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

    private void populate(SearchItemVO itemVO, IbsVInsuredSearch ibsVInsuredSearch) {

        if (Utils.isEmpty(ibsVInsuredSearch)) {
            return;
        }

        if (Utils.isEmpty(itemVO)) {
            itemVO = new SearchItemVO();
        }

        itemVO.setCustomerName(ibsVInsuredSearch.getCustName());
        itemVO.setCustomerEmail(ibsVInsuredSearch.getEmail());
        itemVO.setCustomerMob(ibsVInsuredSearch.getMobNo());
        itemVO.setInsuredName(ibsVInsuredSearch.getInsuredName());
        itemVO.setPolicyNum(ibsVInsuredSearch.getPolicyNo());
        if (!Utils.isEmpty(ibsVInsuredSearch.getId().getEnquiryNo())) {
            itemVO.setEnquiryNum(ibsVInsuredSearch.getId().getEnquiryNo().longValue());
        }
        if (!Utils.isEmpty(ibsVInsuredSearch.getQuotationNo())) {
            itemVO.setQuotationNum(ibsVInsuredSearch.getQuotationNo().longValue());
        }
    }
}
