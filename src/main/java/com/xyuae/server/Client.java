package com.xyuae.server;

/**
 * Created by Xiaojun YU on 2017-09-21.
 */
import java.io.*;
import java.net.*;


class Client {
    public static void main(String args[]) throws Exception {
        Socket sock = new Socket(args[0], Integer.parseInt(args[1]));
        System.out.println("Connected to server: " + sock);

        BufferedReader reader = new BufferedReader(new InputStreamReader(sock.getInputStream()));
        PrintWriter writer = new PrintWriter(sock.getOutputStream(), true);

        writer.println(args[2]);
        System.out.println("Sent data: " + args[2]);

        System.out.println("Got response: " + reader.readLine());
        sock.close();
    }
}
