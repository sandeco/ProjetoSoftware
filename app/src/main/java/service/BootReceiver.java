package service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.example.sandeco.meuprimeirodb.activities.MainActivity;

import util.MyApp;

public class BootReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {

        Intent i = new Intent(context,MainActivity.class);

        MyApp.getContext().startActivity(i);

    }


}
