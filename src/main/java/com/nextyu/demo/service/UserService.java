package com.nextyu.demo.service;

import com.nextyu.demo.entity.User;
import com.nextyu.summer.framework.annotation.Service;
import com.nextyu.summer.framework.annotation.Transaction;

import java.util.ArrayList;
import java.util.List;

/**
 * created on 2017-06-23 15:11
 *
 * @author nextyu
 */
@Service
public class UserService {

    private static List<User> users = new ArrayList<>();

    static {
        users.add(new User(1L, "小明"));
        users.add(new User(2L, "小黑"));
    }

    public List<User> listAll() {
        return users;
    }

    @Transaction
    public Boolean save(User user) {
        users.add(user);
        return true;
    }

}
