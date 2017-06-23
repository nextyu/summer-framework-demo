package com.nextyu.demo.service;

import com.nextyu.demo.entity.User;
import com.nextyu.summer.framework.annotation.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * created on 2017-06-23 15:11
 *
 * @author nextyu
 */
@Service
public class UserService {

    public List<User> listAll() {
        List<User> users = new ArrayList<>();
        users.add(new User(1L, "小明"));
        users.add(new User(2L, "小黑"));

        return users;
    }

}
