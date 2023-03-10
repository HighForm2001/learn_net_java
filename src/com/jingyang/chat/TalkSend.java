package com.jingyang.chat;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;

public class TalkSend implements Runnable{
    DatagramSocket socket = null;
    BufferedReader reader = null;
    private int fromIP;
    private String toIP;
    private int toPort;
    public TalkSend(int fromPort, String toIP, int toPort) {
        this.fromIP = fromPort;
        this.toIP = toIP;
        this.toPort = toPort;
        try{
            socket = new DatagramSocket(fromPort);
            reader = new BufferedReader(new InputStreamReader(System.in));
        }catch(Exception ex){
            ex.printStackTrace();
        }

    }

    
    @Override
    public void run() {
        while(true) {
            try{
                String data = reader.readLine();
                byte[] bytes = data.getBytes();
                DatagramPacket packet = new DatagramPacket(bytes, 0, bytes.length, new InetSocketAddress(this.toIP, this.toPort));
                socket.send(packet);
                if (data.equals("bye")){
                    break;
                }
            }catch(Exception ex){
                ex.printStackTrace();
            }

        }
        socket.close();
    }
}
