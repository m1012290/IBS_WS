package com.shrinfo.ibs.service.test;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.shrinfo.ibs.cmn.utils.Utils;
import com.shrinfo.ibs.search.dao.SearchDaoImpl;
import com.shrinfo.ibs.search.svc.SearchService;
import com.shrinfo.ibs.vo.business.ContactVO;
import com.shrinfo.ibs.vo.business.CustomerVO;
import com.shrinfo.ibs.vo.business.SearchItemVO;
import com.shrinfo.ibs.vo.business.SearchVO;

/**
 * Servlet implementation class TestServlet
 */
public class TestServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // TODO Auto-generated method stub
        // SearchDaoImpl daoImpl = new SearchDaoImpl();

        SearchItemVO item = new SearchItemVO();
        item.setCustomerName("Shaik");
        item.setCustomerEmail("ABC_GMAIL.COM");
        item.setCustomerMob("9980808080");
        item.setInsuredName("insured");
        item.setEnquiryNum(3);
        item.setQuotationNum(2);
        item.setPolicyNum("1234567890");

        SearchService service = (SearchService) Utils.getBean("customerInsuredSearchSvcBean");

        System.out.println(((SearchVO)service.getSearchResult(item)).getSearchItems());

        // daoImpl.getSearchResult(item);
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

}
