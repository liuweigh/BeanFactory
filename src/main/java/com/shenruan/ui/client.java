package com.shenruan.ui;

import com.shenruan.factory.BeanFactory;
import com.shenruan.service.impl.AccountServiceImpl;

public class client {
    public static void main(String[] args) {
        AccountServiceImpl accountService = (AccountServiceImpl) BeanFactory.getBean("userService");
        accountService.saveAccount();
    }
}
