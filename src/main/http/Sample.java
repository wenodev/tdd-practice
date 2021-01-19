package main.http;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.logging.Handler;

public class Sample {
    public static void main(String[] args) {

        try {
            InetSocketAddress address = new InetSocketAddress(8001);
            HttpServer server = HttpServer.create(address, 0);
            server.createContext("/", new MyHandler());
            server.start();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
