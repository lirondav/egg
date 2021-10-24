package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private ImageView img;
    private TextView tv,num;
    private Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=findViewById(R.id.tv);
        img=findViewById(R.id.img);
        num=findViewById(R.id.num);
        btn=findViewById(R.id.btn);

    }
     int count=10;
    public void gg(View view) {

        if (count>0) {
            num.setText(String.valueOf(count-1));
            count --;
        }
            if (count==0){
                img.setImageResource(R.drawable.ball);
            }
    }

    public void aa(View view) {
        count=10;
        num.setText("10");
        img.setImageResource(R.drawable.egg);
    }
}