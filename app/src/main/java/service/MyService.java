package service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

import util.MyApp;

public class MyService extends Service {



    public MyService() {

    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {

        Toast.makeText(MyApp.getContext(), "service iniciado", Toast.LENGTH_LONG).show();

        MinhaThread minhaThread = new MinhaThread(startId);
        minhaThread.start();

        return super.onStartCommand(intent, flags, startId);
    }


    private class MinhaThread extends Thread{

        int startId = 0;
        int cont    = 0;

        public MinhaThread(int startId){
            this.startId = startId;
        }

        @Override
        public void run() {
            while(cont<10){
                try {
                    Log.i("MINHA SERVICE","CONT = " +cont);
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                cont++;
            }
            stopSelf(startId);
        }
    }

    @Override
    public void onDestroy() {
        Toast.makeText(MyApp.getContext(), "service terminado", Toast.LENGTH_LONG).show();
    }
}
