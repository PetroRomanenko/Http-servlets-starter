package com.ferros.http.client;

import java.io.IOException;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class UrlExample {
    public static void main(String[] args) throws IOException {
        var url = new URL("file:C:\\Users\\Ferros\\IdeaProjects\\Http-servlets-starter\\src\\main\\java\\com\\ferros\\http\\socket\\SocketRunner.java");
        var urlConnection = url.openConnection();
        System.out.println(new String(urlConnection.getInputStream().readAllBytes()));


    }

    private static void checkGoogle() throws IOException {
        var url = new URL("http://www.google.com");
        var urlConnection = url.openConnection();
        urlConnection.setDoOutput(true);

        try (var outputStream = urlConnection.getOutputStream()) {

        }

        System.out.println();
    }
}
