package util;

import android.content.Context;
import android.net.ConnectivityManager;

public class InternetCheck {

    public static boolean isConnected() {
        boolean conectado;
        ConnectivityManager conectivtyManager = (ConnectivityManager) MyApp.getContext().getSystemService(Context.CONNECTIVITY_SERVICE);
        conectado = conectivtyManager.getActiveNetworkInfo() != null
                && conectivtyManager.getActiveNetworkInfo().isAvailable()
                && conectivtyManager.getActiveNetworkInfo().isConnected();
        return conectado;
    }
}