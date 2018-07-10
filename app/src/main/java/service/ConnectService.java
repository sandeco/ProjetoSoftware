package service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import util.MyApp;

public class ConnectService extends Service implements Response.Listener<String>, Response.ErrorListener{


    private final String URL = "http://sandeco.com.br/aulas/projeto/echo.php?msg=";
    private RequestQueue requestQueue;
    private StringRequest stringRequest;
    private String message;

    public ConnectService() {
    }

    @Override
    public void onCreate() {
        requestQueue = Volley.newRequestQueue(this);
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {


        message = "Minha primeira mensagem na web";

        stringRequest = new StringRequest(Request.Method.GET,URL+message,this,this);
        requestQueue.add(stringRequest);
        return super.onStartCommand(intent, flags, startId);
    };

    @Override
    public void onResponse(String response) {
        Toast.makeText(MyApp.getContext(), response.substring(0,10), Toast.LENGTH_LONG).show();
    }

    @Override
    public void onErrorResponse(VolleyError error) {

    }
}
