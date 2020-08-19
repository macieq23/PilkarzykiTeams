package com.example.pilkarzykiteams;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.TextView;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class Activity2 extends AppCompatActivity {
    TextView osoba1;
    TextView osoba2;
    TextView osoba3;
    TextView osoba4;
    int tempnum;

    public String t1,t2,t3,t4;
    String teamsy[] = {t1,t2,t3,t4};

    private Handler mHandler = new Handler();
    ConstraintLayout mLayout;
    AnimationDrawable mDrawable;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        mLayout = (ConstraintLayout) findViewById(R.id.layout2);
        mDrawable = (AnimationDrawable) mLayout.getBackground();
        mDrawable.setEnterFadeDuration(5000);
        mDrawable.setExitFadeDuration(5000);
        mDrawable.start();

        Intent intent = getIntent();
        String t1 = intent.getStringExtra(MainActivity.EXTRA_TEXT1);
        String t2 = intent.getStringExtra(MainActivity.EXTRA_TEXT2);
        String t3 = intent.getStringExtra(MainActivity.EXTRA_TEXT3);
        String t4 = intent.getStringExtra(MainActivity.EXTRA_TEXT4);

        String teamsy[] = {t1,t2,t3,t4};

        osoba1 = (TextView) findViewById(R.id.textView);
        osoba2 = (TextView) findViewById(R.id.textView2);
        osoba3 = (TextView) findViewById(R.id.textView3);
        osoba4 = (TextView) findViewById(R.id.textView4);


        /*t1 = mEditText1.getText().toString();
        t2 = mEditText2.getText().toString();
        t3 = mEditText3.getText().toString();
        t4 = mEditText4.getText().toString();*/

        Random random = new Random();
        int num = random.nextInt(teamsy.length);
        tempnum = num;
        int num2 = random.nextInt(teamsy.length);
        int num3 = random.nextInt(teamsy.length);
        int num4 = random.nextInt(teamsy.length);

        while (tempnum == num2){
            num2 = random.nextInt(teamsy.length);
        }
        tempnum = num2;

        while (tempnum == num3 || num == num3){
            num3 = random.nextInt(teamsy.length);
        }
        tempnum = num3;

        while (tempnum == num4 || num == num4 || num2 == num4) {
            num4 = random.nextInt(teamsy.length);
        }

        osoba1.setText(teamsy[num]);
        osoba2.setText(teamsy[num2]);
        osoba3.setText(teamsy[num3]);
        osoba4.setText(teamsy[num4]);

        Handler h = new Handler();
        Runnable r = new Runnable() {
            @Override
            public void run() {
                osoba1.setVisibility(View.VISIBLE);
            }
        };
        Runnable r2 = new Runnable() {
            @Override
            public void run() {
                osoba2.setVisibility(View.VISIBLE);
            }
        };
        Runnable r3 = new Runnable() {
            @Override
            public void run() {
                osoba3.setVisibility(View.VISIBLE);
            }
        };
        Runnable r4 = new Runnable() {
            @Override
            public void run() {
                osoba4.setVisibility(View.VISIBLE);
            }
        };

        h.postDelayed(r, 1000);
        h.postDelayed(r2, 2000);
        h.postDelayed(r3, 3000);
        h.postDelayed(r4, 4000);


        /*timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                osoba1.setVisibility(View.VISIBLE);
            }
        }, 1000);

        /*timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                osoba2.setVisibility(View.VISIBLE);
            }
        }, 1000);

        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                osoba3.setVisibility(View.VISIBLE);
            }
        }, 1000);

        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                osoba4.setVisibility(View.VISIBLE);
            }
        }, 1000);*/
        /*osoba1.setText(t1);
        osoba2.setText(t2);
        osoba3.setText(t3);
        osoba4.setText(t4);*/
    }


}