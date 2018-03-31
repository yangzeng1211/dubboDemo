package com.yz.dubbo.demo;

import com.alibaba.dubbo.demo.DemoService;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 手写consumer
 * Created by yz on 2018/3/5.
 */
public class YzConsumer {
    public static void main(String[] args) {
        // 返回实现类的实例，实现类在provider , 使用反射获取
        DemoService demoService = (DemoService) remote(DemoService.class);
        String result = demoService.sayHello("yz");
        System.out.println("客户端收到结果："+ result);
    }

    private static Object remote(final Class clazz) {
        return Proxy.newProxyInstance(clazz.getClassLoader(), new Class[]{clazz}, new InvocationHandler() {
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                return null;
            }
        });
    }
}
