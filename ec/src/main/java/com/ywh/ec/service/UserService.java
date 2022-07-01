package com.ywh.ec.service;


import com.ywh.ec.domain.User;

import java.util.List;

public interface UserService {
    String login(String username,String pwd);
    List<User> listUser();
}
