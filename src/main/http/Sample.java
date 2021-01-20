package main.http;

import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.net.InetSocketAddress;

public class Sample {



    public static void main(String[] args) {

        try {
            InetSocketAddress address = new InetSocketAddress(8000);
            HttpServer server = HttpServer.create(address, 0);
            server.createContext("/users", new MyHandler());
            server.start();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
