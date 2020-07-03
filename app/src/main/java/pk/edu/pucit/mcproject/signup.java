package pk.edu.pucit.mcproject;

import android.content.ContentValues;
import android.os.Bundle;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


import androidx.appcompat.app.AppCompatActivity;

public class signup extends AppCompatActivity {
    EditText username,password,email,confirm_pass;
    Button signup_btn;
    TextView clickHere;
    database_sqlite db_sqlite;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        db_sqlite = new database_sqlite(this);
        username=findViewById(R.id.name);
        password=findViewById(R.id.password);
        email=findViewById(R.id.email);
        confirm_pass=findViewById(R.id.Confirm_password);
        signup_btn=findViewById(R.id.signup_btn);
        clickHere=findViewById(R.id.click_here_btn);
        clickHere.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(signup.this,Login.class);
                startActivity(intent);
            }
        });
        signup_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (validate()) {
                    String user_name = username.getText().toString();
                    String Email = email.getText().toString();
                    String Password = password.getText().toString();
                    ContentValues values = new ContentValues();
                    values.put("user_name",user_name );
                    values.put("user_email", Email);
                    values.put("user_pass", Password);

                    long rowNumber=db_sqlite.getWritableDatabase().insert("users_table", null, values);
                    if(rowNumber==-1)
                    {
                        Toast toast = Toast.makeText(getApplicationContext(),
                                "Failed to insert data",
                                Toast.LENGTH_SHORT);

                        toast.show();

                    }
                    else
                    {

                        Toast toast = Toast.makeText(getApplicationContext(),
                                "Data inserted successfully",
                                Toast.LENGTH_SHORT);

                        toast.show();

                    }

                }
            }
        });

    }
    public boolean validate() {
        String name = username.getText().toString();
        String Email = email.getText().toString();
        String con_pass = confirm_pass.getText().toString();
        String Password = password.getText().toString();
        if (name.isEmpty() || Password.isEmpty() || con_pass.isEmpty() || Email.isEmpty()) {

            Toast toast = Toast.makeText(getApplicationContext(),
                    "Please fill all the fields",
                    Toast.LENGTH_SHORT);

            toast.show();
            return false;
        }


        if(!con_pass.equals(Password))
        {

            Toast toast = Toast.makeText(getApplicationContext(),
                    "Please verify your password again",
                    Toast.LENGTH_SHORT);
            toast.show();
            return false;
        }
        return true;
    }

}




