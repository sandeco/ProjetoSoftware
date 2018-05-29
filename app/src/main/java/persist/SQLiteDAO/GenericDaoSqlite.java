package persist.SQLiteDAO;

import android.database.sqlite.SQLiteDatabase;

import persist.DatabaseHelper;
import util.MyApp;

public abstract class GenericDaoSqlite {


    public SQLiteDatabase getWritebleDB(){
        return DatabaseHelper.getInstance(MyApp.getContext()).getWritableDatabase();
    }


    public SQLiteDatabase getReadableDB(){
        return DatabaseHelper.getInstance(MyApp.getContext()).getReadableDatabase();
    }


}
