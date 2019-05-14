package com.example.ver1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Select3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select3);

        Button btn11 = findViewById(R.id.two);//2단
        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //2의값을 DanActivity로 전달
                Intent intent3 = new Intent(Select3Activity.this, DanActivity.class);
                intent3.putExtra("a", 11);
                startActivity(intent3);
            }
        });

        Button btn12 = findViewById(R.id.three);//3단
        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //3의값을 DanActivity로 전달
                Intent intent3 = new Intent(Select3Activity.this, DanActivity.class);
                intent3.putExtra("a", 12);
                startActivity(intent3);
            }

        });

        Button btn13 = findViewById(R.id.four);
        btn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(Select3Activity.this, DanActivity.class);
                intent3.putExtra("a", 13);
                startActivity(intent3);
            }
        });

        Button btn14 = findViewById(R.id.five);
        btn14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(Select3Activity.this, DanActivity.class);
                intent3.putExtra("a", 14);
                startActivity(intent3);
            }
        });


        Button btn15 = findViewById(R.id.six);
        btn15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(Select3Activity.this, DanActivity.class);
                intent3.putExtra("a", 15);
                startActivity(intent3);
            }
        });


        Button btn16 = findViewById(R.id.seven);
        btn16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(Select3Activity.this, DanActivity.class);
                intent3.putExtra("a", 16);
                startActivity(intent3);
            }
        });

        Button btn17 = findViewById(R.id.eight);
        btn17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(Select3Activity.this, DanActivity.class);
                intent3.putExtra("a", 17);
                startActivity(intent3);
            }
        });

        Button btn18 = findViewById(R.id.nine);
        btn18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(Select3Activity.this, DanActivity.class);
                intent3.putExtra("a", 18);
                startActivity(intent3);
            }
        });

        Button btn19 = findViewById(R.id.ten);
        btn19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(Select3Activity.this, DanActivity.class);
                intent3.putExtra("a", 19);
                startActivity(intent3);
            }
        });

        Button btn20 = findViewById(R.id.eleven);
        btn20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(Select3Activity.this, DanActivity.class);
                intent3.putExtra("a", 20);
                startActivity(intent3);
            }
        });



    }
}
