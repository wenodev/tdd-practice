package main.http;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.Charset;

public class RequestSample extends Thread {
    public static final String USER_AGENT = "Mozilla/5.0";

    public static void main(String[] args) throws Exception{

        RequestSample httpConn1 = new RequestSample();
        RequestSample httpConn2 = new RequestSample();
        RequestSample httpConn3 = new RequestSample();
        RequestSample httpConn4 = new RequestSample();
        RequestSample httpConn5 = new RequestSample();

        for (int i = 0; i < 5; i++) {
            httpConn1.sendGet();
            httpConn2.sendGet();
            httpConn3.sendGet();
            httpConn4.sendGet();
            httpConn5.sendGet();
        }

    }


    private void sendGet() throws Exception {
        String url = "http://localhost:8000/";

        URL obj = new URL(url);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        //전송방식
        con.setRequestMethod("GET");
        //Request Header 정의
        con.setRequestProperty("User-Agent", USER_AGENT);
//        con.setConnectTimeout(10000);       //컨텍션타임아웃 10초
//        con.setReadTimeout(5000);           //컨텐츠조회 타임아웃 5총

        int responseCode = con.getResponseCode();
        System.out.println("\nSending 'GET' request to URL : " + url);
        System.out.println("Response Code : " + responseCode);

        Charset charset = Charset.forName("UTF-8");
        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream(),charset));
        String inputLine;
        StringBuffer response = new StringBuffer();
        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();

        System.out.println("조회결과 : " + response.toString());
    }



}
