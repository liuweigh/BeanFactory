package com.shenruan.dao.impl;


import com.shenruan.dao.IAccountDao;

public class AccountDaoImpl implements IAccountDao {

    @Override
    public void saveAccount() {
        System.out.println("保存了账户MySql");
    }
}
