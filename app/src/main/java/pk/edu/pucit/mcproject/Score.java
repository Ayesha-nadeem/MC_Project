package pk.edu.pucit.mcproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Score extends AppCompatActivity {
    private TextView scored,total;
    private Button donebtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);
        scored=findViewById(R.id.scored);
        total=findViewById(R.id.total);
        donebtn=findViewById(R.id.done_btn);
        scored.setText(String.valueOf(getIntent().getIntExtra("score",0)));
        total.setText("Out of "+ String.valueOf(getIntent().getIntExtra("total",0)));


        donebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Score.this,CategoriesActivity.class);
                startActivity(intent);
                finish();
                return;


            }
        });
    }
}
