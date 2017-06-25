package com.nextyu.demo.web.controller;

import com.nextyu.demo.entity.User;
import com.nextyu.demo.service.UserService;
import com.nextyu.summer.framework.annotation.Autowired;
import com.nextyu.summer.framework.annotation.RequestMapping;
import com.nextyu.summer.framework.annotation.RequestMethod;
import com.nextyu.summer.framework.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * created on 2017-06-23 13:58
 *
 * @author nextyu
 */
@RestController
public class UserController {

    private static Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @RequestMapping(name = "/users", method = RequestMethod.GET)
    public Object list() {
        return userService.listAll();
    }

    @RequestMapping(name = "/users", method = RequestMethod.POST)
    public Object save() {
        return userService.save(new User(5L, "呵呵"));
    }
}
