package com.alibaba.dubbo.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * provider
 * Created by yz on 2018/3/5.
 */
public class Provider {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"provider.xml"});
        context.start();
        System.out.println("启动成功！端口号：20881");
        // 按任意键退出
        System.in.read();
    }
}
