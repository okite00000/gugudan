package com.example.ver1;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class Sub2Activity extends AppCompatActivity implements OnClickListener {
    TextView tv01, tv02, tv03;  //(tv01) X (tv02) = (tv03) 각각에 표시될 텍스트뷰
    EditText et01;//정답입력 저장
    ImageView iv01;//정답 맞으면 O 틀리면 X 이미지 출력
    Button bt01, bt02;//bt01 = 문제 생성 , bt02 = 정답확인
    int dan, num; //구구단 숫자를 나타낼 변수 (dan) X (num)
    int ans, myans;//진짜 정답(ans)과 사용자가 입력한 답(myans)을 저장할 변수
    int total=0, win=0;//시도횟수와 이긴횟수 저장할 변수.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        //Select2에서 단을 선택후 몇단인지 값을 넘겨받음
        Intent intent2 = getIntent();
        dan = intent2.getIntExtra("a", 0);

        //텍스트뷰 출력을 위해 버튼과 변수 선언
        tv01=(TextView)findViewById(R.id.tv01);
        tv02=(TextView)findViewById(R.id.tv02);
        tv03=(TextView)findViewById(R.id.tv03);
        tv03.setText("시도횟수:"+total+", 맞은횟수"+win);

        //사용자가 정답을 입력할 에디트 텍스트 변수 선언
        et01=(EditText)findViewById(R.id.et01);

        //이미지 뷰 변수 선언
        iv01=(ImageView)findViewById(R.id.iv01);

        //문제 생성과 정답확인 버튼 변수 선언
        bt01=(Button)findViewById(R.id.button1);
        bt02=(Button)findViewById(R.id.button2);

        bt01.setOnClickListener(this);//버튼 클릭 이벤트 처리. 클릭하면 this(해당 class)의 onClick()으로 갈 수 있도록...
        bt02.setOnClickListener(this);//
    }
    @Override
    public void onClick(View v) {
        // TODO Auto-generated method stub
        if(v.getId() == R.id.button1){//버튼 1이 눌리면 아래 함수 실행
            setView();//화면구성해주는 함수 호출(맨마지막부분에 함수있음)
        }
        else if(v.getId()==R.id.button2){//버튼 2가 눌리면 아래 조건문 실행
            myans = Integer.parseInt(et01.getText().toString());//editText에 입력된 값을 Integer타입으로 myans에 저장
            ans = dan*num;//ans에 진짜 정답 구하기.
            if(ans == myans){//입력받은값과 진짜 정답기 같다면
                iv01.setImageResource(R.drawable.o);//o이미지 출력
                MediaPlayer mp1 = MediaPlayer.create(Sub2Activity.this, R.raw.correct);
                mp1.start();
                win++;//승리횟수표시할때 쓰는 변수
            }
            else {//아니라면.
                iv01.setImageResource(R.drawable.x);//x이미지 출력
                MediaPlayer mp2 = MediaPlayer.create(Sub2Activity.this, R.raw.incorrect2);
                mp2.start();
            }
            total++;//총 시도했던 횟수 표시할때 쓰는 변수
            et01.setText("");//EditText초기화
            setView();//화면구성함수 호출.
        }


    }
    public void setView(){
        //(dan) X (num) =
        Random r = new Random();//랜덤한 값을 받아오기위한 r변수 선언
        num = r.nextInt(9)+1;//같은의미. 1~9사이의 숫자중 랜덤한 수 num 에 넣기
        tv01.setText(Integer.toString(dan));//dan을 tv01에 나타내기
        tv02.setText(Integer.toString(num));//num을 tv02에 나타내기
        tv03.setText("시도횟수:"+total+", 맞은횟수"+win);//시도횟수와 맞은횟수 출력
    }
}
