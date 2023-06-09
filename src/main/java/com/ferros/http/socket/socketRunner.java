package com.ferros.http.socket;

import java.io.*;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.Socket;

public class socketRunner {
    public static void main(String[] args) throws IOException {
        //  http -80
        //  https - 443
        //  tcp
        var inetAddress = Inet4Address.getByName("google.com");
        try (var socket = new Socket(inetAddress, 80);
             var outputStream = new DataOutputStream(socket.getOutputStream());
             var inputStream = new DataInputStream(socket.getInputStream())) {
            outputStream.writeUTF("Hello world!");
            var response = inputStream.readAllBytes();
            System.out.println(response.length);
        }
    }
}
