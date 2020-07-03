package pk.edu.pucit.mcproject;

import androidx.appcompat.app.AppCompatActivity;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


import android.os.Bundle;
public class database_sqlite extends SQLiteOpenHelper {
    public static final String DB_name = "interviewPrep";
    public static final int DB_version = 1;
    public static final String users_table= "users";
    public static final String user_ID = "id";
    public static final String user_name = "username";
    public static final String user_email = "email";
    public static final String user_pass = "password";
    public static final String create_users_table = " CREATE TABLE " + users_table
            + " ( "
            + user_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
            + user_name + " TEXT, "
            + user_email + " TEXT, "
            + user_pass + " TEXT"
            + " ) ";
    public database_sqlite(Context context) {
        super(context, DB_name, null, DB_version);
    }
    public Boolean isExistingEmail(String email)
    {
        SQLiteDatabase db=this.getReadableDatabase();
        Cursor cursor=db.query(users_table,
                new String[]{user_name,user_email},
                user_email + "=?",
                new String[]{email},
                null,null,null);
        if(cursor!=null && cursor.moveToFirst()&& cursor.getCount()>0)

        {

            return  false;
        }
        else
            return true;
    }
    public Boolean isValidUser(String email,String pass)
    {
        SQLiteDatabase db=this.getReadableDatabase();
        Cursor cursor=db.query(users_table,
                new String[]{user_name,user_email},
                user_email + "=?",
                new String[]{email},
                null,null,null);
        if(cursor!=null && cursor.moveToFirst()&& cursor.getCount()>0) {
            String password = cursor.getString(3);
            return !pass.equals(password);
        }
        return false;
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(create_users_table);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL(" DROP TABLE IF EXISTS " + users_table);
    }

}

