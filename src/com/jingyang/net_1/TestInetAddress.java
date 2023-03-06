package com.jingyang.net_1;

import java.net.InetAddress;

//test ip
public class TestInetAddress {
    public static void main(String[] args){
        try{
            // get localhost address
//            InetAddress address1 = InetAddress.getByName("127.0.0.1");
//            InetAddress address2 = InetAddress.getByName("localhost");
//            InetAddress address3 = InetAddress.getLocalHost();
//            InetAddress address4 = InetAddress.getByName("www.google.com");
            InetAddress address5 = InetAddress.getByName("www.google.com");

            // 常用方法
            System.out.println(address5.getAddress());
            System.out.println(address5.getCanonicalHostName());
            System.out.println(address5.getHostAddress());
            System.out.println(address5.getHostName());

        }catch(Exception ex){
            ex.printStackTrace();
        }

    }
}
