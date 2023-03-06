package com.jingyang.net_2;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServerDemo2 {
    public static void main(String[] args)throws Exception {
        // create port
        ServerSocket socket = new ServerSocket(9999);
        // 监听客户端连接
        Socket accept = socket.accept();
        // 获取输入流
        InputStream is = accept.getInputStream();

        FileOutputStream fo = new FileOutputStream(new File("receive.jpg"));
        byte[] buffer = new byte[1024];
        int len;
        while ((len = is.read(buffer))!=1){
            fo.write(buffer,0,len);
        }
        OutputStream os = accept.getOutputStream();
        os.write("finished!".getBytes());
        fo.close();
        is.close();
        accept.close();
        socket.close();


    }
}
