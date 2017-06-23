package com.nextyu.demo.web.controller;

import com.nextyu.summer.framework.annotation.RequestMapping;
import com.nextyu.summer.framework.annotation.RequestMethod;
import com.nextyu.summer.framework.annotation.RestController;

/**
 * created on 2017-06-23 16:01
 *
 * @author nextyu
 */
@RestController
public class OrderController {

    @RequestMapping(name = "/orders", method = RequestMethod.GET)
    public Object list() {
        return "order list";
    }
}
