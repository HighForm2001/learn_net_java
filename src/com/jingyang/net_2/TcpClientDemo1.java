package com.jingyang.net_2;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

//客户端
public class TcpClientDemo1 {
    public static void main(String[] args) {
        //要知道一个地址
        Socket socket = null;
        try {
            InetAddress localhost = InetAddress.getByName("localhost");

            //端口号
            int port = 9999;
            //链接
            socket = new Socket(localhost,port);
            // send msg
            OutputStream outputStream = socket.getOutputStream();
            outputStream.write("hello".getBytes());
            outputStream.close();

        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally{
            try {
                if (socket!=null){
                    socket.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }


    }
}
