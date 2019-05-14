package com.example.ver1;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;


public class Sub3Activity extends AppCompatActivity implements OnClickListener {
    TextView tv01, tv02, tv03; //(tv01) X (tv02) = (tv03) 각각에 표시될 텍스트뷰
    EditText et01;//정답입력 저장
    ImageView iv01;//이미지 저장
    Button bt01, bt02;//문제 생성, 정답확인
    MediaPlayer mp1, mp2;
    int dan, num; //구구단 숫자를 나타낼 변수(dan) X (num)
    int ans, myans;//진짜 정답과 사용자가 입력한 답을 저장할 변수
    int total=0, win=0;//시도횟수와 이긴횟수 저장할 변수.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub3);

        tv01=(TextView)findViewById(R.id.tv01);
        tv02=(TextView)findViewById(R.id.tv02);
        tv03=(TextView)findViewById(R.id.tv03);
        tv03.setText("시도횟수:"+total+", 맞은횟수"+win);

        et01=(EditText)findViewById(R.id.et01);

        iv01=(ImageView)findViewById(R.id.iv01);

        bt01=(Button)findViewById(R.id.button1);
        bt02=(Button)findViewById(R.id.button2);

        bt01.setOnClickListener(this);//버튼 클릭 이벤트 처리. 클릭하면 this(해당 class)의 onClick()으로 갈 수 있도록...
        bt02.setOnClickListener(this);//
    }
    @Override
    public void onClick(View v) {
        // TODO Auto-generated method stub
        if(v.getId() == R.id.button1){
            setView();//화면구성해주는 함수 호출
        }
        else if(v.getId()==R.id.button2){
            myans = Integer.parseInt(et01.getText().toString());//editText에 입력된 값 받아오기 Integer타입으로
            ans= dan*num;//ans에 진짜 정답 구하기.
            if(ans ==myans){//입력받은값과 진짜 정답기 같다면
                iv01.setImageResource(R.drawable.o);//o이미지 출력
                MediaPlayer mp1 = MediaPlayer.create(Sub3Activity.this, R.raw.correct);
                mp1.start();
                win++;
            }
            else {//아니라면.
                iv01.setImageResource(R.drawable.x);//x이미지 출력
                MediaPlayer mp2 = MediaPlayer.create(Sub3Activity.this, R.raw.incorrect2);
                mp2.start();
            }
            total++;
            et01.setText("");//EditText초기화
            setView();//화면구성함수 호출.
        }


    }
    public void setView(){
        Random r= new Random();//랜덤한 값을 받아오기위한 r변수 선언
        dan = r.nextInt(18)+2;//1~9중 랜덤한 수 dan에 넣기
        num = r.nextInt(9)+1;//같은의미. 1~9사이의 숫자중 랜덤한 수 num에 넣기
        tv01.setText(Integer.toString(dan));//dan을 tv01에 나타내기
        tv02.setText(Integer.toString(num));//num을 tv02에 나타내기
        tv03.setText("시도횟수:"+total+", 맞은횟수"+win);
    }
}
