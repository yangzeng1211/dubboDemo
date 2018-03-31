package com.alibaba.dubbo.demo;

import com.alibaba.dubbo.rpc.RpcContext;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * provider
 * Created by yz on 2018/3/5.
 */
public class DemoServiceImpl implements DemoService{
    public String sayHello(String name) {
        System.out.println("[" + new SimpleDateFormat("HH:mm:ss").format(new Date()) + "] Hello " + name + ", request from consumer: " + RpcContext.getContext().getRemoteAddress());
        return "Hello " + name + ", response form provider: " + RpcContext.getContext().getLocalAddress();
    }
}
