package com.example.dorel69;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity2 extends AppCompatActivity {
    TextView tv1, tv2, tv3;
    Button btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second2);
        Intent gi = getIntent();

        int x1 = gi.getIntExtra("n",-1);
        int x2 = gi.getIntExtra("nn", -1);
        tv1 = (TextView) findViewById(R.id.tv1);
        tv2 = (TextView) findViewById(R.id.tv2);
        tv3 = (TextView) findViewById(R.id.tv3);
        btn4 = (Button) findViewById(R.id.btn4);
        tv1.setText(x2+"");
        tv2.setText(x1+"");
        if(x1>x2){
            tv3.setText("the winner is: red");
        }
        if(x2>x1){
            tv3.setText("the winner is: blue");
        }
        if(x2==x1){
            tv3.setText("tied game");
        }

    }


    public void dorel2(View view) {
        finish();
    }
}