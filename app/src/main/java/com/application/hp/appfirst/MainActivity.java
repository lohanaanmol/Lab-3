package com.application.hp.appfirst;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView t_user ,t_email ,t_password , t_Date , t_gender;
    EditText et_user , et_email , et_password , et_Date ;
    RadioButton r_female , r_male;

    Button bt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et_user=findViewById(R.id.editText3);
        et_email=findViewById(R.id.editText4);
        et_password=findViewById(R.id.editText5);
        et_Date=findViewById(R.id.editText6);
        r_female=findViewById(R.id.radioButton2);
        r_male=findViewById(R.id.radioButton);
        bt=findViewById(R.id.button);
    }

    public void btClick(View v){
        Intent in = new  Intent(MainActivity.this ,Main2Activity.class);
        in.putExtra( "UserName" ,et_user.getText().toString());
        in.putExtra("Email",et_email.getText().toString());
        in.putExtra("Password",et_password.getText().toString());
        in.putExtra("Date-Of-Birth",et_Date.getText().toString());
        startActivity(in);

    }

//    public void callActivity(View v){
//        Intent intent = new Intent(MainActivity.this,Login.class);
//        intent.putExtra( "User Name" ,et_user.getText().toString());
////        intent.putExtra( "Email" ,et_email.getText().toString());
////        intent.putExtra( "Date Of Birth" ,et_Date.getText().toString());
//        startActivity(intent);




}
