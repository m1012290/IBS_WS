package com.shrinfo.ibs.service.customer;

import com.shrinfo.ibs.vo.business.CustomerVO;


public interface CustomerService {

    public CustomerVO getCustomer(String customerCode);

    public void createCustomer(CustomerVO customer);

}
