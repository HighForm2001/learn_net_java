package com.jingyang.net_4;

import java.net.MalformedURLException;
import java.net.URL;

public class UrlDemo01 {
    public static void main(String[] args) throws MalformedURLException {
        URL url = new URL("www.google.com");
        System.out.println(url.getProtocol()); // 协议
        System.out.println(url.getHost()); // 主机ip
        System.out.println(url.getPort()); // 端口
        System.out.println(url.getPath()); // 文件
        System.out.println(url.getFile()); //全路径
        System.out.println(url.getQuery());//参数

    }
}
