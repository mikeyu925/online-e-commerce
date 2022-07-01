package com.ywh.ec.service.impl;

import com.ywh.ec.dao.UserDao;
import com.ywh.ec.domain.User;
import com.ywh.ec.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {
    private static Map<String,User> sessionMap = new HashMap<>();
    @Autowired
    private UserDao userDao;

    @Override
    public String login(String username, String pwd) {
        User user = userDao.login(username,pwd);
        if (user == null) return null;
        else{
            String token = UUID.randomUUID().toString();
            System.out.println(token);
            sessionMap.put(token,user);
            return token;
        }
    }

    @Override
    public List<User> listUser() {
        return userDao.listUser();
    }
}
