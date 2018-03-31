package com.yz.dubbo.demo;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 手写provider
 * Created by yz on 2018/3/5.
 */
public class YzProvider {

    /**
     * 首先解决网络通信，consumer调用provider
     * @param args
     */
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(6666);
            while (true){
                Socket socket = serverSocket.accept();
                InputStream is = socket.getInputStream();
                byte[] b = new byte[16];
                is.read(b);
                System.out.println("服务端接收到的请求："+new String(b));
                is.close();
                socket.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
