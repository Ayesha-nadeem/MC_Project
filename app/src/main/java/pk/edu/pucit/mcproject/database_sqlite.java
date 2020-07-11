package pk.edu.pucit.mcproject;

import androidx.appcompat.app.AppCompatActivity;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class database_sqlite extends SQLiteOpenHelper {

    public database_sqlite(Context context) {
        super(context,  "interviewPrep1", null, 1);

    }
    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("create table users(id INTEGER primary key Autoincrement,username TEXT,email TEXT,password TEXT)");
        sqLiteDatabase.execSQL("create table categories(id INTEGER primary key Autoincrement,name TEXT)");
        ContentValues cv1=new ContentValues();
        cv1.put("name","computer architecture");
        sqLiteDatabase.insert( "categories",null,cv1);

        ContentValues cv2=new ContentValues();
        cv2.put("name","Graphics and visual computing");
        sqLiteDatabase.insert( "categories",null,cv2);

        ContentValues cv3=new ContentValues();
        cv3.put("name","data science");
        sqLiteDatabase.insert( "categories",null,cv3);

        ContentValues cv4=new ContentValues();
        cv4.put("name","Algorithms and complexity");
        sqLiteDatabase.insert( "categories",null,cv4);

        ContentValues cv5=new ContentValues();
        cv5.put("name","networking and communication");
        sqLiteDatabase.insert( "categories",null,cv5);

        ContentValues cv6=new ContentValues();
        cv6.put("name","web development");
        sqLiteDatabase.insert( "categories",null,cv6);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL(" DROP TABLE IF EXISTS users");
        sqLiteDatabase.execSQL(" DROP TABLE IF EXISTS categories");
        onCreate(sqLiteDatabase);
    }
    public long insert_category(String category_name)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues cv=new ContentValues();
        cv.put("name",category_name);
        long s=db.insert( "categories",null,cv);
        return s;
    }
    public List<CategoryModel> getCategories()
    {
        SQLiteDatabase db=this.getReadableDatabase();
        List<CategoryModel> list=new ArrayList<>();
        Cursor cursor = db.query("categories",null,null,null,null,null,null);
        if(cursor.moveToFirst()){
            do{
               Integer id= cursor.getInt(0);
                String category_name= cursor.getString(1);

                list.add(new CategoryModel("", category_name,id));
            }while (cursor.moveToNext());
        }
        cursor.close();
        return list;
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

