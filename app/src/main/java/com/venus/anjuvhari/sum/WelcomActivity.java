package com.venus.anjuvhari.sum;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class WelcomActivity extends AppCompatActivity {
EditText ed1,ed2,ed3,ed4;
int r;
Button n;
String getN1,getN2,getN3,getRes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcom);
        ed1=(EditText)findViewById(R.id.nmm);
        ed2=(EditText)findViewById(R.id.nnn);
        ed3=(EditText)findViewById(R.id.mmm);
        ed4=(EditText)findViewById(R.id.red);
        n=(Button)findViewById(R.id.btnn);
        n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getN1=ed1.getText().toString();
                int n1=Integer.parseInt(getN1);
                getN2=ed2.getText().toString();
                int n2=Integer.parseInt(getN2);
                getN3=ed3.getText().toString();
                int n3=Integer.parseInt(getN3);
                if (n1>n2)
                {
                    r=n1;
                }
                else if (n2>n3)
                {
                   r=n2;
                }
                else if (n3>n1)
                {
                     r=n3;
                }
                else {
                    r=0;
                }
              getRes=String.valueOf(r);
                ed4.setVisibility(View.VISIBLE);
                ed4.setText(getRes);
            }
        });
    }
}
