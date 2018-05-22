package persist;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {

    private static final String BANCO_DADOS = "meubanco";
    private static final int VERSAO = 1;

    private static DatabaseHelper instance;

    private DatabaseHelper(Context context) {
        super(context, BANCO_DADOS,null, VERSAO);
    }


    public static DatabaseHelper getInstance(Context context){

        if(instance==null)
            instance = new DatabaseHelper(context);

        return instance;
    }


    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String ddl = "CREATE TABLE pessoa("+
                "_id INTEGER PRIMARY KEY AUTOINCREMENT," +
                " nome TEXT not null)";

        sqLiteDatabase.execSQL(ddl);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion) {


    }
}
