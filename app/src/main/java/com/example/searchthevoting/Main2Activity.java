package com.example.searchthevoting;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {


    TextView textView,textView4,textView3;
    String[][] Voter = { {"123", "124", "134", "125", "126"},{"Mohammed", "Amarr", "Nor", "Yuosif", "Ahmed"},{"Baghdad", "Najaf", "Dyala", "Kirkuk", "Babil"}};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textView=(TextView)findViewById(R.id.textView) ;
        textView4=(TextView)findViewById(R.id.textView4) ;
        textView3=(TextView)findViewById(R.id.textView3) ;
        Intent in=getIntent();
        String Id=in.getStringExtra("ID");
        for (int i=0;i<Voter[0].length;i++){
            if (Id.equals(Voter[0][i])){
                textView.setText(Voter[1][i]);
                textView4.setText(Voter[0][i]);
                textView3.setText(Voter[2][i]);
            }
        }
if(textView.getText().toString().equals("")) {
    Intent intent = new Intent(Main2Activity.this, Main3Activity.class);

    startActivity(intent);


}

    }
    public void goToSecond2(View v){


        Intent intent = new Intent(Main2Activity.this, MainActivity.class);

        startActivity(intent);

    }}
