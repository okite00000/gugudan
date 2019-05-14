package com.example.ver1;

import android.content.Intent;
import android.net.Uri;
import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //데이터 사용에 대한 정책
        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);

        //네트워크연결
        NetworkUtil util = new NetworkUtil();

        //연습모드 버튼 동작
        Button btn1 = findViewById(R.id.mod1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //연습할 구구단을 선택하는 화면으로 이동
                Intent intent = new Intent(getApplicationContext(), Select1Activity.class);
                startActivity(intent);
            }
        });
        //실전모드 버튼 동작
        Button btn2 = findViewById(R.id.mod2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //문제를 풀 구구단을 선택하는 화면으로 이동
                Intent intent = new Intent(getApplicationContext(), Select2Activity.class);
                startActivity(intent);
            }
        });

        Button btn3 = findViewById(R.id.mod3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //유튜브 구구단송 불러옴
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://youtube.com/watch?v=NG2aBtqazkY"));
                startActivity(intent);
            }
        });

        Button btn4 = findViewById(R.id.mod4);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Select3Activity.class);
                startActivity(intent);
            }
        });

    }
}
