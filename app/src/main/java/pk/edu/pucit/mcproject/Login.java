package pk.edu.pucit.mcproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    EditText password,email;
    Button login_btn;
    TextView clickHere;
    database_sqlite db_sqlite;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        clickHere=findViewById(R.id.click_here_btn);
        password=findViewById(R.id.password);
        email=findViewById(R.id.email);
       login_btn=findViewById(R.id.login_btn);

        clickHere.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Login.this,signup.class);
                startActivity(intent);
            }
        });
        login_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (Isvalidate()) {
                    String Email = email.getText().toString();
                    String Password = password.getText().toString();
                    Boolean isValidLogin=db_sqlite.isValidUser(Email,Password);
                    if(isValidLogin)
                    {
                        Toast toast = Toast.makeText(getApplicationContext(),
                                "Successfully logged in",
                                Toast.LENGTH_SHORT);

                        toast.show();
                        Intent intent = new Intent(Login.this,MainActivity.class);
                        startActivity(intent);

                    }
                    else
                    {
                        Toast toast = Toast.makeText(getApplicationContext(),
                                "Invalid email/password",
                                Toast.LENGTH_SHORT);

                        toast.show();
                        return;
                    }


                }
            }
        });

    }
    public boolean Isvalidate() {

        String Email = email.getText().toString();

        String Password = password.getText().toString();
        if ( Password.isEmpty() ||Email.isEmpty()) {

            Toast toast = Toast.makeText(getApplicationContext(),
                    "Please fill both of the fields",
                    Toast.LENGTH_SHORT);

            toast.show();
            return false;
        }


        return true;
    }

}

