package com.jingyang.net_4;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class UrlDown {
    public static void main(String[] args) throws Exception {
        URL url = new URL("www.google.com");

        HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();

        InputStream is = urlConnection.getInputStream();
        FileOutputStream fs = new FileOutputStream("file.txt");
        byte[] buffer = new byte[1024];
        int len;
        while((len = is.read(buffer)) != -1){
            fs.write(buffer, 0 ,len);
        }
        fs.close();
        is.close();
        urlConnection.disconnect();
    }
}
