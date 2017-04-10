package com.example.nikhin.searchtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Search.inputData("input2.txt", this);
        String result = Search.getResultString();
        String length = ""+ Search.getResultLength();
        String path = Search.getResultPath();
        Toast.makeText(this,result +" " + length +" " + path, Toast.LENGTH_LONG).show();
    }
}
