package main.http;

import com.sun.net.httpserver.HttpExchange;

import java.util.Arrays;
import java.util.List;

public class MyController {


    private MyService myService = new MyService();

    private static List<Board> boardList = Arrays.asList(
            new Board(1L, "name1"),
            new Board(2L, "name2")
    );

    public void getController(HttpExchange exchange){
        String strUri = String.valueOf(exchange.getRequestURI());
        if (strUri.length() <= 7){
            myService.getTodoById();
        }
        else{
            myService.getTodos();
        }
    }

    public Long getId(String uri){
        return Long.valueOf(uri.split("/")[2]);
    }

}
