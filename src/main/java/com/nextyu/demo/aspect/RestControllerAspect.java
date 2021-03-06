package com.nextyu.demo.aspect;

import com.nextyu.summer.framework.annotation.Aspect;
import com.nextyu.summer.framework.annotation.RestController;
import com.nextyu.summer.framework.proxy.AspectProxy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Method;

/**
 * 拦截 Controller 所有方法
 * created on 2017-06-23 17:26
 *
 * @author nextyu
 */
@Aspect(RestController.class)
public class RestControllerAspect extends AspectProxy {

    private static Logger logger = LoggerFactory.getLogger(RestControllerAspect.class);

    private long begin;

    @Override
    public void before(Class<?> cls, Method method, Object[] params) throws Throwable {
        logger.debug("---------- begin ----------");
        logger.debug(String.format("class: %s", cls.getName()));
        logger.debug(String.format("method: %s", method.getName()));
        begin = System.currentTimeMillis();
    }

    @Override
    public void after(Class<?> cls, Method method, Object[] params, Object result) throws Throwable {
        logger.debug(String.format("time: %dms", System.currentTimeMillis() - begin));
        logger.debug("----------- end -----------");
    }
}
