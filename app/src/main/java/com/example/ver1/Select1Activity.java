package com.example.ver1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Select1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select1);

        Button btn2 = findViewById(R.id.two);//2단
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //2의값을 DanActivity로 전달
                Intent intent1 = new Intent(Select1Activity.this, DanActivity.class);
                intent1.putExtra("a", 2);
                startActivity(intent1);
            }
        });

        Button btn3 = findViewById(R.id.three);//3단
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //3의값을 DanActivity로 전달
                Intent intent1 = new Intent(Select1Activity.this, DanActivity.class);
                intent1.putExtra("a", 3);
                startActivity(intent1);
            }

        });

        Button btn4 = findViewById(R.id.four);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(Select1Activity.this, DanActivity.class);
                intent1.putExtra("a", 4);
                startActivity(intent1);
            }
        });

        Button btn5 = findViewById(R.id.five);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(Select1Activity.this, DanActivity.class);
                intent1.putExtra("a", 5);
                startActivity(intent1);
            }
        });


        Button btn6 = findViewById(R.id.six);
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(Select1Activity.this, DanActivity.class);
                intent1.putExtra("a", 6);
                startActivity(intent1);
            }
        });


        Button btn7 = findViewById(R.id.seven);
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(Select1Activity.this, DanActivity.class);
                intent1.putExtra("a", 7);
                startActivity(intent1);
            }
        });

        Button btn8 = findViewById(R.id.eight);
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(Select1Activity.this, DanActivity.class);
                intent1.putExtra("a", 8);
                startActivity(intent1);
            }
        });

        Button btn9 = findViewById(R.id.nine);
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(Select1Activity.this, DanActivity.class);
                intent1.putExtra("a", 9);
                startActivity(intent1);
            }
        });



    }
}
