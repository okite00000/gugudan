package com.example.ver1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DanActivity extends AppCompatActivity {
int a;// 숫자1 X 숫자2 = 숫자3 중 숫자1
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dan);


        Intent intent1 = getIntent();//Intent를 통해 Select1엑티비티에서 값을받아옴
        a = intent1.getIntExtra("a",0);
        int[] n = {1,2,3,4,5,6,7,8,9};//숫자1 X 숫자2 = 숫자3 중 숫자2
        for(int m = 0 ; m < 9 ; m++)
        {
            n[m] = n[m]*a;
        }//넘겨받은 a와 곱셈연산

        //숫자1 X 숫자2 = 숫자3 중 넘겨받은 a를 이용해 숫자1의 값을 출력
        TextView q = (TextView)findViewById(R.id.q);
        q.setText(Integer.toString(a));
        TextView w = (TextView)findViewById(R.id.w);
        w.setText(Integer.toString(a));
        TextView e = (TextView)findViewById(R.id.e);
        e.setText(Integer.toString(a));
        TextView r = (TextView)findViewById(R.id.r);
        r.setText(Integer.toString(a));
        TextView t = (TextView)findViewById(R.id.t);
        t.setText(Integer.toString(a));
        TextView y = (TextView)findViewById(R.id.y);
        y.setText(Integer.toString(a));
        TextView u = (TextView)findViewById(R.id.u);
        u.setText(Integer.toString(a));
        TextView i = (TextView)findViewById(R.id.i);
        i.setText(Integer.toString(a));
        TextView o = (TextView)findViewById(R.id.o);
        o.setText(Integer.toString(a));


        //숫자1 X 숫자2 = 숫자3 중 계산을 통해 숫자 3을 출력
        TextView z = (TextView)findViewById(R.id.z);
        z.setText(Integer.toString(n[0]));
        TextView s = (TextView)findViewById(R.id.s);
        s.setText(Integer.toString(n[1]));
        TextView d = (TextView)findViewById(R.id.d);
        d.setText(Integer.toString(n[2]));
        TextView f = (TextView)findViewById(R.id.f);
        f.setText(Integer.toString(n[3]));
        TextView g = (TextView)findViewById(R.id.g);
        g.setText(Integer.toString(n[4]));
        TextView h = (TextView)findViewById(R.id.h);
        h.setText(Integer.toString(n[5]));
        TextView j = (TextView)findViewById(R.id.j);
        j.setText(Integer.toString(n[6]));
        TextView k = (TextView)findViewById(R.id.k);
        k.setText(Integer.toString(n[7]));
        TextView l = (TextView)findViewById(R.id.l);
        l.setText(Integer.toString(n[8]));

    }
}
