package com.example.ver1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Select2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select2);

        Button easy = findViewById(R.id.easy);
        easy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(Select2Activity.this, SubActivity.class);
                startActivity(intent2);
            }
        });


        //실전모드
        //랜덤으로 구구단문제풀기
        Button hard = findViewById(R.id.hard);
        hard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(Select2Activity.this, Sub3Activity.class);
                startActivity(intent2);
            }
        });
        //2단 풀기
        Button btn21 = findViewById(R.id.two1);
        btn21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(Select2Activity.this, Sub2Activity.class);
                intent2.putExtra("a", 2);
                startActivity(intent2);
            }
        });
        //3단 풀기
        Button btn31 = findViewById(R.id.three1);
        btn31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(Select2Activity.this, Sub2Activity.class);
                intent2.putExtra("a", 3);
                startActivity(intent2);
            }

        });
        //4단풀기
        Button btn41 = findViewById(R.id.four1);
        btn41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(Select2Activity.this, Sub2Activity.class);
                intent2.putExtra("a", 4);
                startActivity(intent2);
            }
        });

        Button btn51 = findViewById(R.id.five1);
        btn51.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(Select2Activity.this, Sub2Activity.class);
                intent2.putExtra("a", 5);
                startActivity(intent2);
            }
        });


        Button btn61 = findViewById(R.id.six1);
        btn61.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(Select2Activity.this, Sub2Activity.class);
                intent2.putExtra("a", 6);
                startActivity(intent2);
            }
        });


        Button btn71 = findViewById(R.id.seven1);
        btn71.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(Select2Activity.this, Sub2Activity.class);
                intent2.putExtra("a", 7);
                startActivity(intent2);
            }
        });

        Button btn81 = findViewById(R.id.eight1);
        btn81.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(Select2Activity.this, Sub2Activity.class);
                intent2.putExtra("a", 8);
                startActivity(intent2);
            }
        });

        Button btn91 = findViewById(R.id.nine1);
        btn91.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(Select2Activity.this, Sub2Activity.class);
                intent2.putExtra("a", 9);
                startActivity(intent2);
            }
        });

        Button btn111 = findViewById(R.id.k11);
        btn111.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(Select2Activity.this, Sub2Activity.class);
                intent2.putExtra("a", 11);
                startActivity(intent2);
            }
        });

        Button btn121 = findViewById(R.id.k12);
        btn121.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(Select2Activity.this, Sub2Activity.class);
                intent2.putExtra("a", 12);
                startActivity(intent2);
            }
        });

        Button btn131 = findViewById(R.id.k13);
        btn131.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(Select2Activity.this, Sub2Activity.class);
                intent2.putExtra("a", 13);
                startActivity(intent2);
            }
        });

        Button btn141 = findViewById(R.id.k14);
        btn141.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(Select2Activity.this, Sub2Activity.class);
                intent2.putExtra("a", 14);
                startActivity(intent2);
            }
        });

        Button btn151 = findViewById(R.id.k15);
        btn151.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(Select2Activity.this, Sub2Activity.class);
                intent2.putExtra("a", 15);
                startActivity(intent2);
            }
        });

        Button btn161 = findViewById(R.id.k16);
        btn161.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(Select2Activity.this, Sub2Activity.class);
                intent2.putExtra("a", 16);
                startActivity(intent2);
            }
        });

        Button btn171 = findViewById(R.id.k17);
        btn171.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(Select2Activity.this, Sub2Activity.class);
                intent2.putExtra("a", 17);
                startActivity(intent2);
            }
        });

        Button btn181 = findViewById(R.id.k18);
        btn181.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(Select2Activity.this, Sub2Activity.class);
                intent2.putExtra("a", 18);
                startActivity(intent2);
            }
        });

        Button btn191 = findViewById(R.id.k19);
        btn191.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(Select2Activity.this, Sub2Activity.class);
                intent2.putExtra("a", 19);
                startActivity(intent2);
            }
        });

        Button btn201 = findViewById(R.id.k20);
        btn201.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(Select2Activity.this, Sub2Activity.class);
                intent2.putExtra("a", 20);
                startActivity(intent2);
            }
        });


    }
}
