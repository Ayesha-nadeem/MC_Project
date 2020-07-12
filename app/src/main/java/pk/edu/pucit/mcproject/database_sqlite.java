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
        sqLiteDatabase.execSQL("create table categories(id INTEGER primary key Autoincrement,name TEXT,url TEXT)");
        sqLiteDatabase.execSQL("create table questions(id INTEGER primary key Autoincrement,question TEXT,A TEXT,B TEXT,C TEXT,D TEXT,correctOption TEXT,categoryId INTEGER)");

        ContentValues cv1=new ContentValues();
        cv1.put("name","Computer Architecture");
        cv1.put("url","https://i.imgur.com/F57jwzB.jpg");
        sqLiteDatabase.insert( "categories",null,cv1);

        ContentValues cv2=new ContentValues();
        cv2.put("name","Graphics and Visual computing");
        cv2.put("url","https://i.imgur.com/kgKz0LS.jpg");
        sqLiteDatabase.insert( "categories",null,cv2);

        ContentValues cv3=new ContentValues();
        cv3.put("name","Data Science");
        cv3.put("url","https://i.imgur.com/SkPbq.jpg");
        sqLiteDatabase.insert( "categories",null,cv3);

        ContentValues cv4=new ContentValues();
        cv4.put("name","Algorithms and Complexity");
        cv4.put("url","https://i.imgur.com/k7JCpSg.jpg");
        sqLiteDatabase.insert( "categories",null,cv4);

        ContentValues cv5=new ContentValues();
        cv5.put("name","Networking and Communication");
        cv5.put("url","https://i.imgur.com/rLqpSjt.jpg");
        sqLiteDatabase.insert( "categories",null,cv5);

        ContentValues cv6=new ContentValues();
        cv6.put("name","Web Development");
        cv6.put("url","https://i.imgur.com/l7KBzNq.jpg");
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
        v8.put("question","The Quantity Of An Image Depend On");
        v8.put("A","No. Of Pixel Used By Image");
        v8.put("B","No. Of Line Used By Image");
        v8.put("C","No. Of Resolution Used By Image");
        v8.put("D","None");
        v8.put("correctOption","No. Of Pixel Used By Image");
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

        ContentValues v16=new ContentValues();
        v16.put("question","The running time of insertion sort is ");
        v16.put("A","O(n^2)");
        v16.put("B","O(n)");
        v16.put("C","O(n log n)");
        v16.put("D","O(log n)");
        v16.put("correctOption","O(n^2)");
        v16.put("categoryID","4");
        sqLiteDatabase.insert( "categories",null,v16);
        ContentValues v17=new ContentValues();
        v17.put("question"," What data structure is used for breadth first traversal of a graph?");
        v17.put("A","queue");
        v17.put("B"," stack");
        v17.put("C"," list");
        v17.put("D","none of the above");
        v17.put("correctOption"," queue");
        v17.put("categoryID","4");
        sqLiteDatabase.insert( "categories",null,v17);
        ContentValues v18=new ContentValues();
        v18.put("question","A balance factor in AVL tree is used to check");
        v18.put("A","if all child nodes are at same level");
        v18.put("B","what rotation to make");
        v18.put("C","when the last rotation occured");
        v18.put("D","if the tree is unbalanced");
        v18.put("correctOption","if the tree is unbalanced");
        v18.put("categoryID","4");
        sqLiteDatabase.insert( "categories",null,v18);
        ContentValues v19=new ContentValues();
        v19.put("question","If the array is already sorted, which of these algorithms will exhibit the best performance");
        v19.put("A","Merge Sort");
        v19.put("B"," Insertion Sort");
        v19.put("C","Quick Sort");
        v19.put("D","Heap Sort\n");
        v19.put("correctOption","Insertion Sort");
        v19.put("categoryID","4");
        sqLiteDatabase.insert( "categories",null,v19);
        ContentValues v20=new ContentValues();
        v20.put("question","Which of the following is an example of dynamic programming approach?");
        v20.put("A","Fibonacci Series");
        v20.put("B","Tower of Hanoi");
        v20.put("C","Dijkstra Shortest Path");
        v20.put("D","All of the above");
        v20.put("correctOption","All of the above");
        v20.put("categoryID","4");
        sqLiteDatabase.insert( "categories",null,v20);

        ContentValues v21=new ContentValues();
        v21.put("question"," The Mobile Application Protocol (MAP) typically runs on top of which protocol ?");
        v21.put("A","SNMP (Simple Network Management Protocol)");
        v21.put("B"," SMTP (Simple Mail Transfer Protocol)");
        v21.put("C","SS7 (Signalling System 7)");
        v21.put("D","HTTP (Hyper Text Transfer Protocol)");
        v21.put("correctOption","SS7 (Signalling System 7)");
        v21.put("categoryID","5");
        sqLiteDatabase.insert( "categories",null,v21);
        ContentValues v22=new ContentValues();
        v22.put("question"," The design issue of Datalink Layer in OSI Reference Model is");
        v22.put("A","Framing");
        v22.put("B","Representation of bits ");
        v22.put("C","Synchronization of bits ");
        v22.put("D","Connection control");
        v22.put("correctOption","Framing ");
        v22.put("categoryID","5");
        sqLiteDatabase.insert( "categories",null,v22);
        ContentValues v23=new ContentValues();
        v23.put("question"," An example of a layer that is absent in broadcast networks is:");
        v23.put("A","Physical layer");
        v23.put("B"," Presentation layer");
        v23.put("C","Network layer ");
        v23.put("D","Application layer");
        v23.put("correctOption","Network layer ");
        v23.put("categoryID","5");
        sqLiteDatabase.insert( "categories",null,v23);
        ContentValues v24=new ContentValues();
        v24.put("question"," The ATM cell is");
        v24.put("A","48 bytes long");
        v24.put("B","53 bytes long ");
        v24.put("C","64 bytes long");
        v24.put("D","69 bytes long");
        v24.put("correctOption","53 bytes long ");
        v24.put("categoryID","5");
        sqLiteDatabase.insert( "categories",null,v24);
        ContentValues v25=new ContentValues();
        v25.put("question"," In IPV 4, the IP address 200.200.200.200 belongs to");
        v25.put("A","Class A");
        v25.put("B","Class B ");
        v25.put("C","Class C");
        v25.put("D","Class D");
        v25.put("correctOption","Class C ");
        v25.put("categoryID","5");
        sqLiteDatabase.insert( "categories",null,v25);

        ContentValues v26=new ContentValues();
        v26.put("question","Which is not a property of attribute Behaviour of <Marquee> tag?");
        v26.put("A","alternate");
        v26.put("B"," blur");
        v26.put("C"," scroll");
        v26.put("D","slide");
        v26.put("correctOption"," blur");
        v26.put("categoryID","6");
        sqLiteDatabase.insert( "categories",null,v26);
        ContentValues v27=new ContentValues();
        v27.put("question","Which of the following options is correct with regard to HTML?");
        v27.put("A","It is a modelling language");
        v27.put("B"," It is a scripting language");
        v27.put("C"," It is a partial programming language");
        v27.put("D","It is used to structure documents");
        v27.put("correctOption"," It is used to structure documents");
        v27.put("categoryID","6");
        sqLiteDatabase.insert( "categories",null,v27);
        ContentValues v28=new ContentValues();
        v28.put("question","Which browser can supports the transition property?");
        v28.put("A","Internet Explorer 10");
        v28.put("B","  Firefox");
        v28.put("C"," Chrome");
        v28.put("D","All of the Mentioned");
        v28.put("correctOption"," All of the Mentioned");
        v28.put("categoryID","6");
        sqLiteDatabase.insert( "categories",null,v28);
        ContentValues v29=new ContentValues();
        v29.put("question","colspan=n can be added to only what tag?");
        v29.put("A","<table>");
        v29.put("B"," <td>");
        v29.put("C"," <tr>");
        v29.put("D","All of the Mentioned");
        v29.put("correctOption"," <td>");
        v29.put("categoryID","6");
        sqLiteDatabase.insert( "categories",null,v29);
        ContentValues v30=new ContentValues();
        v30.put("question","Which of the following is not supported by older browsers?");
        v30.put("A","CSS");
        v30.put("B"," Layers");
        v30.put("C"," Frames");
        v30.put("D","All of the Mentioned");
        v30.put("correctOption"," All of the Mentioned");
        v30.put("categoryID","6");
        sqLiteDatabase.insert( "categories",null,v30);

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
                String url=cursor.getString(2);
                list.add(new CategoryModel(url, category_name,id));
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

