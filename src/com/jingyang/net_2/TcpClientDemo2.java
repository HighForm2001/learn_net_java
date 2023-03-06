package com.jingyang.net_2;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class TcpClientDemo2 {
    public static void main(String[] args) throws Exception {
        //create socket
        Socket localhost = new Socket(InetAddress.getByName("localhost"),9999);

        // create an output stream
        OutputStream os = localhost.getOutputStream();

        //file stream
        FileInputStream fs = new FileInputStream(new File("D:\\Java\\net\\src\\test.jpg"));
        byte[] buffer = new byte[1024];
        int len;
        while((len = fs.read(buffer))!=-1){
            os.write(buffer,0,len);
        }
        localhost.shutdownOutput(); // tell that im finished
        InputStream inputStream = localhost.getInputStream();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        byte[] buffer2 = new byte[1024];
        int len2;
        while((len2=inputStream.read(buffer2))!=-1){
            baos.write(buffer2,0,len2);
        }
        fs.close();
        os.close();
        localhost.close();


    }
}
