package com.zy.dao.impl;

import com.zy.dao.UserDao;
import org.springframework.stereotype.Repository;

//@Component("userDao")
@Repository("userDao")
//@Scope("singleton")
//@Scope("prototype")
public class UserDaoImpl implements UserDao {
    @Override
    public void save() {
        System.out.println("UserDaoImpl.save");
    }
}
