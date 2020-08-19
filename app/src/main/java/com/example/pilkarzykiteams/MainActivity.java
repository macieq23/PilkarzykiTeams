package com.example.pilkarzykiteams;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_TEXT1 = "com.example.application.example.EXTRA_TEXT1";
    public static final String EXTRA_TEXT2 = "com.example.application.example.EXTRA_TEXT2";
    public static final String EXTRA_TEXT3 = "com.example.application.example.EXTRA_TEXT3";
    public static final String EXTRA_TEXT4 = "com.example.application.example.EXTRA_TEXT4";
    private Button mButton;
    public EditText mEditText1;
    public EditText mEditText2;
    public EditText mEditText3;
    public EditText mEditText4;
    public String t1,t2,t3,t4;

    ConstraintLayout mLayout;
    AnimationDrawable mDrawable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        mLayout = (ConstraintLayout) findViewById(R.id.layout);
        mDrawable = (AnimationDrawable) mLayout.getBackground();
        mDrawable.setEnterFadeDuration(5000);
        mDrawable.setExitFadeDuration(5000);
        mDrawable.start();

        mButton = (Button) findViewById(R.id.button);

        mEditText1 = (EditText) findViewById(R.id.editTextTextPersonName2);
        mEditText2 = (EditText) findViewById(R.id.editTextTextPersonName3);
        mEditText3 = (EditText) findViewById(R.id.editTextTextPersonName4);
        mEditText4 = (EditText) findViewById(R.id.editTextTextPersonName5);

        //showRandomTeam();

        mButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){


                //shuffleTeams();
                //showRandomTeam();
                t1 = mEditText1.getText().toString();
                t2 = mEditText2.getText().toString();
                t3 = mEditText3.getText().toString();
                t4 = mEditText4.getText().toString();


                //osoba2.setText(teamsy[num]);
                //osoba3.setText(teamsy[num]);
                //osoba4.setText(teamsy[num]);

                openActivity2();


                //osoba1.setText(teamsy[num]);
                //osoba1.setText("lalalalalala");

            }
        });
    }

    public void openActivity2() {
        Intent intent = new Intent(this, Activity2.class);
        intent.putExtra(EXTRA_TEXT1, t1);
        intent.putExtra(EXTRA_TEXT2, t2);
        intent.putExtra(EXTRA_TEXT3, t3);
        intent.putExtra(EXTRA_TEXT4, t4);

        startActivity(intent);
    }


    /*public void showRandomTeam() {

        osoba1.setText(teamArray[0].getmTeams());
        osoba2.setText(teamArray[1].getmTeams());
        osoba3.setText(teamArray[2].getmTeams());
        osoba4.setText(teamArray[3].getmTeams());


    }
    Teams f01 = new Teams(mEditText1.getText().toString());
    Teams f02 = new Teams(mEditText2.getText().toString());
    Teams f03 = new Teams(mEditText3.getText().toString());
    Teams f04 = new Teams(mEditText4.getText().toString());


    Teams f01 = new Teams(mEditText1.toString());
    Teams f02 = new Teams(mEditText2.toString());
    Teams f03 = new Teams(mEditText3.toString());
    Teams f04 = new Teams(mEditText4.toString());

    Teams [] teamArray = new Teams[]{
            f01,f02,f03,f04
    };
    public void shuffleTeams(){
        Collections.shuffle(Arrays.asList(teamArray));
    }

        private String osoba11;

    public MainActivity(String mTeams) {
        this.osoba11 = mTeams;
    }

    public String getmTeams() {
        return osoba11;
    }
    */
}