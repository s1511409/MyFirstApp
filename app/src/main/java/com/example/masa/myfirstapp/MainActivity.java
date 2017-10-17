package com.example.masa.myfirstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class MainActivity extends AppCompatActivity implements OnClickListener{

    private Button button_segue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_segue=(Button)findViewById(R.id.button_segue);
        button_segue.setOnClickListener(this);
    }

    //ボタンクリック時の関数
    public void onClick(View v) {

        if(v==button_segue){
            Intent intent = new Intent(this, SubActivity.class);
            startActivityForResult(intent, 0);
        }

    }
}
