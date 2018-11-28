package com.application.hp.appfirst;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class  Main2Activity extends AppCompatActivity {
    TextView t1_user ,t1_password;
    EditText et1_user , et2_password;
    Button bt1;
    String uname, pass, data ,data1,data2,data3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        et1_user = findViewById(R.id.editText);
        et2_password = findViewById(R.id.editText2);
        bt1=findViewById(R.id.button2);
        Intent intent = getIntent();
        data= intent.getStringExtra("UserName");
        data1=intent.getStringExtra("Password");
        data2=intent.getStringExtra("Email");
        data3=intent.getStringExtra("Date-Of-Birth");

    }

    public void loginClick(View V){
        uname=et1_user.getText().toString();
        pass= et2_password.getText().toString();
        valid(uname,pass);
    }

    public void valid(String un, String upass){
        if(un.equals(data) && upass.equals(data1)){
            Intent in =new Intent( Main2Activity.this, Main3Activity.class);
            in.putExtra("name",data);
            in.putExtra("Password",data1);
            in.putExtra("Email",data2);
            in.putExtra("Date-Of-Birth",data3);
            startActivity(in);
        }
        else{
            Toast.makeText(Main2Activity.this , "Input Ivalid",Toast.LENGTH_SHORT).show();

        }
    }
}
