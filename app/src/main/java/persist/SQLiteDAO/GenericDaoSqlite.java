package persist.SQLiteDAO;

import android.database.sqlite.SQLiteDatabase;

import persist.DatabaseHelper;
import util.MyApp;

public class GenericDaoSqlite {


    public SQLiteDatabase getWritebleDB(){
        return DatabaseHelper.getInstance(MyApp.getContext()).getReadableDatabase();
    }


    public SQLiteDatabase getReadbleDB(){
        return DatabaseHelper.getInstance(MyApp.getContext()).getReadableDatabase();
    }


}
