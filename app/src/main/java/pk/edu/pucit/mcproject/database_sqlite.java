package pk.edu.pucit.mcproject;

import androidx.appcompat.app.AppCompatActivity;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


import android.os.Bundle;
public class database_sqlite extends SQLiteOpenHelper {

    Context context;

    public database_sqlite(Context context) {
        super(context,  "interviewPrep.db", null, 1);
        this.context=context;
    }
    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("create table users(id INTEGER primary key Autoincrement,username TEXT,email TEXT,password TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL(" DROP TABLE IF EXISTS users");
    }
    public Boolean isValidUser(String email,String pass)
    {
        SQLiteDatabase db=this.getReadableDatabase();
        Cursor cursor=db.query("users",null, "email = ? and password = ?",
                new String[]{email,pass},
                null,null,null);
        if (cursor.moveToFirst()) {
             cursor.close();
            return true;
        }
        cursor.close();
        return false;
    }
    public Boolean isExistingEmail(String email)
    {
        SQLiteDatabase db=this.getReadableDatabase();
        Cursor cursor=db.query("users",
                new String[]{"username","email"},
                "email = ?",
                new String[]{email},
                null,null,null);
        if(cursor!=null && cursor.moveToFirst()&& cursor.getCount()>0)
        {
            cursor.close();
            return  false;
        }
        else {
            return true;
        }
    }

}

