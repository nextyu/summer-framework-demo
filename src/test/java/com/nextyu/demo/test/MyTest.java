package com.nextyu.demo.test;

import com.nextyu.summer.framework.util.ClassUtil;
import org.junit.Test;

/**
 * created on 2017-06-23 14:20
 *
 * @author nextyu
 */
public class MyTest {

    @Test
    public void test() {
        Class<?> aClass = ClassUtil.loadClass("com.nextyu.summer.framework.helper.ClassHelper");
        System.out.println(aClass);
    }
}
