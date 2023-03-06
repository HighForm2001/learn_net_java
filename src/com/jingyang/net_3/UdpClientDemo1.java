package com.jingyang.net_3;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

// 不需要连接
public class UdpClientDemo1 {
    public static void main(String[] args)throws Exception {
        // create socket
        DatagramSocket ds = new DatagramSocket();

        // create packet
        String msg = "hello server";

        // send to who?
        InetAddress inetAddress = InetAddress.getByName("localhost");
        int port = 9999;
        DatagramPacket datagramPacket = new DatagramPacket(msg.getBytes(), 0, msg.getBytes().length, inetAddress, port);
        ds.send(datagramPacket);
        ds.close();

    }
}
