package com.jinwooyom.liftingapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView tv1;
    private Button btn1;
    private ArrayList<String> arr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        arr = new ArrayList<String>(Arrays.asList("pushups", "pullups", "squats", "benchpress"));

        tv1 = (TextView) findViewById(R.id.tv1);
        btn1 = (Button) findViewById(R.id.btn1);
    }

    public void poop(View v) {
        int min = 0;
        int max = arr.size();
        Random rand = new Random();
        int random = rand.nextInt((max - min)) + min;

        tv1.setText(arr.get(random));
    }
}
