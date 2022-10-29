package com.example.dorel69;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
Button btn1, btn2, btn3;
int i,ii;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ii = 0;
        i=0;
        btn1 = (Button)findViewById(R.id.btn1);
        btn2 = (Button)findViewById(R.id.btn2);
        btn3 = (Button)findViewById(R.id.btn3);

       btn1.setOnLongClickListener(new View.OnLongClickListener() {
           @Override
           public boolean onLongClick(View view) {
               i = i+2;
               return false;
           }
       });

        btn2.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {
        ii++;
    }


    public void dorel(View view) {
            Intent si = new Intent(this,SecondActivity2.class);
            si.putExtra("n",i);
            si.putExtra("nn",ii);
            startActivity(si);
            i = 0;
            ii = 0;

    }
}

