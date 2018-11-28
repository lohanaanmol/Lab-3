package com.application.hp.appsecond;

import android.content.Intent;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText et;
    Button b,b2,b3,b4,b5,b6,b7;
    String No;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et = findViewById(R.id.editText);
        b = findViewById(R.id.button);
        b2 = findViewById(R.id.button2);
        b3 = findViewById(R.id.button3);
        b4 = findViewById(R.id.button4);
        b5 = findViewById(R.id.button5);
        b6 = findViewById(R.id.button6);
        b7 = findViewById(R.id.button7);

        No = et.getText().toString();

    }



     public void Camera(View view){
        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
         startActivity(intent);
    }

    public void Gallery(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("content://media/external/images/media/"));
        startActivity(intent);
    }

    public void CallLog(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("content://call_log/calls/1"));
        startActivity(intent);
    }

    public void Call(View view){
        Intent intent = new Intent(Intent.ACTION_CALL);
        intent.setData(Uri.parse("tel:" + No));
        startActivity(intent);
    }

    public void DailPad(View view){
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:"+No));
        startActivity(intent);
    }

    public void Contact(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("content://contacts/people/"));
        startActivity(intent);
    }

    public void Browser(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("http://www.google.com/"));
        startActivity(intent);
    }
}
