package com.shenruan.service.impl;

//import org.springframework.beans.com.shenruan.factory.BeanFactory;

import com.shenruan.dao.IAccountDao;
import com.shenruan.factory.BeanFactory;
import com.shenruan.service.IAccountService;

public class AccountServiceImpl implements IAccountService {

    private IAccountDao accountDao = (IAccountDao) BeanFactory.getBean("userDao");

    @Override
    public void saveAccount() {
        accountDao.saveAccount();
    }
}
