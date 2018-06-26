package service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import android.widget.Toast;

import util.MyApp;

public class MyService extends Service {


    public MyService() {
    }


    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        return null;
    }


    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Toast.makeText(MyApp.getContext(), "service iniciado", Toast.LENGTH_LONG).show();
        MinhaThead minhaThead = new MinhaThead(startId);
        minhaThead.start();
        return super.onStartCommand(intent, flags, startId);
    }


    private class MinhaThead extends Thread{

        int startId = 0;
        int cont = 0;

        public MinhaThead(int startId){
            this.startId = startId;
        }

        @Override
        public void run() {
            while(cont<10) {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                cont++;
                Log.i("SANDECO", " CONT = "+ cont);
            }
            stopSelf(startId);
        }
    }

    @Override
    public void onDestroy() {
        Toast.makeText(MyApp.getContext(), "service FINALIZADO", Toast.LENGTH_LONG).show();
    }
}
