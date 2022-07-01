package com.ywh.ec.dao;

import com.ywh.ec.domain.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class UserDao {
    private static Map<String, User> userMap = new HashMap<>();

    static {
        userMap.put("ywh",new User(1,"ywh","123"));
        userMap.put("wl",new User(2,"wl","456"));
        userMap.put("admin",new User(3,"admin","666"));
    }

    public User login(String username,String pwd){
        User user = userMap.get(username);
        if (user == null) return null;
        if (user.getPwd().equals(pwd)){
            return user;
        }
        return null;
    }

    public List<User> listUser(){
        List<User> list = new ArrayList<>();
        list.addAll(userMap.values());
        return list;
    }

}
