package com.jingyang.net_3;

import java.net.DatagramPacket;
import java.net.DatagramSocket;


//还是要等待客户端连接
public class UdpServerDemo1 {
    public static void main(String[] args) throws Exception{
        //开放端口
        DatagramSocket socket = new DatagramSocket(9999);
        //accept datagram
        byte[] buffer = new byte[1024];
        DatagramPacket datagramPacket = new DatagramPacket(buffer, 0, buffer.length);
        socket.receive(datagramPacket);//阻塞接收
        System.out.println(new String(datagramPacket.getData(),0,datagramPacket.getLength()));
        socket.close();
    }
}
