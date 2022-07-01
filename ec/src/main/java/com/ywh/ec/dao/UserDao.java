package com.ywh.ec.dao;

import com.ywh.ec.domain.User;

import java.util.HashMap;
import java.util.Map;

public class UserDao {
    private static Map<Integer, User> userMap = new HashMap<>();

    static {
        userMap.put(1,new User(1,"ywh","123"));
        userMap.put(2,new User(2,"wl","456"));
        userMap.put(3,new User(3,"admin","666"));
    }
}
