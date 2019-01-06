package com.venus.anjuvhari.sum;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
EditText ed3,ed4,ed5;
Button b1,b2;
String getNum1,getNum2,getResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ed3=(EditText)findViewById(R.id.nn);
        ed4=(EditText)findViewById(R.id.nm);
        ed5=(EditText)findViewById(R.id.re);
        b1=(Button)findViewById(R.id.butn);
        b2=(Button)findViewById(R.id.nxt);
            b1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    getNum1 = ed3.getText().toString();
                    int fn = Integer.parseInt(getNum1);
                    getNum2 = ed4.getText().toString();
                    int sn = Integer.parseInt(getNum2);
                    int r = (fn + sn);
                    getResult = Integer.toString(r);
                    ed5.setVisibility(View.VISIBLE);
                    ed5.setText(getResult);
//                    Toast.makeText(getApplicationContext(), getNum1, Toast.LENGTH_LONG).show();
//                    Toast.makeText(getApplicationContext(), getNum2, Toast.LENGTH_LONG).show();
                }
            });
         b2.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Toast.makeText(getApplicationContext(),"Welcome",Toast.LENGTH_LONG).show();
                 Intent inte=new Intent(getApplicationContext(),WelcomActivity.class);
                 startActivity(inte);
             }
         });
}
}

