package com.jingyang.chat;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;

public class UdpSenderDemo01 {
    public static void main(String[] args) throws Exception {
        DatagramSocket socket = new DatagramSocket(8888);

        // prepare data
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        while(true) {
            String data = bufferedReader.readLine();
            byte[] bytes = data.getBytes();
            System.out.println(bytes.length);
            DatagramPacket packet = new DatagramPacket(bytes, 0, bytes.length, new InetSocketAddress("localhost", 6666));
            socket.send(packet);
            if (data.equals("bye")){
                break;
            }
        }
        socket.close();
    }
}
