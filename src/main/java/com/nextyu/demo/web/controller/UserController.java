package com.nextyu.demo.web.controller;

import com.nextyu.demo.service.UserService;
import com.nextyu.summer.framework.annotation.Autowired;
import com.nextyu.summer.framework.annotation.RequestMapping;
import com.nextyu.summer.framework.annotation.RequestMethod;
import com.nextyu.summer.framework.annotation.RestController;

/**
 * created on 2017-06-23 13:58
 *
 * @author nextyu
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(name = "/users", method = RequestMethod.GET)
    public Object list() {
        return userService.listAll();
    }


}
