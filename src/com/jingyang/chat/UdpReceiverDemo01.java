package com.jingyang.chat;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UdpReceiverDemo01 {
    public static void main(String[] args) throws Exception {
        DatagramSocket socket = new DatagramSocket(6666);
        while (true) {
            byte[] container = new byte[1024];

            DatagramPacket packet = new DatagramPacket(container, 0, container.length);
            socket.receive(packet);
            byte[] data = packet.getData();
            String receiveData = new String(data, 0, data.length);
            System.out.println(receiveData);
            if (receiveData.equals("bye")) {
                break;
            }
        }
        socket.close();
    }
}
