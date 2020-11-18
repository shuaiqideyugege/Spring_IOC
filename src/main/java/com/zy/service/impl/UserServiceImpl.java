package com.zy.service.impl;

import com.zy.dao.UserDao;
import com.zy.service.UserService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

//@Component("userService")
@Service("userService")
public class UserServiceImpl implements UserService {
    //@Autowired
    //@Qualifier("userDao")
    @Resource(name="userDao")//reosurce = autowirter+qualifier
    private UserDao userDao;

//    public void setUserDao(UserDao userDao) {
//        this.userDao = userDao;
//    }
    @Value("${driver}")
    private String driver;

    @Override
    public void save() {
        System.out.println("driver = " + driver);
        System.out.println("UserServiceImpl.save");
        userDao.save();
    }
    @PostConstruct
    public void init(){
        System.out.println("service对象初始化方法");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("service对象销毁方法");
    }

}
