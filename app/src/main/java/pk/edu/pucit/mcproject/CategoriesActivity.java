package pk.edu.pucit.mcproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.database.Cursor;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CategoriesActivity extends AppCompatActivity {
    database_sqlite db_sqlite;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);
//        Toolbar toolbar=findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
//        Objects.requireNonNull(getSupportActionBar()).setTitle("Categories");
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        RecyclerView recyclerView = findViewById(R.id.rv);
        LinearLayoutManager layoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        List<CategoryModel> list=new ArrayList<>();
//        list.add(new CategoryModel("","category1"));
//        list.add(new CategoryModel("","category1"));
//        list.add(new CategoryModel("","category1"));
//        list.add(new CategoryModel("","category1"));
//        list.add(new CategoryModel("","category1"));
//        list.add(new CategoryModel("","category1"));
//        list.add(new CategoryModel("","category1"));
//        list.add(new CategoryModel("","category1"));
//        list.add(new CategoryModel("","category1"));
//        list.add(new CategoryModel("","category1"));
//        list.add(new CategoryModel("","category1"));
//
        db_sqlite = new database_sqlite(this);
        long s=db_sqlite.insert_category("Architecture and organization");
        Toast toast = Toast.makeText(getApplicationContext(),
                s+"",
                Toast.LENGTH_SHORT);
        list=db_sqlite.getCategories();
        CategoryAdapter adapter = new CategoryAdapter(this,list);
        recyclerView.setAdapter(adapter);

    }

}
