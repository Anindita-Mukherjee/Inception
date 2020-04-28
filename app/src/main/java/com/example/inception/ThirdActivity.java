package com.example.inception;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
    }
    public void viewBoat(View v)
    {
        Toast.makeText(this,"any number of vacant squares vertically or horizontally",Toast.LENGTH_SHORT).show();
    }
    public void viewHorse(View v)
    {
        Toast.makeText(this,"L shape 2 + 1",Toast.LENGTH_SHORT).show();
    }
    public void viewElephant(View v)
    {
        Toast.makeText(this,"any number of vacant squares diagonally",Toast.LENGTH_SHORT).show();
    }
    public void viewKing(View v)
    {
        Toast.makeText(this,"one step horizontally,vert,or diagonally",Toast.LENGTH_SHORT).show();
    }
    public void viewMinister(View v)
    {
        Toast.makeText(this,"any no. of vacant squares horizontally,vert,or diagonally",Toast.LENGTH_SHORT).show();
    }
}
