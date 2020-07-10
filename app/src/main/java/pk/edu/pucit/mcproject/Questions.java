package pk.edu.pucit.mcproject;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.Animator;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;

public class Questions extends AppCompatActivity {
    private TextView question,noIndicator;
    private LinearLayout optionsContainer;
    private Button shareBtn,nextBtn;
    private int count=0;
    private List<QuestionModel> list;
    private int position =0;
    private int score=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions);
        //Toolbar toolbar=findViewById(R.id.toolbar);
       // setSupportActionBar(toolbar);
        question=findViewById(R.id.question);
        noIndicator=findViewById(R.id.button1);
        optionsContainer=findViewById(R.id.LinearLayout2);
        shareBtn=findViewById(R.id.btn5);
        nextBtn=findViewById(R.id.btn6);

        list=new ArrayList<>();
        list.add(new QuestionModel("a","b","c","d","a","question 1"));
        list.add(new QuestionModel("a","b","c","d","d","question 2"));
        list.add(new QuestionModel("a","b","c","d","b","question 3"));
        list.add(new QuestionModel("a","b","c","d","a","question 4"));
        list.add(new QuestionModel("a","b","c","d","c","question 5"));
        for(int i=0;i<4;i++){
            optionsContainer.getChildAt(i).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    checkAnswer((Button)v);

                }
            });
        }

        playAnimation(question,0,list.get(position).getQuestion());
        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                nextBtn.setEnabled(false);
                nextBtn.setAlpha(0.7f);
                enableOption(true);
                position++;
                if(position==list.size()){
                    //score activity
                    return;
                }
                count=0;
                playAnimation(question,0,list.get(position).getQuestion());
            }
        });


    }


    private void playAnimation(final View view,final int value,final String data) {
        view.animate().alpha(value).scaleX(value).scaleY(value).setDuration(500).setStartDelay(100).setInterpolator(new DecelerateInterpolator()).setListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animation) {
                if (value == 0 && count<4) {
                    String option="";
                    if(count==0){
                        option=list.get(position).getOptiona();
                    }else if(count==1){
                        option=list.get(position).getOptionb();
                    }else if(count==2){
                        option=list.get(position).getOptionc();
                    }else if(count==3) {
                        option=list.get(position).getOptiond();
                    }

                    playAnimation(optionsContainer.getChildAt(count), 0,option);
                    count++;
                }

            }

            @Override
            public void onAnimationEnd(Animator animation) {
                if (value == 0) {
                    //count = 0;
                    try {
                        ((TextView)view).setText(data);
                        noIndicator.setText(position+1+"/"+list.size());

                    }catch (ClassCastException ex) {
                        ((Button)view).setText(data);
                    }
                    view.setTag(data);
                    playAnimation(view, 1,data);

                }

            }

            @Override
            public void onAnimationCancel(Animator animation) {

            }

            @Override
            public void onAnimationRepeat(Animator animation) {

            }
        });

    }

    private void checkAnswer(Button selectedOption){
        enableOption(false);
        nextBtn.setEnabled(true);
        nextBtn.setAlpha(1);
        if(selectedOption.getText().toString().equals(list.get(position).getCorrectanswer())){
            score++;
            selectedOption.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#23b834")));
        }else{
            selectedOption.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#ff0000")));
            Button correctOption=(Button)optionsContainer.findViewWithTag(list.get(position).getCorrectanswer());
            correctOption.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#23b834")));

        }
    }
    private void enableOption(boolean enable){
        for(int i=0;i<4;i++){
            optionsContainer.getChildAt(i).setEnabled(enable);
            if(enable){
                optionsContainer.getChildAt(i).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#2980B9")));


            }
        }

    }
}
