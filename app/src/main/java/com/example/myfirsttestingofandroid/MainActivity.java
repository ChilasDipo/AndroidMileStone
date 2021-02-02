package com.example.myfirsttestingofandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void buttonclick(View view){
        TextView tv = (TextView)findViewById(R.id.textView);
        TextView tvedit = (TextView)findViewById(R.id.editTextTextPersonName);
        tv.setText(tvedit.getText());
    }
}