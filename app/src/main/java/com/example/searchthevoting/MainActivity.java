package com.example.searchthevoting;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void goToSecond(View v){
        EditText textView10 = (EditText) findViewById(R.id.editText5);

        Intent intent = new Intent(MainActivity.this, Main2Activity.class);
        intent.putExtra("ID",textView10.getText().toString());
        startActivity(intent);
    }}

