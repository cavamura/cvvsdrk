package com.example.cavamura.cvvsdrk;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;
import android.widget.Toast;

import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.text.Normalizer;

/**
 * Created by cavamura on 27/12/2017.
 */

public class SendAsyncTask  extends AsyncTask<Sheet, Void, Integer> {

    Context c;
    ProgressDialog load;

    public Context getC() {
        return c;
    }

    public void setC(Context c) {
        this.c = c;
    }

    @Override
    protected void onPreExecute(){
        //load = ProgressDialog.show(this.c, "Por favor Aguarde ...",                "Baixando Imagem ...");
        Toast.makeText(c, "trying send data...", Toast.LENGTH_LONG).show();
    }


    protected Integer doInBackground(Sheet... sheets) {
        URL url;
        //URLConnection urlConn;
        DataOutputStream printout;
        DataInputStream input;
        String http;
        //http = "http://143.0.232.34:3017/testjson/test.php";
        http = "http://143.0.232.34:3017/cvvsdrk/admin/getDados/recorddata.php";
        try {
            HttpURLConnection urlConn = null;
            StringBuilder sb = new StringBuilder();
            url = new URL(http);
            urlConn = (HttpURLConnection)url.openConnection();
            urlConn.setDoInput(true);
            urlConn.setDoOutput(true);
            urlConn.setRequestMethod("POST");
            urlConn.setUseCaches(false);
            urlConn.setRequestProperty("Content-Type", "application/json");
            urlConn.setRequestProperty("Host", "143.0.232.34:3017");
            Sheet sh = sheets[0];
            sh.setC(c);

            /*
            String urlparameters = "fpid="+URLEncoder.encode(sh.getId(), "UTF-8")+
                    "&fpstudent="+URLEncoder.encode(sh.getStudent(), "UTF-8")+
                    "&fpflightdate="+URLEncoder.encode(sh.getFlightdate(), "UTF-8")+
                    "&fplevel="+URLEncoder.encode(sh.getLevel(), "UTF-8")+
                    "&fpflightnumber="+URLEncoder.encode(sh.getFlightnumber(), "UTF-8")+
                    "&fptakeoff="+URLEncoder.encode(sh.getTakeoff(), "UTF-8")+
                    "&fplanding="+URLEncoder.encode(sh.getLanding(), "UTF-8")+
                    "&fptime="+URLEncoder.encode(sh.getTime(), "UTF-8")+
                    "&fpglider="+URLEncoder.encode(sh.getGlider(), "UTF-8")+
                    "&fpinpl="+URLEncoder.encode(sh.getInpl(), "UTF-8")+
                    "&fph11="+URLEncoder.encode(sh.getH11(), "UTF-8")+
                    "&fph12="+URLEncoder.encode(sh.getH12(), "UTF-8")+
                    "&fph13="+URLEncoder.encode(sh.getH13(), "UTF-8")+
                    "&fph14="+URLEncoder.encode(sh.getH14(), "UTF-8")+
                    "&fph15="+URLEncoder.encode(sh.getH15(), "UTF-8")+
                    "&fph16="+URLEncoder.encode(sh.getH16(), "UTF-8")+
                    "&fph17="+URLEncoder.encode(sh.getH17(), "UTF-8")+
                    "&fph21="+URLEncoder.encode(sh.getH21(), "UTF-8")+
                    "&fph22="+URLEncoder.encode(sh.getH22(), "UTF-8")+
                    "&fph23="+URLEncoder.encode(sh.getH23(), "UTF-8")+
                    "&fph24="+URLEncoder.encode(sh.getH24(), "UTF-8")+
                    "&fph31="+URLEncoder.encode(sh.getH31(), "UTF-8")+
                    "&fph32="+URLEncoder.encode(sh.getH32(), "UTF-8")+
                    "&fph33="+URLEncoder.encode(sh.getH33(), "UTF-8")+
                    "&fph34="+URLEncoder.encode(sh.getH34(), "UTF-8")+
                    "&fph35="+URLEncoder.encode(sh.getH35(), "UTF-8")+
                    "&fph36="+URLEncoder.encode(sh.getH36(), "UTF-8")+
                    "&fph37="+URLEncoder.encode(sh.getH37(), "UTF-8")+
                    "&fph41="+URLEncoder.encode(sh.getH41(), "UTF-8")+
                    "&fph42="+URLEncoder.encode(sh.getH42(), "UTF-8")+
                    "&fph43="+URLEncoder.encode(sh.getH43(), "UTF-8")+
                    "&fph44="+URLEncoder.encode(sh.getH44(), "UTF-8")+
                    "&fph51="+URLEncoder.encode(sh.getH51(), "UTF-8")+
                    "&fph52="+URLEncoder.encode(sh.getH52(), "UTF-8")+
                    "&fph53="+URLEncoder.encode(sh.getH53(), "UTF-8")+
                    "&fph54="+URLEncoder.encode(sh.getH54(), "UTF-8")+
                    "&fph61="+URLEncoder.encode(sh.getH61(), "UTF-8")+
                    "&fph62="+URLEncoder.encode(sh.getH62(), "UTF-8")+
                    "&fph63="+URLEncoder.encode(sh.getH63(), "UTF-8")+
                    "&fph64="+URLEncoder.encode(sh.getH64(), "UTF-8")+
                    "&fph71="+URLEncoder.encode(sh.getH71(), "UTF-8")+
                    "&fph72="+URLEncoder.encode(sh.getH72(), "UTF-8")+
                    "&fph81="+URLEncoder.encode(sh.getH81(), "UTF-8")+
                    "&fph82="+URLEncoder.encode(sh.getH82(), "UTF-8")+
                    "&fph83="+URLEncoder.encode(sh.getH83(), "UTF-8")+
                    "&fpcommentf1="+URLEncoder.encode(sh.getCommentf1(), "UTF-8")+
                    "&fpcommentf2="+URLEncoder.encode(sh.getCommentf2(), "UTF-8")+
                    "&fpcommentf3="+URLEncoder.encode(sh.getCommentf3(), "UTF-8")+
                    "&fpcommentf4="+URLEncoder.encode(sh.getCommentf4(), "UTF-8")+
                    "&fpcommentf5="+URLEncoder.encode(sh.getCommentf5(), "UTF-8")+
                    "&fpcommentf6="+URLEncoder.encode(sh.getCommentf6(), "UTF-8")+
                    "&fpimport="+URLEncoder.encode("S", "UTF-8");
                    */


            urlConn.connect();

            //Create JSONObject here
            JSONObject jsonParam = new JSONObject();
            jsonParam.put("id",sh.getId());
            jsonParam.put("student",sh.getStudent());
            jsonParam.put("flightdate",sh.getFlightdate());
            jsonParam.put("level",sh.getLevel());
            jsonParam.put("flightnumber",sh.getFlightnumber());
            jsonParam.put("takeoff",sh.getTakeoff());
            jsonParam.put("landing",sh.getLanding());
            jsonParam.put("timef",sh.getTime());
            jsonParam.put("glider",sh.getGlider());
            jsonParam.put("inpl",sh.getInpl());
            jsonParam.put("h11",sh.getH11());
            jsonParam.put("h12",sh.getH12());
            jsonParam.put("h13",sh.getH13());
            jsonParam.put("h14",sh.getH14());
            jsonParam.put("h15",sh.getH15());
            jsonParam.put("h16",sh.getH16());
            jsonParam.put("h17",sh.getH17());
            jsonParam.put("h21",sh.getH21());
            jsonParam.put("h22",sh.getH22());
            jsonParam.put("h23",sh.getH23());
            jsonParam.put("h24",sh.getH24());
            jsonParam.put("h31",sh.getH31());
            jsonParam.put("h32",sh.getH32());
            jsonParam.put("h33",sh.getH33());
            jsonParam.put("h34",sh.getH34());
            jsonParam.put("h35",sh.getH35());
            jsonParam.put("h36",sh.getH36());
            jsonParam.put("h37",sh.getH37());
            jsonParam.put("h41",sh.getH41());
            jsonParam.put("h42",sh.getH42());
            jsonParam.put("h43",sh.getH43());
            jsonParam.put("h44",sh.getH44());
            jsonParam.put("h51",sh.getH51());
            jsonParam.put("h52",sh.getH52());
            jsonParam.put("h53",sh.getH53());
            jsonParam.put("h54",sh.getH54());
            jsonParam.put("h61",sh.getH61());
            jsonParam.put("h62",sh.getH62());
            jsonParam.put("h63",sh.getH63());
            jsonParam.put("h64",sh.getH64());
            jsonParam.put("h71",sh.getH71());
            jsonParam.put("h72",sh.getH72());
            jsonParam.put("h81",sh.getH81());
            jsonParam.put("h82",sh.getH82());
            jsonParam.put("h83",sh.getH83());
            jsonParam.put("commentf1",sh.getCommentf1());
            jsonParam.put("commentf2",sh.getCommentf2());
            jsonParam.put("commentf3",sh.getCommentf3());
            jsonParam.put("commentf4",sh.getCommentf4());
            jsonParam.put("commentf5",sh.getCommentf5());
            jsonParam.put("commentf6",sh.getCommentf6());
            jsonParam.put("import",sh.getImportreg());


            System.out.println(jsonParam.toString());

            String jsonParamtratado = Normalizer.normalize(jsonParam.toString(), Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "");

            // Send POST output.
            printout = new DataOutputStream(urlConn.getOutputStream ());
            //printout.writeBytes(URLEncoder.encode(jsonParam.toString(),"UTF-8"));
            //printout.writeBytes(jsonParam.toString());
            printout.writeBytes(jsonParamtratado);
            //printout.writeBytes(urlparameters);
            printout.flush ();
            printout.close ();

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
                ///Toast.makeText(c, ""+sb.toString(), Toast.LENGTH_LONG).show();
                System.out.println(""+sb.toString());
                String retorno = sb.toString().trim();
                int ret = Integer.valueOf(retorno);
                return ret;
            }else{
                //Toast.makeText(c, urlConn.getResponseMessage(), Toast.LENGTH_LONG).show();
                System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
                System.out.println(urlConn.getResponseMessage());
                return -4;
            }

        }catch(Exception e){
            e.printStackTrace();
            return -5;
        }

    }


    @Override
    protected void onPostExecute(Integer ret){

        //1-OK; -1:array json não formatado (servidor); -2:erro nao funcao cadastrar servidor; -3:ja importado; -4:erro ao tentar conectar servidor; -5:erro na funcao de conexao
        String msg = "Problema inexperado...";
        switch (ret){
            case 1:
                msg = "Registro exportado";
                break;
            case -1:
                msg = "Validação servidor: json fora de padrão";
                break;
            case -2:
                msg = "Validação servidor: erro na função cadastrar";
                break;
            case -3:
                msg = "Registro já exportado";
                break;
            case -4:
                msg = "Erro ao tentar comunicação com o servidor";
                break;
            case -5:
                msg = "Erro na função de conexão";
                break;
        }
        Toast.makeText(c, msg, Toast.LENGTH_LONG).show();
    }


}
