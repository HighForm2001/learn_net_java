package com.jingyang.net_2;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

//服务端
public class TcpServerDemo1 {
    public static void main(String[] args) {
        //要有一个地址
        try {
            ServerSocket serverSocket = new ServerSocket(9999);
            //wait to connect
            Socket accept = serverSocket.accept();
            //读取客户端的消息
            InputStream inputStream = accept.getInputStream();

            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            byte[] buffer = new byte[1024];
            int len;
            while((len=inputStream.read())!=-1){
                baos.write(buffer,0,len);
            }
            System.out.println(baos.toString());
            baos.close();
            inputStream.close();
            accept.close();
            serverSocket.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally{

        }
    }
}
