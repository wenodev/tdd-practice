package main.http;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;

public class MyHandler implements HttpHandler {

    MyController myController = new MyController();

    @Override
    public void handle(HttpExchange exchange) throws IOException {

        String method = exchange.getRequestMethod();

        if (method.equals("GET")) myController.getController(exchange);

        if (method.equals("GET")){
            myController.getController(exchange);
        }
        if (method.equals("GET")){
            myController.getController(exchange);
        }
        if (method.equals("GET")){
            myController.getController(exchange);
        }
        if (method.equals("GET")){
            myController.getController(exchange);
        }
        exchange.sendResponseHeaders(200,0);
        exchange.getResponseBody().close();
    }

}
