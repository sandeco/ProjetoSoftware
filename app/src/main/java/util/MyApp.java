package util;

import android.app.Application;

public class MyApp extends Application {

    /*****
     * OBSERVAÇÃO IMPORTANTE
     *
     * ESSA CLASSE DEVE SER DECLARADA NO MANIFESTO
     * COM O COMANDO ABAIXO
     *
     * android:name="util.MyApp"
     */




    private static MyApp context;

    public MyApp(){

        context = this;
    }

    public static MyApp getContext(){
        return context;
    }

}
