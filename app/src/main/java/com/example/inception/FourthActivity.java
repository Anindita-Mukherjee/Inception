package com.example.inception;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class FourthActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);
    }
    public void sendMessage(View v)
    {
        EditText text=(EditText)findViewById(R.id.message);
        String message1="hi  "+(text.getText()).toString();
        EditText number=(EditText)findViewById(R.id.number);
        String s=(number.getText()).toString();
        Uri destination=Uri.parse("smsto:"+s);
        Intent smsIntent=new Intent(Intent.ACTION_SENDTO,destination);
        smsIntent.putExtra("sms",message1);
        startActivity(smsIntent);
    }
}
