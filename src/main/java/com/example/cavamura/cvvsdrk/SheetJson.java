package com.example.cavamura.cvvsdrk;

import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;

/**
 * Created by cavamura on 27/12/2017.
 */

public class SheetJson {
    private Sheet s;

    public Sheet getS() {
        return s;
    }

    public void setS(Sheet s) {
        this.s = s;
    }

    public SheetJson(Sheet s) {
        this.s = s;
    }

    public SheetJson() {

    }

    public boolean sendJson(){
        URL url;
        //URLConnection urlConn;
        DataOutputStream printout;
        DataInputStream input;
        String http;
        http = "http://143.0.232.34:3017/testjson/test.php";
        try {
            HttpURLConnection urlConn = null;
            StringBuilder sb = new StringBuilder();
            url = new URL(http);
            urlConn = (HttpURLConnection)url.openConnection();
            urlConn.setDoInput(true);
            urlConn.setDoOutput(true);
            urlConn.setUseCaches(false);
            urlConn.setRequestProperty("Content-Type", "application/json");
            urlConn.setRequestProperty("Host", "143.0.232.34:3017");

            urlConn.connect();

            //Create JSONObject here
            JSONObject jsonParam = new JSONObject();
            jsonParam.put("ID", "25");
            jsonParam.put("description", "Real");
            jsonParam.put("enable", "true");

            // Send POST output.
            printout = new DataOutputStream(urlConn.getOutputStream ());
            printout.writeBytes(URLEncoder.encode(jsonParam.toString(),"UTF-8"));
            printout.flush ();
            printout.close ();


            //OutputStreamWriter out = new   OutputStreamWriter(urlConn.getOutputStream());
            //out.write(jsonParam.toString());
            //out.close();

            int HttpResult =urlConn.getResponseCode();
            if(HttpResult == HttpURLConnection.HTTP_OK){
                BufferedReader br = new BufferedReader(new InputStreamReader(
                        urlConn.getInputStream(),"utf-8"));
                String line = null;
                while ((line = br.readLine()) != null) {
                    sb.append(line + "\n");
                }
                br.close();

                System.out.println(""+sb.toString());

            }else{
                System.out.println(urlConn.getResponseMessage());
            }
            return true;
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }
    }
}
