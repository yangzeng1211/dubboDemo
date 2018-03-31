package com.alibaba.bubbo.demo;

import com.alibaba.dubbo.demo.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Consumer
 * Created by yz on 2018/3/5.
 */
public class Consumer {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"consumer.xml"});
        context.start();
        // 获取远程服务代理
        DemoService demoService = (DemoService) context.getBean("demoService");
        // 执行远程方法
        String hello = demoService.sayHello("world");
        System.out.println(hello);
    }
}
