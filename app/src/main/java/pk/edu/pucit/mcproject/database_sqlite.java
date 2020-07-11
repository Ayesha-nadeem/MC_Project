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
        super(context,  "interviewPrep2", null, 1);

    }
    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("create table users(id INTEGER primary key Autoincrement,username TEXT,email TEXT,password TEXT)");
        sqLiteDatabase.execSQL("create table categories(id INTEGER primary key Autoincrement,name TEXT)");
        sqLiteDatabase.execSQL("create table questions(id INTEGER primary key Autoincrement,question TEXT,A TEXT,B TEXT,C TEXT,D TEXT,correctOption TEXT,categoryId INTEGER)");

        ContentValues cv1=new ContentValues();
        cv1.put("name","Computer Architecture");
        sqLiteDatabase.insert( "categories",null,cv1);

        ContentValues cv2=new ContentValues();
        cv2.put("name","Graphics and Visual computing");
        sqLiteDatabase.insert( "categories",null,cv2);

        ContentValues cv3=new ContentValues();
        cv3.put("name","Data Science");
        sqLiteDatabase.insert( "categories",null,cv3);

        ContentValues cv4=new ContentValues();
        cv4.put("name","Algorithms and Complexity");
        sqLiteDatabase.insert( "categories",null,cv4);

        ContentValues cv5=new ContentValues();
        cv5.put("name","Networking and Communication");
        sqLiteDatabase.insert( "categories",null,cv5);

        ContentValues cv6=new ContentValues();
        cv6.put("name","web development");
        sqLiteDatabase.insert( "categories",null,cv6);

        ContentValues v1=new ContentValues();
        v1.put("question","The most relevant addressing mode to write position independent code");
        v1.put("A","Direct mode ");
        v1.put("B","Indirect mode");
        v1.put("C","Relative mode");
        v1.put("D","Indexed mode");
        v1.put("correctOption","Relative mode");
        v1.put("categoryID","1");
        sqLiteDatabase.insert( "categories",null,v1);
        ContentValues v2=new ContentValues();
        v2.put("question","In magnetic disk data organized on the plotter in a concentric sets or rings called");
        v2.put("A","Sector");
        v2.put("B","Track");
        v2.put("C","Head");
        v2.put("D","Block");
        v2.put("correctOption","Head");
        v2.put("categoryID","1");
        sqLiteDatabase.insert( "categories",null,v2);
        ContentValues v3=new ContentValues();
        v3.put("question","In which addressing mode the operand is given explicitly in the instruction\n");
        v3.put("A","Absolute");
        v3.put("B","Immediate");
        v3.put("C","Indirect");
        v3.put("D","Direct");
        v3.put("correctOption","Immediate");
        v3.put("categoryID","1");
        sqLiteDatabase.insert( "categories",null,v3);
        ContentValues v4=new ContentValues();
        v4.put("question","A basic instruction that can be interpreted by computer generally has");
        v4.put("A","An operand and an address");
        v4.put("B","A decoder and an accumulator");
        v4.put("C","Sequence register and decoder");
        v4.put("D","An address and decoder");
        v4.put("correctOption","An operand and an address");
        v4.put("categoryID","1");
        sqLiteDatabase.insert( "categories",null,v4);
        ContentValues v5=new ContentValues();
        v5.put("question","A hardware unit which is used to monitor computer processing is");
        v5.put("A","Console");
        v5.put("B","Dot matrix printer");
        v5.put("C","Mouse");
        v5.put("D","ROM");
        v5.put("correctOption","Console");
        v5.put("categoryID","1");
        sqLiteDatabase.insert( "categories",null,v5);

        ContentValues v6=new ContentValues();
        v6.put("question","Types Of Computer Graphics Are");
        v6.put("A"," Scalar And Raster");
        v6.put("B","Vector And Raster");
        v6.put("C"," Vector And Scalar");
        v6.put("D"," None Of These");
        v6.put("correctOption"," Vector And Raster");
        v6.put("categoryID","2");
        sqLiteDatabase.insert( "categories",null,v6);
        ContentValues v7=new ContentValues();
        v7.put("question","Raster Graphics Are Composed Of");
        v7.put("A","Paths");
        v7.put("B"," Palette");
        v7.put("C","Pixels");
        v7.put("D"," None Of These");
        v7.put("correctOption","Pixels");
        v7.put("categoryID","2");
        sqLiteDatabase.insert( "categories",null,v7);
        ContentValues v8=new ContentValues();
        v8.put("question","");
        v8.put("A","");
        v8.put("B","");
        v8.put("C","");
        v8.put("D","");
        v8.put("correctOption","");
        v8.put("categoryID","2");
        sqLiteDatabase.insert( "categories",null,v8);
        ContentValues v9=new ContentValues();
        v9.put("question","Pixel Can Be Arranged In A Regular");
        v9.put("A","One Dimensional Grid");
        v9.put("B"," Two Dimensional Grid");
        v9.put("C","Three Dimensional Grid");
        v9.put("D","None Of These");
        v9.put("correctOption"," Two Dimensional Grid");
        v9.put("categoryID","2");
        sqLiteDatabase.insert( "categories",null,v9);
        ContentValues v10=new ContentValues();
        v10.put("question","The Brightness Of Each Pixel Is");
        v10.put("A","Compatible");
        v10.put("B","Incompatible");
        v10.put("C","Both A & B");
        v10.put("D","None Of These");
        v10.put("correctOption","Incompatible");
        v10.put("categoryID","2");
        sqLiteDatabase.insert( "categories",null,v10);

        ContentValues v11=new ContentValues();
        v11.put("question","Which of the following step is performed by data scientist after acquiring the data");
        v11.put("A","Data Cleansing");
        v11.put("B","Data Integration");
        v11.put("C","Data Replication");
        v11.put("D","All of the Mentioned");
        v11.put("correctOption"," Data Cleansing");
        v11.put("categoryID","3");
        sqLiteDatabase.insert( "categories",null,v11);
        ContentValues v12=new ContentValues();
        v12.put("question","Which of the following systems record changes to a file over time");
        v12.put("A","Record Control");
        v12.put("B","Version Control");
        v12.put("C","Forecast Control");
        v12.put("D","None of the mentioned");
        v12.put("correctOption","Version Control");
        v12.put("categoryID","3");
        sqLiteDatabase.insert( "categories",null,v12);
        ContentValues v13=new ContentValues();
        v13.put("question"," Which of the following form the basis for frequency interpretation of probabilities");
        v13.put("A","Asymptotics");
        v13.put("B","Symptotics");
        v13.put("C","Asymmetry");
        v13.put("D","All of the Mentioned");
        v13.put("correctOption","Asymptotics");
        v13.put("categoryID","3");
        sqLiteDatabase.insert( "categories",null,v13);
        ContentValues v14=new ContentValues();
        v14.put("question","Which of the following is also referred to as random variable");
        v14.put("A","stochast");
        v14.put("B"," aleatory");
        v14.put("C"," eliette");
        v14.put("D","All of the Mentioned");
        v14.put("correctOption"," aleatory");
        v14.put("categoryID","3");
        sqLiteDatabase.insert( "categories",null,v14);
        ContentValues v15=new ContentValues();
        v15.put("question","Which of the following function provides unsupervised prediction");
        v15.put("A"," cl_forecast");
        v15.put("B","cl_nowcast");
        v15.put("C","cl_precast");
        v15.put("D","None of the Mentioned");
        v15.put("correctOption","None of the Mentioned");
        v15.put("categoryID","3");
        sqLiteDatabase.insert( "categories",null,v15);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL(" DROP TABLE IF EXISTS users");
        sqLiteDatabase.execSQL(" DROP TABLE IF EXISTS categories");
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS questions");
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

